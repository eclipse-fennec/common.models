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
 * A representation of the model object '<em><b>Origin Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Originating Actor</b>
 *   : The actor that produces an observation, a finding, or a risk. One or more actor type can be used to specify a person that is using a tool.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.OriginActor#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.OriginActor#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.OriginActor#getActorUuid <em>Actor Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.OriginActor#getRoleId <em>Role Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.OriginActor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOriginActor()
 * @model extendedMetaData="name='oscal-assessment-common-origin-actor-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OriginActor extends EObject {
	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOriginActor_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOriginActor_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Actor Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Actor Universally Unique Identifier Reference</b>
	 *   : A machine-oriented identifier reference to the tool or person based on the associated type.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Uuid</em>' attribute.
	 * @see #setActorUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOriginActor_ActorUuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='actor-uuid'"
	 * @generated
	 */
	String getActorUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.OriginActor#getActorUuid <em>Actor Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Uuid</em>' attribute.
	 * @see #getActorUuid()
	 * @generated
	 */
	void setActorUuid(String value);

	/**
	 * Returns the value of the '<em><b>Role Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Actor Role</b>
	 *   : For a party, this can optionally be used to specify the role the actor was performing.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Id</em>' attribute.
	 * @see #setRoleId(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOriginActor_RoleId()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='role-id'"
	 * @generated
	 */
	String getRoleId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.OriginActor#getRoleId <em>Role Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Id</em>' attribute.
	 * @see #getRoleId()
	 * @generated
	 */
	void setRoleId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Actor Type</b>
	 *   : The kind of actor.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOriginActor_Type()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.OriginActor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // OriginActor

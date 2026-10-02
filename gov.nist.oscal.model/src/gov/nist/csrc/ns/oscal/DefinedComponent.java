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
 * A representation of the model object '<em><b>Defined Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Component</b>
 *   : A defined component that can be part of an implemented system.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getType <em>Type</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.DefinedComponent#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent()
 * @model extendedMetaData="name='oscal-component-definition-defined-component-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DefinedComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Component Title</b>
	 *   : A human readable name for the component.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Title()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Component Description</b>
	 *   : A description of the component, including information about its function.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Purpose</b>
	 *   : A summary of the technological or business purpose of the component.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Purpose()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Responsible Role</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ResponsibleRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Role</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_ResponsibleRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible-role' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='responsible-roles'"
	 * @generated
	 */
	EList<ResponsibleRole> getResponsibleRole();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Protocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='protocol' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='protocols'"
	 * @generated
	 */
	EList<Protocol> getProtocol();

	/**
	 * Returns the value of the '<em><b>Control Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ComponentControlImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Implementation</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_ControlImplementation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control-implementation' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='control-implementations'"
	 * @generated
	 */
	EList<ComponentControlImplementation> getControlImplementation();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Component Type</b>
	 *   : A category describing the purpose of the component.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Type()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Component Identifier</b>
	 *   : Provides a globally unique means to identify a given component.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getDefinedComponent_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.DefinedComponent#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // DefinedComponent

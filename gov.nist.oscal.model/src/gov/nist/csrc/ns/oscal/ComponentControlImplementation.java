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
 * A representation of the model object '<em><b>Component Control Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Implementation Set</b>
 *   : Defines how the component or capability supports a set of controls.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getImplementedRequirement <em>Implemented Requirement</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation()
 * @model extendedMetaData="name='oscal-component-definition-control-implementation-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ComponentControlImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Implementation Description</b>
	 *   : A description of how the specified set of controls are implemented for the containing component or capability.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Set Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SetParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Parameter</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation_SetParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set-parameter' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='set-parameters'"
	 * @generated
	 */
	EList<SetParameter> getSetParameter();

	/**
	 * Returns the value of the '<em><b>Implemented Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ComponentImplementedRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented Requirement</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation_ImplementedRequirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='implemented-requirement' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='implemented-requirements'"
	 * @generated
	 */
	EList<ComponentImplementedRequirement> getImplementedRequirement();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Source Resource Reference</b>
	 *   : A reference to an OSCAL catalog or profile providing the referenced control or subcontrol definition.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation_Source()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIReferenceDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Implementation Set Identifier</b>
	 *   : Provides a means to identify a set of control implementations that are supported by a given component or capability.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getComponentControlImplementation_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ComponentControlImplementation#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // ComponentControlImplementation

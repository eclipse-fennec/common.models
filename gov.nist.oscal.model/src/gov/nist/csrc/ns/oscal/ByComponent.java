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
 * A representation of the model object '<em><b>By Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Component Control Implementation</b>
 *   : Defines how the referenced component implements a set of controls.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getImplementationStatus <em>Implementation Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getExport <em>Export</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getInherited <em>Inherited</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getComponentUuid <em>Component Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ByComponent#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent()
 * @model extendedMetaData="name='oscal-ssp-by-component-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ByComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Implementation Description</b>
	 *   : An implementation statement that describes how a control or a control statement is implemented within the referenced system component.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ByComponent#getDescription <em>Description</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Link()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_SetParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set-parameter' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='set-parameters'"
	 * @generated
	 */
	EList<SetParameter> getSetParameter();

	/**
	 * Returns the value of the '<em><b>Implementation Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Status</em>' containment reference.
	 * @see #setImplementationStatus(ImplementationStatus)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_ImplementationStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementation-status' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationStatus getImplementationStatus();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ByComponent#getImplementationStatus <em>Implementation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Status</em>' containment reference.
	 * @see #getImplementationStatus()
	 * @generated
	 */
	void setImplementationStatus(ImplementationStatus value);

	/**
	 * Returns the value of the '<em><b>Export</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' containment reference.
	 * @see #setExport(Export)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Export()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='export' namespace='##targetNamespace'"
	 * @generated
	 */
	Export getExport();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ByComponent#getExport <em>Export</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' containment reference.
	 * @see #getExport()
	 * @generated
	 */
	void setExport(Export value);

	/**
	 * Returns the value of the '<em><b>Inherited</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Inherited}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Inherited()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inherited' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Inherited> getInherited();

	/**
	 * Returns the value of the '<em><b>Satisfied</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Satisfied}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Satisfied()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='satisfied' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Satisfied> getSatisfied();

	/**
	 * Returns the value of the '<em><b>Responsible Role</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ResponsibleRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Role</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_ResponsibleRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible-role' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='responsible-roles'"
	 * @generated
	 */
	EList<ResponsibleRole> getResponsibleRole();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ByComponent#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Component Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Component Universally Unique Identifier Reference</b>
	 *   : A machine-oriented identifier reference to the component that is implementing a given control.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Uuid</em>' attribute.
	 * @see #setComponentUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_ComponentUuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='component-uuid'"
	 * @generated
	 */
	String getComponentUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ByComponent#getComponentUuid <em>Component Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Uuid</em>' attribute.
	 * @see #getComponentUuid()
	 * @generated
	 */
	void setComponentUuid(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">By-Component Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this by-component entry elsewhere in this or other OSCAL instances. The locally defined UUID of the by-component entry can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getByComponent_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ByComponent#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // ByComponent

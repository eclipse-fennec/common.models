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
 * A representation of the model object '<em><b>Ssp Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Specific Control Statement</b>
 *   : Identifies which statements within a control are addressed.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspStatement#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspStatement#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspStatement#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspStatement#getByComponent <em>By Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspStatement#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspStatement#getStatementId <em>Statement Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspStatement#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement()
 * @model extendedMetaData="name='oscal-ssp-statement-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SspStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement_Link()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement_ResponsibleRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responsible-role' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='responsible-roles'"
	 * @generated
	 */
	EList<ResponsibleRole> getResponsibleRole();

	/**
	 * Returns the value of the '<em><b>By Component</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ByComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Component</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement_ByComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='by-component' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='by-components'"
	 * @generated
	 */
	EList<ByComponent> getByComponent();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SspStatement#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Statement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Statement Reference</b>
	 *   : A human-oriented identifier reference to a control statement.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Id</em>' attribute.
	 * @see #setStatementId(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement_StatementId()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='statement-id'"
	 * @generated
	 */
	String getStatementId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SspStatement#getStatementId <em>Statement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Id</em>' attribute.
	 * @see #getStatementId()
	 * @generated
	 */
	void setStatementId(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Statement Reference Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this control statement elsewhere in this or other OSCAL instances. The UUID of the control statement in the source OSCAL instance is sufficient to reference the data item locally or globally (e.g., in an imported OSCAL instance).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspStatement_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SspStatement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // SspStatement

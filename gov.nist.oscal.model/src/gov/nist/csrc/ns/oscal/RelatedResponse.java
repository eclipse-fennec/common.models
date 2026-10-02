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
 * A representation of the model object '<em><b>Related Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                          
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Risk Response Reference</b>
 *   : Identifies an individual risk response that this log entry is for.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.RelatedResponse#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.RelatedResponse#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.RelatedResponse#getRelatedTask <em>Related Task</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.RelatedResponse#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.RelatedResponse#getResponseUuid <em>Response Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRelatedResponse()
 * @model extendedMetaData="name='related-response_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RelatedResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRelatedResponse_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRelatedResponse_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Related Task</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RelatedTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRelatedResponse_RelatedTask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related-task' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='related-tasks'"
	 * @generated
	 */
	EList<RelatedTask> getRelatedTask();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRelatedResponse_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.RelatedResponse#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Response Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Response Universally Unique Identifier Reference</b>
	 *   : A machine-oriented identifier reference to a unique risk response.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Uuid</em>' attribute.
	 * @see #setResponseUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRelatedResponse_ResponseUuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='response-uuid'"
	 * @generated
	 */
	String getResponseUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.RelatedResponse#getResponseUuid <em>Response Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Uuid</em>' attribute.
	 * @see #getResponseUuid()
	 * @generated
	 */
	void setResponseUuid(String value);

} // RelatedResponse

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
 * A representation of the model object '<em><b>Identified Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Identified Subject</b>
 *   : Used to detail assessment subjects that were identified by this task.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.IdentifiedSubject#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.IdentifiedSubject#getSubjectPlaceholderUuid <em>Subject Placeholder Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getIdentifiedSubject()
 * @model extendedMetaData="name='identified-subject_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IdentifiedSubject extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.AssessmentSubject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getIdentifiedSubject_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='subjects'"
	 * @generated
	 */
	EList<AssessmentSubject> getSubject();

	/**
	 * Returns the value of the '<em><b>Subject Placeholder Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Subject Placeholder Universally Unique Identifier Reference</b>
	 *   : A machine-oriented identifier reference to a unique assessment subject placeholder defined by this task.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Placeholder Uuid</em>' attribute.
	 * @see #setSubjectPlaceholderUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getIdentifiedSubject_SubjectPlaceholderUuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='subject-placeholder-uuid'"
	 * @generated
	 */
	String getSubjectPlaceholderUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.IdentifiedSubject#getSubjectPlaceholderUuid <em>Subject Placeholder Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Placeholder Uuid</em>' attribute.
	 * @see #getSubjectPlaceholderUuid()
	 * @generated
	 */
	void setSubjectPlaceholderUuid(String value);

} // IdentifiedSubject

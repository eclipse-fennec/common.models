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
 * A representation of the model object '<em><b>Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Origin</b>
 *   : Identifies the source of the finding, such as a tool, interviewed person, or activity.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Origin#getActor <em>Actor</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Origin#getRelatedTask <em>Related Task</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOrigin()
 * @model extendedMetaData="name='oscal-assessment-common-origin-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Origin extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.OriginActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOrigin_Actor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actor' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='actors'"
	 * @generated
	 */
	EList<OriginActor> getActor();

	/**
	 * Returns the value of the '<em><b>Related Task</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RelatedTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getOrigin_RelatedTask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related-task' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='related-tasks'"
	 * @generated
	 */
	EList<RelatedTask> getRelatedTask();

} // Origin

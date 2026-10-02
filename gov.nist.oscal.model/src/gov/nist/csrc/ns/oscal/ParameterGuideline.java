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
 * A representation of the model object '<em><b>Parameter Guideline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Guideline</b>
 *   : A prose statement that provides a recommendation for the use of a parameter.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getProse <em>Prose</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterGuideline()
 * @model extendedMetaData="name='oscal-control-common-parameter-guideline-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ParameterGuideline extends EObject {
	/**
	 * Returns the value of the '<em><b>Prose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prose of this part as a Markdown string (OSCAL JSON key prose).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prose</em>' attribute.
	 * @see #setProse(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterGuideline_Prose()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='prose' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProse();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ParameterGuideline#getProse <em>Prose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prose</em>' attribute.
	 * @see #getProse()
	 * @generated
	 */
	void setProse(String value);

} // ParameterGuideline

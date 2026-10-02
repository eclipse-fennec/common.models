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
 * A representation of the model object '<em><b>Parameter Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Selection</b>
 *   : Presenting a choice among alternatives.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ParameterSelection#getChoice <em>Choice</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ParameterSelection#getHowMany <em>How Many</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterSelection()
 * @model extendedMetaData="name='oscal-control-common-parameter-selection-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ParameterSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.MarkupLineDatatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Choice</b>
	 *   : A value selection among several such options.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterSelection_Choice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MarkupLineDatatype> getChoice();

	/**
	 * Returns the value of the '<em><b>How Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter Cardinality</b>
	 *   : Describes the number of selections that must occur. Without this setting, only one value should be assumed to be permitted.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>How Many</em>' attribute.
	 * @see #setHowMany(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterSelection_HowMany()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='how-many'"
	 * @generated
	 */
	String getHowMany();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ParameterSelection#getHowMany <em>How Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How Many</em>' attribute.
	 * @see #getHowMany()
	 * @generated
	 */
	void setHowMany(String value);

} // ParameterSelection

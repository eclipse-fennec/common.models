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
 * A representation of the model object '<em><b>Set Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Set Parameter Value</b>
 *   : Identifies the parameter that will be set by the enclosed value.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SetParameter#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SetParameter#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SetParameter#getParamId <em>Param Id</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSetParameter()
 * @model extendedMetaData="name='oscal-implementation-common-set-parameter-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SetParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSetParameter_Value()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.ValueType" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='values'"
	 * @generated
	 */
	EList<String> getValue();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSetParameter_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SetParameter#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Param Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Parameter ID</b>
	 *   : A human-oriented reference to a parameter within a control, who's catalog has been imported into the current implementation context.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param Id</em>' attribute.
	 * @see #setParamId(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSetParameter_ParamId()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='param-id'"
	 * @generated
	 */
	String getParamId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SetParameter#getParamId <em>Param Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Id</em>' attribute.
	 * @see #getParamId()
	 * @generated
	 */
	void setParamId(String value);

} // SetParameter

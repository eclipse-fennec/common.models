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
 * A representation of the model object '<em><b>Hash</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Hash</b>
 *   : A representation of a cryptographic digest generated over a resource using a specified hash algorithm.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Hash#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Hash#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getHash()
 * @model extendedMetaData="name='oscal-metadata-hash-FIELD' kind='simple'"
 * @generated
 */
@ProviderType
public interface Hash extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getHash_Value()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="name=':0' kind='simple'"
	 *        annotation="http://eclipse.org/fennec/codec key='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Hash#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Hash algorithm</b>
	 *   : The digest method by which a hash is derived.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getHash_Algorithm()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Hash#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

} // Hash

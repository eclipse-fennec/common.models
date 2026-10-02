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

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Coverage</b>
 *   : A decimal value from 0-1, representing the percentage coverage of the targets by the sources.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Coverage#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Coverage#getGenerationMethod <em>Generation Method</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCoverage()
 * @model extendedMetaData="name='oscal-mapping-common-coverage-FIELD' kind='simple'"
 * @generated
 */
@ProviderType
public interface Coverage extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCoverage_Value()
	 * @model dataType="gov.nist.csrc.ns.oscal.DecimalDatatype"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Coverage#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Generation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Coverage Generation Method</b>
	 *   : The method used to determine the coverage value.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation Method</em>' attribute.
	 * @see #setGenerationMethod(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCoverage_GenerationMethod()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='generation-method'"
	 * @generated
	 */
	String getGenerationMethod();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Coverage#getGenerationMethod <em>Generation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Method</em>' attribute.
	 * @see #getGenerationMethod()
	 * @generated
	 */
	void setGenerationMethod(String value);

} // Coverage

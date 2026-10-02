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
 * A representation of the model object '<em><b>Confidence Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Confidence Score</b>
 *   : This records either a string category or a decimal value from 0-1 representing a percentage. Both of these values describe an estimation of the author's confidence that this mapping is correct and accurate. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ConfidenceScore#getCategory <em>Category</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ConfidenceScore#getPercentage <em>Percentage</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getConfidenceScore()
 * @model extendedMetaData="name='oscal-mapping-common-confidence-score-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConfidenceScore extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getConfidenceScore_Category()
	 * @model dataType="gov.nist.csrc.ns.oscal.CategoryType"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ConfidenceScore#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(BigDecimal)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getConfidenceScore_Percentage()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalMappingCommonPercentageFIELD"
	 *        extendedMetaData="kind='element' name='percentage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getPercentage();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ConfidenceScore#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(BigDecimal value);

} // ConfidenceScore

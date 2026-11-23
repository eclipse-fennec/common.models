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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Feature is used for structured diagnostic data, including specific data values like steps or conditions. For example, consider a PRS_Statement with a Text property value of: 
 * Print jobs per day are less than 50 
 * 
 * This could be described using a PRS_Feature as follows: 
 * Description: 'Print jobs per day' 
 * Prompt: 'How many print jobs per day?' 
 * ValidValues: '10' '50' '100' 
 * DataType: 'Integer' 
 * 
 * The associated PRS_Statement would contain: 
 * Operator: '<' 
 * FeatureValue: '50'
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Feature#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Feature#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Feature#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Feature()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Feature extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prompt presented through user interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prompt</em>' attribute.
	 * @see #setPrompt(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Feature_Prompt()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPrompt();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Feature#getPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' attribute.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(String value);

	/**
	 * Returns the value of the '<em><b>Valid Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Valid values for this PRS_Feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Values</em>' attribute.
	 * @see #setValidValues(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Feature_ValidValues()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getValidValues();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Feature#getValidValues <em>Valid Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Values</em>' attribute.
	 * @see #getValidValues()
	 * @generated
	 */
	void setValidValues(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data type used for PRS_Statement FeatureValue property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Feature_DataType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"254\",\"255\"]' Values='[\"String\",\"Integer\",\"Float\",\"Date/Time\",\"Boolean\",\"Binary\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getDataType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Feature#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Integer value);

} // PRS_Feature

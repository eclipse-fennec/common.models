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
 * A representation of the model object '<em><b>PRS Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Statement contains the text describing a problem, any relevant background information, and its resolution. Statements are units of text ranging from brief sentences or phrases to paragraphs or pages. There is no limit to the number of PRS_Statements within a Solution, as long as they support the intent and focus of their root class. Root classes include: PRS_Reference, PRS_Problem or PRS_Resolution. 
 * 
 * PRS_Statements may be grouped together to build compound 'sentences'. For example, 
 * StatementA = Printer output is blotchy. 
 * StatementB = Print jobs per day are less than 50. 
 * ExpressionA = StatementA AND StatementB.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Statement#getStatementRole <em>Statement Role</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Statement#getText <em>Text</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Statement#getStatementOperator <em>Statement Operator</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Statement#getFeatureValue <em>Feature Value</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Statement#getOrder <em>Order</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Statement#getRelevance <em>Relevance</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Statement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Statement extends PRS_ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Statement Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StatementRole describes how the PRS_Statement relates to the larger context. For example, is the PRS_Statement describing a Fix or a Symptom? 'Description' is generic text without a specific diagnostic application. 'Symptom' describes initial observable incident or behavior that the user reports. 'Error_Message' is a specific type of symptom that the user reports, describing the specific error condition. 'Objective' is what the user wants to accomplish, often expressed as a positive condition. FOr example, how to print on a network. 'Evidence' is information that is collected to diagnose the problem after the symptom is reported. 'Cause' is a description of the underlying facts or factors that engender or relate this behavior. 'Work_around' is information that lets the user work, but does not correct the problem completely. 'Fix' is information that fixes the problem completely. 'Answer' is the information given to the user such as steps to perform, wording to support their environment and understanding. 'Keyword' is a specific classification using defined words or phrases. 'Changes' describe recent changes in the environment which could affect the problem or resolution. 'Title' is the title applying to associated PRS_Statements (usually associated via an 'and' expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Role</em>' attribute.
	 * @see #setStatementRole(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Statement_StatementRole()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"254\",\"255\"]' Values='[\"Description\",\"Symptom\",\"Error_Message\",\"Objective\",\"Evidence\",\"Cause\",\"Work_Around\",\"Fix\",\"Answer\",\"Keyword\",\"Changes\",\"Title\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getStatementRole();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Statement#getStatementRole <em>Statement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Role</em>' attribute.
	 * @see #getStatementRole()
	 * @generated
	 */
	void setStatementRole(Integer value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The descriptive text used for the PRS_Statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Statement_Text()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Statement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Statement Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the PRS_Adminstrative object indicates Level 2 compliance, StatementOperator describes the relationship between an associated PRS_Feature and the FeatureValue property. This property is ignored if there is no PRS_Feature associated with this PRS_Statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement Operator</em>' attribute.
	 * @see #setStatementOperator(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Statement_StatementOperator()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getStatementOperator();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Statement#getStatementOperator <em>Statement Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Operator</em>' attribute.
	 * @see #getStatementOperator()
	 * @generated
	 */
	void setStatementOperator(String value);

	/**
	 * Returns the value of the '<em><b>Feature Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the PRS_Adminstrative object indicates Level 2 compliance, FeatureValue is the specific value selected from the associated PRS_Feature. This property is ignored if there is no PRS_Feature associated with this PRS_Statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Value</em>' attribute.
	 * @see #setFeatureValue(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Statement_FeatureValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFeatureValue();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Statement#getFeatureValue <em>Feature Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Value</em>' attribute.
	 * @see #getFeatureValue()
	 * @generated
	 */
	void setFeatureValue(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order is used to sequence PRS_Statements associated with a single PRS_Expression to allow a Consumer to process the information in the order desired by the Producer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Statement_Order()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Statement#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(String value);

	/**
	 * Returns the value of the '<em><b>Relevance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Importance of this Statement. The value of this property shall be an integer value in the range of 0 to 100, inclusive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance</em>' attribute.
	 * @see #setRelevance(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Statement_Relevance()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='0' MaxValue='100'"
	 * @generated
	 */
	Integer getRelevance();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Statement#getRelevance <em>Relevance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance</em>' attribute.
	 * @see #getRelevance()
	 * @generated
	 */
	void setRelevance(Integer value);

} // PRS_Statement

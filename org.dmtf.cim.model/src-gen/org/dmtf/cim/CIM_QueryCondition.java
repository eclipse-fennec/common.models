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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Query Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QueryCondition defines the criteria for generating a set of query results that are accessible to other QueryConditions or MethodActions of the same PolicyRule. If there are no results returned from the query, then the Condition evaluates to false; otherwise, true. 
 * 
 * QueryConditions are assumed to be constantly evaluated whenever precursor PolicyConditions are met. Actual implementations may evaluate conditions dynamically, via polling, or via other means. 
 * 
 * QueryCondition instances are viewed as clients of query. The QueryCondition implementation takes the query results and makes them available by the name specified in QueryResultName to the FROM clause in the Query property of other QueryConditions or MethodActions. (The details of how this is accomplished are implementation dependent.) These results are not available via CIM Operations, do not create lifecycle indications, and do not persist beyond a single evaluation of the associated PolicyRule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_QueryCondition#getQueryResultName <em>Query Result Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryCondition#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryCondition#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryCondition#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueryCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_QueryCondition extends CIM_PolicyCondition {
	/**
	 * Returns the value of the '<em><b>Query Result Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the context of the associated PolicyRule, QueryResultName defines a unique alias for the query results that MAY be used in subsequent QueryConditions or MethodActions of the same PolicyRule. This string is treated as a class name, in a query statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Result Name</em>' attribute.
	 * @see #setQueryResultName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryCondition_QueryResultName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_QueryCondition.Query\",\"CIM_MethodAction.Query\"]'"
	 * @generated
	 */
	String getQueryResultName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryCondition#getQueryResultName <em>Query Result Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Result Name</em>' attribute.
	 * @see #getQueryResultName()
	 * @generated
	 */
	void setQueryResultName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query expression that MAY be evaluated and that defines the query results that MAY be generated. Note that the query's FROM clause MAY reference any class, including those named by the QueryResultName of other QueryCondition instances associated to the same PolicyRule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryCondition_Query()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_QueryCondition.QueryLanguage\",\"CIM_QueryCondition.QueryResultName\"]'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryCondition#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Query Language</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language in which the Query string is expressed./n CQL - refers to the 'DMTF:CQL' language defined by DSP0200. 
	 * CQL: indicates a CIM Query Language string. 
	 * CQLT: indicates a CIM Query Language Template string. When used, the identifiers recognized in the $identifier$ tokens are "SELF" and the property names of this class, or one of its subclasses. When used in the Query string, $SELF$ will be replaced by a string corresponding to a WBEM URI referencing the instance of this class that contains the Query template string. Tokens of the form $<propertyname>$ will be replaced by a string representing the corresponding property value of the instance of this class that contains the Query string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Language</em>' attribute.
	 * @see #setQueryLanguage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryCondition_QueryLanguage()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"CQL\",\"CQLT\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_QueryCondition.Query\"]'"
	 * @generated
	 */
	Integer getQueryLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryCondition#getQueryLanguage <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Language</em>' attribute.
	 * @see #getQueryLanguage()
	 * @generated
	 */
	void setQueryLanguage(Integer value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If Trigger = true, and with the exception of any PolicyTimePeriodConditions, PolicyConditions of this Policy are not evaluated until this 'triggering' condition query is true. There MUST be no more than one QueryCondition with Trigger = true associated with a particular Policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryCondition_Trigger()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getTrigger();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryCondition#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Boolean value);

} // CIM_QueryCondition

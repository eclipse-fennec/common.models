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
 * A representation of the model object '<em><b>CIM Method Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MethodAction is a PolicyAction that MAY invoke methods as defined by a query. If there are no results returned from the query, then no methods are called, otherwise each query result row defines the method to call and its parameters. The called method MAY be either an intrinsic method of a CIM Namespace or an extrinsic method of a CIM_ManagedElement. 
 * 
 * In order to correlate between methods called by this MethodAction and any other invoked Methods, InstMethodCall indications MAY be created for the method calls that result from this MethodAction. These indications are named by the value in the InstMethodCallName property. These indications MUST be produced if that InstMethodCallName value is included in the FROM clause of the query of some other MethodAction instance within the same PolicyRule. (The details of how this is accomplished are implementation dependent.) 
 * 
 * The input parameters to the method are defined by the query and MAY be fixed values defined by literals or MAY be defined by reference to one or more properties of classes named in the FROM clause of the query. The referenced objects MAY be those produced by QueryConditions or MethodActions instances associated to the same PolicyRule instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MethodAction#getInstMethodCallName <em>Inst Method Call Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MethodAction#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MethodAction#getQueryLanguage <em>Query Language</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MethodAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_MethodAction extends CIM_PolicyAction {
	/**
	 * Returns the value of the '<em><b>Inst Method Call Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the context of the associated PolicyRule, InstMethodCallName defines a unique name for the InstMethodCall instances that result from the methods invoked as a result of evaluating the Query string. This name MAY be used in subsequent MethodActions of the same PolicyRule to identify the set of InstMethodCall instances that result from evaluation of this MethodAction in the context of its PolicyRule. This string is treated as a class name, in a query statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inst Method Call Name</em>' attribute.
	 * @see #setInstMethodCallName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MethodAction_InstMethodCallName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_MethodAction.Query\"]'"
	 * @generated
	 */
	String getInstMethodCallName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MethodAction#getInstMethodCallName <em>Inst Method Call Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Method Call Name</em>' attribute.
	 * @see #getInstMethodCallName()
	 * @generated
	 */
	void setInstMethodCallName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query expression that defines the method to invoke and its input parameters. These are defined by the first and subsequent select-list entries in the Query string's select-criteria. The FROM clause MAY reference any object, including those named by the QueryResultName and MethodCallName produced by QueryConditions or MethodActions of the same PolicyRule. 
	 * Note that both intrinsic and extrinsic methods MAY be called. The first select-list entry MUST be an object Path to a method. For consistency it SHOULD be called MethodName. However, if there is a conflict with existing parameter names, it MAY be called something else. The remaining select list entries are not positional and MUST use the name of the corresponding method parameter. 
	 * The object path to a method is defined here as a WBEM URI, (see DSP0207) dot concatenated with a method name. It must have the form: [<wbemURI>, ".",] <MethodName>. 
	 * The named method may be intrinsic or extrinsic. Extrinsics may be at class level (i.e. static) or not. 
	 * The particular instance of this class that is invoking the specified method defines the default namespace, class, and key values. If any of these are missing from the WBEM URI, these defaults are assumed. 
	 * For intrinsic methods (as defined in the "Specification for CIM Operations over HTTP", see DSP0200), any class name or key values specified in the WBEM URI are ignored. Similarly, key values are ignored for static methods. 
	 * Intrinsic methods that take an <instancename>, an <objectname>, an <instance>, or a <namedinstance> (as defined in DSP0200) as an input parameter are preprocessed by the implementation of the MethodAction instance. For each of <instancename> or <objectname>, the corresponding input parameter name is set to a WBEM URI of the instance or class. /n For each of <instance> or <namedinstance>, the corresponding input parameter must be set to a WBEM URI to the instance or class. Properties of that instance are passed as additional select list entries with the name of the corresponding parameter dot appended with the name of the named instance property. 
	 * For example: if the call is to ModifyInstance, then parameter ModifiedInstance is set to the= <wbemURI> of the instance to modify and for each relevant property to modify, a parameter is supplied with the name ModifiedInstance.<propertyName> and is set to the new value for the named property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MethodAction_Query()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_MethodAction.InstMethodCallName\",\"CIM_MethodAction.QueryLanguage\"]'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MethodAction#getQuery <em>Query</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_MethodAction_QueryLanguage()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"CQL\",\"CQLT\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_MethodAction.Query\"]'"
	 * @generated
	 */
	Integer getQueryLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MethodAction#getQueryLanguage <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Language</em>' attribute.
	 * @see #getQueryLanguage()
	 * @generated
	 */
	void setQueryLanguage(Integer value);

} // CIM_MethodAction

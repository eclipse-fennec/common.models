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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Indication Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IndicationFilter defines the criteria for generating an instance of CIM_Indication and what data should be returned in that instance. It is derived from CIM_ManagedElement to allow modeling the dependency of the filter on a specific service.
 * If used with the "DMTF:CQLT" language, the processing and CQLT tokens that must be supported are described in the description of the QueryLanguage property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getSourceNamespace <em>Source Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getSourceNamespaces <em>Source Namespaces</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getIndividualSubscriptionSupported <em>Individual Subscription Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getQuery <em>Query</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getQueryLanguage <em>Query Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicationFilter#getTemplateVariable <em>Template Variable</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Event' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IndicationFilter extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A System's CreationClassName. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A System's Name. The Filter is defined in the context of a CIM_System, where it is hosted or to which it applies. In a future release, a weak relationship will be explicitly added to the model. This is not done now to allow further refinement of the Filter definition and its inheritance tree. Keys are defined now to allow the class to be instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, it allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path to a local namespace where the Indications originate. If NULL, the namespace of the Filter registration is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Namespace</em>' attribute.
	 * @see #setSourceNamespace(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_SourceNamespace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_IndicationFilter.SourceNamespaces\"]'"
	 * @generated
	 */
	String getSourceNamespace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getSourceNamespace <em>Source Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Namespace</em>' attribute.
	 * @see #getSourceNamespace()
	 * @generated
	 */
	void setSourceNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Source Namespaces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The names of the local namespaces where the Indications originate. If NULL, the namespace of the Filter registration is assumed. SourceNamespaces replaces the SourceNamespace property on IndicationFilter to provide a means of defining the multiple namespaces where indications may originate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Namespaces</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_SourceNamespaces()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Namespace.Name\"]'"
	 * @generated
	 */
	EList<String> getSourceNamespaces();

	/**
	 * Returns the value of the '<em><b>Individual Subscription Supported</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If IndividualSubscriptionSupported is true, the implementation shall support direct subscription to this IndicationFilter. If IndividualSubscriptionSupported is false, the implementation shall not support direct subscription to this IndicationFilter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual Subscription Supported</em>' attribute.
	 * @see #setIndividualSubscriptionSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_IndividualSubscriptionSupported()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIndividualSubscriptionSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getIndividualSubscriptionSupported <em>Individual Subscription Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Subscription Supported</em>' attribute.
	 * @see #getIndividualSubscriptionSupported()
	 * @generated
	 */
	void setIndividualSubscriptionSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query expression that defines the condition(s) under which instances of CIM_Indication will be generated. For CIM_InstIndication subclasses of CIM_Indication classes, the query expression may also define the instance properties to be copied to the CIM_InstIndication's SourceInstance and PreviousInstance properties. Query language semantics include projection (e.g., Select), range (e.g., From) and predicate (e.g., Where). 
	 * When used with QueryLanguage set to "DMTF:CQL" or "DMTF:CQLT", the FROM clause shall contain at least one subclass of CIM_Indication and may contain any number of other classes or subqueries. If only one subclass of CIM_Indication is named, it defines the CIM_Indication that this Instance of CIM_IndicationFilter will produce. If more than one subclass of CIM_Indication is named, then one of them must be named explicitly in the select-list. 
	 * The select-list must refer explicitly or implicitly to exactly one CIM_Indication subclass. In addition, it shall conform to one of several options: 
	 * 1) only a "*": This may only be used if the Indication subclass is the only entry on the FROM list. 
	 * 2) only a "<Indicationclass or alias>.*": This form may be used if the FROM clause contains more than one Indication subclass. 
	 * 3) a list of the form "<propertyname>*[","[<literal> AS ]<propertyname>]": This form may only be used if the CIM_Indication subclass is the only entry on the FROM list. In this form, the literal is assigned to the named property of the selected CIM_Indication subclass 
	 * 4) a list of the form "<Indicationname>.<propertyname> *["," [<Indicationname>.<propertyname> |"": <literal> AS <propertyname> | <fromname>.<propertyname> AS <propertyname> ] ]" : The first term selects the appropriate CIM_Indication subclass to produce. Subsequent terms allow other properties of that indication, or allow a literal or property of another class to be assigned to the output as one of the properties of the selected CIM_Indication subclass. 
	 * Note that in all cases, only the property names of the selected CIM_Indication subclass may be referred to in the select-list.
	 * When used with "DMTF:CQLT", the additional string array property TemplateVariable should be used to provide additional filtering information to the query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_Query()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_IndicationFilter.QueryLanguage\",\"CIM_IndicationFilter.TemplateVariable\"]'"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language in which the query is expressed. . 
	 * "DMTF:CQL" indicates a CIM Query Language string. 
	 * "DMTF:CQLT" indicates a CIM Query Language Template string. When used, the identifiers recognized in the $identifier$ tokens are "SELF" and the property names of this class, or one of its subclasses. As seen by a CIM client, the value of the Query property is not changed as a result of template processing. Template processing conceptually produces a new query string, which defines the actual conditions that will trigger production of a CIM_Indication instance. When used in the Query string, $SELF$ will be replaced by a string corresponding to a WBEM URI referencing the instance of this class that contains the Query template string. Tokens of the form $<propertyname>$ will be replaced by a string representing the corresponding property value of the instance of this class that contains the Query string. The Query string must be evaluated when the CIM_IndicationFilter is created and at any time when one any modification of any property referenced by tokens in the Query string are modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Language</em>' attribute.
	 * @see #setQueryLanguage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_QueryLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' ModelCorrespondence='[\"CIM_IndicationFilter.Query\",\"CIM_IndicationFilter.TemplateVariable\"]'"
	 * @generated
	 */
	String getQueryLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicationFilter#getQueryLanguage <em>Query Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Language</em>' attribute.
	 * @see #getQueryLanguage()
	 * @generated
	 */
	void setQueryLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Template Variable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property may be used to hold application specific filtering information for use within a "DMTF:CQLT" formatted query.
	 * 
	 * For example, each TemplateVariable entry might be filled with the WBEM URI formatted object path of a CIM_ManagedElement, as in the following example, which selects only indications against namedCIM_StorageSynchonized instances. It then uses SELF to select the executing IndicationFilter, and then uses the entries of the TemplateVariable array to select particular instances of CIM_StorageSynchronized.
	 * 
	 * SELECT I.* 
	 * FROM CIM_InstIndication I, CIM_IndicationFilter F 
	 * WHERE I.SourceInstance ISA CIM_StorageSynchronized 
	 * 	AND ObjectPath(F) = ObjectPath($SELF$)
	 * 	AND ANY x IN F.TemplateVariable[*]
	 * 		SATISFIES (ObjectPath(I.SourceInstanceModelPath) = ObjectPath(x)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Variable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicationFilter_TemplateVariable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_IndicationFilter.QueryLanguage\",\"CIM_IndicationFilter.Query\"]'"
	 * @generated
	 */
	EList<String> getTemplateVariable();

} // CIM_IndicationFilter

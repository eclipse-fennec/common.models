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
 * A representation of the model object '<em><b>CIM Query Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_QueryCapabilities is deprecated. See CIM_GenericOperationCapabilitiesStructure.
 * This class defines the extent of the support of a query language. Query languages may be used in support of the query operation, as defined in the OpenQueryInstances CIM Operation from DSP0223, or in the filtering of indications. 
 * An instance of this class associated to the CIM_ObjectManager instance denotes that the WBEM Infrastructure itself supports the query operation. An instance of this class associated to a CIM_Provider instance denotes that the provider has less or more capabilities than the Object Manager for processing queries. If the provider has different support for query languages than the object manager then, instances of this class shall be associated to both the object manager and the provider.
 * An instance of this class associated to the CIM_IndicationService denotes what query languages can be used to formulate an indication filter. 
 * The possible query languages are CQL and XPath, as denoted by the CQLFeatures and XPathFeatures respectively. A value of null in one of these properties indicates that the related query language is not supported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_QueryCapabilities#getCQLFeatures <em>CQL Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_QueryCapabilities#getXPathFeatures <em>XPath Features</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueryCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_GenericOperationCapabilitiesStructure\"]' Version='2.45.0' UMLPackagePath='CIM::Interop' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_QueryCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>CQL Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of CQL features supported by an Object Manager or Provider associated via ElementCapabilities. For more information refer to the CIM Query Language Specification, DSP0202.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CQL Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryCapabilities_CQLFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_GenericOperationCapabilitiesStructure.CQLSupport\"]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"0x8000..\"]' Values='[\"Basic Query\",\"Simple Join\",\"Complex Join\",\"Subquery\",\"Result Set Operations\",\"Extended Select List\",\"Embedded Properties\",\"Aggregations\",\"Regular Expression Like\",\"Array Range\",\"Satisfies Array\",\"Foreign Namespace Support\",\"Arithmetic Expression\",\"Full Unicode Support\",\"Conversion Utilities\",\"Property Scoping\",\"Association Traversal\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicationFilter.Query\"]'"
	 * @generated
	 */
	EList<Integer> getCQLFeatures();

	/**
	 * Returns the value of the '<em><b>XPath Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of XPath features supported by an Object Manager or Provider associated via ElementCapabilities. For more information refer to the WS-Management Specification, DSP0226 1.0, Annex D "XPath Support".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPath Features</em>' attribute.
	 * @see #setXPathFeatures(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueryCapabilities_XPathFeatures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Level 1 with basic node selector support and no filtering\",\"Level 2 with basic filtering support\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicationFilter.Query\"]'"
	 * @generated
	 */
	Integer getXPathFeatures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueryCapabilities#getXPathFeatures <em>XPath Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath Features</em>' attribute.
	 * @see #getXPathFeatures()
	 * @generated
	 */
	void setXPathFeatures(Integer value);

} // CIM_QueryCapabilities

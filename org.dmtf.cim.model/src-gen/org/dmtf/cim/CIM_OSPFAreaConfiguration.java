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
 * A representation of the model object '<em><b>CIM OSPF Area Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each OSPF router has an association to one or more OSPF areas. Into these areas, a router advertises summaries filtered by specific address ranges. This would natively be modeled as a ternary association (router/OSPFService to OSPFArea to RangeOfIPAddresses), which is problematic in some implementations. To get around this issue, the OSPFAreaConfiguration class is defined to act as a focal point to bring together the router (indicated as a ComputerSystem with an instance of OSPFService, associated to the AreaConfiguration using OSPFServiceConfiguration), the area (indicated as an OSPFArea, associated to the AreaConfiguration using AreaOfConfiguration) and the address ranges for advertising (indicated as instances of RangeOfIPAddresses, associated to the AreaConfiguration using RangesOfConfiguration). There would be an instance of OSPFAreaConfiguration for each connected area of a router/OSPFService. 
 * 
 * When network administrators want to control the advertisements of OSPF routers by filters, they first define the relevant ranges. In order for a router to handle a range, an instance of RangeOfIPAddresses MUST be associated to the relevant OSPFAreaConfiguration (using the relationship, RangesOf Configuration). The association between the range and area configuration contains a property defining the handling (EnableAdvertise) to allow or disallow advertisements in the range. 
 * 
 * Notes: 
 * - Because RangeOfIPAddresses is scoped by a System (via the HostedCollection association), an instance of RangeOfIPAddresses would be associated to an OSPFArea, satisfying this semantic. 
 * - This class is inherited from LogicalElement, because a suitable subclass 'lower' in the inheritance hiearchy does not exist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSPFAreaConfiguration#getStubDefaultCost <em>Stub Default Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFAreaConfiguration#getStubMetricType <em>Stub Metric Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFAreaConfiguration()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Network::OSPF' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;OSPFService ID&gt;&lt;Area Configuration ID&gt; \nwhere: \n&lt;OrgID&gt; and the remainder of the InstanceID are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and the &lt;OSPFService ID&gt;. For DMTF defined instances, the \'preferred\' algorithm MUST be used, and the &lt;OrgID&gt; set to \'CIM\'. \n&lt;OSPFService ID&gt; and &lt;Area Configuration ID&gt; MUST specify vendor-unique identifiers for the OSPFService and AreaConfiguration.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFAreaConfiguration extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Stub Default Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute contains the value of the default route that this router advertises into a stub area, see C.2 RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stub Default Cost</em>' attribute.
	 * @see #setStubDefaultCost(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFAreaConfiguration_StubDefaultCost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfStubMetric\"]'"
	 * @generated
	 */
	Long getStubDefaultCost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFAreaConfiguration#getStubDefaultCost <em>Stub Default Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub Default Cost</em>' attribute.
	 * @see #getStubDefaultCost()
	 * @generated
	 */
	void setStubDefaultCost(Long value);

	/**
	 * Returns the value of the '<em><b>Stub Metric Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute contains the type of metric advertised as a default route into a stub area, see 3. in RFC 1850.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stub Metric Type</em>' attribute.
	 * @see #setStubMetricType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFAreaConfiguration_StubMetricType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"OSPF Metric\",\"Comparable Cost\",\"NonComparable\"]' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfStubMetricType\"]'"
	 * @generated
	 */
	Integer getStubMetricType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFAreaConfiguration#getStubMetricType <em>Stub Metric Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stub Metric Type</em>' attribute.
	 * @see #getStubMetricType()
	 * @generated
	 */
	void setStubMetricType(Integer value);

} // CIM_OSPFAreaConfiguration

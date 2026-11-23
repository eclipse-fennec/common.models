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
 * A representation of the model object '<em><b>CIM Autonomous System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Autonomous System (AS) is a fundamental concept in networking. An AS provides a structured view of routing by segregating the system that is using routing (e.g., the Internet, or an extranet) into a set of separately administered domains that each have their own independent routing policies. These domains are called autonomous systems. 
 * 
 * The classic definition of an AS, from RFC1771, is '...a set of routers under a single technical administration, using an interior gateway protocol and common metrics to route packets within the AS, and using an exterior gateway protocol to route packets to other ASs'. The RFC continues: 'Since this classic definition was developed, it has become common for a single AS to use several interior gateway protocols and sometimes several sets of metrics within an AS. The use of the term Autonomous System here stresses the fact that, even when multiple IGPs and metrics are used, the administration of an AS appears to other ASs to have a single coherent interior routing plan and presents a consistent picture of what destinations are reachable through it.'
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AutonomousSystem#getASNumber <em>AS Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AutonomousSystem#getIsSingleHomed <em>Is Single Homed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AutonomousSystem#getIsTransit <em>Is Transit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AutonomousSystem#getRequireIGPSync <em>Require IGP Sync</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AutonomousSystem#getRoutingUpdateSource <em>Routing Update Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AutonomousSystem#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AutonomousSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.40.0' UMLPackagePath='CIM::Network::Systems' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AutonomousSystem extends CIM_AdminDomain {
	/**
	 * Returns the value of the '<em><b>AS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ASNumber is an integer between 1 and 65535, with the range 64512 through 65535 reserved for private use. Every AS has a unique AS number, which is assigned to it by an Internet Registry or a provider. IANA assigns and administers AS numbers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AS Number</em>' attribute.
	 * @see #setASNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AutonomousSystem_ASNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getASNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AutonomousSystem#getASNumber <em>AS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AS Number</em>' attribute.
	 * @see #getASNumber()
	 * @generated
	 */
	void setASNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Single Homed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IsSingleHomed is a boolean that, when its value is TRUE, indicates that this AS reaches networks outside of its domain through a single exit point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Single Homed</em>' attribute.
	 * @see #setIsSingleHomed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AutonomousSystem_IsSingleHomed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsSingleHomed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AutonomousSystem#getIsSingleHomed <em>Is Single Homed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Homed</em>' attribute.
	 * @see #getIsSingleHomed()
	 * @generated
	 */
	void setIsSingleHomed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Transit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IsTransit is a boolean that, when its value is TRUE, indicates that this AS will advertise routes that it learns from other ASs. A non-transit AS will only advertise its own routes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Transit</em>' attribute.
	 * @see #setIsTransit(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AutonomousSystem_IsTransit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsTransit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AutonomousSystem#getIsTransit <em>Is Transit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transit</em>' attribute.
	 * @see #getIsTransit()
	 * @generated
	 */
	void setIsTransit(Boolean value);

	/**
	 * Returns the value of the '<em><b>Require IGP Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequireIGPSync is a boolean that, when its value is TRUE, indicates that this AS must obey the following rule: a router should not advertise destinations learned from internal neighbors to external destinations unless those destinations are also known via some internal gateway protocol. Otherwise, a router may receive traffic that cannot yet be routed. However, since this is a costly choice, it is common practice to allow this rule to be broken under certain carefully controlled circumstances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require IGP Sync</em>' attribute.
	 * @see #setRequireIGPSync(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AutonomousSystem_RequireIGPSync()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRequireIGPSync();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AutonomousSystem#getRequireIGPSync <em>Require IGP Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require IGP Sync</em>' attribute.
	 * @see #getRequireIGPSync()
	 * @generated
	 */
	void setRequireIGPSync(Boolean value);

	/**
	 * Returns the value of the '<em><b>Routing Update Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RoutingUpdateSource defines how routing information is to be injected. Statically injected routes are maintained by the routing table and are independent of the status of the networks to which they refer. This is done simply by defining static routes in the routing table. Dynamically injected routes are of two types. Dynamic routes refer to distributing all of the IGP routes. Semi-dynamic routes define a set of specific IGP routes that will be injected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routing Update Source</em>' attribute.
	 * @see #setRoutingUpdateSource(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AutonomousSystem_RoutingUpdateSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Static\",\"Dynamic\",\"Semi-Dynamic\"]'"
	 * @generated
	 */
	Integer getRoutingUpdateSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AutonomousSystem#getRoutingUpdateSource <em>Routing Update Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Update Source</em>' attribute.
	 * @see #getRoutingUpdateSource()
	 * @generated
	 */
	void setRoutingUpdateSource(Integer value);

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Route aggregation refers to summarizing ranges of routes into one or more aggregate routes. This is done to minimize the number of routes in the global routing table. A potential drawback is that specific path information (e.g., the Path attribute value) is lost, which may lead to potential routing loops. There are a variety of ways to ensure that this does not happen. Note that BGP4 is required to do this. 
	 * 
	 * There are many ways to form aggregate routes. The following are the most popular: 'Aggregate only', where only the aggregate is advertised, and all of its more specific routes are suppressed; 'Aggregate Plus Specific Routes', where both the aggregate as well as its more specific routes are advertised (e.g., send the aggregate to the NAP, but send the more specific routes to providers); 'Aggregate Based on a Subset of Specific Routes', where the aggregate route is formed by looking at certain more specific routes and forming an aggregate on them, suppressing all others.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see #setAggregationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AutonomousSystem_AggregationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"None\",\"Aggregate Only\",\"Aggregate And All Specific Routes\",\"Aggregate Based on Subset of Specific Routes\"]'"
	 * @generated
	 */
	Integer getAggregationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AutonomousSystem#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(Integer value);

} // CIM_AutonomousSystem

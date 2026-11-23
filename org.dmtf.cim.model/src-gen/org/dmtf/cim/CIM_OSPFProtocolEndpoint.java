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
 * A representation of the model object '<em><b>CIM OSPF Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the OSPF configuration of an interface running OSPF. The instance of this class should be connected to an IPProtocolEndpoint instance via a BindsTo association. The IPProtocolEndpoint instance is the Antecedent and the OSPFProtocolEndpoint instance is the Dependent in the BindsTo association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getPollInterval <em>Poll Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getCost <em>Cost</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getIfDemand <em>If Demand</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFProtocolEndpoint extends CIM_OSPFProtocolEndpointBase {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When two routers attached to a network both attempt to become the Designated Router, the one with the highest (i.e. largest) Priority takes precedence, see C.3 in RFC 2328. Only routers with greater than zero priority are eligible to become Designated Router.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpoint_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfRtrPriority\"]'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Poll Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a neighbouring router on an NBMA (NonBroadcast MultiAccess) link becomes inactive, it is still necessary to send Hello Packets to the dead neighbor. These packets will be sent at the reduced rate, which should be much larger than HelloInterval, see C.5 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poll Interval</em>' attribute.
	 * @see #setPollInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpoint_PollInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfPollInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getPollInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getPollInterval <em>Poll Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poll Interval</em>' attribute.
	 * @see #getPollInterval()
	 * @generated
	 */
	void setPollInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost of the routes through this OSPF endpoint, see C.3 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpoint_Cost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfMetricStatus\"]'"
	 * @generated
	 */
	Integer getCost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Integer value);

	/**
	 * Returns the value of the '<em><b>If Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the interface connects to an on-demand circuit, see RFC 1793.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If Demand</em>' attribute.
	 * @see #setIfDemand(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFProtocolEndpoint_IfDemand()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfDemand\"]'"
	 * @generated
	 */
	Boolean getIfDemand();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFProtocolEndpoint#getIfDemand <em>If Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Demand</em>' attribute.
	 * @see #getIfDemand()
	 * @generated
	 */
	void setIfDemand(Boolean value);

} // CIM_OSPFProtocolEndpoint

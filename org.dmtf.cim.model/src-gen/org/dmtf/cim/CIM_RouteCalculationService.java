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
 * A representation of the model object '<em><b>CIM Route Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is an abstract base class, derived from Service, that represents the route calculation aspects of a system. This class also addresses functions performed by the system when it exchanges routing information. 
 * 
 * Examining the RouteCalculationService class definition, note that its superclass NetworkService is deprecated. Therefore, NetworkService's properties need not be implemented in an instance of RouteCalculationService. Unfortunately, NetworkService cannot be removed from the object hierarchy without a major Schema release. When/if this occurs, the NetworkService superclass will be removed, and RouteCalculationService will subclass from CIM_Service directly. Also note that there are a large number of additional routing protocols that are not currently modeled. These will be added over time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RouteCalculationService#getRouterID <em>Router ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RouteCalculationService#getAlgorithmType <em>Algorithm Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RouteCalculationService()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RouteCalculationService extends CIM_NetworkService {
	/**
	 * Returns the value of the '<em><b>Router ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RouterID uniquely identifies the router that is performing the route calculation. It is the highest IP address on the router (or the highest loopback interface, if there is one).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Router ID</em>' attribute.
	 * @see #setRouterID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RouteCalculationService_RouterID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRouterID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RouteCalculationService#getRouterID <em>Router ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router ID</em>' attribute.
	 * @see #getRouterID()
	 * @generated
	 */
	void setRouterID(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an enumerated value that defines the routing algorithm used in this route calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm Type</em>' attribute.
	 * @see #setAlgorithmType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RouteCalculationService_AlgorithmType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"RIPv1\",\"RIPv2\",\"OSPFv1\",\"OSPFv2\",\"BGPv1\",\"BGPv2\",\"BGPv3\",\"BGPv4\"]'"
	 * @generated
	 */
	Integer getAlgorithmType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RouteCalculationService#getAlgorithmType <em>Algorithm Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Type</em>' attribute.
	 * @see #getAlgorithmType()
	 * @generated
	 */
	void setAlgorithmType(Integer value);

} // CIM_RouteCalculationService

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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Logical Network Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicalNetworkService represents network services that either originate and/or terminate in a LogicalNetwork. This association is deprecated since LogicalNetworks aggregate ProtocolEndpoints, not their backing Services.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalNetworkService#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalNetworkService#getNetworkService <em>Network Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalNetworkService#getContainmentType <em>Containment Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalNetworkService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' keys='Network,NetworkService'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalNetworkService extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LogicalNetwork that contains the network service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(CIM_LogicalNetwork)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalNetworkService_Network()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalNetwork REF' Deprecated='[\"No value\"]' Key='true'"
	 * @generated
	 */
	CIM_LogicalNetwork getNetwork();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalNetworkService#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(CIM_LogicalNetwork value);

	/**
	 * Returns the value of the '<em><b>Network Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NetworkService that is running in the LogicalNetwork.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Service</em>' reference.
	 * @see #setNetworkService(CIM_NetworkService)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalNetworkService_NetworkService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkService REF' Deprecated='[\"No value\"]' Key='true'"
	 * @generated
	 */
	CIM_NetworkService getNetworkService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalNetworkService#getNetworkService <em>Network Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Service</em>' reference.
	 * @see #getNetworkService()
	 * @generated
	 */
	void setNetworkService(CIM_NetworkService value);

	/**
	 * Returns the value of the '<em><b>Containment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that explicitly defines this network service as originating, terminating, or residing in this LogicalNetwork.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containment Type</em>' attribute.
	 * @see #setContainmentType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalNetworkService_ContainmentType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Originates In\",\"Terminates In\",\"Resides In\"]'"
	 * @generated
	 */
	Integer getContainmentType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalNetworkService#getContainmentType <em>Containment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Type</em>' attribute.
	 * @see #getContainmentType()
	 * @generated
	 */
	void setContainmentType(Integer value);

} // CIM_LogicalNetworkService

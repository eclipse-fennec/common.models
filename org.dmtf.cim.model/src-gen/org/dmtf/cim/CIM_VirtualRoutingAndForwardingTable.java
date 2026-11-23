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
 * A representation of the model object '<em><b>CIM Virtual Routing And Forwarding Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of interfaces and associated routes that form the context used for a virtual routing and forwarding table.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualRoutingAndForwardingTable#getRouteDistinguisher <em>Route Distinguisher</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualRoutingAndForwardingTable()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.52.0' UMLPackagePath='CIM::Network' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='This property should contain the unique ID required to match this instance to the managed environment.For example the provider may use the VRF context name in or as part of the value of this property' override.ElementName='string' override.ElementName.Description='This property should contain the VRF context name.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualRoutingAndForwardingTable extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Route Distinguisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An eight Octet field (typically the AS number) prefixed to an IPv4 address as defined in RFC 4364 used to uniquely distinguish the route when there are multiple VRFs in a single router.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Distinguisher</em>' attribute.
	 * @see #setRouteDistinguisher(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualRoutingAndForwardingTable_RouteDistinguisher()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Octetstring='true'"
	 * @generated
	 */
	String getRouteDistinguisher();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VirtualRoutingAndForwardingTable#getRouteDistinguisher <em>Route Distinguisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Distinguisher</em>' attribute.
	 * @see #getRouteDistinguisher()
	 * @generated
	 */
	void setRouteDistinguisher(String value);

} // CIM_VirtualRoutingAndForwardingTable

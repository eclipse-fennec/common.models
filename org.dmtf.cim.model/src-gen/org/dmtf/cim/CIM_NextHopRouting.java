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
 * A representation of the model object '<em><b>CIM Next Hop Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NextHopRouting relates a destination address to the address or interface through which the remote address may be reached. An instance of this class can represent either static or dynamic routing, and may represent a routing table entry (but it is not required that all NextHopRoutes be in a routing table). Static routes are distinguished by setting the IsStatic boolean property to TRUE. Subclasses of NextHopRouting provide specific protocol and Key information. NextHopRoutes are dependent on at least one ForwardingService to execute them. This is conveyed by the CIM_NextHopForwardedByService association. 
 * 
 * NextHopRouting is deprecated in lieu of the more general, concrete NextHopRoute class. NextHopRoute allows the definition of BOTH a next hop address and an interface for transmission of the traffic. Also, it does not mandate the instantiation of a ForwardingService class. The latter is not needed if the sole purpose of the instance is to specify a 'desired/configured' route. This is simply a specification of the next hop.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRouting#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRouting#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRouting#getNextHop <em>Next Hop</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRouting#getIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRouting()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_NextHopRoute\"]' Abstract='true' Version='2.7.0' UMLPackagePath='CIM::Network::Routes'"
 * @generated
 */
@ProviderType
public interface CIM_NextHopRouting extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The address which serves as the destination to be reached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Address</em>' attribute.
	 * @see #setDestinationAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRouting_DestinationAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NextHopRoute.DestinationAddress\"]'"
	 * @generated
	 */
	String getDestinationAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRouting#getDestinationAddress <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address</em>' attribute.
	 * @see #getDestinationAddress()
	 * @generated
	 */
	void setDestinationAddress(String value);

	/**
	 * Returns the value of the '<em><b>Destination Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mask for the DestinationAddress.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Mask</em>' attribute.
	 * @see #setDestinationMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRouting_DestinationMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	String getDestinationMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRouting#getDestinationMask <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Mask</em>' attribute.
	 * @see #getDestinationMask()
	 * @generated
	 */
	void setDestinationMask(String value);

	/**
	 * Returns the value of the '<em><b>Next Hop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contains either the address of the next-hop router, or the interface used to reach the destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Hop</em>' attribute.
	 * @see #setNextHop(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRouting_NextHop()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_AssociatedNextHop.Antecedent\",\"CIM_RouteUsesEndpoint.Antecedent\"]'"
	 * @generated
	 */
	String getNextHop();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRouting#getNextHop <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Hop</em>' attribute.
	 * @see #getNextHop()
	 * @generated
	 */
	void setNextHop(String value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUE indicates that this is a static route, and FALSE indicates a dynamically-learned route.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRouting_IsStatic()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_NextHopRoute.IsStatic\"]'"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRouting#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(Boolean value);

} // CIM_NextHopRouting

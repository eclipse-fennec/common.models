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
 * A representation of the model object '<em><b>CIM BGP Route Maps In Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregation defines the BGPRouteMaps that are used by a particular RoutingPolicy object. Multiple instances of the same RouteMap may be used in the same RoutingPolicy instance. If this is desired, then the Sequence attribute of this aggregation can be used to disambiguate them.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMapsInRoutingPolicy#getMapSequence <em>Map Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMapsInRoutingPolicy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.GroupComponent='CIM_RoutingPolicy REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The RoutingPolicy that aggregates the RouteMaps.' override.PartComponent='CIM_BGPRouteMap REF' override.PartComponent.Description='The RouteMaps that are used by the RoutingPolicy.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_BGPRouteMapsInRoutingPolicy extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Map Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the position of this RouteMap instance relative to all other instances of the same RouteMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Sequence</em>' attribute.
	 * @see #setMapSequence(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMapsInRoutingPolicy_MapSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMapSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMapsInRoutingPolicy#getMapSequence <em>Map Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Sequence</em>' attribute.
	 * @see #getMapSequence()
	 * @generated
	 */
	void setMapSequence(Integer value);

} // CIM_BGPRouteMapsInRoutingPolicy

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
 * A representation of the model object '<em><b>CIM BGP Peer Uses Route Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association defines the RouteMaps that are aggregated and used by a particular BGPPeerGroup object. Multiple instances of the same RouteMap may be aggregated into the same BGPPeerGroup. If this is desired, then the MapSequence attribute of the association can be used to disambiguate them.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPPeerUsesRouteMap#getMapSequence <em>Map Sequence</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerUsesRouteMap()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Network::BGP' override.Collection='CIM_BGPPeerGroup REF' override.Collection.Aggregate='true' override.Collection.Description='The BGPPeerGroup that aggregates the RouteMaps.' override.Member='CIM_BGPRouteMap REF' override.Member.Description='The RouteMaps that are used by the BGPPeerGroup.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_BGPPeerUsesRouteMap extends CIM_CollectedMSEs {
	/**
	 * Returns the value of the '<em><b>Map Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the position of this RouteMap instance relative to all other instances of the same RouteMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Sequence</em>' attribute.
	 * @see #setMapSequence(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPeerUsesRouteMap_MapSequence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMapSequence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPeerUsesRouteMap#getMapSequence <em>Map Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Sequence</em>' attribute.
	 * @see #getMapSequence()
	 * @generated
	 */
	void setMapSequence(Integer value);

} // CIM_BGPPeerUsesRouteMap

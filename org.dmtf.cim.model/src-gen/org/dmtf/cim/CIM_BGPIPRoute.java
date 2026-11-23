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
 * A representation of the model object '<em><b>CIM BGPIP Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * BGPIPRoute describes a BGP routing entry that connects two peer routers that are running BGP. The source and destination addresses may be either specific IP endpoints or IP subnets. Examining the BGPIPRoute class definition, note that its superclass IPRoute is deprecated. Unfortunately, IPRoute cannot be removed from the object hierarchy without a major Schema release. When/if this occurs, the IPRoute superclass will be removed, and BGPIPRoute will subclass from CIM_NextHopRouting directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPIPRoute#getIsBackDoorRoute <em>Is Back Door Route</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPIPRoute#getUsesLoopbackPeering <em>Uses Loopback Peering</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPIPRoute()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Network::BGP' keys='SystemCreationClassName,SystemName,ServiceCreationClassName,ServiceName,CreationClassName,IPDestinationAddress,IPDestinationMask,AddressType'"
 * @generated
 */
@ProviderType
public interface CIM_BGPIPRoute extends CIM_IPRoute {
	/**
	 * Returns the value of the '<em><b>Is Back Door Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usually, the administrative distance is used to determine which route gets installed in the routing table. Using this scheme, routes learned via EBGP will win over routes learned via an IGP. If this is not desired, then this assigns the administrative distance of this route to be equal to that of a local route, which means that the same route learned by an IGP will have a lower administrative distance and be installed instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Back Door Route</em>' attribute.
	 * @see #setIsBackDoorRoute(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPIPRoute_IsBackDoorRoute()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsBackDoorRoute();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPIPRoute#getIsBackDoorRoute <em>Is Back Door Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Back Door Route</em>' attribute.
	 * @see #getIsBackDoorRoute()
	 * @generated
	 */
	void setIsBackDoorRoute(Boolean value);

	/**
	 * Returns the value of the '<em><b>Uses Loopback Peering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loopback interfaces are often used by IBGP peers, because they eliminate a dependency that would otherwise occur if the actual IP address of a physical interface was used to configure BGP. The loopback interface instead instructs the router to use any available interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses Loopback Peering</em>' attribute.
	 * @see #setUsesLoopbackPeering(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPIPRoute_UsesLoopbackPeering()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUsesLoopbackPeering();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPIPRoute#getUsesLoopbackPeering <em>Uses Loopback Peering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Loopback Peering</em>' attribute.
	 * @see #getUsesLoopbackPeering()
	 * @generated
	 */
	void setUsesLoopbackPeering(Boolean value);

} // CIM_BGPIPRoute

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
 * A representation of the model object '<em><b>CIM Next Hop IP Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NextHopIPRoute specifies routing in an IP network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NextHopIPRoute#getRouteDerivation <em>Route Derivation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopIPRoute#getOtherDerivation <em>Other Derivation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopIPRoute#getDestinationMask <em>Destination Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopIPRoute#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopIPRoute#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NextHopIPRoute()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.40.0' UMLPackagePath='CIM::Network::Routes' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NextHopIPRoute extends CIM_NextHopRoute {
	/**
	 * Returns the value of the '<em><b>Route Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer indicating how the route was derived. This is useful for display and query purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Derivation</em>' attribute.
	 * @see #setRouteDerivation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopIPRoute_RouteDerivation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Unknown\",\"Other\",\"Connected\",\"User-Defined\",\"IGRP\",\"EIGRP\",\"RIP\",\"Hello\",\"EGP\",\"BGP\",\"ISIS\",\"OSPF\"]' ModelCorrespondence='[\"CIM_NextHopIPRoute.OtherDerivation\"]'"
	 * @generated
	 */
	Integer getRouteDerivation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopIPRoute#getRouteDerivation <em>Route Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Derivation</em>' attribute.
	 * @see #getRouteDerivation()
	 * @generated
	 */
	void setRouteDerivation(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing how the route was derived when the RouteDerivation property is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Derivation</em>' attribute.
	 * @see #setOtherDerivation(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopIPRoute_OtherDerivation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_NextHopIPRoute.RouteDerivation\"]'"
	 * @generated
	 */
	String getOtherDerivation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopIPRoute#getOtherDerivation <em>Other Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Derivation</em>' attribute.
	 * @see #getOtherDerivation()
	 * @generated
	 */
	void setOtherDerivation(String value);

	/**
	 * Returns the value of the '<em><b>Destination Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mask for the Ipv4 destination address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Mask</em>' attribute.
	 * @see #setDestinationMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopIPRoute_DestinationMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.SubnetMask\"]'"
	 * @generated
	 */
	String getDestinationMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopIPRoute#getDestinationMask <em>Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Mask</em>' attribute.
	 * @see #getDestinationMask()
	 * @generated
	 */
	void setDestinationMask(String value);

	/**
	 * Returns the value of the '<em><b>Prefix Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefix length for the IPv6 destination address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix Length</em>' attribute.
	 * @see #setPrefixLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopIPRoute_PrefixLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.IPv6SubnetPrefixLength\"]'"
	 * @generated
	 */
	Integer getPrefixLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopIPRoute#getPrefixLength <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Length</em>' attribute.
	 * @see #getPrefixLength()
	 * @generated
	 */
	void setPrefixLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the format of the address properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopIPRoute_AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]'"
	 * @generated
	 */
	Integer getAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopIPRoute#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(Integer value);

} // CIM_NextHopIPRoute

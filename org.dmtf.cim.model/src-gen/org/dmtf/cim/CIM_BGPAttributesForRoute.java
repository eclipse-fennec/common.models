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
 * A representation of the model object '<em><b>CIM BGP Attributes For Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This defines the attributes that are transmitted between BGP peers on a per-route basis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributesForRoute#getPathAttrPeer <em>Path Attr Peer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributesForRoute#getPathAttrIPAddrPrefixLen <em>Path Attr IP Addr Prefix Len</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributesForRoute#getPathAttrIPAddrPrefix <em>Path Attr IP Addr Prefix</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributesForRoute()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::BGP' override.Antecedent='CIM_BGPPathAttributes REF' override.Antecedent.Max='1' override.Antecedent.Description='The BGPPathAttribute object that may be associated with a BGPIPRoute.' override.Dependent='CIM_BGPIPRoute REF' override.Dependent.Max='1' override.Dependent.Description='The BGPIPRoute that may have an associated set of per-peer attributes.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_BGPAttributesForRoute extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Path Attr Peer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the IP address of the peer where the path information was learned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Peer</em>' attribute.
	 * @see #setPathAttrPeer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributesForRoute_PathAttrPeer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrPeer\"]' ModelCorrespondence='[\"CIM_BGPAttributesForRoute.PathAttrIPAddrPrefixLen\",\"CIM_BGPAttributesForRoute.PathAttrIPAddrPrefix\"]'"
	 * @generated
	 */
	String getPathAttrPeer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributesForRoute#getPathAttrPeer <em>Path Attr Peer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Peer</em>' attribute.
	 * @see #getPathAttrPeer()
	 * @generated
	 */
	void setPathAttrPeer(String value);

	/**
	 * Returns the value of the '<em><b>Path Attr IP Addr Prefix Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the length in bits of the IP address prefix for the property, PathAttrPeer. The range is 0 to 32.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr IP Addr Prefix Len</em>' attribute.
	 * @see #setPathAttrIPAddrPrefixLen(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributesForRoute_PathAttrIPAddrPrefixLen()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrIpAddrPrefixLen\"]' ModelCorrespondence='[\"CIM_BGPAttributesForRoute.PathAttrPeer\"]'"
	 * @generated
	 */
	Integer getPathAttrIPAddrPrefixLen();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributesForRoute#getPathAttrIPAddrPrefixLen <em>Path Attr IP Addr Prefix Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr IP Addr Prefix Len</em>' attribute.
	 * @see #getPathAttrIPAddrPrefixLen()
	 * @generated
	 */
	void setPathAttrIPAddrPrefixLen(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Attr IP Addr Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address prefix of the property, PathAttrPeer. Its length is specified by the property, PathAttrIpAddrPrefixLen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr IP Addr Prefix</em>' attribute.
	 * @see #setPathAttrIPAddrPrefix(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributesForRoute_PathAttrIPAddrPrefix()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrIpAddrPrefix\"]' ModelCorrespondence='[\"CIM_BGPAttributesForRoute.PathAttrPeer\",\"CIM_BGPAttributesForRoute.PathAttrIPAddrPrefixLen\"]'"
	 * @generated
	 */
	String getPathAttrIPAddrPrefix();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributesForRoute#getPathAttrIPAddrPrefix <em>Path Attr IP Addr Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr IP Addr Prefix</em>' attribute.
	 * @see #getPathAttrIPAddrPrefix()
	 * @generated
	 */
	void setPathAttrIPAddrPrefix(String value);

} // CIM_BGPAttributesForRoute

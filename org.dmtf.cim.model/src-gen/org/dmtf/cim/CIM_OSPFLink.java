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
 * A representation of the model object '<em><b>CIM OSPF Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to represent OSPF connectivity between two or more OSPF protocol endpoints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSPFLink#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFLink#getHelloInterval <em>Hello Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFLink#getRouterDeadInterval <em>Router Dead Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFLink#getMulticastForwarding <em>Multicast Forwarding</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFLink()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFLink extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the OSPF link, see section 1.2 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see #setLinkType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFLink_LinkType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Point-To-Point\",\"Point-To-Multipoint\",\"Broadcast\",\"NBMA\"]'"
	 * @generated
	 */
	Integer getLinkType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFLink#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(Integer value);

	/**
	 * Returns the value of the '<em><b>Hello Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time, in seconds, between sending OSPF Hello-packets over the interface, see section C.3 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hello Interval</em>' attribute.
	 * @see #setHelloInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFLink_HelloInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfHelloInterval\"]' PUnit='second'"
	 * @generated
	 */
	Long getHelloInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFLink#getHelloInterval <em>Hello Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hello Interval</em>' attribute.
	 * @see #getHelloInterval()
	 * @generated
	 */
	void setHelloInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Router Dead Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After ceasing to hear a router's Hello-packets, the number of seconds before its neighbors declare the router down, see section C.3 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Router Dead Interval</em>' attribute.
	 * @see #setRouterDeadInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFLink_RouterDeadInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfRtrDeadInterval\"]' PUnit='second'"
	 * @generated
	 */
	Long getRouterDeadInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFLink#getRouterDeadInterval <em>Router Dead Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Dead Interval</em>' attribute.
	 * @see #getRouterDeadInterval()
	 * @generated
	 */
	void setRouterDeadInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Multicast Forwarding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This parameter indicates whether IP multicast datagrams should be forwarded over this OSPF link, and if so, how the forwarding should be done, see section B.2 in RFC 1584.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multicast Forwarding</em>' attribute.
	 * @see #setMulticastForwarding(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFLink_MulticastForwarding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Disabled\",\"Data-link Multicast\",\"Data-link Unicast\"]' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfIfMulticastForwarding\"]'"
	 * @generated
	 */
	Integer getMulticastForwarding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFLink#getMulticastForwarding <em>Multicast Forwarding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicast Forwarding</em>' attribute.
	 * @see #getMulticastForwarding()
	 * @generated
	 */
	void setMulticastForwarding(Integer value);

} // CIM_OSPFLink

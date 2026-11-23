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
 * A representation of the model object '<em><b>CIM Forwarding Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the functions used in forwarding network traffic. Its instances act on packets received from one or more ProtocolEndpoints or Services, and drop (discard), or send those packets to one or more other ProtocolEndpoints or Services. The explicit Endpoints being forwarded between, are described using the ForwardsAmong association (or one of its subclasses). Generally, the Endpoints are at the same protocol layer and are usually of similar types, or of the same type. ForwardingService is different than RouteCalculation Service in that it represents the function of forwarding traffic independent of calculating routing information. 
 * 
 * Examining the ForwardingService class definition, note that its superclass NetworkService is deprecated. Therefore, NetworkService's properties need not be implemented in an instance of ForwardingService. Unfortunately, NetworkService cannot be removed from the object hierarchy without a major Schema release. When/if this occurs, the NetworkService superclass will be removed, and ForwardingService will subclass from CIM_Service directly. Also note that there are a large number of additional protocols that are not currently modeled. These will be added over time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ForwardingService#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ForwardingService#getOtherProtocolType <em>Other Protocol Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ForwardingService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ForwardingService extends CIM_NetworkService {
	/**
	 * Returns the value of the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the type of protocol that is being forwarded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Type</em>' attribute.
	 * @see #setProtocolType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ForwardingService_ProtocolType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\"]' Values='[\"Unknown\",\"Other\",\"IPv4\",\"IPv6\",\"IPv4/IPv6\",\"IPX\",\"AppleTalk\",\"DECnet\",\"SNA\",\"CONP\",\"CLNP\",\"VINES\",\"XNS\",\"ATM\",\"Frame Relay\",\"Ethernet\",\"TokenRing\",\"FDDI\",\"Infiniband\",\"Fibre Channel\"]' ModelCorrespondence='[\"CIM_ForwardingService.OtherProtocolType\"]'"
	 * @generated
	 */
	Integer getProtocolType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ForwardingService#getProtocolType <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Type</em>' attribute.
	 * @see #getProtocolType()
	 * @generated
	 */
	void setProtocolType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the type of protocol that is being forwarded when the value of the ProtocolType attribute is 1 (i.e., "Other"). This provides for future extensibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Protocol Type</em>' attribute.
	 * @see #setOtherProtocolType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ForwardingService_OtherProtocolType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32' ModelCorrespondence='[\"CIM_ForwardingService.ProtocolType\"]'"
	 * @generated
	 */
	String getOtherProtocolType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ForwardingService#getOtherProtocolType <em>Other Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Protocol Type</em>' attribute.
	 * @see #getOtherProtocolType()
	 * @generated
	 */
	void setOtherProtocolType(String value);

} // CIM_ForwardingService

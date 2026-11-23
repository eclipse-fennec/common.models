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
 * A representation of the model object '<em><b>CIM VLAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of VLAN represents a VLAN within a switch. In a particular switch, there should be an instance of VLAN for every VLAN available. For example, in a switch with port-based VLANs, if there are 16 VLANs to which ports can be assigned (VLAN 1 through VLAN 16), there should be an instance of CIM_VLAN for each of VLAN 1 through VLAN 16. 
 * 
 * VLAN inherits Name from ServiceAccessPoint. Use this for the textual name of the VLAN, if there is one. Otherwise, synthesize a textual name, e.g., VLAN 0003. (Consider leading zero fill, as shown, to ensure that if the textual VLAN names are extracted and presented by a management applictions, the VLAN names will sort in the expected order.) The numeric part of the name should be at least four digits wide since 802.1Q specifies 4095 VLANs. 
 * 
 * It is intended that VLAN be subclassed only if necessary to add attributes. The type of the VLAN can be inferred from the VLANService(s) with which the VLAN is associated in the VLANFor association. 
 * 
 * An instance of VLAN may be associated with more than one VLANService. For example, there are switches that support both 802.1Q VLANs and the vendor's proprietary VLANs. In some such switches, if a broadcast packet is received on a port in an 802.1Q VLAN (VLAN 5, for example), it may be be transmitted from a port in a 'proprietary' VLAN 5. In effect, there is only one VLAN 5, and the type of port only determines the packet format for tagged packets. In the case just described, only one instance of CIM_VLAN should be instantiated for VLAN 5, and it should be associated both with the 802.1Q VLANService and the proprietary VLANService. 
 * 
 * In typical VLAN-aware switches, packets can be assigned to a VLAN based on the port on which they are received (port-based VLANS), based on the source MAC address (MAC-based VLANs), or based on the value of a set of bits in the packet (protocol-based VLANs). If it is desirable to represent the VLAN assignment predicate for some MAC-based VLAN switch, it will be necessary to subclass VLAN. The list of MAC addresses associated with a VLAN might be an attribute of the subclass. If it is desirable to represent the VLAN assignment predicate in a protocol-based VLAN switch, it will also be necessary to subclass VLAN, InboundVLAN, or both. If the predicate applies to all ports in the switch, then only VLAN need be used/instantiated. If the predicate may vary based on the port, then InboundVLAN must be subclassed, and CIM_VLAN might have to be subclassed as well.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VLAN#getVLANNumber <em>VLAN Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VLAN()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_VLAN extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>VLAN Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VLAN identifying number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLAN Number</em>' attribute.
	 * @see #setVLANNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VLAN_VLANNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Integer getVLANNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VLAN#getVLANNumber <em>VLAN Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLAN Number</em>' attribute.
	 * @see #getVLANNumber()
	 * @generated
	 */
	void setVLANNumber(Integer value);

} // CIM_VLAN

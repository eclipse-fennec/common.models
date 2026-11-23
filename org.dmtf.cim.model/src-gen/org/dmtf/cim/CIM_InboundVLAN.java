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
 * A representation of the model object '<em><b>CIM Inbound VLAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is deprecated in lieu or not being necessary to indicate whether the VLAN is inbound/outbound This association makes explicit the operational dependencies of a SwitchPort when operating in a VLAN. If there is an association between a particular SwitchPort and a particular VLAN, then there is the possibility that a packet received by the port will be assigned to the VLAN (or if the packet already has a VLAN tag, that the packet will not be dropped). If there is no such association, then there is NO possibility that a packet received by the port will progress through the switch having been assigned to the referenced VLAN.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InboundVLAN#getTagged <em>Tagged</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InboundVLAN#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InboundVLAN()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' override.Antecedent='CIM_VLAN REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='The VLAN to which the SwitchPort is assigned.' override.Dependent='CIM_SwitchPort REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Description='The SwitchPort on the VLAN.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_InboundVLAN extends CIM_SAPSAPDependency {
	/**
	 * Returns the value of the '<em><b>Tagged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If TRUE, packets already tagged with this VLAN number will be accepted when arriving at this port. For example, if there is an InboundVLAN association between port 12 and VLAN 7 for which Tagged is true, then when a packet tagged with VLAN 7 arrives at port 12, the packet will be accepted into the switch for further processing. If there is no such association, then the packet will be dropped. 
	 * 
	 * If FALSE, it means that any untagged packets arriving at this port MIGHT be classified into the associated VLAN. If, for a particular SwitchPort, there is only one instance of the association for which Tagged is FALSE, then all incoming untagged packets will be classified into that VLAN. This is the typical configuration of a non-trunk port in a switch implementing port-based VLANs. If there is more than one such association instance, then the packet MIGHT be classified into any one of them, based on some criterion other than the identity of the switch port. For example, in a MAC-based VLAN switch, the decision would be based on the source MAC address. In a protocol-based VLAN switch, the decision would be based on the values of some set of bits in the packet. 
	 * 
	 * Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tagged</em>' attribute.
	 * @see #setTagged(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_InboundVLAN_Tagged()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getTagged();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InboundVLAN#getTagged <em>Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagged</em>' attribute.
	 * @see #getTagged()
	 * @generated
	 */
	void setTagged(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default should be TRUE if untagged packets received by the SwitchPort are assigned to the VLAN. For 802.1Q-compliant ports, the Default property should be TRUE on the association instance connecting a SwitchPort to the VLAN corresponding to the port's PVID. Default MUST never be TRUE if Tagged is true -- it applies only to untagged packets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_InboundVLAN_Default()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InboundVLAN#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Boolean value);

} // CIM_InboundVLAN

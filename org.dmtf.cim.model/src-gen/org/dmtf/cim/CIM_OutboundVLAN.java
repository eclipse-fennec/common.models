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
 * A representation of the model object '<em><b>CIM Outbound VLAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is deprecated in lieu or not being necessary to indicate whether the VLAN is inbound/outbound This association makes explicit the operational dependencies of a SwitchPort when operating in a VLAN. If there is no instance of OutboundVLAN between a given SwitchPort and VLAN, then any packet that has been assigned to the VLAN and whose destination address is associated with the port will be dropped by the switch without being transmitted. Otherwise, the packet will be transmitted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OutboundVLAN#getTagged <em>Tagged</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OutboundVLAN()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' override.Antecedent='CIM_VLAN REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='The VLAN to which the SwitchPort is assigned.' override.Dependent='CIM_SwitchPort REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Description='The SwitchPort on the VLAN.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_OutboundVLAN extends CIM_SAPSAPDependency {
	/**
	 * Returns the value of the '<em><b>Tagged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If Tagged is TRUE, then the packet will be transmitted in encapsulated form, tagged with the associated VLAN tag. If Tagged is FALSE, the packet will be trasmitted without any VLAN tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tagged</em>' attribute.
	 * @see #setTagged(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_OutboundVLAN_Tagged()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getTagged();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OutboundVLAN#getTagged <em>Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagged</em>' attribute.
	 * @see #getTagged()
	 * @generated
	 */
	void setTagged(Boolean value);

} // CIM_OutboundVLAN

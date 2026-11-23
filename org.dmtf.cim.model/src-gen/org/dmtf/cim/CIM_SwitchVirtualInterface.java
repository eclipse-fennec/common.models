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
 * A representation of the model object '<em><b>CIM Switch Virtual Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Configuration class for a switch virtual interface which is a VLAN of switch ports represented by one interface to a routing or bridging system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchVirtualInterface#getVLANId <em>VLAN Id</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchVirtualInterface()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Network' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchVirtualInterface extends CIM_IPProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>VLAN Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 12-bit VLAN ID that this interface is dependent on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLAN Id</em>' attribute.
	 * @see #setVLANId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchVirtualInterface_VLANId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' MaxValue='4094' MappingStrings='[\"MIB.IETF|Q-BRIDGE-MIB.VlanId\"]'"
	 * @generated
	 */
	Integer getVLANId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchVirtualInterface#getVLANId <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLAN Id</em>' attribute.
	 * @see #getVLANId()
	 * @generated
	 */
	void setVLANId(Integer value);

} // CIM_SwitchVirtualInterface

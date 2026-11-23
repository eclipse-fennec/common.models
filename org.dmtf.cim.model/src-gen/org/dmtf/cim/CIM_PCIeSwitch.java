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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM PC Ie Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a PCI device that provide PCI Express switch capability.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PCIeSwitch#getNumberOfPorts <em>Number Of Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIeSwitch#getSecondaryBusNumbers <em>Secondary Bus Numbers</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PCIeSwitch()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PCIeSwitch extends CIM_PCIDevice {
	/**
	 * Returns the value of the '<em><b>Number Of Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of ports that are exposed by this switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Ports</em>' attribute.
	 * @see #setNumberOfPorts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIeSwitch_NumberOfPorts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getNumberOfPorts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIeSwitch#getNumberOfPorts <em>Number Of Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Ports</em>' attribute.
	 * @see #getNumberOfPorts()
	 * @generated
	 */
	void setNumberOfPorts(Integer value);

	/**
	 * Returns the value of the '<em><b>Secondary Bus Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of the PCI bus segments to which the secondary interfaces of the switch are connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Bus Numbers</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIeSwitch_SecondaryBusNumbers()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]'"
	 * @generated
	 */
	EList<Integer> getSecondaryBusNumbers();

} // CIM_PCIeSwitch

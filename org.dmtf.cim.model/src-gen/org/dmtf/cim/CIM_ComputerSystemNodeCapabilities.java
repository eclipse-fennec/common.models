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
 * A representation of the model object '<em><b>CIM Computer System Node Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates general capabilities of a ComputerSystem node, such as the ability to support a battery (and be portable), and ECC memory. To tie these capabilities to a ComputerSystem instance, the ElementCapabilities association is used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ComputerSystemNodeCapabilities#getBatterySupported <em>Battery Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ComputerSystemNodeCapabilities#getECCSupported <em>ECC Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemNodeCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.2' UMLPackagePath='CIM::System::SystemElements' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ComputerSystemNodeCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Battery Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating whether a battery is installable/ supportable on this System. This is independent of whether one is currently installed. The latter is indicated by an instance of the CIM_Battery class associated using the SystemDevice relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Battery Supported</em>' attribute.
	 * @see #setBatterySupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemNodeCapabilities_BatterySupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Battery Supported\",\"Battery Not Supported\"]'"
	 * @generated
	 */
	Integer getBatterySupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ComputerSystemNodeCapabilities#getBatterySupported <em>Battery Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Supported</em>' attribute.
	 * @see #getBatterySupported()
	 * @generated
	 */
	void setBatterySupported(Integer value);

	/**
	 * Returns the value of the '<em><b>ECC Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating whether ECC single or multi-bit memory is supported on this node. This is independent of whether ECC memory is actually installed. The latter is indicated by an instance of CIM_PhysicalMemory that 'Realizes' the CIM_Memory of the System (associated using SystemDevice).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ECC Supported</em>' attribute.
	 * @see #setECCSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystemNodeCapabilities_ECCSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Single-bit ECC\",\"Multi-bit ECC\"]' MappingStrings='[\"MIF.DMTF|Physical Memory|002.10\"]'"
	 * @generated
	 */
	Integer getECCSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ComputerSystemNodeCapabilities#getECCSupported <em>ECC Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECC Supported</em>' attribute.
	 * @see #getECCSupported()
	 * @generated
	 */
	void setECCSupported(Integer value);

} // CIM_ComputerSystemNodeCapabilities

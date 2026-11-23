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
 * A representation of the model object '<em><b>CIM Device Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DeviceConnection relationship indicates that two or more Devices are connected together.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DeviceConnection#getNegotiatedSpeed <em>Negotiated Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceConnection#getNegotiatedDataWidth <em>Negotiated Data Width</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceConnection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::DeviceElements' override.Antecedent='CIM_LogicalDevice REF' override.Antecedent.Description='A LogicalDevice.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='A second LogicalDevice that is connected to the Antecedent Device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceConnection extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Negotiated Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When several bus and connection speeds are possible, the NegotiatedSpeed property defines the one that is in use between the Devices. Speed is specified in bits per second. If connection or bus speeds are not negotiated, or if this information is not available or not important to Device management, the property should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiated Speed</em>' attribute.
	 * @see #setNegotiatedSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceConnection_NegotiatedSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bits per Second' MappingStrings='[\"MIF.DMTF|Bus Port Association|001.2\"]' PUnit='bit / second'"
	 * @generated
	 */
	Long getNegotiatedSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceConnection#getNegotiatedSpeed <em>Negotiated Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Speed</em>' attribute.
	 * @see #getNegotiatedSpeed()
	 * @generated
	 */
	void setNegotiatedSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Negotiated Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When several bus and connection data widths are possible, the NegotiatedDataWidth property defines the one that is in use between the Devices. Data width is specified in bits. If data width is not negotiated, or if this information is not available or not important to Device management, the property should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiated Data Width</em>' attribute.
	 * @see #setNegotiatedDataWidth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceConnection_NegotiatedDataWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits' MappingStrings='[\"MIF.DMTF|Bus Port Association|001.3\"]' PUnit='bit'"
	 * @generated
	 */
	Long getNegotiatedDataWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DeviceConnection#getNegotiatedDataWidth <em>Negotiated Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Data Width</em>' attribute.
	 * @see #getNegotiatedDataWidth()
	 * @generated
	 */
	void setNegotiatedDataWidth(Long value);

} // CIM_DeviceConnection

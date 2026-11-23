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
 * A representation of the model object '<em><b>CIM Serial Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the SerialController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SerialController#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SerialController#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SerialController#getMaxBaudRate <em>Max Baud Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SerialController#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SerialController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_SerialController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Capabilities property defines chip level compatibility for the SerialController. Therefore, this property describes the buffering and other capabilities of the SerialController that might be inherent in the chip hardware. The property is an enumerated integer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SerialController_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"160\",\"161\"]' Values='[\"Other\",\"Unknown\",\"XT/AT Compatible\",\"16450 Compatible\",\"16550 Compatible\",\"16550A Compatible\",\"8251 Compatible\",\"8251FIFO Compatible\"]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|Serial Ports|004.7\"]' ModelCorrespondence='[\"CIM_SerialController.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the SerialController features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SerialController_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SerialController.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Max Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum baud rate in Bits per Second that is supported by the SerialController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Baud Rate</em>' attribute.
	 * @see #setMaxBaudRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SerialController_MaxBaudRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' MappingStrings='[\"MIF.DMTF|Serial Ports|004.6\"]' PUnit='bit / second'"
	 * @generated
	 */
	Long getMaxBaudRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SerialController#getMaxBaudRate <em>Max Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Baud Rate</em>' attribute.
	 * @see #getMaxBaudRate()
	 * @generated
	 */
	void setMaxBaudRate(Long value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that indicates the operational security for the Controller. For example, information that the external interface of the Device is locked out (value=4) or "Boot Bypass" (value=6) can be described using this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SerialController_Security()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"None\",\"External Interface Locked Out\",\"External Interface Enabled\",\"Boot Bypass\"]' MappingStrings='[\"MIF.DMTF|Serial Ports|004.9\"]'"
	 * @generated
	 */
	Integer getSecurity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SerialController#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Integer value);

} // CIM_SerialController

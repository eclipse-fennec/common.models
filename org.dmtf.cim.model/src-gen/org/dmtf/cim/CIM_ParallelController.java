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
 * A representation of the model object '<em><b>CIM Parallel Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the ParallelController.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ParallelController#getDMASupport <em>DMA Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ParallelController#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ParallelController#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ParallelController#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ParallelController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_ParallelController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>DMA Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the ParallelController supports DMA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DMA Support</em>' attribute.
	 * @see #setDMASupport(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParallelController_DMASupport()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIF.DMTF|Parallel Ports|003.7\"]'"
	 * @generated
	 */
	Boolean getDMASupport();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParallelController#getDMASupport <em>DMA Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMA Support</em>' attribute.
	 * @see #getDMASupport()
	 * @generated
	 */
	void setDMASupport(Boolean value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration that indicates the capabilities of the ParallelController.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ParallelController_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"XT/AT Compatible\",\"PS/2 Compatible\",\"ECP\",\"EPP\",\"PC-98\",\"PC-98-Hireso\",\"PC-H98\"]' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|Parallel Ports|003.8\"]' ModelCorrespondence='[\"CIM_ParallelController.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the ParallelController features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ParallelController_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ParallelController.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that indicates the operational security for the Controller. For example, information that the external interface of the Device is locked out (value=4) or "Boot Bypass" (value=6) can be described using this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ParallelController_Security()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"None\",\"External Interface Locked Out\",\"External Interface Enabled\",\"Boot Bypass\"]' MappingStrings='[\"MIF.DMTF|Parallel Ports|003.10\"]'"
	 * @generated
	 */
	Integer getSecurity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ParallelController#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Integer value);

} // CIM_ParallelController

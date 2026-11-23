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
 * A representation of the model object '<em><b>CIM Device Sharing Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Capabilities that describes the type of access supported for a shared device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DeviceSharingCapabilities#getSupportedAccessModes <em>Supported Access Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DeviceSharingCapabilities#getOtherSupportedAccessModes <em>Other Supported Access Modes</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSharingCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::SCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DeviceSharingCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Access Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedAccess describes the types of shared access that are supported for the referenced LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Access Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSharingCapabilities_SupportedAccessModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"No Access\",\"Exclusive Access\",\"Shared Read\",\"Shared Full\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SharingDependency.CurrentAccess\",\"CIM_DeviceSharingCapabilities.OtherSupportedAccessModes\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAccessModes();

	/**
	 * Returns the value of the '<em><b>Other Supported Access Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string value describing SupportedAccess when it has a value of "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Access Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DeviceSharingCapabilities_OtherSupportedAccessModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DeviceSharingCapabilities.SupportedAccessModes\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedAccessModes();

} // CIM_DeviceSharingCapabilities

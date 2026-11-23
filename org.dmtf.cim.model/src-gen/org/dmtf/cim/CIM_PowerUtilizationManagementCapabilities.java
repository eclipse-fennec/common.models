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
 * A representation of the model object '<em><b>CIM Power Utilization Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_PowerUtilizationManagementCapabilities describes the capabilities of the associated CIM_PowerUtilizationManagementService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PowerUtilizationManagementCapabilities#getPowerUtilizationModesSupported <em>Power Utilization Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PowerUtilizationManagementCapabilities#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PowerUtilizationManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.23.0' UMLPackagePath='CIM::Device::CoolingAndPower' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PowerUtilizationManagementCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Power Utilization Modes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PowerUtilizationModesSupported indicates the power utilization modes supported by associated instances of CIM_PowerUtilizationManagementService. See CIM_PowerUtilizationManagementService.PowerSavingMode for a description of each enumeration value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Utilization Modes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerUtilizationManagementCapabilities_PowerUtilizationModesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Dynamic\",\"Static\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PowerUtilizationManagementService.PowerUtilizationMode\"]'"
	 * @generated
	 */
	EList<Integer> getPowerUtilizationModesSupported();

	/**
	 * Returns the value of the '<em><b>Supported Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of supported method identifiers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerUtilizationManagementCapabilities_SupportedMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"..\",\"32768..65535\"]' Values='[\"ApplyPowerAllocationSettings\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedMethods();

} // CIM_PowerUtilizationManagementCapabilities

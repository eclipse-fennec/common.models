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
 * A representation of the model object '<em><b>CIM Power Utilization Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PowerUtilizationManagementService represents the ability of a platform or component to perform autonomic management of its power utilization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PowerUtilizationManagementService#getPowerUtilizationMode <em>Power Utilization Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PowerUtilizationManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.23.0' UMLPackagePath='CIM::Device::CoolingAndPower' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PowerUtilizationManagementService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Power Utilization Mode</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PowerUtilizationMode indicates the current power utilization mode implemented by the service. The mode selection is a generally made infrequently as part of element configuration. 
	 * A value of "None" shall indicate that no effort is being made to reduce the power consumed by the system below nominal. 
	 * A value of "Dynamic" shall indicate the PowerUtilizationManagementService is actively modifying the configuration of one or more system components in order to reduce the power consumed. 
	 * A value of "Static" shall indicate the system whose power utilization functionality is represented by the PowerUtilizationManagementService is operating with a fixed configuration resulting in a lower level of power consumption than nominal. Static mode differs from dynamic in that the mode corresponds to a single fixed configuration, while dynamic mode implies frequent changes in system configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Utilization Mode</em>' attribute.
	 * @see #setPowerUtilizationMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PowerUtilizationManagementService_PowerUtilizationMode()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"None\",\"Dynamic\",\"Static\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PowerUtilizationManagementCapabilities.PowerUtilizationModesSupported\"]'"
	 * @generated
	 */
	Integer getPowerUtilizationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PowerUtilizationManagementService#getPowerUtilizationMode <em>Power Utilization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Utilization Mode</em>' attribute.
	 * @see #getPowerUtilizationMode()
	 * @generated
	 */
	void setPowerUtilizationMode(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the Power Allocation Settings that represents.the power aspect of the system. When applied to a system's Power Allocation settings, a system's power allocation settingsmay be modified.Upon successfull execution if the limit property of the power aspectis modified the power cap is modified
	 * @param PowerAllocationSettings An embedded instance of class CIM_PowerAllocationSettingData that describes modifications to the existing power allocation aspects of a computer system. The embedded instance must have a valid InstanceID in order to identify the power allocation setting to be modified.
	 * @param Job If the operation is long running, then optionally a job be returned.
	 * <!-- end-model-doc -->
	 * @model PowerAllocationSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true' EmbeddedInstance='CIM_PowerAllocationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ApplyPowerAllocationSettings(String PowerAllocationSettings, CIM_ConcreteJob Job);

} // CIM_PowerUtilizationManagementService

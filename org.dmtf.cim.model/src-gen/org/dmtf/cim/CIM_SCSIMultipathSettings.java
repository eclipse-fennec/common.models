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
 * A representation of the model object '<em><b>CIM SCSI Multipath Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from CIM_SettingData describing settings related to management of multiple paths to SCSI devices. It is associated to one of more instances of subclasses of LogicalDevice that represent SCSI logical units. If a LogicalDevice instance is associated to an instance of SCSIPathConfigurationService and is not associated to an instance of this class, the the default values for properties below and the polling values from the associated CIM_SCSIMultipathConfigurationCapabilities instance apply.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getAsymmetric <em>Asymmetric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getCurrentLoadBalanceType <em>Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getOtherCurrentLoadBalanceType <em>Other Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getPollingRateMax <em>Polling Rate Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getCurrentPollingRate <em>Current Polling Rate</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::Device::SCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIMultipathSettings extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Asymmetric</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean indicating whether the associated logical unit has asymmetric multipath access. If Asymmetric is true, then there MUST be a SCSITargetPortGroup instance associated to the LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asymmetric</em>' attribute.
	 * @see #setAsymmetric(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathSettings_Asymmetric()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|asymmetric\"]'"
	 * @generated
	 */
	Boolean getAsymmetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getAsymmetric <em>Asymmetric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asymmetric</em>' attribute.
	 * @see #getAsymmetric()
	 * @generated
	 */
	void setAsymmetric(Boolean value);

	/**
	 * Returns the value of the '<em><b>Current Load Balance Type</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The load balance type for the associated logical unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Load Balance Type</em>' attribute.
	 * @see #setCurrentLoadBalanceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathSettings_CurrentLoadBalanceType()
	 * @model default="7"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"No Load Balancing\",\"Round Robin\",\"Least Blocks\",\"Least IO\",\"Product Specific\",\"Service Wide Default\"]' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|currentLoadBalanceType\"]' ModelCorrespondence='[\"CIM_SCSIMultipathSettings.OtherCurrentLoadBalanceType\"]'"
	 * @generated
	 */
	Integer getCurrentLoadBalanceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getCurrentLoadBalanceType <em>Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Load Balance Type</em>' attribute.
	 * @see #getCurrentLoadBalanceType()
	 * @generated
	 */
	void setCurrentLoadBalanceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Current Load Balance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the current load balance algorithm if CurrentLoadBalanceType is 1 ('Other'). This string MUST be identical to one of the strings from CIM_SCSIMultipathConfigurationCapabilities OtherSupportedLoadBalanceAlgorithmNames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Current Load Balance Type</em>' attribute.
	 * @see #setOtherCurrentLoadBalanceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathSettings_OtherCurrentLoadBalanceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|currentLoadBalanceType\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.OtherSupportedLoadBalanceAlgorithmNames\",\"CIM_SCSIMultipathSettings.CurrentLoadBalanceType\"]'"
	 * @generated
	 */
	String getOtherCurrentLoadBalanceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getOtherCurrentLoadBalanceType <em>Other Current Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Current Load Balance Type</em>' attribute.
	 * @see #getOtherCurrentLoadBalanceType()
	 * @generated
	 */
	void setOtherCurrentLoadBalanceType(String value);

	/**
	 * Returns the value of the '<em><b>Auto Failback Enabled</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The auto-failback setting for the associated logical units. Either enabled, disabled, or all associated logical units follow the service-wide setting from the capabilities class associated with the appropriate service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Failback Enabled</em>' attribute.
	 * @see #setAutoFailbackEnabled(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathSettings_AutoFailbackEnabled()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Enabled for the associated logical units\",\"Disabled for the associated logical units\",\"The associated logical units use the service-wide setting\"]' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|autoFailbackEnabled\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.AutoFailbackEnabled\"]'"
	 * @generated
	 */
	Integer getAutoFailbackEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Failback Enabled</em>' attribute.
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 */
	void setAutoFailbackEnabled(Integer value);

	/**
	 * Returns the value of the '<em><b>Polling Rate Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum polling rate (in seconds) supported by the driver if different from the service-wide max from the capabilities instance. Zero (0) indicates the driver either does not poll for autofailback or has not provided an interface to set the polling rate for multipath logical units. If this property and the service PollingRateMax are non-zero, this value has precedence for the associate logical units. The instrumentation should not instantiate this property if the value from CIM_SCSIMultipathConfigurationCapabilities is used for the associated logical units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polling Rate Max</em>' attribute.
	 * @see #setPollingRateMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathSettings_PollingRateMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|pollingRateMax\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.PollingRateMax\"]'"
	 * @generated
	 */
	Long getPollingRateMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getPollingRateMax <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Rate Max</em>' attribute.
	 * @see #getPollingRateMax()
	 * @generated
	 */
	void setPollingRateMax(Long value);

	/**
	 * Returns the value of the '<em><b>Current Polling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current polling rate (in seconds) for auto-failback. This cannot exceed PollingRateMax. If this property and the service-wide Capabilities instance CurrentPollingRate are non-zero, this value has precedence for the associated logical units. The instrumentation should not instantiate this property if the value from CIM_SCSIMultipathConfigurationCapabilities is used for the associated logical units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Polling Rate</em>' attribute.
	 * @see #setCurrentPollingRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSIMultipathSettings_CurrentPollingRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|currentPollingRate\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.CurrentPollingRate\"]'"
	 * @generated
	 */
	Long getCurrentPollingRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSIMultipathSettings#getCurrentPollingRate <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Polling Rate</em>' attribute.
	 * @see #getCurrentPollingRate()
	 * @generated
	 */
	void setCurrentPollingRate(Long value);

} // CIM_SCSIMultipathSettings

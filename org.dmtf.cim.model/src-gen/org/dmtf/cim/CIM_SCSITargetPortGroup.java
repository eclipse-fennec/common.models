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
 * A representation of the model object '<em><b>CIM SCSI Target Port Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from SystemSpecificCollection that models SCSI Target Port Groups. SCSITargetPortGroup is part of the model for devices with asymmetric access to logical units - access is optimized for a subset of target ports. SCSITargetPortGroup is aggregated to SCSIProtocolEndpoints that expose a common ValueMap { 2, 3, 4, 5, 6 }, Values { Active/Optimized, Active/Non-optimized, StandBy, Unavailable, Transitioning }, access state for a set of associated logical Units (modeled by various subclasses of LogicalDevice). SCSITargetPortGroups only apply to target devices with asymmetric multipath access and not to devices with symmetric (or single path) access.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getAsymmetric <em>Asymmetric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getCurrentLoadBalanceType <em>Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getOtherCurrentLoadBalanceType <em>Other Current Load Balance Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getPollingRateMax <em>Polling Rate Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getCurrentPollingRate <em>Current Polling Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getAccessState <em>Access State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getExplicitFailover <em>Explicit Failover</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getSupportsLuAssignment <em>Supports Lu Assignment</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::Device::StorageDevices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SCSITargetPortGroup extends CIM_SystemSpecificCollection {
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_Asymmetric()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|asymmetric\"]'"
	 * @generated
	 */
	Boolean getAsymmetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getAsymmetric <em>Asymmetric</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_CurrentLoadBalanceType()
	 * @model default="7"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"No Load Balancing\",\"Round Robin\",\"Least Blocks\",\"Least IO\",\"Product Specific\",\"Service Wide Default\"]' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|currentLoadBalanceType\"]' ModelCorrespondence='[\"CIM_SCSIMultipathSettings.OtherCurrentLoadBalanceType\"]'"
	 * @generated
	 */
	Integer getCurrentLoadBalanceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getCurrentLoadBalanceType <em>Current Load Balance Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_OtherCurrentLoadBalanceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|currentLoadBalanceType\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.OtherSupportedLoadBalanceAlgorithmNames\",\"CIM_SCSIMultipathSettings.CurrentLoadBalanceType\"]'"
	 * @generated
	 */
	String getOtherCurrentLoadBalanceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getOtherCurrentLoadBalanceType <em>Other Current Load Balance Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_AutoFailbackEnabled()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Enabled for the associated logical units\",\"Disabled for the associated logical units\",\"The associated logical units use the service-wide setting\"]' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|autoFailbackEnabled\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.AutoFailbackEnabled\"]'"
	 * @generated
	 */
	Integer getAutoFailbackEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_PollingRateMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|pollingRateMax\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.PollingRateMax\"]'"
	 * @generated
	 */
	Long getPollingRateMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getPollingRateMax <em>Polling Rate Max</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_CurrentPollingRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' MappingStrings='[\"MP_API.SNIA|MP_MULTIPATH_LOGICAL_UNIT_PROPERTIES|currentPollingRate\"]' ModelCorrespondence='[\"CIM_SCSIMultipathConfigurationCapabilities.CurrentPollingRate\"]'"
	 * @generated
	 */
	Long getCurrentPollingRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getCurrentPollingRate <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Polling Rate</em>' attribute.
	 * @see #getCurrentPollingRate()
	 * @generated
	 */
	void setCurrentPollingRate(Long value);

	/**
	 * Returns the value of the '<em><b>Access State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access to all associated logical units through all aggregated ports share this access state. Access to the Logical Units through other ports is specified by the access state of those port's target port group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access State</em>' attribute.
	 * @see #setAccessState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_AccessState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Active/Optimized\",\"Active/Non-optimized\",\"StandBy\",\"Unavailable\",\"Transitioning\"]' MappingStrings='[\"SPC.INCITS-T10 |Asymmetric Access State\",\"MP_API.SNIA|MP_ACCESS_STATE_TYPE\"]'"
	 * @generated
	 */
	Integer getAccessState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getAccessState <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access State</em>' attribute.
	 * @see #getAccessState()
	 * @generated
	 */
	void setAccessState(Integer value);

	/**
	 * Returns the value of the '<em><b>Explicit Failover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the underlying implementation provides an interface allowing drivers to explicitly request activation of a target port group - either through the SCSI SET TARGET PORT GROUP or a proprietary command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explicit Failover</em>' attribute.
	 * @see #setExplicitFailover(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_ExplicitFailover()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|MP_TARGET_PORT_PROPERTIES|explicitFailover\"]'"
	 * @generated
	 */
	Boolean getExplicitFailover();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getExplicitFailover <em>Explicit Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Failover</em>' attribute.
	 * @see #getExplicitFailover()
	 * @generated
	 */
	void setExplicitFailover(Boolean value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer identifier for the target port group. This corresponds to the TARGET PORT GROUP field in the REPORT TARGET PORT GROUPS response and the TARGET PORT GROUP field in an INQUIRY VPD page 85 response, type 5h identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_Identifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MP_API.SNIA|MP_TARGET_PORT_PROPERTIES|tpgID\",\"SPC.INCITS-T10 | Target Port Group Descriptor | Target Port Group\",\"SPC.INCITS-T10 | Inquiry VPD page 0x85 | Target Port Group\"]'"
	 * @generated
	 */
	Integer getIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Integer value);

	/**
	 * Returns the value of the '<em><b>Preferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the target device indicates that access to the associated logical units through the ports in this target port group is preferred over access through other ports. This may correspond to the PREF bit in the SCSI TARGET PORT GROUP descriptor or an equivalent vendor-specific interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred</em>' attribute.
	 * @see #setPreferred(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_Preferred()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|MP_TARGET_PORT_PROPERTIES|preferredLUPath\",\"SPC.INCITS-T10 | Target Port Group Descriptor | PREF\"]'"
	 * @generated
	 */
	Boolean getPreferred();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getPreferred <em>Preferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred</em>' attribute.
	 * @see #getPreferred()
	 * @generated
	 */
	void setPreferred(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supports Lu Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the underlying implementation provides an interface allowing the administrator to reassign logical units to target port groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Lu Assignment</em>' attribute.
	 * @see #setSupportsLuAssignment(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SCSITargetPortGroup_SupportsLuAssignment()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MP_API.SNIA|MP_TARGET_PORT_PROPERTIES|supportsLuAssignment\"]'"
	 * @generated
	 */
	Boolean getSupportsLuAssignment();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SCSITargetPortGroup#getSupportsLuAssignment <em>Supports Lu Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Lu Assignment</em>' attribute.
	 * @see #getSupportsLuAssignment()
	 * @generated
	 */
	void setSupportsLuAssignment(Boolean value);

} // CIM_SCSITargetPortGroup

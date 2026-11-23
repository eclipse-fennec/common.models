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
 * A representation of the model object '<em><b>CIM SCSI Path Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from CIM_Service providing methods related to management of multiple paths to SCSI devices.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SCSIPathConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::Device::StorageDevices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SCSIPathConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method requests that the target change the access states of the requested SCSITargetPortGroups. This will have the effect of doing a failover or failback operation.
	 * @param LogicalUnit A reference to an instances of a subclass of CIM_LogicalDevice representing the SCSI logical unit where the command will be sent.
	 * @param TargetPortGroups Array of references to instances of SCSITargetPortGroup. All the referenced TargetPortGroup instances must be part of the same target device.
	 * @param AccessStates
	 *   An array of desired access states. Each access state in this array is the desired access state for the SCSITargetPortGroup in the corresponding entry in the TargetPortGroups parameter. 
	 *   
	 *   The Active value is not part of the SCSI Specification; it is a convenience for clients that are not sure whether to specify Active/Optimized of Active/Non-optimized. The instrumentation selects a value based on historic information, knowledge of the target configuration, or trial and error. 
	 *   
	 *   Note that SCSITargetPortGroup.AccessState includes the value 'Transitioning' that is excluded here - a caller cannot request transitioning, though it can be reported by a target device.
	 * <!-- end-model-doc -->
	 * @model LogicalUnitAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' In='true'" TargetPortGroupsUnique="false" TargetPortGroupsMany="true"
	 *        TargetPortGroupsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSITargetPortGroup REF[]' In='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SCSITargetPortGroup\"]'" AccessStatesUnique="false" AccessStatesMany="true"
	 *        AccessStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' In='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Active/Optimized\",\"Active/Non-optimized\",\"StandBy\",\"Unavailable\",\"Active\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SCSITargetPortGroup.AccessState\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Unsupported AccessState\",\"Invalid SCSITargetPortGroup\",\"Unsupported AccessState combination\",\"Unsupported SCSITargetPortGroup combination\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long SetTPGAccess(CIM_LogicalDevice LogicalUnit, EList<CIM_SCSITargetPortGroup> TargetPortGroups, EList<Integer> AccessStates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method requests that the target change the load balance algorithm for the referenced LogicalDevice instance.
	 * @param LogicalDevice A reference to the LogicalDevice subclass instance with an LogicalIdentity to the load balance RedundancySet. If SCSIMultipathConfigurationCapabilities. CanLoadBalanceLUsIndependently is true, just the referenced logical unit is modified. Otherwise, all logical units sharing the target are modified.
	 * @param LoadBalanceAlgorithm The desired load balance algorithm.
	 * @param OtherLoadBalanceAlgorithmDescription When LoadBalanceAlgorithm is 'Other', this parameter specifies a description of the load balancing algorithm. When LoadBalanceAlgorithm is 'Product Specific', this property provides a string specifying the vendor/product/version of the ManagedElement.
	 * <!-- end-model-doc -->
	 * @model LogicalDeviceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' In='true'" LoadBalanceAlgorithmAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"No Load Balancing\",\"Round Robin\",\"Least Blocks\",\"Least IO\",\"Product Specific\"]'" OtherLoadBalanceAlgorithmDescriptionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"4096\",\"4097\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Unsupported LogicalDevice\",\"Invalid LoadBalanceType\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long SetLoadBalanceAlgorithm(CIM_LogicalDevice LogicalDevice, Integer LoadBalanceAlgorithm, String OtherLoadBalanceAlgorithmDescription);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method allows an administrator to assign a logical unit to a target port group. At any time, each LU will typically be associated with two target port groups, one in active state and one in standby state. The result of this method will be that the LU associations change to a pair of target port groups. Only valid if the target device supports asymmetric access state and SCSIMultipathConfigurationCapabilities SupportsLuAssignment is set.
	 * @param LogicalUnit A reference to an instance of a subclass of LogicalDevice representing a SCSI logical unit.
	 * @param TargetPortGroup A reference to a target port group. The Target Port Group should be in an active state.
	 * <!-- end-model-doc -->
	 * @model LogicalUnitAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' In='true'" TargetPortGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSITargetPortGroup REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AssignLogicalUnitToPortGroup(CIM_LogicalDevice LogicalUnit, CIM_SCSITargetPortGroup TargetPortGroup);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method allows an administrator to temporarily disable load balancing for a specific logical unit. The path specified as a parameter will have its AdministrativeOverride property set to 'Overriding' and all I/O to the logical unit will be directed to this path. All other paths to this logical unit will have AdministrativeOverride set to 'Overridden'.
	 * @param Path A reference to a SCSIInitiatorTargetLogicalUnitPath.
	 * <!-- end-model-doc -->
	 * @model PathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIInitiatorTargetLogicalUnitPath REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long SetOverridePath(CIM_SCSIInitiatorTargetLogicalUnitPath Path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method clears an override path as set in SetOverridePath and load balancing is enabled. All paths to the logical unit specified as a parameter will have AdministrativeOverride property set to 'No override in effect'.
	 * @param LogicalUnit A reference to a SCSIInitiatorTargetLogicalUnitPath.
	 * <!-- end-model-doc -->
	 * @model LogicalUnitAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CancelOverridePath(CIM_LogicalDevice LogicalUnit);

} // CIM_SCSIPathConfigurationService

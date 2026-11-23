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
 * A representation of the model object '<em><b>CIM IP Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IPConfigurationService provides management of the IP configuration associated with a LANEndpoint or IPProtocolEndpoint or IPNetworkConnection or the global IP configuration for the ComputerSystem. CIM_IPConfigurationService also provides methods to support the additon and removal of an IPProtocolEndpoint to support the addition of a Layer 3 interface to a port, system or network.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::Network::IP' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply the configuration represented by the CIM_IPAssignmentSettingData to the specified IPProtocolEndpoint. This will result in the value of the IsCurrent property of the CIM_ElementSettingData which associates the specified CIM_IPAssignmentSettingData and specified CIM_IPProtocolEndpoint having a value of "true". The IsCurrent property of any other instances of CIM_ElementSettingData which reference the specified CIM_IPProtocolEndpoint and an instance of CIM_IPAssignmentSettingData will have a value of "false". Each instance of CIM_IPAssignmentSettingData which is aggregated into the target CIM_IPAssignmentSettingData instance will be applied to the CIM_ProtocolEndpoint to which it is associated via an instance of CIM_ElementSettingData where the CIM_ProtocolEndpoint is associated with the target CIM_IPProtocolEndpoint via an instance of CIM_EndpointIdentity.
	 * @param Configuration The IPAssignmentSettingData to apply.
	 * @param Endpoint The IPProtocolEndpoint to which the configuration will be applied.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. This parameter MUST NOT be null if a value of 4096 is returned. This parameter MUST be null if any other value is returned by the method.
	 * <!-- end-model-doc -->
	 * @model ConfigurationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPAssignmentSettingData REF' Required='true'" EndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPProtocolEndpoint REF' Required='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Failed\",\"Invalid Parameter\",\"Busy\",\"Method Parameters Checked - Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ApplySettingToIPProtocolEndpoint(CIM_IPAssignmentSettingData Configuration, CIM_IPProtocolEndpoint Endpoint, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply the IP Version respresented by the CIM_IPVersionSettingData to the specified ComputerSystem. The IP Version may take effect or disable immediatley or may be set to take effect or disable in the next boot, depending on ComputerSystem and the value specified for Mode. This will reflect in the IsCurrent & IsNext property of CIM_ElementSettingData associating the IPVersionSettingData with the ComputerSystem. Refer the description for the Mode parameter for more details.
	 * @param IPVersionSettingData The IPVersionSettingData to be apply.
	 * @param ComputerSystem The ComputerSystem to which the setting will be applied
	 * @param Mode
	 *   The mode in which the configuration need to be applied to the ComputerSystem.
	 *   Mode 0 - implies use Mode 1 if allowed, else Mode 2.
	 *   Mode 1 - Results in IsNext = 1 (Is Next), IsCurrent = 1 (Is Current) for the CIM_ElementSettingData associating the setting with ComputerSystem.
	 *   Mode 2 - Results in IsNext = 1 (Is Next) for the CIM_ElementSettingData associating the setting with ComputerSystem. The value of IsCurrent will not be affected.
	 *   Mode 3 - implies use Mode 4 if allowed, else Mode 5.
	 *   Mode 4 - Results in IsNext = 2 (Is Not Next), IsCurrent = 2 (Is Not Current) for the CIM_ElementSettingData associating the setting with ComputerSystem.
	 *   Mode 5 - Results in IsNext = 2 (Is Not Next) for the CIM_ElementSettingData associating the setting with ComputerSystem. The value of IsCurrent will not be affected.
	 *   Mode 6 - Results in IsNext = 3 (Is Next For Single Use)for the CIM_ElementSettingData associating the setting with ComputerSystem. The value of IsCurrent will not be affected. To change the IsNext=3 (Is Next For Single Use) for a Setting, invoke the method with any of the other values for the mode.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (may be null if task completed).
	 * <!-- end-model-doc -->
	 * @model IPVersionSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPVersionSettingData REF' Required='true'" ComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Mode 0\",\"Mode 1\",\"Mode 2\",\"Mode 3\",\"Mode 4\",\"Mode 5\",\"Mode 6\",\"DMTF Reserved\",\"Vendor Reserved\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ApplySettingToComputerSystem(CIM_IPVersionSettingData IPVersionSettingData, CIM_ComputerSystem ComputerSystem, Integer Mode, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply the IP setting respresented by the CIM_IPAssignmentSettingData and/or the IPVersion Setting respresented by the CIM_IPVersionSettingData to the specified IPNetworkConnection. The settings may take effect or disable immediatley or may be set to take effect or disable in the next boot, depending on system, IPNetworkConnection, Setting and the value specified for Mode. This will reflect in the IsCurrent & IsNext property of instances of CIM_ElementSettingData associating the SettingData and or IPVersionSettingData with the IPNetworkConnection. For cases, enabling one setting can result in automatic disabling of another setting, it will be refelected in the properties of ElementSettingData associating those settings to the IPNetworkConnection.Refer the description for the Mode parameter for more details.
	 * At least one of the SettingData or IPVersionSettingData is required in the method call; both may be specified on the same method call.
	 * @param SettingData The IPAssignmentSettingData to apply.
	 * @param IPVersionSettingData The IPVersionSettingData to be apply.
	 * @param IPNetworkConnection The IPNetworkConnection to which the setting will be applied
	 * @param Mode
	 *   The mode in which the configuration need to be applied to the IPNetworkConnection.
	 *   Mode 0 - implies use Mode 1 if allowed, else Mode 2.
	 *   Mode 1 - Results in IsNext = 1 (Is Next), IsCurrent = 1 (Is Current) for the CIM_ElementSettingData associating the setting with IPNetworkConnection.
	 *   Mode 2 - Results in IsNext = 1 (Is Next) for the CIM_ElementSettingData associating the setting with IPNetworkConnection. The value of IsCurrent will not be affected.
	 *   Mode 3 - implies use Mode 4 if allowed, else Mode 5.
	 *   Mode 4 - Results in IsNext = 2 (Is Not Next), IsCurrent = 2 (Is Not Current) for the CIM_ElementSettingData associating the setting with IPNetworkConnection.
	 *   Mode 5 - Results in IsNext = 2 (Is Not Next) for the CIM_ElementSettingData associating the setting with IPNetworkConnection. The value of IsCurrent will not be affected.
	 *   Mode 6 - Results in IsNext = 3 (Is Next For Single Use)for the CIM_ElementSettingData associating the setting with IPNetworkConnection. The value of IsCurrent will not be affected. To change the IsNext=3 (Is Next For Single Use) for a Setting, invoke the method with any of the other values for the mode.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (may be null if task completed).
	 * <!-- end-model-doc -->
	 * @model SettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPAssignmentSettingData REF'" IPVersionSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPVersionSettingData REF'" IPNetworkConnectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPNetworkConnection REF' Required='true'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Mode 0\",\"Mode 1\",\"Mode 2\",\"Mode 3\",\"Mode 4\",\"Mode 5\",\"Mode 6\",\"DMTF Reserved\",\"Vendor Reserved\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ApplySettingToIPNetworkConnection(CIM_IPAssignmentSettingData SettingData, CIM_IPVersionSettingData IPVersionSettingData, CIM_IPNetworkConnection IPNetworkConnection, Integer Mode, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines and assigns an CIM_IPProtocolEndpoint subclass to a CIM_ComputerSystem, CIM_EthernetPort or a CIM_Network instance. The provider should use default values for properites that are not populated in the embedded instance.
	 * @param TargetInterface
	 *   Optional reference to an associated interface or system. This is usally an instance of CIM_EthernetPort, or a VLANNetwork. If no value is provided the new IPProtocolEndpoint 
	 *   instances are associated with the ComputerSystem instance representing the host of the service. The new IPProtocolEndpoint instance should also be associated though an instance of CIM_ServiceAffectsElement to the instance of IPConfigurationService from which the method was called.
	 * @param IPProtocolEndpoint An array of string containing embedded instances of the class-subclass of CIM_IPProtocolEndpoint that describes the configuration of the new IPProtocolEndpoints
	 * @param EndpointSettings An array of strings each containing an embedded instance of class-subclass of CIM_SettingData that are to be associated with the new IP protocol endpoint. Generally these should be associated to the CIM_IPProtocolEndpoint instance through an instance of CIM_ElementSettingData. This array of instances shall be indexed one to one with the embedded instances contained in the IPProtocolEndpoint parameter.
	 * @param ResultingEndpoint If the addition of a protocol endpoint is successfully, a reference to the instance of class CIM_IPProtocolEndpoint that represents the newly defined endpoints are returned.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model TargetInterfaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" IPProtocolEndpointUnique="false" IPProtocolEndpointMany="true"
	 *        IPProtocolEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_IPProtocolEndpoint'" EndpointSettingsUnique="false" EndpointSettingsMany="true"
	 *        EndpointSettingsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_SettingData'" ResultingEndpointUnique="false" ResultingEndpointMany="true"
	 *        ResultingEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPProtocolEndpoint REF[]' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Failed\",\"Invalid Parameter\",\"Busy\",\"Method Parameters Checked - Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long AddIPProtocolEndpoint(CIM_ManagedElement TargetInterface, EList<String> IPProtocolEndpoint, EList<String> EndpointSettings, EList<CIM_IPProtocolEndpoint> ResultingEndpoint, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes one more IPProtocolEndpoint classes or subclasses instances.
	 * @param Endpoint Reference to the targeted instances of CIM_ProtocolEndpoint.
	 * @param Job If the operation is long running, then optionally a job may be returned.
	 * <!-- end-model-doc -->
	 * @model EndpointUnique="false" EndpointMany="true"
	 *        EndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_IPProtocolEndpoint REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Failed\",\"Invalid Parameter\",\"Busy\",\"Method Parameters Checked - Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long RemoveIPProtocolEndpoint(EList<CIM_IPProtocolEndpoint> Endpoint, CIM_ConcreteJob Job);

} // CIM_IPConfigurationService

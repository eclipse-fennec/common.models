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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.dmtf.cim.CimPackage
 * @generated
 */
@ProviderType
public interface CimFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CimFactory eINSTANCE = org.dmtf.cim.impl.CimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CIM Parameter Value Sources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Parameter Value Sources</em>'.
	 * @generated
	 */
	CIM_ParameterValueSources createCIM_ParameterValueSources();

	/**
	 * Returns a new object of class '<em>CIM Parameters For Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Parameters For Method</em>'.
	 * @generated
	 */
	CIM_ParametersForMethod createCIM_ParametersForMethod();

	/**
	 * Returns a new object of class '<em>CIM Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product</em>'.
	 * @generated
	 */
	CIM_Product createCIM_Product();

	/**
	 * Returns a new object of class '<em>CIM Product Parent Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Parent Child</em>'.
	 * @generated
	 */
	CIM_ProductParentChild createCIM_ProductParentChild();

	/**
	 * Returns a new object of class '<em>CIM Product Physical Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Physical Elements</em>'.
	 * @generated
	 */
	CIM_ProductPhysicalElements createCIM_ProductPhysicalElements();

	/**
	 * Returns a new object of class '<em>CIM Product Product Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Product Dependency</em>'.
	 * @generated
	 */
	CIM_ProductProductDependency createCIM_ProductProductDependency();

	/**
	 * Returns a new object of class '<em>CIM Replacement FRU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replacement FRU</em>'.
	 * @generated
	 */
	CIM_ReplacementFRU createCIM_ReplacementFRU();

	/**
	 * Returns a new object of class '<em>CIM Settings Define State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Settings Define State</em>'.
	 * @generated
	 */
	CIM_SettingsDefineState createCIM_SettingsDefineState();

	/**
	 * Returns a new object of class '<em>CIM Statistical Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Statistical Setting</em>'.
	 * @generated
	 */
	CIM_StatisticalSetting createCIM_StatisticalSetting();

	/**
	 * Returns a new object of class '<em>CIM Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Statistics</em>'.
	 * @generated
	 */
	CIM_Statistics createCIM_Statistics();

	/**
	 * Returns a new object of class '<em>CIM Support Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Support Access</em>'.
	 * @generated
	 */
	CIM_SupportAccess createCIM_SupportAccess();

	/**
	 * Returns a new object of class '<em>CIM Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Synchronized</em>'.
	 * @generated
	 */
	CIM_Synchronized createCIM_Synchronized();

	/**
	 * Returns a new object of class '<em>CIM System Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Configuration</em>'.
	 * @generated
	 */
	CIM_SystemConfiguration createCIM_SystemConfiguration();

	/**
	 * Returns a new object of class '<em>CIM System Statistical Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Statistical Information</em>'.
	 * @generated
	 */
	CIM_SystemStatisticalInformation createCIM_SystemStatisticalInformation();

	/**
	 * Returns a new object of class '<em>CIM Common Database Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Common Database Setting Data</em>'.
	 * @generated
	 */
	CIM_CommonDatabaseSettingData createCIM_CommonDatabaseSettingData();

	/**
	 * Returns a new object of class '<em>CIM Common Database Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Common Database Statistics</em>'.
	 * @generated
	 */
	CIM_CommonDatabaseStatistics createCIM_CommonDatabaseStatistics();

	/**
	 * Returns a new object of class '<em>CIM Database Resource Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Resource Statistics</em>'.
	 * @generated
	 */
	CIM_DatabaseResourceStatistics createCIM_DatabaseResourceStatistics();

	/**
	 * Returns a new object of class '<em>CIM Database Service Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Service Statistics</em>'.
	 * @generated
	 */
	CIM_DatabaseServiceStatistics createCIM_DatabaseServiceStatistics();

	/**
	 * Returns a new object of class '<em>CIM Block Statistics Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Block Statistics Manifest</em>'.
	 * @generated
	 */
	CIM_BlockStatisticsManifest createCIM_BlockStatisticsManifest();

	/**
	 * Returns a new object of class '<em>CIM Block Storage Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Block Storage Statistical Data</em>'.
	 * @generated
	 */
	CIM_BlockStorageStatisticalData createCIM_BlockStorageStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM Device Error Counts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Error Counts</em>'.
	 * @generated
	 */
	CIM_DeviceErrorCounts createCIM_DeviceErrorCounts();

	/**
	 * Returns a new object of class '<em>CIM Device Error Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Error Data</em>'.
	 * @generated
	 */
	CIM_DeviceErrorData createCIM_DeviceErrorData();

	/**
	 * Returns a new object of class '<em>CIM FC Port Rate Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Port Rate Statistics</em>'.
	 * @generated
	 */
	CIM_FCPortRateStatistics createCIM_FCPortRateStatistics();

	/**
	 * Returns a new object of class '<em>CIM FC Switch Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Switch Settings</em>'.
	 * @generated
	 */
	CIM_FCSwitchSettings createCIM_FCSwitchSettings();

	/**
	 * Returns a new object of class '<em>CIM File System Group Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Group Synchronized</em>'.
	 * @generated
	 */
	CIM_FileSystemGroupSynchronized createCIM_FileSystemGroupSynchronized();

	/**
	 * Returns a new object of class '<em>CIM File System Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Synchronized</em>'.
	 * @generated
	 */
	CIM_FileSystemSynchronized createCIM_FileSystemSynchronized();

	/**
	 * Returns a new object of class '<em>CIM Label Reader Stat Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Label Reader Stat Data</em>'.
	 * @generated
	 */
	CIM_LabelReaderStatData createCIM_LabelReaderStatData();

	/**
	 * Returns a new object of class '<em>CIM Logical Port Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Port Settings</em>'.
	 * @generated
	 */
	CIM_LogicalPortSettings createCIM_LogicalPortSettings();

	/**
	 * Returns a new object of class '<em>CIM Logical Port Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Port Statistics</em>'.
	 * @generated
	 */
	CIM_LogicalPortStatistics createCIM_LogicalPortStatistics();

	/**
	 * Returns a new object of class '<em>CIM Media Access Stat Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Access Stat Data</em>'.
	 * @generated
	 */
	CIM_MediaAccessStatData createCIM_MediaAccessStatData();

	/**
	 * Returns a new object of class '<em>CIM Network Port Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Port Settings</em>'.
	 * @generated
	 */
	CIM_NetworkPortSettings createCIM_NetworkPortSettings();

	/**
	 * Returns a new object of class '<em>CIM Network Port Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Port Statistics</em>'.
	 * @generated
	 */
	CIM_NetworkPortStatistics createCIM_NetworkPortStatistics();

	/**
	 * Returns a new object of class '<em>CIM Operational Power Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operational Power Manifest</em>'.
	 * @generated
	 */
	CIM_OperationalPowerManifest createCIM_OperationalPowerManifest();

	/**
	 * Returns a new object of class '<em>CIM Operational Power Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operational Power Statistical Data</em>'.
	 * @generated
	 */
	CIM_OperationalPowerStatisticalData createCIM_OperationalPowerStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM Picker Stat Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Picker Stat Data</em>'.
	 * @generated
	 */
	CIM_PickerStatData createCIM_PickerStatData();

	/**
	 * Returns a new object of class '<em>CIM Powered Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Powered Statistical Data</em>'.
	 * @generated
	 */
	CIM_PoweredStatisticalData createCIM_PoweredStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM Replication Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replication Setting Data</em>'.
	 * @generated
	 */
	CIM_ReplicationSettingData createCIM_ReplicationSettingData();

	/**
	 * Returns a new object of class '<em>CIM SCSI Multipath Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Multipath Settings</em>'.
	 * @generated
	 */
	CIM_SCSIMultipathSettings createCIM_SCSIMultipathSettings();

	/**
	 * Returns a new object of class '<em>CIM Storage Erasure Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Erasure Setting</em>'.
	 * @generated
	 */
	CIM_StorageErasureSetting createCIM_StorageErasureSetting();

	/**
	 * Returns a new object of class '<em>CIM Storage Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Error</em>'.
	 * @generated
	 */
	CIM_StorageError createCIM_StorageError();

	/**
	 * Returns a new object of class '<em>CIM Storage Pool View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Pool View</em>'.
	 * @generated
	 */
	CIM_StoragePoolView createCIM_StoragePoolView();

	/**
	 * Returns a new object of class '<em>CIM Storage Protection Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Protection Setting</em>'.
	 * @generated
	 */
	CIM_StorageProtectionSetting createCIM_StorageProtectionSetting();

	/**
	 * Returns a new object of class '<em>CIM Storage Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Setting</em>'.
	 * @generated
	 */
	CIM_StorageSetting createCIM_StorageSetting();

	/**
	 * Returns a new object of class '<em>CIM Storage Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Synchronized</em>'.
	 * @generated
	 */
	CIM_StorageSynchronized createCIM_StorageSynchronized();

	/**
	 * Returns a new object of class '<em>CIM Synchronization Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Synchronization Aspect</em>'.
	 * @generated
	 */
	CIM_SynchronizationAspect createCIM_SynchronizationAspect();

	/**
	 * Returns a new object of class '<em>CIM Tape Drive Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tape Drive Resource Usage</em>'.
	 * @generated
	 */
	CIM_TapeDriveResourceUsage createCIM_TapeDriveResourceUsage();

	/**
	 * Returns a new object of class '<em>CIM Tier Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tier Setting Data</em>'.
	 * @generated
	 */
	CIM_TierSettingData createCIM_TierSettingData();

	/**
	 * Returns a new object of class '<em>CIM Token Ring Port Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Token Ring Port Statistics</em>'.
	 * @generated
	 */
	CIM_TokenRingPortStatistics createCIM_TokenRingPortStatistics();

	/**
	 * Returns a new object of class '<em>CIM VTL Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VTL Resource Usage</em>'.
	 * @generated
	 */
	CIM_VTLResourceUsage createCIM_VTLResourceUsage();

	/**
	 * Returns a new object of class '<em>CIM VTL Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VTL Statistical Data</em>'.
	 * @generated
	 */
	CIM_VTLStatisticalData createCIM_VTLStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM Video Head Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video Head Resolution</em>'.
	 * @generated
	 */
	CIM_VideoHeadResolution createCIM_VideoHeadResolution();

	/**
	 * Returns a new object of class '<em>CIM Indication Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indication Filter</em>'.
	 * @generated
	 */
	CIM_IndicationFilter createCIM_IndicationFilter();

	/**
	 * Returns a new object of class '<em>CIM Indication Service Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indication Service Setting Data</em>'.
	 * @generated
	 */
	CIM_IndicationServiceSettingData createCIM_IndicationServiceSettingData();

	/**
	 * Returns a new object of class '<em>CIM Inst Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Inst Method Call</em>'.
	 * @generated
	 */
	CIM_InstMethodCall createCIM_InstMethodCall();

	/**
	 * Returns a new object of class '<em>CIM Inst Modification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Inst Modification</em>'.
	 * @generated
	 */
	CIM_InstModification createCIM_InstModification();

	/**
	 * Returns a new object of class '<em>CIM Inst Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Inst Read</em>'.
	 * @generated
	 */
	CIM_InstRead createCIM_InstRead();

	/**
	 * Returns a new object of class '<em>CIM Listener Destination CIMXML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Listener Destination CIMXML</em>'.
	 * @generated
	 */
	CIM_ListenerDestinationCIMXML createCIM_ListenerDestinationCIMXML();

	/**
	 * Returns a new object of class '<em>CIM Listener Destination WS Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Listener Destination WS Management</em>'.
	 * @generated
	 */
	CIM_ListenerDestinationWSManagement createCIM_ListenerDestinationWSManagement();

	/**
	 * Returns a new object of class '<em>CIM SNMP Trap Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SNMP Trap Indication</em>'.
	 * @generated
	 */
	CIM_SNMPTrapIndication createCIM_SNMPTrapIndication();

	/**
	 * Returns a new object of class '<em>CIM CIMOM Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CIMOM Statistical Data</em>'.
	 * @generated
	 */
	CIM_CIMOMStatisticalData createCIM_CIMOMStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Error</em>'.
	 * @generated
	 */
	CIM_Error createCIM_Error();

	/**
	 * Returns a new object of class '<em>CIM Generic Operation Capabilities Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Generic Operation Capabilities Structure</em>'.
	 * @generated
	 */
	CIM_GenericOperationCapabilitiesStructure createCIM_GenericOperationCapabilitiesStructure();

	/**
	 * Returns a new object of class '<em>CIM Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Message</em>'.
	 * @generated
	 */
	CIM_Message createCIM_Message();

	/**
	 * Returns a new object of class '<em>CIM Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Namespace</em>'.
	 * @generated
	 */
	CIM_Namespace createCIM_Namespace();

	/**
	 * Returns a new object of class '<em>CIM Registered Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Registered Specification</em>'.
	 * @generated
	 */
	CIM_RegisteredSpecification createCIM_RegisteredSpecification();

	/**
	 * Returns a new object of class '<em>CIM Schema Information Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Schema Information Structure</em>'.
	 * @generated
	 */
	CIM_SchemaInformationStructure createCIM_SchemaInformationStructure();

	/**
	 * Returns a new object of class '<em>CIM System Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Identification</em>'.
	 * @generated
	 */
	CIM_SystemIdentification createCIM_SystemIdentification();

	/**
	 * Returns a new object of class '<em>CIM System In Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System In Namespace</em>'.
	 * @generated
	 */
	CIM_SystemInNamespace createCIM_SystemInNamespace();

	/**
	 * Returns a new object of class '<em>CIM WBEM Server Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WBEM Server Namespace</em>'.
	 * @generated
	 */
	CIM_WBEMServerNamespace createCIM_WBEMServerNamespace();

	/**
	 * Returns a new object of class '<em>CIM Base Metric Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Base Metric Definition</em>'.
	 * @generated
	 */
	CIM_BaseMetricDefinition createCIM_BaseMetricDefinition();

	/**
	 * Returns a new object of class '<em>CIM Base Metric Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Base Metric Value</em>'.
	 * @generated
	 */
	CIM_BaseMetricValue createCIM_BaseMetricValue();

	/**
	 * Returns a new object of class '<em>CIM Metric Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Metric Definition</em>'.
	 * @generated
	 */
	CIM_MetricDefinition createCIM_MetricDefinition();

	/**
	 * Returns a new object of class '<em>CIM Trace Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Trace Level Type</em>'.
	 * @generated
	 */
	CIM_TraceLevelType createCIM_TraceLevelType();

	/**
	 * Returns a new object of class '<em>CIM Unit Of Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unit Of Work</em>'.
	 * @generated
	 */
	CIM_UnitOfWork createCIM_UnitOfWork();

	/**
	 * Returns a new object of class '<em>CIM BGP Endpoint Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Endpoint Statistics</em>'.
	 * @generated
	 */
	CIM_BGPEndpointStatistics createCIM_BGPEndpointStatistics();

	/**
	 * Returns a new object of class '<em>CIM CLP Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CLP Setting Data</em>'.
	 * @generated
	 */
	CIM_CLPSettingData createCIM_CLPSettingData();

	/**
	 * Returns a new object of class '<em>CIM Connectivity Membership Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Connectivity Membership Setting Data</em>'.
	 * @generated
	 */
	CIM_ConnectivityMembershipSettingData createCIM_ConnectivityMembershipSettingData();

	/**
	 * Returns a new object of class '<em>CIM Encapsulation Mapping Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Encapsulation Mapping Setting Data</em>'.
	 * @generated
	 */
	CIM_EncapsulationMappingSettingData createCIM_EncapsulationMappingSettingData();

	/**
	 * Returns a new object of class '<em>CIM IEEE802 1x Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IEEE802 1x Settings</em>'.
	 * @generated
	 */
	CIM_IEEE8021xSettings createCIM_IEEE8021xSettings();

	/**
	 * Returns a new object of class '<em>CIM IP Assignment Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Assignment Setting Data</em>'.
	 * @generated
	 */
	CIM_IPAssignmentSettingData createCIM_IPAssignmentSettingData();

	/**
	 * Returns a new object of class '<em>CIM IP Encapsulation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Encapsulation Interface</em>'.
	 * @generated
	 */
	CIM_IPEncapsulationInterface createCIM_IPEncapsulationInterface();

	/**
	 * Returns a new object of class '<em>CIM IP Interface Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Interface Setting Data</em>'.
	 * @generated
	 */
	CIM_IPInterfaceSettingData createCIM_IPInterfaceSettingData();

	/**
	 * Returns a new object of class '<em>CIM IP Version Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Version Setting Data</em>'.
	 * @generated
	 */
	CIM_IPVersionSettingData createCIM_IPVersionSettingData();

	/**
	 * Returns a new object of class '<em>CIM Network Policy Action Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Policy Action Setting Data</em>'.
	 * @generated
	 */
	CIM_NetworkPolicyActionSettingData createCIM_NetworkPolicyActionSettingData();

	/**
	 * Returns a new object of class '<em>CIM Network Policy Rule Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Policy Rule Setting Data</em>'.
	 * @generated
	 */
	CIM_NetworkPolicyRuleSettingData createCIM_NetworkPolicyRuleSettingData();

	/**
	 * Returns a new object of class '<em>CIM Next Hop Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Next Hop Route</em>'.
	 * @generated
	 */
	CIM_NextHopRoute createCIM_NextHopRoute();

	/**
	 * Returns a new object of class '<em>CIM SA Endpoint Connection Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SA Endpoint Connection Statistics</em>'.
	 * @generated
	 */
	CIM_SAEndpointConnectionStatistics createCIM_SAEndpointConnectionStatistics();

	/**
	 * Returns a new object of class '<em>CIM SA Endpoint Refresh Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SA Endpoint Refresh Settings</em>'.
	 * @generated
	 */
	CIM_SAEndpointRefreshSettings createCIM_SAEndpointRefreshSettings();

	/**
	 * Returns a new object of class '<em>CIM SSH Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SSH Setting Data</em>'.
	 * @generated
	 */
	CIM_SSHSettingData createCIM_SSHSettingData();

	/**
	 * Returns a new object of class '<em>CIM Static IP Assignment Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Static IP Assignment Setting Data</em>'.
	 * @generated
	 */
	CIM_StaticIPAssignmentSettingData createCIM_StaticIPAssignmentSettingData();

	/**
	 * Returns a new object of class '<em>CIM Telnet Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Telnet Setting Data</em>'.
	 * @generated
	 */
	CIM_TelnetSettingData createCIM_TelnetSettingData();

	/**
	 * Returns a new object of class '<em>CIM VLAN Endpoint Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VLAN Endpoint Setting Data</em>'.
	 * @generated
	 */
	CIM_VLANEndpointSettingData createCIM_VLANEndpointSettingData();

	/**
	 * Returns a new object of class '<em>CIM WRR Scheduling Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WRR Scheduling Element</em>'.
	 * @generated
	 */
	CIM_WRRSchedulingElement createCIM_WRRSchedulingElement();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Endpoint Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Endpoint Settings</em>'.
	 * @generated
	 */
	CIM_WiFiEndpointSettings createCIM_WiFiEndpointSettings();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Network Detection Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Network Detection Settings</em>'.
	 * @generated
	 */
	CIM_WiFiNetworkDetectionSettings createCIM_WiFiNetworkDetectionSettings();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Connection Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Connection Settings</em>'.
	 * @generated
	 */
	CIM_iSCSIConnectionSettings createCIM_iSCSIConnectionSettings();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Login Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Login Statistics</em>'.
	 * @generated
	 */
	CIM_iSCSILoginStatistics createCIM_iSCSILoginStatistics();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Session Failures</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Session Failures</em>'.
	 * @generated
	 */
	CIM_iSCSISessionFailures createCIM_iSCSISessionFailures();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Session Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Session Settings</em>'.
	 * @generated
	 */
	CIM_iSCSISessionSettings createCIM_iSCSISessionSettings();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Session Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Session Statistics</em>'.
	 * @generated
	 */
	CIM_iSCSISessionStatistics createCIM_iSCSISessionStatistics();

	/**
	 * Returns a new object of class '<em>CIM Media Physical Stat Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Physical Stat Data</em>'.
	 * @generated
	 */
	CIM_MediaPhysicalStatData createCIM_MediaPhysicalStatData();

	/**
	 * Returns a new object of class '<em>CIM Physical Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Component</em>'.
	 * @generated
	 */
	CIM_PhysicalComponent createCIM_PhysicalComponent();

	/**
	 * Returns a new object of class '<em>CIM Physical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Connector</em>'.
	 * @generated
	 */
	CIM_PhysicalConnector createCIM_PhysicalConnector();

	/**
	 * Returns a new object of class '<em>CIM Physical Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Link</em>'.
	 * @generated
	 */
	CIM_PhysicalLink createCIM_PhysicalLink();

	/**
	 * Returns a new object of class '<em>CIM Physical Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Media</em>'.
	 * @generated
	 */
	CIM_PhysicalMedia createCIM_PhysicalMedia();

	/**
	 * Returns a new object of class '<em>CIM Physical Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Package</em>'.
	 * @generated
	 */
	CIM_PhysicalPackage createCIM_PhysicalPackage();

	/**
	 * Returns a new object of class '<em>CIM Physical Tape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Tape</em>'.
	 * @generated
	 */
	CIM_PhysicalTape createCIM_PhysicalTape();

	/**
	 * Returns a new object of class '<em>CIM Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Slot</em>'.
	 * @generated
	 */
	CIM_Slot createCIM_Slot();

	/**
	 * Returns a new object of class '<em>CIM Policy Set Applies To Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Set Applies To Element</em>'.
	 * @generated
	 */
	CIM_PolicySetAppliesToElement createCIM_PolicySetAppliesToElement();

	/**
	 * Returns a new object of class '<em>CIM Policy Time Period Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Time Period Condition</em>'.
	 * @generated
	 */
	CIM_PolicyTimePeriodCondition createCIM_PolicyTimePeriodCondition();

	/**
	 * Returns a new object of class '<em>CIM Query Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Query Condition</em>'.
	 * @generated
	 */
	CIM_QueryCondition createCIM_QueryCondition();

	/**
	 * Returns a new object of class '<em>CIM Reject Connection Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Reject Connection Action</em>'.
	 * @generated
	 */
	CIM_RejectConnectionAction createCIM_RejectConnectionAction();

	/**
	 * Returns a new object of class '<em>CIM Vendor Policy Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Vendor Policy Action</em>'.
	 * @generated
	 */
	CIM_VendorPolicyAction createCIM_VendorPolicyAction();

	/**
	 * Returns a new object of class '<em>CIM Vendor Policy Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Vendor Policy Condition</em>'.
	 * @generated
	 */
	CIM_VendorPolicyCondition createCIM_VendorPolicyCondition();

	/**
	 * Returns a new object of class '<em>CIM BIOS Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Attribute</em>'.
	 * @generated
	 */
	CIM_BIOSAttribute createCIM_BIOSAttribute();

	/**
	 * Returns a new object of class '<em>CIM BIOS Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Enumeration</em>'.
	 * @generated
	 */
	CIM_BIOSEnumeration createCIM_BIOSEnumeration();

	/**
	 * Returns a new object of class '<em>CIM BIOS Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Integer</em>'.
	 * @generated
	 */
	CIM_BIOSInteger createCIM_BIOSInteger();

	/**
	 * Returns a new object of class '<em>CIM BIOS Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Password</em>'.
	 * @generated
	 */
	CIM_BIOSPassword createCIM_BIOSPassword();

	/**
	 * Returns a new object of class '<em>CIM BIOS String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS String</em>'.
	 * @generated
	 */
	CIM_BIOSString createCIM_BIOSString();

	/**
	 * Returns a new object of class '<em>CIM Boot Source Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Boot Source Setting</em>'.
	 * @generated
	 */
	CIM_BootSourceSetting createCIM_BootSourceSetting();

	/**
	 * Returns a new object of class '<em>CIM CIFS Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CIFS Setting Data</em>'.
	 * @generated
	 */
	CIM_CIFSSettingData createCIM_CIFSSettingData();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Result</em>'.
	 * @generated
	 */
	CIM_DiagnosticResult createCIM_DiagnosticResult();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Result For MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Result For MSE</em>'.
	 * @generated
	 */
	CIM_DiagnosticResultForMSE createCIM_DiagnosticResultForMSE();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Result In Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Result In Package</em>'.
	 * @generated
	 */
	CIM_DiagnosticResultInPackage createCIM_DiagnosticResultInPackage();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Setting Data</em>'.
	 * @generated
	 */
	CIM_DiagnosticSettingData createCIM_DiagnosticSettingData();

	/**
	 * Returns a new object of class '<em>CIM Disk Drive Diagnostic Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Drive Diagnostic Setting Data</em>'.
	 * @generated
	 */
	CIM_DiskDriveDiagnosticSettingData createCIM_DiskDriveDiagnosticSettingData();

	/**
	 * Returns a new object of class '<em>CIM Exported File Share Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Exported File Share Setting</em>'.
	 * @generated
	 */
	CIM_ExportedFileShareSetting createCIM_ExportedFileShareSetting();

	/**
	 * Returns a new object of class '<em>CIM FCHBA Diagnostic Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FCHBA Diagnostic Setting Data</em>'.
	 * @generated
	 */
	CIM_FCHBADiagnosticSettingData createCIM_FCHBADiagnosticSettingData();

	/**
	 * Returns a new object of class '<em>CIM FSIP Interface Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FSIP Interface Setting Data</em>'.
	 * @generated
	 */
	CIM_FSIPInterfaceSettingData createCIM_FSIPInterfaceSettingData();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Config Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Config Entry</em>'.
	 * @generated
	 */
	CIM_FSQuotaConfigEntry createCIM_FSQuotaConfigEntry();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Indication</em>'.
	 * @generated
	 */
	CIM_FSQuotaIndication createCIM_FSQuotaIndication();

	/**
	 * Returns a new object of class '<em>CIM File Server Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Server Settings</em>'.
	 * @generated
	 */
	CIM_FileServerSettings createCIM_FileServerSettings();

	/**
	 * Returns a new object of class '<em>CIM File System Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Setting</em>'.
	 * @generated
	 */
	CIM_FileSystemSetting createCIM_FileSystemSetting();

	/**
	 * Returns a new object of class '<em>CIM File System Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Statistical Data</em>'.
	 * @generated
	 */
	CIM_FileSystemStatisticalData createCIM_FileSystemStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM File System Statistics Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Statistics Manifest</em>'.
	 * @generated
	 */
	CIM_FileSystemStatisticsManifest createCIM_FileSystemStatisticsManifest();

	/**
	 * Returns a new object of class '<em>CIM Job Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Job Setting Data</em>'.
	 * @generated
	 */
	CIM_JobSettingData createCIM_JobSettingData();

	/**
	 * Returns a new object of class '<em>CIM Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Method Result</em>'.
	 * @generated
	 */
	CIM_MethodResult createCIM_MethodResult();

	/**
	 * Returns a new object of class '<em>CIM NFS Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM NFS Setting Data</em>'.
	 * @generated
	 */
	CIM_NFSSettingData createCIM_NFSSettingData();

	/**
	 * Returns a new object of class '<em>CIM NIS Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM NIS Setting Data</em>'.
	 * @generated
	 */
	CIM_NISSettingData createCIM_NISSettingData();

	/**
	 * Returns a new object of class '<em>CIM Summary Diagnostics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Summary Diagnostics</em>'.
	 * @generated
	 */
	CIM_SummaryDiagnostics createCIM_SummaryDiagnostics();

	/**
	 * Returns a new object of class '<em>CIM Unix Process Statistical Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix Process Statistical Information</em>'.
	 * @generated
	 */
	CIM_UnixProcessStatisticalInformation createCIM_UnixProcessStatisticalInformation();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Migration Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Migration Setting Data</em>'.
	 * @generated
	 */
	CIM_VirtualSystemMigrationSettingData createCIM_VirtualSystemMigrationSettingData();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Setting Data</em>'.
	 * @generated
	 */
	CIM_VirtualSystemSettingData createCIM_VirtualSystemSettingData();

	/**
	 * Returns a new object of class '<em>CIM Account Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account Setting Data</em>'.
	 * @generated
	 */
	CIM_AccountSettingData createCIM_AccountSettingData();

	/**
	 * Returns a new object of class '<em>CIM Associated Privilege</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Privilege</em>'.
	 * @generated
	 */
	CIM_AssociatedPrivilege createCIM_AssociatedPrivilege();

	/**
	 * Returns a new object of class '<em>CIM Credential Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Credential Context</em>'.
	 * @generated
	 */
	CIM_CredentialContext createCIM_CredentialContext();

	/**
	 * Returns a new object of class '<em>CIM Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Identity</em>'.
	 * @generated
	 */
	CIM_Identity createCIM_Identity();

	/**
	 * Returns a new object of class '<em>CIM Identity Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Identity Context</em>'.
	 * @generated
	 */
	CIM_IdentityContext createCIM_IdentityContext();

	/**
	 * Returns a new object of class '<em>CIM Kerberos Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Kerberos Credential</em>'.
	 * @generated
	 */
	CIM_KerberosCredential createCIM_KerberosCredential();

	/**
	 * Returns a new object of class '<em>CIM Kerberos Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Kerberos Ticket</em>'.
	 * @generated
	 */
	CIM_KerberosTicket createCIM_KerberosTicket();

	/**
	 * Returns a new object of class '<em>CIM Named Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Named Credential</em>'.
	 * @generated
	 */
	CIM_NamedCredential createCIM_NamedCredential();

	/**
	 * Returns a new object of class '<em>CIM Named Shared IKE Secret</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Named Shared IKE Secret</em>'.
	 * @generated
	 */
	CIM_NamedSharedIKESecret createCIM_NamedSharedIKESecret();

	/**
	 * Returns a new object of class '<em>CIM Opaque Management Data Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Opaque Management Data Owner</em>'.
	 * @generated
	 */
	CIM_OpaqueManagementDataOwner createCIM_OpaqueManagementDataOwner();

	/**
	 * Returns a new object of class '<em>CIM Other Group Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Other Group Information</em>'.
	 * @generated
	 */
	CIM_OtherGroupInformation createCIM_OtherGroupInformation();

	/**
	 * Returns a new object of class '<em>CIM Other Org Unit Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Other Org Unit Information</em>'.
	 * @generated
	 */
	CIM_OtherOrgUnitInformation createCIM_OtherOrgUnitInformation();

	/**
	 * Returns a new object of class '<em>CIM Other Organization Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Other Organization Information</em>'.
	 * @generated
	 */
	CIM_OtherOrganizationInformation createCIM_OtherOrganizationInformation();

	/**
	 * Returns a new object of class '<em>CIM Other Person Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Other Person Information</em>'.
	 * @generated
	 */
	CIM_OtherPersonInformation createCIM_OtherPersonInformation();

	/**
	 * Returns a new object of class '<em>CIM Other Role Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Other Role Information</em>'.
	 * @generated
	 */
	CIM_OtherRoleInformation createCIM_OtherRoleInformation();

	/**
	 * Returns a new object of class '<em>CIM Privilege</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Privilege</em>'.
	 * @generated
	 */
	CIM_Privilege createCIM_Privilege();

	/**
	 * Returns a new object of class '<em>CIM Security Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Security Sensitivity</em>'.
	 * @generated
	 */
	CIM_SecuritySensitivity createCIM_SecuritySensitivity();

	/**
	 * Returns a new object of class '<em>CIM Shared Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Shared Credential</em>'.
	 * @generated
	 */
	CIM_SharedCredential createCIM_SharedCredential();

	/**
	 * Returns a new object of class '<em>CIM Shared Secret</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Shared Secret</em>'.
	 * @generated
	 */
	CIM_SharedSecret createCIM_SharedSecret();

	/**
	 * Returns a new object of class '<em>CIM Signed Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Signed Credential</em>'.
	 * @generated
	 */
	CIM_SignedCredential createCIM_SignedCredential();

	/**
	 * Returns a new object of class '<em>CIM Storage Client Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Client Setting Data</em>'.
	 * @generated
	 */
	CIM_StorageClientSettingData createCIM_StorageClientSettingData();

	/**
	 * Returns a new object of class '<em>CIM Storage Hardware ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Hardware ID</em>'.
	 * @generated
	 */
	CIM_StorageHardwareID createCIM_StorageHardwareID();

	/**
	 * Returns a new object of class '<em>CIM Unsigned Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unsigned Credential</em>'.
	 * @generated
	 */
	CIM_UnsignedCredential createCIM_UnsignedCredential();

	/**
	 * Returns a new object of class '<em>CIM Unsigned Public Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unsigned Public Key</em>'.
	 * @generated
	 */
	CIM_UnsignedPublicKey createCIM_UnsignedPublicKey();

	/**
	 * Returns a new object of class '<em>CIM Users Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Users Access</em>'.
	 * @generated
	 */
	CIM_UsersAccess createCIM_UsersAccess();

	/**
	 * Returns a new object of class '<em>CIM X509 Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM X509 Infrastructure</em>'.
	 * @generated
	 */
	CIM_X509Infrastructure createCIM_X509Infrastructure();

	/**
	 * Returns a new object of class '<em>CIM J2ee Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Notification</em>'.
	 * @generated
	 */
	CIM_J2eeNotification createCIM_J2eeNotification();

	/**
	 * Returns a new object of class '<em>CIM Statistical Runtime Overview</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Statistical Runtime Overview</em>'.
	 * @generated
	 */
	CIM_StatisticalRuntimeOverview createCIM_StatisticalRuntimeOverview();

	/**
	 * Returns a new object of class '<em>CIM Compatible Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Compatible Product</em>'.
	 * @generated
	 */
	CIM_CompatibleProduct createCIM_CompatibleProduct();

	/**
	 * Returns a new object of class '<em>CIM Concrete Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Concrete Collection</em>'.
	 * @generated
	 */
	CIM_ConcreteCollection createCIM_ConcreteCollection();

	/**
	 * Returns a new object of class '<em>CIM Concrete Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Concrete Component</em>'.
	 * @generated
	 */
	CIM_ConcreteComponent createCIM_ConcreteComponent();

	/**
	 * Returns a new object of class '<em>CIM Concrete Component View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Concrete Component View</em>'.
	 * @generated
	 */
	CIM_ConcreteComponentView createCIM_ConcreteComponentView();

	/**
	 * Returns a new object of class '<em>CIM Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Configuration</em>'.
	 * @generated
	 */
	CIM_Configuration createCIM_Configuration();

	/**
	 * Returns a new object of class '<em>CIM Configuration Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Configuration Component</em>'.
	 * @generated
	 */
	CIM_ConfigurationComponent createCIM_ConfigurationComponent();

	/**
	 * Returns a new object of class '<em>CIM Configuration Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Configuration Data</em>'.
	 * @generated
	 */
	CIM_ConfigurationData createCIM_ConfigurationData();

	/**
	 * Returns a new object of class '<em>CIM Dependency Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Dependency Context</em>'.
	 * @generated
	 */
	CIM_DependencyContext createCIM_DependencyContext();

	/**
	 * Returns a new object of class '<em>CIM Device Statistical Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Statistical Information</em>'.
	 * @generated
	 */
	CIM_DeviceStatisticalInformation createCIM_DeviceStatisticalInformation();

	/**
	 * Returns a new object of class '<em>CIM Element Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Capabilities</em>'.
	 * @generated
	 */
	CIM_ElementCapabilities createCIM_ElementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Configuration</em>'.
	 * @generated
	 */
	CIM_ElementConfiguration createCIM_ElementConfiguration();

	/**
	 * Returns a new object of class '<em>CIM Element Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Setting Data</em>'.
	 * @generated
	 */
	CIM_ElementSettingData createCIM_ElementSettingData();

	/**
	 * Returns a new object of class '<em>CIM Element Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Statistical Data</em>'.
	 * @generated
	 */
	CIM_ElementStatisticalData createCIM_ElementStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM Element View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element View</em>'.
	 * @generated
	 */
	CIM_ElementView createCIM_ElementView();

	/**
	 * Returns a new object of class '<em>CIM Enabled Logical Element Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Enabled Logical Element Capabilities</em>'.
	 * @generated
	 */
	CIM_EnabledLogicalElementCapabilities createCIM_EnabledLogicalElementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM FRU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FRU</em>'.
	 * @generated
	 */
	CIM_FRU createCIM_FRU();

	/**
	 * Returns a new object of class '<em>CIM FRU Includes Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FRU Includes Product</em>'.
	 * @generated
	 */
	CIM_FRUIncludesProduct createCIM_FRUIncludesProduct();

	/**
	 * Returns a new object of class '<em>CIM FRU Physical Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FRU Physical Elements</em>'.
	 * @generated
	 */
	CIM_FRUPhysicalElements createCIM_FRUPhysicalElements();

	/**
	 * Returns a new object of class '<em>CIM Group Synchronized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Group Synchronized</em>'.
	 * @generated
	 */
	CIM_GroupSynchronized createCIM_GroupSynchronized();

	/**
	 * Returns a new object of class '<em>CIM Hosted Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Dependency</em>'.
	 * @generated
	 */
	CIM_HostedDependency createCIM_HostedDependency();

	/**
	 * Returns a new object of class '<em>CIM Implementation Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Implementation Capabilities</em>'.
	 * @generated
	 */
	CIM_ImplementationCapabilities createCIM_ImplementationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Job Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Job Capabilities</em>'.
	 * @generated
	 */
	CIM_JobCapabilities createCIM_JobCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Launch In Context Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Launch In Context Capabilities</em>'.
	 * @generated
	 */
	CIM_LaunchInContextCapabilities createCIM_LaunchInContextCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Localization Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Localization Capabilities</em>'.
	 * @generated
	 */
	CIM_LocalizationCapabilities createCIM_LocalizationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Location</em>'.
	 * @generated
	 */
	CIM_Location createCIM_Location();

	/**
	 * Returns a new object of class '<em>CIM Member Of Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Member Of Collection</em>'.
	 * @generated
	 */
	CIM_MemberOfCollection createCIM_MemberOfCollection();

	/**
	 * Returns a new object of class '<em>CIM Opaque Management Data Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Opaque Management Data Capabilities</em>'.
	 * @generated
	 */
	CIM_OpaqueManagementDataCapabilities createCIM_OpaqueManagementDataCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Ordered Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ordered Component</em>'.
	 * @generated
	 */
	CIM_OrderedComponent createCIM_OrderedComponent();

	/**
	 * Returns a new object of class '<em>CIM Ordered Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ordered Dependency</em>'.
	 * @generated
	 */
	CIM_OrderedDependency createCIM_OrderedDependency();

	/**
	 * Returns a new object of class '<em>CIM Ordered Member Of Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ordered Member Of Collection</em>'.
	 * @generated
	 */
	CIM_OrderedMemberOfCollection createCIM_OrderedMemberOfCollection();

	/**
	 * Returns a new object of class '<em>CIM Owning Collection Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Owning Collection Element</em>'.
	 * @generated
	 */
	CIM_OwningCollectionElement createCIM_OwningCollectionElement();

	/**
	 * Returns a new object of class '<em>CIM Physical Statistical Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Statistical Information</em>'.
	 * @generated
	 */
	CIM_PhysicalStatisticalInformation createCIM_PhysicalStatisticalInformation();

	/**
	 * Returns a new object of class '<em>CIM Physical Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Statistics</em>'.
	 * @generated
	 */
	CIM_PhysicalStatistics createCIM_PhysicalStatistics();

	/**
	 * Returns a new object of class '<em>CIM Power Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Power Management Capabilities</em>'.
	 * @generated
	 */
	CIM_PowerManagementCapabilities createCIM_PowerManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Product Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Component</em>'.
	 * @generated
	 */
	CIM_ProductComponent createCIM_ProductComponent();

	/**
	 * Returns a new object of class '<em>CIM Product Element Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Element Component</em>'.
	 * @generated
	 */
	CIM_ProductElementComponent createCIM_ProductElementComponent();

	/**
	 * Returns a new object of class '<em>CIM Product FRU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product FRU</em>'.
	 * @generated
	 */
	CIM_ProductFRU createCIM_ProductFRU();

	/**
	 * Returns a new object of class '<em>CIM Product Physical Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Physical Component</em>'.
	 * @generated
	 */
	CIM_ProductPhysicalComponent createCIM_ProductPhysicalComponent();

	/**
	 * Returns a new object of class '<em>CIM Product Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Support</em>'.
	 * @generated
	 */
	CIM_ProductSupport createCIM_ProductSupport();

	/**
	 * Returns a new object of class '<em>CIM Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Profile</em>'.
	 * @generated
	 */
	CIM_Profile createCIM_Profile();

	/**
	 * Returns a new object of class '<em>CIM Redundancy Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Redundancy Group</em>'.
	 * @generated
	 */
	CIM_RedundancyGroup createCIM_RedundancyGroup();

	/**
	 * Returns a new object of class '<em>CIM Related Element Causing Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Related Element Causing Error</em>'.
	 * @generated
	 */
	CIM_RelatedElementCausingError createCIM_RelatedElementCausingError();

	/**
	 * Returns a new object of class '<em>CIM Related Statistical Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Related Statistical Data</em>'.
	 * @generated
	 */
	CIM_RelatedStatisticalData createCIM_RelatedStatisticalData();

	/**
	 * Returns a new object of class '<em>CIM Related Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Related Statistics</em>'.
	 * @generated
	 */
	CIM_RelatedStatistics createCIM_RelatedStatistics();

	/**
	 * Returns a new object of class '<em>CIM Replaceable Product FRU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replaceable Product FRU</em>'.
	 * @generated
	 */
	CIM_ReplaceableProductFRU createCIM_ReplaceableProductFRU();

	/**
	 * Returns a new object of class '<em>CIM Resource Allocation Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Resource Allocation Setting Data</em>'.
	 * @generated
	 */
	CIM_ResourceAllocationSettingData createCIM_ResourceAllocationSettingData();

	/**
	 * Returns a new object of class '<em>CIM Resource Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Resource Pool</em>'.
	 * @generated
	 */
	CIM_ResourcePool createCIM_ResourcePool();

	/**
	 * Returns a new object of class '<em>CIM Resource Pool Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Resource Pool Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_ResourcePoolConfigurationCapabilities createCIM_ResourcePoolConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM SAP Statistical Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SAP Statistical Information</em>'.
	 * @generated
	 */
	CIM_SAPStatisticalInformation createCIM_SAPStatisticalInformation();

	/**
	 * Returns a new object of class '<em>CIM Service Statistical Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Statistical Information</em>'.
	 * @generated
	 */
	CIM_ServiceStatisticalInformation createCIM_ServiceStatisticalInformation();

	/**
	 * Returns a new object of class '<em>CIM Setting Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Setting Context</em>'.
	 * @generated
	 */
	CIM_SettingContext createCIM_SettingContext();

	/**
	 * Returns a new object of class '<em>CIM Settings Define Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Settings Define Capabilities</em>'.
	 * @generated
	 */
	CIM_SettingsDefineCapabilities createCIM_SettingsDefineCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Software Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Identity</em>'.
	 * @generated
	 */
	CIM_SoftwareIdentity createCIM_SoftwareIdentity();

	/**
	 * Returns a new object of class '<em>CIM Software Installation Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Installation Service Capabilities</em>'.
	 * @generated
	 */
	CIM_SoftwareInstallationServiceCapabilities createCIM_SoftwareInstallationServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Spare Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Spare Group</em>'.
	 * @generated
	 */
	CIM_SpareGroup createCIM_SpareGroup();

	/**
	 * Returns a new object of class '<em>CIM Spared</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Spared</em>'.
	 * @generated
	 */
	CIM_Spared createCIM_Spared();

	/**
	 * Returns a new object of class '<em>CIM Storage Allocation Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Allocation Setting Data</em>'.
	 * @generated
	 */
	CIM_StorageAllocationSettingData createCIM_StorageAllocationSettingData();

	/**
	 * Returns a new object of class '<em>CIM Storage Redundancy Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Redundancy Group</em>'.
	 * @generated
	 */
	CIM_StorageRedundancyGroup createCIM_StorageRedundancyGroup();

	/**
	 * Returns a new object of class '<em>CIM System Setting Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Setting Context</em>'.
	 * @generated
	 */
	CIM_SystemSettingContext createCIM_SystemSettingContext();

	/**
	 * Returns a new object of class '<em>CIM System Specific Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Specific Collection</em>'.
	 * @generated
	 */
	CIM_SystemSpecificCollection createCIM_SystemSpecificCollection();

	/**
	 * Returns a new object of class '<em>CIM Virtual Ethernet Switch Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual Ethernet Switch Setting Data</em>'.
	 * @generated
	 */
	CIM_VirtualEthernetSwitchSettingData createCIM_VirtualEthernetSwitchSettingData();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Management Capabilities</em>'.
	 * @generated
	 */
	CIM_VirtualSystemManagementCapabilities createCIM_VirtualSystemManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Snapshot Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Snapshot Capabilities</em>'.
	 * @generated
	 */
	CIM_VirtualSystemSnapshotCapabilities createCIM_VirtualSystemSnapshotCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Snapshot Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Snapshot Service Capabilities</em>'.
	 * @generated
	 */
	CIM_VirtualSystemSnapshotServiceCapabilities createCIM_VirtualSystemSnapshotServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Common Database Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Common Database Capabilities</em>'.
	 * @generated
	 */
	CIM_CommonDatabaseCapabilities createCIM_CommonDatabaseCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Database Segment Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Segment Setting Data</em>'.
	 * @generated
	 */
	CIM_DatabaseSegmentSettingData createCIM_DatabaseSegmentSettingData();

	/**
	 * Returns a new object of class '<em>CIM Relational Database Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Relational Database Capabilities</em>'.
	 * @generated
	 */
	CIM_RelationalDatabaseCapabilities createCIM_RelationalDatabaseCapabilities();

	/**
	 * Returns a new object of class '<em>CIM SNMP Database Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SNMP Database Parameter</em>'.
	 * @generated
	 */
	CIM_SNMPDatabaseParameter createCIM_SNMPDatabaseParameter();

	/**
	 * Returns a new object of class '<em>CIM Advanced Storage Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Advanced Storage Setting</em>'.
	 * @generated
	 */
	CIM_AdvancedStorageSetting createCIM_AdvancedStorageSetting();

	/**
	 * Returns a new object of class '<em>CIM Alarm Device Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Alarm Device Capabilities</em>'.
	 * @generated
	 */
	CIM_AlarmDeviceCapabilities createCIM_AlarmDeviceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Allocated Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocated Resources</em>'.
	 * @generated
	 */
	CIM_AllocatedResources createCIM_AllocatedResources();

	/**
	 * Returns a new object of class '<em>CIM Block Statistics Manifest Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Block Statistics Manifest Collection</em>'.
	 * @generated
	 */
	CIM_BlockStatisticsManifestCollection createCIM_BlockStatisticsManifestCollection();

	/**
	 * Returns a new object of class '<em>CIM Device Sharing Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Sharing Capabilities</em>'.
	 * @generated
	 */
	CIM_DeviceSharingCapabilities createCIM_DeviceSharingCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Disk Drive View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Drive View</em>'.
	 * @generated
	 */
	CIM_DiskDriveView createCIM_DiskDriveView();

	/**
	 * Returns a new object of class '<em>CIM Disk Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Group</em>'.
	 * @generated
	 */
	CIM_DiskGroup createCIM_DiskGroup();

	/**
	 * Returns a new object of class '<em>CIM Disk Partition Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Partition Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_DiskPartitionConfigurationCapabilities createCIM_DiskPartitionConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Drive Component View View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Drive Component View View</em>'.
	 * @generated
	 */
	CIM_DriveComponentViewView createCIM_DriveComponentViewView();

	/**
	 * Returns a new object of class '<em>CIM Element Statistical Data View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Statistical Data View</em>'.
	 * @generated
	 */
	CIM_ElementStatisticalDataView createCIM_ElementStatisticalDataView();

	/**
	 * Returns a new object of class '<em>CIM Element Storage Protection Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Storage Protection Setting Data</em>'.
	 * @generated
	 */
	CIM_ElementStorageProtectionSettingData createCIM_ElementStorageProtectionSettingData();

	/**
	 * Returns a new object of class '<em>CIM Ethernet Port Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ethernet Port Statistics</em>'.
	 * @generated
	 */
	CIM_EthernetPortStatistics createCIM_EthernetPortStatistics();

	/**
	 * Returns a new object of class '<em>CIM FC Adapter Event Counters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Adapter Event Counters</em>'.
	 * @generated
	 */
	CIM_FCAdapterEventCounters createCIM_FCAdapterEventCounters();

	/**
	 * Returns a new object of class '<em>CIM FC Port Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Port Settings</em>'.
	 * @generated
	 */
	CIM_FCPortSettings createCIM_FCPortSettings();

	/**
	 * Returns a new object of class '<em>CIM FC Port Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Port Statistics</em>'.
	 * @generated
	 */
	CIM_FCPortStatistics createCIM_FCPortStatistics();

	/**
	 * Returns a new object of class '<em>CIM FC Switch Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Switch Capabilities</em>'.
	 * @generated
	 */
	CIM_FCSwitchCapabilities createCIM_FCSwitchCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Failover Storage Extents Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Failover Storage Extents Collection</em>'.
	 * @generated
	 */
	CIM_FailoverStorageExtentsCollection createCIM_FailoverStorageExtentsCollection();

	/**
	 * Returns a new object of class '<em>CIM Fibre Port Event Counters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fibre Port Event Counters</em>'.
	 * @generated
	 */
	CIM_FibrePortEventCounters createCIM_FibrePortEventCounters();

	/**
	 * Returns a new object of class '<em>CIM File System Replication Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Replication Capabilities</em>'.
	 * @generated
	 */
	CIM_FileSystemReplicationCapabilities createCIM_FileSystemReplicationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Indicator LED Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indicator LED Capabilities</em>'.
	 * @generated
	 */
	CIM_IndicatorLEDCapabilities createCIM_IndicatorLEDCapabilities();

	/**
	 * Returns a new object of class '<em>CIM LLDP Ethernet Port Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM LLDP Ethernet Port Statistics</em>'.
	 * @generated
	 */
	CIM_LLDPEthernetPortStatistics createCIM_LLDPEthernetPortStatistics();

	/**
	 * Returns a new object of class '<em>CIM Label Reader Stat Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Label Reader Stat Info</em>'.
	 * @generated
	 */
	CIM_LabelReaderStatInfo createCIM_LabelReaderStatInfo();

	/**
	 * Returns a new object of class '<em>CIM Logical Port Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Port Capabilities</em>'.
	 * @generated
	 */
	CIM_LogicalPortCapabilities createCIM_LogicalPortCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Logical Port Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Port Group</em>'.
	 * @generated
	 */
	CIM_LogicalPortGroup createCIM_LogicalPortGroup();

	/**
	 * Returns a new object of class '<em>CIM Mapping Protocol Controller View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Mapping Protocol Controller View</em>'.
	 * @generated
	 */
	CIM_MappingProtocolControllerView createCIM_MappingProtocolControllerView();

	/**
	 * Returns a new object of class '<em>CIM Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Masking Group</em>'.
	 * @generated
	 */
	CIM_MaskingGroup createCIM_MaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM Media Access Stat Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Access Stat Info</em>'.
	 * @generated
	 */
	CIM_MediaAccessStatInfo createCIM_MediaAccessStatInfo();

	/**
	 * Returns a new object of class '<em>CIM Memory Allocation Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Allocation Setting Data</em>'.
	 * @generated
	 */
	CIM_MemoryAllocationSettingData createCIM_MemoryAllocationSettingData();

	/**
	 * Returns a new object of class '<em>CIM Memory Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Capabilities</em>'.
	 * @generated
	 */
	CIM_MemoryCapabilities createCIM_MemoryCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Memory Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_MemoryConfigurationCapabilities createCIM_MemoryConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Memory Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Error</em>'.
	 * @generated
	 */
	CIM_MemoryError createCIM_MemoryError();

	/**
	 * Returns a new object of class '<em>CIM Monitor Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Monitor Resolution</em>'.
	 * @generated
	 */
	CIM_MonitorResolution createCIM_MonitorResolution();

	/**
	 * Returns a new object of class '<em>CIM Network Port Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Port Capabilities</em>'.
	 * @generated
	 */
	CIM_NetworkPortCapabilities createCIM_NetworkPortCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Operational Power Manifest Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operational Power Manifest Collection</em>'.
	 * @generated
	 */
	CIM_OperationalPowerManifestCollection createCIM_OperationalPowerManifestCollection();

	/**
	 * Returns a new object of class '<em>CIM PCI Port Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PCI Port Group</em>'.
	 * @generated
	 */
	CIM_PCIPortGroup createCIM_PCIPortGroup();

	/**
	 * Returns a new object of class '<em>CIM Persistent Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Persistent Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_PersistentConfigurationCapabilities createCIM_PersistentConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Persistent Memory Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Persistent Memory Capabilities</em>'.
	 * @generated
	 */
	CIM_PersistentMemoryCapabilities createCIM_PersistentMemoryCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Persistent Memory Namespace Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Persistent Memory Namespace Setting Data</em>'.
	 * @generated
	 */
	CIM_PersistentMemoryNamespaceSettingData createCIM_PersistentMemoryNamespaceSettingData();

	/**
	 * Returns a new object of class '<em>CIM Picker Stat Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Picker Stat Info</em>'.
	 * @generated
	 */
	CIM_PickerStatInfo createCIM_PickerStatInfo();

	/**
	 * Returns a new object of class '<em>CIM Power Allocation Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Power Allocation Setting Data</em>'.
	 * @generated
	 */
	CIM_PowerAllocationSettingData createCIM_PowerAllocationSettingData();

	/**
	 * Returns a new object of class '<em>CIM Power Utilization Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Power Utilization Management Capabilities</em>'.
	 * @generated
	 */
	CIM_PowerUtilizationManagementCapabilities createCIM_PowerUtilizationManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Processor Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Processor Capabilities</em>'.
	 * @generated
	 */
	CIM_ProcessorCapabilities createCIM_ProcessorCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Protocol Controller Masking Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Controller Masking Capabilities</em>'.
	 * @generated
	 */
	CIM_ProtocolControllerMaskingCapabilities createCIM_ProtocolControllerMaskingCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Remote Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remote Resources</em>'.
	 * @generated
	 */
	CIM_RemoteResources createCIM_RemoteResources();

	/**
	 * Returns a new object of class '<em>CIM Replica Pair View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replica Pair View</em>'.
	 * @generated
	 */
	CIM_ReplicaPairView createCIM_ReplicaPairView();

	/**
	 * Returns a new object of class '<em>CIM Replication Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replication Group</em>'.
	 * @generated
	 */
	CIM_ReplicationGroup createCIM_ReplicationGroup();

	/**
	 * Returns a new object of class '<em>CIM SCSI Multipath Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Multipath Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_SCSIMultipathConfigurationCapabilities createCIM_SCSIMultipathConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM SCSI Target Port Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Target Port Group</em>'.
	 * @generated
	 */
	CIM_SCSITargetPortGroup createCIM_SCSITargetPortGroup();

	/**
	 * Returns a new object of class '<em>CIM Spare Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Spare Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_SpareConfigurationCapabilities createCIM_SpareConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Statistics Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Statistics Capabilities</em>'.
	 * @generated
	 */
	CIM_StatisticsCapabilities createCIM_StatisticsCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageCapabilities createCIM_StorageCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Element Composition Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Element Composition Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageElementCompositionCapabilities createCIM_StorageElementCompositionCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Erasure Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Erasure Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageErasureCapabilities createCIM_StorageErasureCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Library Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Library Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageLibraryCapabilities createCIM_StorageLibraryCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Pool Diagnostic Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Pool Diagnostic Setting Data</em>'.
	 * @generated
	 */
	CIM_StoragePoolDiagnosticSettingData createCIM_StoragePoolDiagnosticSettingData();

	/**
	 * Returns a new object of class '<em>CIM Storage Protection Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Protection Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageProtectionCapabilities createCIM_StorageProtectionCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Replication Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Replication Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageReplicationCapabilities createCIM_StorageReplicationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Resource Load Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Resource Load Group</em>'.
	 * @generated
	 */
	CIM_StorageResourceLoadGroup createCIM_StorageResourceLoadGroup();

	/**
	 * Returns a new object of class '<em>CIM Storage Server Asymmetry Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Server Asymmetry Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageServerAsymmetryCapabilities createCIM_StorageServerAsymmetryCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Setting With Hints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Setting With Hints</em>'.
	 * @generated
	 */
	CIM_StorageSettingWithHints createCIM_StorageSettingWithHints();

	/**
	 * Returns a new object of class '<em>CIM Storage Tier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Tier</em>'.
	 * @generated
	 */
	CIM_StorageTier createCIM_StorageTier();

	/**
	 * Returns a new object of class '<em>CIM Storage Tier Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Tier Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageTierCapabilities createCIM_StorageTierCapabilities();

	/**
	 * Returns a new object of class '<em>CIM System Registration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Registration Capabilities</em>'.
	 * @generated
	 */
	CIM_SystemRegistrationCapabilities createCIM_SystemRegistrationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Target Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Target Masking Group</em>'.
	 * @generated
	 */
	CIM_TargetMaskingGroup createCIM_TargetMaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM Target Port Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Target Port Group</em>'.
	 * @generated
	 */
	CIM_TargetPortGroup createCIM_TargetPortGroup();

	/**
	 * Returns a new object of class '<em>CIM Tier Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tier Service Capabilities</em>'.
	 * @generated
	 */
	CIM_TierServiceCapabilities createCIM_TierServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM VTL Statistical Data Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VTL Statistical Data Service Capabilities</em>'.
	 * @generated
	 */
	CIM_VTLStatisticalDataServiceCapabilities createCIM_VTLStatisticalDataServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Video Controller Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video Controller Resolution</em>'.
	 * @generated
	 */
	CIM_VideoControllerResolution createCIM_VideoControllerResolution();

	/**
	 * Returns a new object of class '<em>CIM View Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM View Capabilities</em>'.
	 * @generated
	 */
	CIM_ViewCapabilities createCIM_ViewCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Volume View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Volume View</em>'.
	 * @generated
	 */
	CIM_VolumeView createCIM_VolumeView();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Port Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Port Capabilities</em>'.
	 * @generated
	 */
	CIM_WiFiPortCapabilities createCIM_WiFiPortCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Zone Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Zone Capabilities</em>'.
	 * @generated
	 */
	CIM_ZoneCapabilities createCIM_ZoneCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Zone Membership Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Zone Membership Setting Data</em>'.
	 * @generated
	 */
	CIM_ZoneMembershipSettingData createCIM_ZoneMembershipSettingData();

	/**
	 * Returns a new object of class '<em>CIM Alert Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Alert Indication</em>'.
	 * @generated
	 */
	CIM_AlertIndication createCIM_AlertIndication();

	/**
	 * Returns a new object of class '<em>CIM Alert Inst Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Alert Inst Indication</em>'.
	 * @generated
	 */
	CIM_AlertInstIndication createCIM_AlertInstIndication();

	/**
	 * Returns a new object of class '<em>CIM Class Modification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Class Modification</em>'.
	 * @generated
	 */
	CIM_ClassModification createCIM_ClassModification();

	/**
	 * Returns a new object of class '<em>CIM Filter Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter Collection</em>'.
	 * @generated
	 */
	CIM_FilterCollection createCIM_FilterCollection();

	/**
	 * Returns a new object of class '<em>CIM Filter Collection Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter Collection Subscription</em>'.
	 * @generated
	 */
	CIM_FilterCollectionSubscription createCIM_FilterCollectionSubscription();

	/**
	 * Returns a new object of class '<em>CIM Indication Handler CIMXML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indication Handler CIMXML</em>'.
	 * @generated
	 */
	CIM_IndicationHandlerCIMXML createCIM_IndicationHandlerCIMXML();

	/**
	 * Returns a new object of class '<em>CIM Indication Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indication Service Capabilities</em>'.
	 * @generated
	 */
	CIM_IndicationServiceCapabilities createCIM_IndicationServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Indication Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indication Subscription</em>'.
	 * @generated
	 */
	CIM_IndicationSubscription createCIM_IndicationSubscription();

	/**
	 * Returns a new object of class '<em>CIM Inst Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Inst Creation</em>'.
	 * @generated
	 */
	CIM_InstCreation createCIM_InstCreation();

	/**
	 * Returns a new object of class '<em>CIM Inst Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Inst Deletion</em>'.
	 * @generated
	 */
	CIM_InstDeletion createCIM_InstDeletion();

	/**
	 * Returns a new object of class '<em>CIM Threshold Indication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Threshold Indication</em>'.
	 * @generated
	 */
	CIM_ThresholdIndication createCIM_ThresholdIndication();

	/**
	 * Returns a new object of class '<em>CIM SA Static Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SA Static Action</em>'.
	 * @generated
	 */
	CIM_SAStaticAction createCIM_SAStaticAction();

	/**
	 * Returns a new object of class '<em>CIM Query Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Query Capabilities</em>'.
	 * @generated
	 */
	CIM_QueryCapabilities createCIM_QueryCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Referenced Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Referenced Specification</em>'.
	 * @generated
	 */
	CIM_ReferencedSpecification createCIM_ReferencedSpecification();

	/**
	 * Returns a new object of class '<em>CIM Registered Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Registered Profile</em>'.
	 * @generated
	 */
	CIM_RegisteredProfile createCIM_RegisteredProfile();

	/**
	 * Returns a new object of class '<em>CIM Registered Sub Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Registered Sub Profile</em>'.
	 * @generated
	 */
	CIM_RegisteredSubProfile createCIM_RegisteredSubProfile();

	/**
	 * Returns a new object of class '<em>CIM WBEM Server Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WBEM Server Capabilities</em>'.
	 * @generated
	 */
	CIM_WBEMServerCapabilities createCIM_WBEMServerCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Aggregation Metric Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Aggregation Metric Definition</em>'.
	 * @generated
	 */
	CIM_AggregationMetricDefinition createCIM_AggregationMetricDefinition();

	/**
	 * Returns a new object of class '<em>CIM Aggregation Metric Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Aggregation Metric Value</em>'.
	 * @generated
	 */
	CIM_AggregationMetricValue createCIM_AggregationMetricValue();

	/**
	 * Returns a new object of class '<em>CIM Logical Element Performs Uo W</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Element Performs Uo W</em>'.
	 * @generated
	 */
	CIM_LogicalElementPerformsUoW createCIM_LogicalElementPerformsUoW();

	/**
	 * Returns a new object of class '<em>CIM Metric Def For ME</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Metric Def For ME</em>'.
	 * @generated
	 */
	CIM_MetricDefForME createCIM_MetricDefForME();

	/**
	 * Returns a new object of class '<em>CIM Metric For ME</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Metric For ME</em>'.
	 * @generated
	 */
	CIM_MetricForME createCIM_MetricForME();

	/**
	 * Returns a new object of class '<em>CIM Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Metric Instance</em>'.
	 * @generated
	 */
	CIM_MetricInstance createCIM_MetricInstance();

	/**
	 * Returns a new object of class '<em>CIM Metric Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Metric Service Capabilities</em>'.
	 * @generated
	 */
	CIM_MetricServiceCapabilities createCIM_MetricServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Sub Uo W</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Sub Uo W</em>'.
	 * @generated
	 */
	CIM_SubUoW createCIM_SubUoW();

	/**
	 * Returns a new object of class '<em>CIM Unit Of Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unit Of Work Definition</em>'.
	 * @generated
	 */
	CIM_UnitOfWorkDefinition createCIM_UnitOfWorkDefinition();

	/**
	 * Returns a new object of class '<em>CIM Uo WDef Trace Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Uo WDef Trace Level Type</em>'.
	 * @generated
	 */
	CIM_UoWDefTraceLevelType createCIM_UoWDefTraceLevelType();

	/**
	 * Returns a new object of class '<em>CIM Uo WMetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Uo WMetric</em>'.
	 * @generated
	 */
	CIM_UoWMetric createCIM_UoWMetric();

	/**
	 * Returns a new object of class '<em>CIM Uo WMetric Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Uo WMetric Definition</em>'.
	 * @generated
	 */
	CIM_UoWMetricDefinition createCIM_UoWMetricDefinition();

	/**
	 * Returns a new object of class '<em>CIM Administrative Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Administrative Distance</em>'.
	 * @generated
	 */
	CIM_AdministrativeDistance createCIM_AdministrativeDistance();

	/**
	 * Returns a new object of class '<em>CIM Allocation Scheduling Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocation Scheduling Element</em>'.
	 * @generated
	 */
	CIM_AllocationSchedulingElement createCIM_AllocationSchedulingElement();

	/**
	 * Returns a new object of class '<em>CIM BGP Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Attributes</em>'.
	 * @generated
	 */
	CIM_BGPAttributes createCIM_BGPAttributes();

	/**
	 * Returns a new object of class '<em>CIM BGP Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Cluster</em>'.
	 * @generated
	 */
	CIM_BGPCluster createCIM_BGPCluster();

	/**
	 * Returns a new object of class '<em>CIM BGP Path Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Path Attributes</em>'.
	 * @generated
	 */
	CIM_BGPPathAttributes createCIM_BGPPathAttributes();

	/**
	 * Returns a new object of class '<em>CIM BGP Peer Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Peer Group</em>'.
	 * @generated
	 */
	CIM_BGPPeerGroup createCIM_BGPPeerGroup();

	/**
	 * Returns a new object of class '<em>CIM BGP Route Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Route Map</em>'.
	 * @generated
	 */
	CIM_BGPRouteMap createCIM_BGPRouteMap();

	/**
	 * Returns a new object of class '<em>CIM BGP Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Statistics</em>'.
	 * @generated
	 */
	CIM_BGPStatistics createCIM_BGPStatistics();

	/**
	 * Returns a new object of class '<em>CIM Buffer Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Buffer Pool</em>'.
	 * @generated
	 */
	CIM_BufferPool createCIM_BufferPool();

	/**
	 * Returns a new object of class '<em>CIM Collected Buffer Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collected Buffer Pool</em>'.
	 * @generated
	 */
	CIM_CollectedBufferPool createCIM_CollectedBufferPool();

	/**
	 * Returns a new object of class '<em>CIM Connectivity Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Connectivity Collection</em>'.
	 * @generated
	 */
	CIM_ConnectivityCollection createCIM_ConnectivityCollection();

	/**
	 * Returns a new object of class '<em>CIM DHCP Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DHCP Capabilities</em>'.
	 * @generated
	 */
	CIM_DHCPCapabilities createCIM_DHCPCapabilities();

	/**
	 * Returns a new object of class '<em>CIM DHCP Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DHCP Setting Data</em>'.
	 * @generated
	 */
	CIM_DHCPSettingData createCIM_DHCPSettingData();

	/**
	 * Returns a new object of class '<em>CIM DNS General Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DNS General Setting Data</em>'.
	 * @generated
	 */
	CIM_DNSGeneralSettingData createCIM_DNSGeneralSettingData();

	/**
	 * Returns a new object of class '<em>CIM DNS Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DNS Setting Data</em>'.
	 * @generated
	 */
	CIM_DNSSettingData createCIM_DNSSettingData();

	/**
	 * Returns a new object of class '<em>CIM Dynamic Forwarding Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Dynamic Forwarding Entry</em>'.
	 * @generated
	 */
	CIM_DynamicForwardingEntry createCIM_DynamicForwardingEntry();

	/**
	 * Returns a new object of class '<em>CIM Extended Static IP Assignment Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Extended Static IP Assignment Setting Data</em>'.
	 * @generated
	 */
	CIM_ExtendedStaticIPAssignmentSettingData createCIM_ExtendedStaticIPAssignmentSettingData();

	/**
	 * Returns a new object of class '<em>CIM Filter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter List</em>'.
	 * @generated
	 */
	CIM_FilterList createCIM_FilterList();

	/**
	 * Returns a new object of class '<em>CIM Filter Lists In BGP Route Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter Lists In BGP Route Map</em>'.
	 * @generated
	 */
	CIM_FilterListsInBGPRouteMap createCIM_FilterListsInBGPRouteMap();

	/**
	 * Returns a new object of class '<em>CIM Hdr8021 Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hdr8021 Filter</em>'.
	 * @generated
	 */
	CIM_Hdr8021Filter createCIM_Hdr8021Filter();

	/**
	 * Returns a new object of class '<em>CIM IEEE802 1x Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IEEE802 1x Capabilities</em>'.
	 * @generated
	 */
	CIM_IEEE8021xCapabilities createCIM_IEEE8021xCapabilities();

	/**
	 * Returns a new object of class '<em>CIM IP Connectivity Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Connectivity Subnet</em>'.
	 * @generated
	 */
	CIM_IPConnectivitySubnet createCIM_IPConnectivitySubnet();

	/**
	 * Returns a new object of class '<em>CIM IP Headers Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Headers Filter</em>'.
	 * @generated
	 */
	CIM_IPHeadersFilter createCIM_IPHeadersFilter();

	/**
	 * Returns a new object of class '<em>CIM IPSO Filter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPSO Filter Entry</em>'.
	 * @generated
	 */
	CIM_IPSOFilterEntry createCIM_IPSOFilterEntry();

	/**
	 * Returns a new object of class '<em>CIM IPX Connectivity Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPX Connectivity Network</em>'.
	 * @generated
	 */
	CIM_IPXConnectivityNetwork createCIM_IPXConnectivityNetwork();

	/**
	 * Returns a new object of class '<em>CIM LAN Connectivity Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM LAN Connectivity Segment</em>'.
	 * @generated
	 */
	CIM_LANConnectivitySegment createCIM_LANConnectivitySegment();

	/**
	 * Returns a new object of class '<em>CIM Logical Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Network</em>'.
	 * @generated
	 */
	CIM_LogicalNetwork createCIM_LogicalNetwork();

	/**
	 * Returns a new object of class '<em>CIM Named Address Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Named Address Collection</em>'.
	 * @generated
	 */
	CIM_NamedAddressCollection createCIM_NamedAddressCollection();

	/**
	 * Returns a new object of class '<em>CIM Network Policy Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Policy Action</em>'.
	 * @generated
	 */
	CIM_NetworkPolicyAction createCIM_NetworkPolicyAction();

	/**
	 * Returns a new object of class '<em>CIM Network Policy Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Policy Condition</em>'.
	 * @generated
	 */
	CIM_NetworkPolicyCondition createCIM_NetworkPolicyCondition();

	/**
	 * Returns a new object of class '<em>CIM Network VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network VLAN</em>'.
	 * @generated
	 */
	CIM_NetworkVLAN createCIM_NetworkVLAN();

	/**
	 * Returns a new object of class '<em>CIM Next Hop IP Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Next Hop IP Route</em>'.
	 * @generated
	 */
	CIM_NextHopIPRoute createCIM_NextHopIPRoute();

	/**
	 * Returns a new object of class '<em>CIM OSPF Area Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Area Configuration</em>'.
	 * @generated
	 */
	CIM_OSPFAreaConfiguration createCIM_OSPFAreaConfiguration();

	/**
	 * Returns a new object of class '<em>CIM OSPF Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Link</em>'.
	 * @generated
	 */
	CIM_OSPFLink createCIM_OSPFLink();

	/**
	 * Returns a new object of class '<em>CIM OSPF Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Service Capabilities</em>'.
	 * @generated
	 */
	CIM_OSPFServiceCapabilities createCIM_OSPFServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Peer ID Payload Filter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Peer ID Payload Filter Entry</em>'.
	 * @generated
	 */
	CIM_PeerIDPayloadFilterEntry createCIM_PeerIDPayloadFilterEntry();

	/**
	 * Returns a new object of class '<em>CIM Preamble Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Preamble Filter</em>'.
	 * @generated
	 */
	CIM_PreambleFilter createCIM_PreambleFilter();

	/**
	 * Returns a new object of class '<em>CIM Priority Scheduling Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Priority Scheduling Element</em>'.
	 * @generated
	 */
	CIM_PrioritySchedulingElement createCIM_PrioritySchedulingElement();

	/**
	 * Returns a new object of class '<em>CIM Protocol Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Service Capabilities</em>'.
	 * @generated
	 */
	CIM_ProtocolServiceCapabilities createCIM_ProtocolServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Range Of IP Addresses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Range Of IP Addresses</em>'.
	 * @generated
	 */
	CIM_RangeOfIPAddresses createCIM_RangeOfIPAddresses();

	/**
	 * Returns a new object of class '<em>CIM Ranges Of Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ranges Of Configuration</em>'.
	 * @generated
	 */
	CIM_RangesOfConfiguration createCIM_RangesOfConfiguration();

	/**
	 * Returns a new object of class '<em>CIM Redirection Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Redirection Service Capabilities</em>'.
	 * @generated
	 */
	CIM_RedirectionServiceCapabilities createCIM_RedirectionServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Routing Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Routing Policy</em>'.
	 * @generated
	 */
	CIM_RoutingPolicy createCIM_RoutingPolicy();

	/**
	 * Returns a new object of class '<em>CIM SSH Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SSH Capabilities</em>'.
	 * @generated
	 */
	CIM_SSHCapabilities createCIM_SSHCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Spanning Tree Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Spanning Tree Statistics</em>'.
	 * @generated
	 */
	CIM_SpanningTreeStatistics createCIM_SpanningTreeStatistics();

	/**
	 * Returns a new object of class '<em>CIM Static Forwarding Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Static Forwarding Entry</em>'.
	 * @generated
	 */
	CIM_StaticForwardingEntry createCIM_StaticForwardingEntry();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Source Routing Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Source Routing Statistics</em>'.
	 * @generated
	 */
	CIM_SwitchPortSourceRoutingStatistics createCIM_SwitchPortSourceRoutingStatistics();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Spanning Tree Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Spanning Tree Statistics</em>'.
	 * @generated
	 */
	CIM_SwitchPortSpanningTreeStatistics createCIM_SwitchPortSpanningTreeStatistics();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Statistics</em>'.
	 * @generated
	 */
	CIM_SwitchPortStatistics createCIM_SwitchPortStatistics();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Transparent Bridging Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Transparent Bridging Statistics</em>'.
	 * @generated
	 */
	CIM_SwitchPortTransparentBridgingStatistics createCIM_SwitchPortTransparentBridgingStatistics();

	/**
	 * Returns a new object of class '<em>CIM Telnet Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Telnet Capabilities</em>'.
	 * @generated
	 */
	CIM_TelnetCapabilities createCIM_TelnetCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Transparent Bridging Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Transparent Bridging Statistics</em>'.
	 * @generated
	 */
	CIM_TransparentBridgingStatistics createCIM_TransparentBridgingStatistics();

	/**
	 * Returns a new object of class '<em>CIM USB Redirection Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Redirection Capabilities</em>'.
	 * @generated
	 */
	CIM_USBRedirectionCapabilities createCIM_USBRedirectionCapabilities();

	/**
	 * Returns a new object of class '<em>CIM VLAN Endpoint Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VLAN Endpoint Capabilities</em>'.
	 * @generated
	 */
	CIM_VLANEndpointCapabilities createCIM_VLANEndpointCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Virtual Routing And Forwarding Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual Routing And Forwarding Table</em>'.
	 * @generated
	 */
	CIM_VirtualRoutingAndForwardingTable createCIM_VirtualRoutingAndForwardingTable();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Endpoint Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Endpoint Capabilities</em>'.
	 * @generated
	 */
	CIM_WiFiEndpointCapabilities createCIM_WiFiEndpointCapabilities();

	/**
	 * Returns a new object of class '<em>CIM X509 Credential Filter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM X509 Credential Filter Entry</em>'.
	 * @generated
	 */
	CIM_X509CredentialFilterEntry createCIM_X509CredentialFilterEntry();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Capabilities</em>'.
	 * @generated
	 */
	CIM_iSCSICapabilities createCIM_iSCSICapabilities();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_iSCSIConfigurationCapabilities createCIM_iSCSIConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Adjacent Slots</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Adjacent Slots</em>'.
	 * @generated
	 */
	CIM_AdjacentSlots createCIM_AdjacentSlots();

	/**
	 * Returns a new object of class '<em>CIM Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Card</em>'.
	 * @generated
	 */
	CIM_Card createCIM_Card();

	/**
	 * Returns a new object of class '<em>CIM Chip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Chip</em>'.
	 * @generated
	 */
	CIM_Chip createCIM_Chip();

	/**
	 * Returns a new object of class '<em>CIM Configuration Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Configuration Capacity</em>'.
	 * @generated
	 */
	CIM_ConfigurationCapacity createCIM_ConfigurationCapacity();

	/**
	 * Returns a new object of class '<em>CIM Connected To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Connected To</em>'.
	 * @generated
	 */
	CIM_ConnectedTo createCIM_ConnectedTo();

	/**
	 * Returns a new object of class '<em>CIM Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Container</em>'.
	 * @generated
	 */
	CIM_Container createCIM_Container();

	/**
	 * Returns a new object of class '<em>CIM Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Container View</em>'.
	 * @generated
	 */
	CIM_ContainerView createCIM_ContainerView();

	/**
	 * Returns a new object of class '<em>CIM Element Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Capacity</em>'.
	 * @generated
	 */
	CIM_ElementCapacity createCIM_ElementCapacity();

	/**
	 * Returns a new object of class '<em>CIM Element In Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element In Connector</em>'.
	 * @generated
	 */
	CIM_ElementInConnector createCIM_ElementInConnector();

	/**
	 * Returns a new object of class '<em>CIM Elements Linked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Elements Linked</em>'.
	 * @generated
	 */
	CIM_ElementsLinked createCIM_ElementsLinked();

	/**
	 * Returns a new object of class '<em>CIM Link Has Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Link Has Connector</em>'.
	 * @generated
	 */
	CIM_LinkHasConnector createCIM_LinkHasConnector();

	/**
	 * Returns a new object of class '<em>CIM Media Physical Stat Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Physical Stat Info</em>'.
	 * @generated
	 */
	CIM_MediaPhysicalStatInfo createCIM_MediaPhysicalStatInfo();

	/**
	 * Returns a new object of class '<em>CIM Memory Capacity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Capacity</em>'.
	 * @generated
	 */
	CIM_MemoryCapacity createCIM_MemoryCapacity();

	/**
	 * Returns a new object of class '<em>CIM Package In Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package In Connector</em>'.
	 * @generated
	 */
	CIM_PackageInConnector createCIM_PackageInConnector();

	/**
	 * Returns a new object of class '<em>CIM Package In Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package In Slot</em>'.
	 * @generated
	 */
	CIM_PackageInSlot createCIM_PackageInSlot();

	/**
	 * Returns a new object of class '<em>CIM Package Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package Location</em>'.
	 * @generated
	 */
	CIM_PackageLocation createCIM_PackageLocation();

	/**
	 * Returns a new object of class '<em>CIM Packaged Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Packaged Component</em>'.
	 * @generated
	 */
	CIM_PackagedComponent createCIM_PackagedComponent();

	/**
	 * Returns a new object of class '<em>CIM Physical Asset Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Asset Capabilities</em>'.
	 * @generated
	 */
	CIM_PhysicalAssetCapabilities createCIM_PhysicalAssetCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Physical Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Frame</em>'.
	 * @generated
	 */
	CIM_PhysicalFrame createCIM_PhysicalFrame();

	/**
	 * Returns a new object of class '<em>CIM Physical Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Memory</em>'.
	 * @generated
	 */
	CIM_PhysicalMemory createCIM_PhysicalMemory();

	/**
	 * Returns a new object of class '<em>CIM Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Rack</em>'.
	 * @generated
	 */
	CIM_Rack createCIM_Rack();

	/**
	 * Returns a new object of class '<em>CIM Replacement Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replacement Set</em>'.
	 * @generated
	 */
	CIM_ReplacementSet createCIM_ReplacementSet();

	/**
	 * Returns a new object of class '<em>CIM Slot In Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Slot In Slot</em>'.
	 * @generated
	 */
	CIM_SlotInSlot createCIM_SlotInSlot();

	/**
	 * Returns a new object of class '<em>CIM Storage Media Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Media Location</em>'.
	 * @generated
	 */
	CIM_StorageMediaLocation createCIM_StorageMediaLocation();

	/**
	 * Returns a new object of class '<em>CIM System Bus Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Bus Card</em>'.
	 * @generated
	 */
	CIM_SystemBusCard createCIM_SystemBusCard();

	/**
	 * Returns a new object of class '<em>CIM Biometric Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Biometric Authentication</em>'.
	 * @generated
	 */
	CIM_BiometricAuthentication createCIM_BiometricAuthentication();

	/**
	 * Returns a new object of class '<em>CIM Compound Policy Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Compound Policy Action</em>'.
	 * @generated
	 */
	CIM_CompoundPolicyAction createCIM_CompoundPolicyAction();

	/**
	 * Returns a new object of class '<em>CIM Compound Policy Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Compound Policy Condition</em>'.
	 * @generated
	 */
	CIM_CompoundPolicyCondition createCIM_CompoundPolicyCondition();

	/**
	 * Returns a new object of class '<em>CIM Document Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Document Authentication</em>'.
	 * @generated
	 */
	CIM_DocumentAuthentication createCIM_DocumentAuthentication();

	/**
	 * Returns a new object of class '<em>CIM Kerberos Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Kerberos Authentication</em>'.
	 * @generated
	 */
	CIM_KerberosAuthentication createCIM_KerberosAuthentication();

	/**
	 * Returns a new object of class '<em>CIM Method Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Method Action</em>'.
	 * @generated
	 */
	CIM_MethodAction createCIM_MethodAction();

	/**
	 * Returns a new object of class '<em>CIM Network Packet Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Packet Action</em>'.
	 * @generated
	 */
	CIM_NetworkPacketAction createCIM_NetworkPacketAction();

	/**
	 * Returns a new object of class '<em>CIM Networking ID Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Networking ID Authentication</em>'.
	 * @generated
	 */
	CIM_NetworkingIDAuthentication createCIM_NetworkingIDAuthentication();

	/**
	 * Returns a new object of class '<em>CIM Packet Filter Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Packet Filter Condition</em>'.
	 * @generated
	 */
	CIM_PacketFilterCondition createCIM_PacketFilterCondition();

	/**
	 * Returns a new object of class '<em>CIM Physical Credential Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Credential Authentication</em>'.
	 * @generated
	 */
	CIM_PhysicalCredentialAuthentication createCIM_PhysicalCredentialAuthentication();

	/**
	 * Returns a new object of class '<em>CIM Policy Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Group</em>'.
	 * @generated
	 */
	CIM_PolicyGroup createCIM_PolicyGroup();

	/**
	 * Returns a new object of class '<em>CIM Policy Group In Policy Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Group In Policy Group</em>'.
	 * @generated
	 */
	CIM_PolicyGroupInPolicyGroup createCIM_PolicyGroupInPolicyGroup();

	/**
	 * Returns a new object of class '<em>CIM Policy Role Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Role Collection</em>'.
	 * @generated
	 */
	CIM_PolicyRoleCollection createCIM_PolicyRoleCollection();

	/**
	 * Returns a new object of class '<em>CIM Policy Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Rule</em>'.
	 * @generated
	 */
	CIM_PolicyRule createCIM_PolicyRule();

	/**
	 * Returns a new object of class '<em>CIM Policy Rule In Policy Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Rule In Policy Group</em>'.
	 * @generated
	 */
	CIM_PolicyRuleInPolicyGroup createCIM_PolicyRuleInPolicyGroup();

	/**
	 * Returns a new object of class '<em>CIM Policy Rule Validity Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Rule Validity Period</em>'.
	 * @generated
	 */
	CIM_PolicyRuleValidityPeriod createCIM_PolicyRuleValidityPeriod();

	/**
	 * Returns a new object of class '<em>CIM Policy Set Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Set Component</em>'.
	 * @generated
	 */
	CIM_PolicySetComponent createCIM_PolicySetComponent();

	/**
	 * Returns a new object of class '<em>CIM Policy Set In Role Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Set In Role Collection</em>'.
	 * @generated
	 */
	CIM_PolicySetInRoleCollection createCIM_PolicySetInRoleCollection();

	/**
	 * Returns a new object of class '<em>CIM Policy Set Validity Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Set Validity Period</em>'.
	 * @generated
	 */
	CIM_PolicySetValidityPeriod createCIM_PolicySetValidityPeriod();

	/**
	 * Returns a new object of class '<em>CIM Public Private Key Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Public Private Key Authentication</em>'.
	 * @generated
	 */
	CIM_PublicPrivateKeyAuthentication createCIM_PublicPrivateKeyAuthentication();

	/**
	 * Returns a new object of class '<em>CIM Shared Secret Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Shared Secret Authentication</em>'.
	 * @generated
	 */
	CIM_SharedSecretAuthentication createCIM_SharedSecretAuthentication();

	/**
	 * Returns a new object of class '<em>CIM BIOS Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Service Capabilities</em>'.
	 * @generated
	 */
	CIM_BIOSServiceCapabilities createCIM_BIOSServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Boot Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Boot Service Capabilities</em>'.
	 * @generated
	 */
	CIM_BootServiceCapabilities createCIM_BootServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Computer System Node Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System Node Capabilities</em>'.
	 * @generated
	 */
	CIM_ComputerSystemNodeCapabilities createCIM_ComputerSystemNodeCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Default Element Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Default Element Capabilities</em>'.
	 * @generated
	 */
	CIM_DefaultElementCapabilities createCIM_DefaultElementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Record</em>'.
	 * @generated
	 */
	CIM_DiagnosticRecord createCIM_DiagnosticRecord();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Service Capabilities</em>'.
	 * @generated
	 */
	CIM_DiagnosticServiceCapabilities createCIM_DiagnosticServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Service Job Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Service Job Capabilities</em>'.
	 * @generated
	 */
	CIM_DiagnosticServiceJobCapabilities createCIM_DiagnosticServiceJobCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Service Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Service Record</em>'.
	 * @generated
	 */
	CIM_DiagnosticServiceRecord createCIM_DiagnosticServiceRecord();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Setting</em>'.
	 * @generated
	 */
	CIM_DiagnosticSetting createCIM_DiagnosticSetting();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Setting Data Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Setting Data Record</em>'.
	 * @generated
	 */
	CIM_DiagnosticSettingDataRecord createCIM_DiagnosticSettingDataRecord();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Setting Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Setting Record</em>'.
	 * @generated
	 */
	CIM_DiagnosticSettingRecord createCIM_DiagnosticSettingRecord();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Sub Test Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Sub Test Record</em>'.
	 * @generated
	 */
	CIM_DiagnosticSubTestRecord createCIM_DiagnosticSubTestRecord();

	/**
	 * Returns a new object of class '<em>CIM Disk Drive Diagnostic Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Drive Diagnostic Service Capabilities</em>'.
	 * @generated
	 */
	CIM_DiskDriveDiagnosticServiceCapabilities createCIM_DiskDriveDiagnosticServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM FCHBA Diagnostic Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FCHBA Diagnostic Service Capabilities</em>'.
	 * @generated
	 */
	CIM_FCHBADiagnosticServiceCapabilities createCIM_FCHBADiagnosticServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM FS Domain Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Domain Identity</em>'.
	 * @generated
	 */
	CIM_FSDomainIdentity createCIM_FSDomainIdentity();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Applies To Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Applies To Element</em>'.
	 * @generated
	 */
	CIM_FSQuotaAppliesToElement createCIM_FSQuotaAppliesToElement();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Applies To Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Applies To Principal</em>'.
	 * @generated
	 */
	CIM_FSQuotaAppliesToPrincipal createCIM_FSQuotaAppliesToPrincipal();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Capabilities</em>'.
	 * @generated
	 */
	CIM_FSQuotaCapabilities createCIM_FSQuotaCapabilities();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Report Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Report Record</em>'.
	 * @generated
	 */
	CIM_FSQuotaReportRecord createCIM_FSQuotaReportRecord();

	/**
	 * Returns a new object of class '<em>CIM File Export Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Export Capabilities</em>'.
	 * @generated
	 */
	CIM_FileExportCapabilities createCIM_FileExportCapabilities();

	/**
	 * Returns a new object of class '<em>CIM File Server Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Server Capabilities</em>'.
	 * @generated
	 */
	CIM_FileServerCapabilities createCIM_FileServerCapabilities();

	/**
	 * Returns a new object of class '<em>CIM File Server Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Server Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_FileServerConfigurationCapabilities createCIM_FileServerConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM File System Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_FileSystemConfigurationCapabilities createCIM_FileSystemConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM File System Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Setting Data</em>'.
	 * @generated
	 */
	CIM_FileSystemSettingData createCIM_FileSystemSettingData();

	/**
	 * Returns a new object of class '<em>CIM File System Statistics Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Statistics Capabilities</em>'.
	 * @generated
	 */
	CIM_FileSystemStatisticsCapabilities createCIM_FileSystemStatisticsCapabilities();

	/**
	 * Returns a new object of class '<em>CIM File System Statistics Manifest Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Statistics Manifest Collection</em>'.
	 * @generated
	 */
	CIM_FileSystemStatisticsManifestCollection createCIM_FileSystemStatisticsManifestCollection();

	/**
	 * Returns a new object of class '<em>CIM Locally Accessible File System Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Locally Accessible File System Capabilities</em>'.
	 * @generated
	 */
	CIM_LocallyAccessibleFileSystemCapabilities createCIM_LocallyAccessibleFileSystemCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Locally Accessible File System Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Locally Accessible File System Setting</em>'.
	 * @generated
	 */
	CIM_LocallyAccessibleFileSystemSetting createCIM_LocallyAccessibleFileSystemSetting();

	/**
	 * Returns a new object of class '<em>CIM Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Log Entry</em>'.
	 * @generated
	 */
	CIM_LogEntry createCIM_LogEntry();

	/**
	 * Returns a new object of class '<em>CIM Log Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Log Record</em>'.
	 * @generated
	 */
	CIM_LogRecord createCIM_LogRecord();

	/**
	 * Returns a new object of class '<em>CIM Log To Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Log To Log</em>'.
	 * @generated
	 */
	CIM_LogToLog createCIM_LogToLog();

	/**
	 * Returns a new object of class '<em>CIM Logical File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical File</em>'.
	 * @generated
	 */
	CIM_LogicalFile createCIM_LogicalFile();

	/**
	 * Returns a new object of class '<em>CIM Operating System Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operating System Capabilities</em>'.
	 * @generated
	 */
	CIM_OperatingSystemCapabilities createCIM_OperatingSystemCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Platform Watchdog Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Platform Watchdog Service Capabilities</em>'.
	 * @generated
	 */
	CIM_PlatformWatchdogServiceCapabilities createCIM_PlatformWatchdogServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Record Applies To Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Record Applies To Element</em>'.
	 * @generated
	 */
	CIM_RecordAppliesToElement createCIM_RecordAppliesToElement();

	/**
	 * Returns a new object of class '<em>CIM Record Log Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Record Log Capabilities</em>'.
	 * @generated
	 */
	CIM_RecordLogCapabilities createCIM_RecordLogCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Resource Allocation From Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Resource Allocation From Pool</em>'.
	 * @generated
	 */
	CIM_ResourceAllocationFromPool createCIM_ResourceAllocationFromPool();

	/**
	 * Returns a new object of class '<em>CIM Setting Associated To Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Setting Associated To Capabilities</em>'.
	 * @generated
	 */
	CIM_SettingAssociatedToCapabilities createCIM_SettingAssociatedToCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Symbolic Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Symbolic Link</em>'.
	 * @generated
	 */
	CIM_SymbolicLink createCIM_SymbolicLink();

	/**
	 * Returns a new object of class '<em>CIM Time Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Time Zone</em>'.
	 * @generated
	 */
	CIM_TimeZone createCIM_TimeZone();

	/**
	 * Returns a new object of class '<em>CIM Unix File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix File</em>'.
	 * @generated
	 */
	CIM_UnixFile createCIM_UnixFile();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Setting Data Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Setting Data Component</em>'.
	 * @generated
	 */
	CIM_VirtualSystemSettingDataComponent createCIM_VirtualSystemSettingDataComponent();

	/**
	 * Returns a new object of class '<em>CIM Access Control Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Access Control Information</em>'.
	 * @generated
	 */
	CIM_AccessControlInformation createCIM_AccessControlInformation();

	/**
	 * Returns a new object of class '<em>CIM Account Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account Management Capabilities</em>'.
	 * @generated
	 */
	CIM_AccountManagementCapabilities createCIM_AccountManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Assigned Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Assigned Identity</em>'.
	 * @generated
	 */
	CIM_AssignedIdentity createCIM_AssignedIdentity();

	/**
	 * Returns a new object of class '<em>CIM Authentication Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authentication Requirement</em>'.
	 * @generated
	 */
	CIM_AuthenticationRequirement createCIM_AuthenticationRequirement();

	/**
	 * Returns a new object of class '<em>CIM Authentication Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authentication Target</em>'.
	 * @generated
	 */
	CIM_AuthenticationTarget createCIM_AuthenticationTarget();

	/**
	 * Returns a new object of class '<em>CIM Authorization Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authorization Subject</em>'.
	 * @generated
	 */
	CIM_AuthorizationSubject createCIM_AuthorizationSubject();

	/**
	 * Returns a new object of class '<em>CIM Authorization Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authorization Target</em>'.
	 * @generated
	 */
	CIM_AuthorizationTarget createCIM_AuthorizationTarget();

	/**
	 * Returns a new object of class '<em>CIM Authorized Privilege</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authorized Privilege</em>'.
	 * @generated
	 */
	CIM_AuthorizedPrivilege createCIM_AuthorizedPrivilege();

	/**
	 * Returns a new object of class '<em>CIM Authorized Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authorized Subject</em>'.
	 * @generated
	 */
	CIM_AuthorizedSubject createCIM_AuthorizedSubject();

	/**
	 * Returns a new object of class '<em>CIM Authorized Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authorized Target</em>'.
	 * @generated
	 */
	CIM_AuthorizedTarget createCIM_AuthorizedTarget();

	/**
	 * Returns a new object of class '<em>CIM Collection In Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collection In Organization</em>'.
	 * @generated
	 */
	CIM_CollectionInOrganization createCIM_CollectionInOrganization();

	/**
	 * Returns a new object of class '<em>CIM Credential Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Credential Management Capabilities</em>'.
	 * @generated
	 */
	CIM_CredentialManagementCapabilities createCIM_CredentialManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Credential Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Credential Store</em>'.
	 * @generated
	 */
	CIM_CredentialStore createCIM_CredentialStore();

	/**
	 * Returns a new object of class '<em>CIM Element As User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element As User</em>'.
	 * @generated
	 */
	CIM_ElementAsUser createCIM_ElementAsUser();

	/**
	 * Returns a new object of class '<em>CIM Element Security Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Security Sensitivity</em>'.
	 * @generated
	 */
	CIM_ElementSecuritySensitivity createCIM_ElementSecuritySensitivity();

	/**
	 * Returns a new object of class '<em>CIM Gateway Path ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Gateway Path ID</em>'.
	 * @generated
	 */
	CIM_GatewayPathID createCIM_GatewayPathID();

	/**
	 * Returns a new object of class '<em>CIM Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Group</em>'.
	 * @generated
	 */
	CIM_Group createCIM_Group();

	/**
	 * Returns a new object of class '<em>CIM IP Network Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Network Identity</em>'.
	 * @generated
	 */
	CIM_IPNetworkIdentity createCIM_IPNetworkIdentity();

	/**
	 * Returns a new object of class '<em>CIM Keystore</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Keystore</em>'.
	 * @generated
	 */
	CIM_Keystore createCIM_Keystore();

	/**
	 * Returns a new object of class '<em>CIM Member Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Member Principal</em>'.
	 * @generated
	 */
	CIM_MemberPrincipal createCIM_MemberPrincipal();

	/**
	 * Returns a new object of class '<em>CIM More Group Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM More Group Info</em>'.
	 * @generated
	 */
	CIM_MoreGroupInfo createCIM_MoreGroupInfo();

	/**
	 * Returns a new object of class '<em>CIM Org Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Org Structure</em>'.
	 * @generated
	 */
	CIM_OrgStructure createCIM_OrgStructure();

	/**
	 * Returns a new object of class '<em>CIM Org Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Org Unit</em>'.
	 * @generated
	 */
	CIM_OrgUnit createCIM_OrgUnit();

	/**
	 * Returns a new object of class '<em>CIM Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Organization</em>'.
	 * @generated
	 */
	CIM_Organization createCIM_Organization();

	/**
	 * Returns a new object of class '<em>CIM Privilege Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Privilege Management Capabilities</em>'.
	 * @generated
	 */
	CIM_PrivilegeManagementCapabilities createCIM_PrivilegeManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Public Key Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Public Key Certificate</em>'.
	 * @generated
	 */
	CIM_PublicKeyCertificate createCIM_PublicKeyCertificate();

	/**
	 * Returns a new object of class '<em>CIM Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Role</em>'.
	 * @generated
	 */
	CIM_Role createCIM_Role();

	/**
	 * Returns a new object of class '<em>CIM Role Based Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Role Based Management Capabilities</em>'.
	 * @generated
	 */
	CIM_RoleBasedManagementCapabilities createCIM_RoleBasedManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Role Limited To Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Role Limited To Target</em>'.
	 * @generated
	 */
	CIM_RoleLimitedToTarget createCIM_RoleLimitedToTarget();

	/**
	 * Returns a new object of class '<em>CIM User Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM User Contact</em>'.
	 * @generated
	 */
	CIM_UserContact createCIM_UserContact();

	/**
	 * Returns a new object of class '<em>CIM Users Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Users Credential</em>'.
	 * @generated
	 */
	CIM_UsersCredential createCIM_UsersCredential();

	/**
	 * Returns a new object of class '<em>CIM X509CRL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM X509CRL</em>'.
	 * @generated
	 */
	CIM_X509CRL createCIM_X509CRL();

	/**
	 * Returns a new object of class '<em>CIM X509 Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM X509 Certificate</em>'.
	 * @generated
	 */
	CIM_X509Certificate createCIM_X509Certificate();

	/**
	 * Returns a new object of class '<em>CIM Installed Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Installed Product</em>'.
	 * @generated
	 */
	CIM_InstalledProduct createCIM_InstalledProduct();

	/**
	 * Returns a new object of class '<em>CIM Installed Product Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Installed Product Image</em>'.
	 * @generated
	 */
	CIM_InstalledProductImage createCIM_InstalledProductImage();

	/**
	 * Returns a new object of class '<em>CIM J2ee Connection Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Connection Stats</em>'.
	 * @generated
	 */
	CIM_J2eeConnectionStats createCIM_J2eeConnectionStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee Entity Bean Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Entity Bean Stats</em>'.
	 * @generated
	 */
	CIM_J2eeEntityBeanStats createCIM_J2eeEntityBeanStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JCA Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JCA Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJCAStats createCIM_J2eeJCAStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCStats createCIM_J2eeJDBCStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Connection Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Connection Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJMSConnectionStats createCIM_J2eeJMSConnectionStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Producer Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Producer Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJMSProducerStats createCIM_J2eeJMSProducerStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Session Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Session Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJMSSessionStats createCIM_J2eeJMSSessionStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJMSStats createCIM_J2eeJMSStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JTA Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JTA Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJTAStats createCIM_J2eeJTAStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JVM Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JVM Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJVMStats createCIM_J2eeJVMStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee Java Mail Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Java Mail Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJavaMailStats createCIM_J2eeJavaMailStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee Message Driven Bean Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Message Driven Bean Stats</em>'.
	 * @generated
	 */
	CIM_J2eeMessageDrivenBeanStats createCIM_J2eeMessageDrivenBeanStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee Servlet Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Servlet Stats</em>'.
	 * @generated
	 */
	CIM_J2eeServletStats createCIM_J2eeServletStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee Stateful Session Bean Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Stateful Session Bean Stats</em>'.
	 * @generated
	 */
	CIM_J2eeStatefulSessionBeanStats createCIM_J2eeStatefulSessionBeanStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee Stateless Session Bean Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Stateless Session Bean Stats</em>'.
	 * @generated
	 */
	CIM_J2eeStatelessSessionBeanStats createCIM_J2eeStatelessSessionBeanStats();

	/**
	 * Returns a new object of class '<em>CIM Software Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Element</em>'.
	 * @generated
	 */
	CIM_SoftwareElement createCIM_SoftwareElement();

	/**
	 * Returns a new object of class '<em>CIM Software Element Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Element Component</em>'.
	 * @generated
	 */
	CIM_SoftwareElementComponent createCIM_SoftwareElementComponent();

	/**
	 * Returns a new object of class '<em>CIM Software Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Feature</em>'.
	 * @generated
	 */
	CIM_SoftwareFeature createCIM_SoftwareFeature();

	/**
	 * Returns a new object of class '<em>CIM Software Feature Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Feature Component</em>'.
	 * @generated
	 */
	CIM_SoftwareFeatureComponent createCIM_SoftwareFeatureComponent();

	/**
	 * Returns a new object of class '<em>CIM Software Feature Software Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Feature Software Elements</em>'.
	 * @generated
	 */
	CIM_SoftwareFeatureSoftwareElements createCIM_SoftwareFeatureSoftwareElements();

	/**
	 * Returns a new object of class '<em>CIM Video BIOS Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video BIOS Element</em>'.
	 * @generated
	 */
	CIM_VideoBIOSElement createCIM_VideoBIOSElement();

	/**
	 * Returns a new object of class '<em>CIM Video BIOS Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video BIOS Feature</em>'.
	 * @generated
	 */
	CIM_VideoBIOSFeature createCIM_VideoBIOSFeature();

	/**
	 * Returns a new object of class '<em>CIM Video BIOS Feature Video BIOS Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video BIOS Feature Video BIOS Elements</em>'.
	 * @generated
	 */
	CIM_VideoBIOSFeatureVideoBIOSElements createCIM_VideoBIOSFeatureVideoBIOSElements();

	/**
	 * Returns a new object of class '<em>CIM Acts As Spare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Acts As Spare</em>'.
	 * @generated
	 */
	CIM_ActsAsSpare createCIM_ActsAsSpare();

	/**
	 * Returns a new object of class '<em>CIM Allocation Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocation Capabilities</em>'.
	 * @generated
	 */
	CIM_AllocationCapabilities createCIM_AllocationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Collected Collections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collected Collections</em>'.
	 * @generated
	 */
	CIM_CollectedCollections createCIM_CollectedCollections();

	/**
	 * Returns a new object of class '<em>CIM Collected MS Es</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collected MS Es</em>'.
	 * @generated
	 */
	CIM_CollectedMSEs createCIM_CollectedMSEs();

	/**
	 * Returns a new object of class '<em>CIM Collection Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collection Configuration</em>'.
	 * @generated
	 */
	CIM_CollectionConfiguration createCIM_CollectionConfiguration();

	/**
	 * Returns a new object of class '<em>CIM Collection Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collection Setting</em>'.
	 * @generated
	 */
	CIM_CollectionSetting createCIM_CollectionSetting();

	/**
	 * Returns a new object of class '<em>CIM Concrete Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Concrete Dependency</em>'.
	 * @generated
	 */
	CIM_ConcreteDependency createCIM_ConcreteDependency();

	/**
	 * Returns a new object of class '<em>CIM Concrete Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Concrete Identity</em>'.
	 * @generated
	 */
	CIM_ConcreteIdentity createCIM_ConcreteIdentity();

	/**
	 * Returns a new object of class '<em>CIM Contained Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Contained Location</em>'.
	 * @generated
	 */
	CIM_ContainedLocation createCIM_ContainedLocation();

	/**
	 * Returns a new object of class '<em>CIM Element Allocated From Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Allocated From Pool</em>'.
	 * @generated
	 */
	CIM_ElementAllocatedFromPool createCIM_ElementAllocatedFromPool();

	/**
	 * Returns a new object of class '<em>CIM Element Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Location</em>'.
	 * @generated
	 */
	CIM_ElementLocation createCIM_ElementLocation();

	/**
	 * Returns a new object of class '<em>CIM Element Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Profile</em>'.
	 * @generated
	 */
	CIM_ElementProfile createCIM_ElementProfile();

	/**
	 * Returns a new object of class '<em>CIM Element Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Setting</em>'.
	 * @generated
	 */
	CIM_ElementSetting createCIM_ElementSetting();

	/**
	 * Returns a new object of class '<em>CIM Element Software Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Software Identity</em>'.
	 * @generated
	 */
	CIM_ElementSoftwareIdentity createCIM_ElementSoftwareIdentity();

	/**
	 * Returns a new object of class '<em>CIM Ethernet Port Allocation Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ethernet Port Allocation Setting Data</em>'.
	 * @generated
	 */
	CIM_EthernetPortAllocationSettingData createCIM_EthernetPortAllocationSettingData();

	/**
	 * Returns a new object of class '<em>CIM Extra Capacity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Extra Capacity Group</em>'.
	 * @generated
	 */
	CIM_ExtraCapacityGroup createCIM_ExtraCapacityGroup();

	/**
	 * Returns a new object of class '<em>CIM Physical Element Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Element Location</em>'.
	 * @generated
	 */
	CIM_PhysicalElementLocation createCIM_PhysicalElementLocation();

	/**
	 * Returns a new object of class '<em>CIM Processor Allocation Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Processor Allocation Setting Data</em>'.
	 * @generated
	 */
	CIM_ProcessorAllocationSettingData createCIM_ProcessorAllocationSettingData();

	/**
	 * Returns a new object of class '<em>CIM Product Software Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Software Component</em>'.
	 * @generated
	 */
	CIM_ProductSoftwareComponent createCIM_ProductSoftwareComponent();

	/**
	 * Returns a new object of class '<em>CIM Redundancy Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Redundancy Component</em>'.
	 * @generated
	 */
	CIM_RedundancyComponent createCIM_RedundancyComponent();

	/**
	 * Returns a new object of class '<em>CIM Redundancy Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Redundancy Set</em>'.
	 * @generated
	 */
	CIM_RedundancySet createCIM_RedundancySet();

	/**
	 * Returns a new object of class '<em>CIM Scoped Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Scoped Setting</em>'.
	 * @generated
	 */
	CIM_ScopedSetting createCIM_ScopedSetting();

	/**
	 * Returns a new object of class '<em>CIM Statistics Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Statistics Collection</em>'.
	 * @generated
	 */
	CIM_StatisticsCollection createCIM_StatisticsCollection();

	/**
	 * Returns a new object of class '<em>CIM Storage Redundancy Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Redundancy Set</em>'.
	 * @generated
	 */
	CIM_StorageRedundancySet createCIM_StorageRedundancySet();

	/**
	 * Returns a new object of class '<em>CIM Allocated From Storage Pool View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocated From Storage Pool View</em>'.
	 * @generated
	 */
	CIM_AllocatedFromStoragePoolView createCIM_AllocatedFromStoragePoolView();

	/**
	 * Returns a new object of class '<em>CIM Allocated From Storage Pool View View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocated From Storage Pool View View</em>'.
	 * @generated
	 */
	CIM_AllocatedFromStoragePoolViewView createCIM_AllocatedFromStoragePoolViewView();

	/**
	 * Returns a new object of class '<em>CIM Associated Block Statistics Manifest Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Block Statistics Manifest Collection</em>'.
	 * @generated
	 */
	CIM_AssociatedBlockStatisticsManifestCollection createCIM_AssociatedBlockStatisticsManifestCollection();

	/**
	 * Returns a new object of class '<em>CIM Associated Element Tier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Element Tier</em>'.
	 * @generated
	 */
	CIM_AssociatedElementTier createCIM_AssociatedElementTier();

	/**
	 * Returns a new object of class '<em>CIM Asymmetric Accessibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Asymmetric Accessibility</em>'.
	 * @generated
	 */
	CIM_AsymmetricAccessibility createCIM_AsymmetricAccessibility();

	/**
	 * Returns a new object of class '<em>CIM Based On View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Based On View</em>'.
	 * @generated
	 */
	CIM_BasedOnView createCIM_BasedOnView();

	/**
	 * Returns a new object of class '<em>CIM Block Statistics Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Block Statistics Capabilities</em>'.
	 * @generated
	 */
	CIM_BlockStatisticsCapabilities createCIM_BlockStatisticsCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Device Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Masking Group</em>'.
	 * @generated
	 */
	CIM_DeviceMaskingGroup createCIM_DeviceMaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM FC Port Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Port Capabilities</em>'.
	 * @generated
	 */
	CIM_FCPortCapabilities createCIM_FCPortCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Group In Disk Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Group In Disk Group</em>'.
	 * @generated
	 */
	CIM_GroupInDiskGroup createCIM_GroupInDiskGroup();

	/**
	 * Returns a new object of class '<em>CIM Group Masking Mapping Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Group Masking Mapping Capabilities</em>'.
	 * @generated
	 */
	CIM_GroupMaskingMappingCapabilities createCIM_GroupMaskingMappingCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Initiator Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Initiator Masking Group</em>'.
	 * @generated
	 */
	CIM_InitiatorMaskingGroup createCIM_InitiatorMaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM Operational Power Statistics Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operational Power Statistics Capabilities</em>'.
	 * @generated
	 */
	CIM_OperationalPowerStatisticsCapabilities createCIM_OperationalPowerStatisticsCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Print Input Tray</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Input Tray</em>'.
	 * @generated
	 */
	CIM_PrintInputTray createCIM_PrintInputTray();

	/**
	 * Returns a new object of class '<em>CIM Print Interpreter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Interpreter</em>'.
	 * @generated
	 */
	CIM_PrintInterpreter createCIM_PrintInterpreter();

	/**
	 * Returns a new object of class '<em>CIM Print Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Job</em>'.
	 * @generated
	 */
	CIM_PrintJob createCIM_PrintJob();

	/**
	 * Returns a new object of class '<em>CIM Print Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Marker</em>'.
	 * @generated
	 */
	CIM_PrintMarker createCIM_PrintMarker();

	/**
	 * Returns a new object of class '<em>CIM Print Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Supply</em>'.
	 * @generated
	 */
	CIM_PrintSupply createCIM_PrintSupply();

	/**
	 * Returns a new object of class '<em>CIM Query Statistics Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Query Statistics Collection</em>'.
	 * @generated
	 */
	CIM_QueryStatisticsCollection createCIM_QueryStatisticsCollection();

	/**
	 * Returns a new object of class '<em>CIM Remote Replication Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remote Replication Collection</em>'.
	 * @generated
	 */
	CIM_RemoteReplicationCollection createCIM_RemoteReplicationCollection();

	/**
	 * Returns a new object of class '<em>CIM Storage Pool Diagnostic Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Pool Diagnostic Service Capabilities</em>'.
	 * @generated
	 */
	CIM_StoragePoolDiagnosticServiceCapabilities createCIM_StoragePoolDiagnosticServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Settings Associated To Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Settings Associated To Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageSettingsAssociatedToCapabilities createCIM_StorageSettingsAssociatedToCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Settings Generated From Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Settings Generated From Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageSettingsGeneratedFromCapabilities createCIM_StorageSettingsGeneratedFromCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Zone</em>'.
	 * @generated
	 */
	CIM_Zone createCIM_Zone();

	/**
	 * Returns a new object of class '<em>CIM Zone Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Zone Set</em>'.
	 * @generated
	 */
	CIM_ZoneSet createCIM_ZoneSet();

	/**
	 * Returns a new object of class '<em>CIM Class Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Class Creation</em>'.
	 * @generated
	 */
	CIM_ClassCreation createCIM_ClassCreation();

	/**
	 * Returns a new object of class '<em>CIM Class Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Class Deletion</em>'.
	 * @generated
	 */
	CIM_ClassDeletion createCIM_ClassDeletion();

	/**
	 * Returns a new object of class '<em>CIM Formatted Indication Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Formatted Indication Subscription</em>'.
	 * @generated
	 */
	CIM_FormattedIndicationSubscription createCIM_FormattedIndicationSubscription();

	/**
	 * Returns a new object of class '<em>CIM Contained Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Contained Proposal</em>'.
	 * @generated
	 */
	CIM_ContainedProposal createCIM_ContainedProposal();

	/**
	 * Returns a new object of class '<em>CIM IKE Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IKE Action</em>'.
	 * @generated
	 */
	CIM_IKEAction createCIM_IKEAction();

	/**
	 * Returns a new object of class '<em>CIM IKE Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IKE Proposal</em>'.
	 * @generated
	 */
	CIM_IKEProposal createCIM_IKEProposal();

	/**
	 * Returns a new object of class '<em>CIM IPsec Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec Action</em>'.
	 * @generated
	 */
	CIM_IPsecAction createCIM_IPsecAction();

	/**
	 * Returns a new object of class '<em>CIM IPsec Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec Proposal</em>'.
	 * @generated
	 */
	CIM_IPsecProposal createCIM_IPsecProposal();

	/**
	 * Returns a new object of class '<em>CIM IPsec Transport Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec Transport Action</em>'.
	 * @generated
	 */
	CIM_IPsecTransportAction createCIM_IPsecTransportAction();

	/**
	 * Returns a new object of class '<em>CIM IPsec Tunnel Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec Tunnel Action</em>'.
	 * @generated
	 */
	CIM_IPsecTunnelAction createCIM_IPsecTunnelAction();

	/**
	 * Returns a new object of class '<em>CIM Preconfigured SA Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Preconfigured SA Action</em>'.
	 * @generated
	 */
	CIM_PreconfiguredSAAction createCIM_PreconfiguredSAAction();

	/**
	 * Returns a new object of class '<em>CIM Preconfigured Transport Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Preconfigured Transport Action</em>'.
	 * @generated
	 */
	CIM_PreconfiguredTransportAction createCIM_PreconfiguredTransportAction();

	/**
	 * Returns a new object of class '<em>CIM Preconfigured Tunnel Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Preconfigured Tunnel Action</em>'.
	 * @generated
	 */
	CIM_PreconfiguredTunnelAction createCIM_PreconfiguredTunnelAction();

	/**
	 * Returns a new object of class '<em>CIM SA Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SA Rule</em>'.
	 * @generated
	 */
	CIM_SARule createCIM_SARule();

	/**
	 * Returns a new object of class '<em>CIM Transform Of Preconfigured Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Transform Of Preconfigured Action</em>'.
	 * @generated
	 */
	CIM_TransformOfPreconfiguredAction createCIM_TransformOfPreconfiguredAction();

	/**
	 * Returns a new object of class '<em>CIM Element Conforms To Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element Conforms To Profile</em>'.
	 * @generated
	 */
	CIM_ElementConformsToProfile createCIM_ElementConformsToProfile();

	/**
	 * Returns a new object of class '<em>CIM Referenced Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Referenced Profile</em>'.
	 * @generated
	 */
	CIM_ReferencedProfile createCIM_ReferencedProfile();

	/**
	 * Returns a new object of class '<em>CIM Sub Profile Requires Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Sub Profile Requires Profile</em>'.
	 * @generated
	 */
	CIM_SubProfileRequiresProfile createCIM_SubProfileRequiresProfile();

	/**
	 * Returns a new object of class '<em>CIM WBEM Protocol Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WBEM Protocol Service Capabilities</em>'.
	 * @generated
	 */
	CIM_WBEMProtocolServiceCapabilities createCIM_WBEMProtocolServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM WS Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WS Management Capabilities</em>'.
	 * @generated
	 */
	CIM_WSManagementCapabilities createCIM_WSManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Logical Element Unit Of Work Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Element Unit Of Work Def</em>'.
	 * @generated
	 */
	CIM_LogicalElementUnitOfWorkDef createCIM_LogicalElementUnitOfWorkDef();

	/**
	 * Returns a new object of class '<em>CIM Started Uo W</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Started Uo W</em>'.
	 * @generated
	 */
	CIM_StartedUoW createCIM_StartedUoW();

	/**
	 * Returns a new object of class '<em>CIM Sub Uo WDef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Sub Uo WDef</em>'.
	 * @generated
	 */
	CIM_SubUoWDef createCIM_SubUoWDef();

	/**
	 * Returns a new object of class '<em>CIM AH Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM AH Transform</em>'.
	 * @generated
	 */
	CIM_AHTransform createCIM_AHTransform();

	/**
	 * Returns a new object of class '<em>CIM BGP Peer Uses Route Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Peer Uses Route Map</em>'.
	 * @generated
	 */
	CIM_BGPPeerUsesRouteMap createCIM_BGPPeerUsesRouteMap();

	/**
	 * Returns a new object of class '<em>CIM BGP Route Maps In Routing Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Route Maps In Routing Policy</em>'.
	 * @generated
	 */
	CIM_BGPRouteMapsInRoutingPolicy createCIM_BGPRouteMapsInRoutingPolicy();

	/**
	 * Returns a new object of class '<em>CIM Bounded Priority Scheduling Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Bounded Priority Scheduling Element</em>'.
	 * @generated
	 */
	CIM_BoundedPrioritySchedulingElement createCIM_BoundedPrioritySchedulingElement();

	/**
	 * Returns a new object of class '<em>CIM CLP Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CLP Capabilities</em>'.
	 * @generated
	 */
	CIM_CLPCapabilities createCIM_CLPCapabilities();

	/**
	 * Returns a new object of class '<em>CIM ESP Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ESP Transform</em>'.
	 * @generated
	 */
	CIM_ESPTransform createCIM_ESPTransform();

	/**
	 * Returns a new object of class '<em>CIM Entries In Filter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Entries In Filter List</em>'.
	 * @generated
	 */
	CIM_EntriesInFilterList createCIM_EntriesInFilterList();

	/**
	 * Returns a new object of class '<em>CIM Filter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter Entry</em>'.
	 * @generated
	 */
	CIM_FilterEntry createCIM_FilterEntry();

	/**
	 * Returns a new object of class '<em>CIM Filtered BGP Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filtered BGP Attributes</em>'.
	 * @generated
	 */
	CIM_FilteredBGPAttributes createCIM_FilteredBGPAttributes();

	/**
	 * Returns a new object of class '<em>CIM IPCOMP Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPCOMP Transform</em>'.
	 * @generated
	 */
	CIM_IPCOMPTransform createCIM_IPCOMPTransform();

	/**
	 * Returns a new object of class '<em>CIM IP Subnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Subnet</em>'.
	 * @generated
	 */
	CIM_IPSubnet createCIM_IPSubnet();

	/**
	 * Returns a new object of class '<em>CIM IPX Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPX Network</em>'.
	 * @generated
	 */
	CIM_IPXNetwork createCIM_IPXNetwork();

	/**
	 * Returns a new object of class '<em>CIM LAN Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM LAN Segment</em>'.
	 * @generated
	 */
	CIM_LANSegment createCIM_LANSegment();

	/**
	 * Returns a new object of class '<em>CIM Lists In Routing Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Lists In Routing Policy</em>'.
	 * @generated
	 */
	CIM_ListsInRoutingPolicy createCIM_ListsInRoutingPolicy();

	/**
	 * Returns a new object of class '<em>CIM Media Redirection Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Redirection Capabilities</em>'.
	 * @generated
	 */
	CIM_MediaRedirectionCapabilities createCIM_MediaRedirectionCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Network Policy Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Policy Rule</em>'.
	 * @generated
	 */
	CIM_NetworkPolicyRule createCIM_NetworkPolicyRule();

	/**
	 * Returns a new object of class '<em>CIM VRF Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VRF Route</em>'.
	 * @generated
	 */
	CIM_VRFRoute createCIM_VRFRoute();

	/**
	 * Returns a new object of class '<em>CIM Card In Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Card In Slot</em>'.
	 * @generated
	 */
	CIM_CardInSlot createCIM_CardInSlot();

	/**
	 * Returns a new object of class '<em>CIM Card On Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Card On Card</em>'.
	 * @generated
	 */
	CIM_CardOnCard createCIM_CardOnCard();

	/**
	 * Returns a new object of class '<em>CIM Chassis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Chassis</em>'.
	 * @generated
	 */
	CIM_Chassis createCIM_Chassis();

	/**
	 * Returns a new object of class '<em>CIM Chassis In Rack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Chassis In Rack</em>'.
	 * @generated
	 */
	CIM_ChassisInRack createCIM_ChassisInRack();

	/**
	 * Returns a new object of class '<em>CIM Connector On Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Connector On Package</em>'.
	 * @generated
	 */
	CIM_ConnectorOnPackage createCIM_ConnectorOnPackage();

	/**
	 * Returns a new object of class '<em>CIM Docked</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Docked</em>'.
	 * @generated
	 */
	CIM_Docked createCIM_Docked();

	/**
	 * Returns a new object of class '<em>CIM Home For Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Home For Media</em>'.
	 * @generated
	 */
	CIM_HomeForMedia createCIM_HomeForMedia();

	/**
	 * Returns a new object of class '<em>CIM Magazine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Magazine</em>'.
	 * @generated
	 */
	CIM_Magazine createCIM_Magazine();

	/**
	 * Returns a new object of class '<em>CIM Memory On Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory On Card</em>'.
	 * @generated
	 */
	CIM_MemoryOnCard createCIM_MemoryOnCard();

	/**
	 * Returns a new object of class '<em>CIM Memory With Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory With Media</em>'.
	 * @generated
	 */
	CIM_MemoryWithMedia createCIM_MemoryWithMedia();

	/**
	 * Returns a new object of class '<em>CIM Package In Chassis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package In Chassis</em>'.
	 * @generated
	 */
	CIM_PackageInChassis createCIM_PackageInChassis();

	/**
	 * Returns a new object of class '<em>CIM Physical Media In Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Media In Location</em>'.
	 * @generated
	 */
	CIM_PhysicalMediaInLocation createCIM_PhysicalMediaInLocation();

	/**
	 * Returns a new object of class '<em>CIM Account Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account Authentication</em>'.
	 * @generated
	 */
	CIM_AccountAuthentication createCIM_AccountAuthentication();

	/**
	 * Returns a new object of class '<em>CIM Authentication Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authentication Rule</em>'.
	 * @generated
	 */
	CIM_AuthenticationRule createCIM_AuthenticationRule();

	/**
	 * Returns a new object of class '<em>CIM Element In Policy Role Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element In Policy Role Collection</em>'.
	 * @generated
	 */
	CIM_ElementInPolicyRoleCollection createCIM_ElementInPolicyRoleCollection();

	/**
	 * Returns a new object of class '<em>CIM Filter Of Packet Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter Of Packet Condition</em>'.
	 * @generated
	 */
	CIM_FilterOfPacketCondition createCIM_FilterOfPacketCondition();

	/**
	 * Returns a new object of class '<em>CIM Policy Condition In Policy Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Condition In Policy Condition</em>'.
	 * @generated
	 */
	CIM_PolicyConditionInPolicyCondition createCIM_PolicyConditionInPolicyCondition();

	/**
	 * Returns a new object of class '<em>CIM Policy Condition In Policy Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Condition In Policy Rule</em>'.
	 * @generated
	 */
	CIM_PolicyConditionInPolicyRule createCIM_PolicyConditionInPolicyRule();

	/**
	 * Returns a new object of class '<em>CIM Affected Job Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Affected Job Element</em>'.
	 * @generated
	 */
	CIM_AffectedJobElement createCIM_AffectedJobElement();

	/**
	 * Returns a new object of class '<em>CIM Associated File System Statistics Manifest Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated File System Statistics Manifest Collection</em>'.
	 * @generated
	 */
	CIM_AssociatedFileSystemStatisticsManifestCollection createCIM_AssociatedFileSystemStatisticsManifestCollection();

	/**
	 * Returns a new object of class '<em>CIM Corresponding Setting Data Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Corresponding Setting Data Record</em>'.
	 * @generated
	 */
	CIM_CorrespondingSettingDataRecord createCIM_CorrespondingSettingDataRecord();

	/**
	 * Returns a new object of class '<em>CIM Corresponding Settings Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Corresponding Settings Record</em>'.
	 * @generated
	 */
	CIM_CorrespondingSettingsRecord createCIM_CorrespondingSettingsRecord();

	/**
	 * Returns a new object of class '<em>CIM Data File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Data File</em>'.
	 * @generated
	 */
	CIM_DataFile createCIM_DataFile();

	/**
	 * Returns a new object of class '<em>CIM Device File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device File</em>'.
	 * @generated
	 */
	CIM_DeviceFile createCIM_DeviceFile();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Completion Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Completion Record</em>'.
	 * @generated
	 */
	CIM_DiagnosticCompletionRecord createCIM_DiagnosticCompletionRecord();

	/**
	 * Returns a new object of class '<em>CIM Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Directory</em>'.
	 * @generated
	 */
	CIM_Directory createCIM_Directory();

	/**
	 * Returns a new object of class '<em>CIM Directory Contains File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Directory Contains File</em>'.
	 * @generated
	 */
	CIM_DirectoryContainsFile createCIM_DirectoryContainsFile();

	/**
	 * Returns a new object of class '<em>CIM FIFO Pipe File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FIFO Pipe File</em>'.
	 * @generated
	 */
	CIM_FIFOPipeFile createCIM_FIFOPipeFile();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Applies To Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Applies To Tree</em>'.
	 * @generated
	 */
	CIM_FSQuotaAppliesToTree createCIM_FSQuotaAppliesToTree();

	/**
	 * Returns a new object of class '<em>CIM File Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Identity</em>'.
	 * @generated
	 */
	CIM_FileIdentity createCIM_FileIdentity();

	/**
	 * Returns a new object of class '<em>CIM Owning Job Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Owning Job Element</em>'.
	 * @generated
	 */
	CIM_OwningJobElement createCIM_OwningJobElement();

	/**
	 * Returns a new object of class '<em>CIM Unix Device File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix Device File</em>'.
	 * @generated
	 */
	CIM_UnixDeviceFile createCIM_UnixDeviceFile();

	/**
	 * Returns a new object of class '<em>CIM Unix Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix Directory</em>'.
	 * @generated
	 */
	CIM_UnixDirectory createCIM_UnixDirectory();

	/**
	 * Returns a new object of class '<em>CIM Certificate Management Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Certificate Management Capabilities</em>'.
	 * @generated
	 */
	CIM_CertificateManagementCapabilities createCIM_CertificateManagementCapabilities();

	/**
	 * Returns a new object of class '<em>CIM More Org Unit Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM More Org Unit Info</em>'.
	 * @generated
	 */
	CIM_MoreOrgUnitInfo createCIM_MoreOrgUnitInfo();

	/**
	 * Returns a new object of class '<em>CIM More Organization Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM More Organization Info</em>'.
	 * @generated
	 */
	CIM_MoreOrganizationInfo createCIM_MoreOrganizationInfo();

	/**
	 * Returns a new object of class '<em>CIM More Role Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM More Role Info</em>'.
	 * @generated
	 */
	CIM_MoreRoleInfo createCIM_MoreRoleInfo();

	/**
	 * Returns a new object of class '<em>CIM Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Person</em>'.
	 * @generated
	 */
	CIM_Person createCIM_Person();

	/**
	 * Returns a new object of class '<em>CIM Public Private Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Public Private Key Pair</em>'.
	 * @generated
	 */
	CIM_PublicPrivateKeyPair createCIM_PublicPrivateKeyPair();

	/**
	 * Returns a new object of class '<em>CIM AGP Software Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM AGP Software Feature</em>'.
	 * @generated
	 */
	CIM_AGPSoftwareFeature createCIM_AGPSoftwareFeature();

	/**
	 * Returns a new object of class '<em>CIM BIOS Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Element</em>'.
	 * @generated
	 */
	CIM_BIOSElement createCIM_BIOSElement();

	/**
	 * Returns a new object of class '<em>CIM BIOS Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Feature</em>'.
	 * @generated
	 */
	CIM_BIOSFeature createCIM_BIOSFeature();

	/**
	 * Returns a new object of class '<em>CIM BIOS Feature BIOS Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Feature BIOS Elements</em>'.
	 * @generated
	 */
	CIM_BIOSFeatureBIOSElements createCIM_BIOSFeatureBIOSElements();

	/**
	 * Returns a new object of class '<em>CIM Collected Software Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collected Software Elements</em>'.
	 * @generated
	 */
	CIM_CollectedSoftwareElements createCIM_CollectedSoftwareElements();

	/**
	 * Returns a new object of class '<em>CIM Collected Software Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collected Software Features</em>'.
	 * @generated
	 */
	CIM_CollectedSoftwareFeatures createCIM_CollectedSoftwareFeatures();

	/**
	 * Returns a new object of class '<em>CIM FRU Includes Software Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FRU Includes Software Feature</em>'.
	 * @generated
	 */
	CIM_FRUIncludesSoftwareFeature createCIM_FRUIncludesSoftwareFeature();

	/**
	 * Returns a new object of class '<em>CIM J2ee Connection Pool Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Connection Pool Stats</em>'.
	 * @generated
	 */
	CIM_J2eeConnectionPoolStats createCIM_J2eeConnectionPoolStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JCA Connection Pools</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JCA Connection Pools</em>'.
	 * @generated
	 */
	CIM_J2eeJCAConnectionPools createCIM_J2eeJCAConnectionPools();

	/**
	 * Returns a new object of class '<em>CIM J2ee JCA Nonpooled Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JCA Nonpooled Connections</em>'.
	 * @generated
	 */
	CIM_J2eeJCANonpooledConnections createCIM_J2eeJCANonpooledConnections();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Connection Pools</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Connection Pools</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCConnectionPools createCIM_J2eeJDBCConnectionPools();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Nonpooled Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Nonpooled Connections</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCNonpooledConnections createCIM_J2eeJDBCNonpooledConnections();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Connection Sessions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Connection Sessions</em>'.
	 * @generated
	 */
	CIM_J2eeJMSConnectionSessions createCIM_J2eeJMSConnectionSessions();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Consumer Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Consumer Stats</em>'.
	 * @generated
	 */
	CIM_J2eeJMSConsumerStats createCIM_J2eeJMSConsumerStats();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Session Consumers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Session Consumers</em>'.
	 * @generated
	 */
	CIM_J2eeJMSSessionConsumers createCIM_J2eeJMSSessionConsumers();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Session Producers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Session Producers</em>'.
	 * @generated
	 */
	CIM_J2eeJMSSessionProducers createCIM_J2eeJMSSessionProducers();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Stat Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Stat Connections</em>'.
	 * @generated
	 */
	CIM_J2eeJMSStatConnections createCIM_J2eeJMSStatConnections();

	/**
	 * Returns a new object of class '<em>CIM Product Software Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Software Features</em>'.
	 * @generated
	 */
	CIM_ProductSoftwareFeatures createCIM_ProductSoftwareFeatures();

	/**
	 * Returns a new object of class '<em>CIM Concrete Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Concrete Job</em>'.
	 * @generated
	 */
	CIM_ConcreteJob createCIM_ConcreteJob();

	/**
	 * Returns a new object of class '<em>CIM Default Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Default Setting</em>'.
	 * @generated
	 */
	CIM_DefaultSetting createCIM_DefaultSetting();

	/**
	 * Returns a new object of class '<em>CIM Is Spare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Is Spare</em>'.
	 * @generated
	 */
	CIM_IsSpare createCIM_IsSpare();

	/**
	 * Returns a new object of class '<em>CIM Physical Computer System View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Computer System View</em>'.
	 * @generated
	 */
	CIM_PhysicalComputerSystemView createCIM_PhysicalComputerSystemView();

	/**
	 * Returns a new object of class '<em>CIM Service Access URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Access URI</em>'.
	 * @generated
	 */
	CIM_ServiceAccessURI createCIM_ServiceAccessURI();

	/**
	 * Returns a new object of class '<em>CIM Service Affects Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Affects Element</em>'.
	 * @generated
	 */
	CIM_ServiceAffectsElement createCIM_ServiceAffectsElement();

	/**
	 * Returns a new object of class '<em>CIM Service Affects Element With Quota</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Affects Element With Quota</em>'.
	 * @generated
	 */
	CIM_ServiceAffectsElementWithQuota createCIM_ServiceAffectsElementWithQuota();

	/**
	 * Returns a new object of class '<em>CIM Service Available To Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Available To Element</em>'.
	 * @generated
	 */
	CIM_ServiceAvailableToElement createCIM_ServiceAvailableToElement();

	/**
	 * Returns a new object of class '<em>CIM Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Component</em>'.
	 * @generated
	 */
	CIM_ServiceComponent createCIM_ServiceComponent();

	/**
	 * Returns a new object of class '<em>CIM Service SAP Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service SAP Dependency</em>'.
	 * @generated
	 */
	CIM_ServiceSAPDependency createCIM_ServiceSAPDependency();

	/**
	 * Returns a new object of class '<em>CIM Service Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Statistics</em>'.
	 * @generated
	 */
	CIM_ServiceStatistics createCIM_ServiceStatistics();

	/**
	 * Returns a new object of class '<em>CIM Software Installation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Installation Service</em>'.
	 * @generated
	 */
	CIM_SoftwareInstallationService createCIM_SoftwareInstallationService();

	/**
	 * Returns a new object of class '<em>CIM Time Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Time Service</em>'.
	 * @generated
	 */
	CIM_TimeService createCIM_TimeService();

	/**
	 * Returns a new object of class '<em>CIM Common Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Common Database</em>'.
	 * @generated
	 */
	CIM_CommonDatabase createCIM_CommonDatabase();

	/**
	 * Returns a new object of class '<em>CIM Database Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Administrator</em>'.
	 * @generated
	 */
	CIM_DatabaseAdministrator createCIM_DatabaseAdministrator();

	/**
	 * Returns a new object of class '<em>CIM Database Control File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Control File</em>'.
	 * @generated
	 */
	CIM_DatabaseControlFile createCIM_DatabaseControlFile();

	/**
	 * Returns a new object of class '<em>CIM Database File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database File</em>'.
	 * @generated
	 */
	CIM_DatabaseFile createCIM_DatabaseFile();

	/**
	 * Returns a new object of class '<em>CIM Database Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Service</em>'.
	 * @generated
	 */
	CIM_DatabaseService createCIM_DatabaseService();

	/**
	 * Returns a new object of class '<em>CIM Service Available To Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Available To Database</em>'.
	 * @generated
	 */
	CIM_ServiceAvailableToDatabase createCIM_ServiceAvailableToDatabase();

	/**
	 * Returns a new object of class '<em>CIM Configuration Reporting Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Configuration Reporting Service</em>'.
	 * @generated
	 */
	CIM_ConfigurationReportingService createCIM_ConfigurationReportingService();

	/**
	 * Returns a new object of class '<em>CIM Fibre Protocol Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fibre Protocol Service</em>'.
	 * @generated
	 */
	CIM_FibreProtocolService createCIM_FibreProtocolService();

	/**
	 * Returns a new object of class '<em>CIM File System Replication Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Replication Service Capabilities</em>'.
	 * @generated
	 */
	CIM_FileSystemReplicationServiceCapabilities createCIM_FileSystemReplicationServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Hardware Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hardware Thread</em>'.
	 * @generated
	 */
	CIM_HardwareThread createCIM_HardwareThread();

	/**
	 * Returns a new object of class '<em>CIM IB Subnet Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IB Subnet Manager</em>'.
	 * @generated
	 */
	CIM_IBSubnetManager createCIM_IBSubnetManager();

	/**
	 * Returns a new object of class '<em>CIM Power Utilization Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Power Utilization Management Service</em>'.
	 * @generated
	 */
	CIM_PowerUtilizationManagementService createCIM_PowerUtilizationManagementService();

	/**
	 * Returns a new object of class '<em>CIM Print Job File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Job File</em>'.
	 * @generated
	 */
	CIM_PrintJobFile createCIM_PrintJobFile();

	/**
	 * Returns a new object of class '<em>CIM Print SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print SAP</em>'.
	 * @generated
	 */
	CIM_PrintSAP createCIM_PrintSAP();

	/**
	 * Returns a new object of class '<em>CIM Print Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Service</em>'.
	 * @generated
	 */
	CIM_PrintService createCIM_PrintService();

	/**
	 * Returns a new object of class '<em>CIM Processor Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Processor Core</em>'.
	 * @generated
	 */
	CIM_ProcessorCore createCIM_ProcessorCore();

	/**
	 * Returns a new object of class '<em>CIM Replication Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replication Entity</em>'.
	 * @generated
	 */
	CIM_ReplicationEntity createCIM_ReplicationEntity();

	/**
	 * Returns a new object of class '<em>CIM Statistics Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Statistics Service</em>'.
	 * @generated
	 */
	CIM_StatisticsService createCIM_StatisticsService();

	/**
	 * Returns a new object of class '<em>CIM Zone Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Zone Service</em>'.
	 * @generated
	 */
	CIM_ZoneService createCIM_ZoneService();

	/**
	 * Returns a new object of class '<em>CIM Indication Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indication Service</em>'.
	 * @generated
	 */
	CIM_IndicationService createCIM_IndicationService();

	/**
	 * Returns a new object of class '<em>CIM Contained Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Contained Transform</em>'.
	 * @generated
	 */
	CIM_ContainedTransform createCIM_ContainedTransform();

	/**
	 * Returns a new object of class '<em>CIM IKE Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IKE Rule</em>'.
	 * @generated
	 */
	CIM_IKERule createCIM_IKERule();

	/**
	 * Returns a new object of class '<em>CIM IPsec Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec Rule</em>'.
	 * @generated
	 */
	CIM_IPsecRule createCIM_IPsecRule();

	/**
	 * Returns a new object of class '<em>CIM Packet Condition In SA Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Packet Condition In SA Rule</em>'.
	 * @generated
	 */
	CIM_PacketConditionInSARule createCIM_PacketConditionInSARule();

	/**
	 * Returns a new object of class '<em>CIM CIMXML Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CIMXML Capabilities</em>'.
	 * @generated
	 */
	CIM_CIMXMLCapabilities createCIM_CIMXMLCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Object Manager Communication Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Object Manager Communication Mechanism</em>'.
	 * @generated
	 */
	CIM_ObjectManagerCommunicationMechanism createCIM_ObjectManagerCommunicationMechanism();

	/**
	 * Returns a new object of class '<em>CIM WBEM Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WBEM Server</em>'.
	 * @generated
	 */
	CIM_WBEMServer createCIM_WBEMServer();

	/**
	 * Returns a new object of class '<em>CIM Metric Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Metric Service</em>'.
	 * @generated
	 */
	CIM_MetricService createCIM_MetricService();

	/**
	 * Returns a new object of class '<em>CIM BGPIP Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGPIP Route</em>'.
	 * @generated
	 */
	CIM_BGPIPRoute createCIM_BGPIPRoute();

	/**
	 * Returns a new object of class '<em>CIM Conditioning Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Conditioning Service</em>'.
	 * @generated
	 */
	CIM_ConditioningService createCIM_ConditioningService();

	/**
	 * Returns a new object of class '<em>CIM Drop Threshold Calculation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Drop Threshold Calculation Service</em>'.
	 * @generated
	 */
	CIM_DropThresholdCalculationService createCIM_DropThresholdCalculationService();

	/**
	 * Returns a new object of class '<em>CIM Dropper Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Dropper Service</em>'.
	 * @generated
	 */
	CIM_DropperService createCIM_DropperService();

	/**
	 * Returns a new object of class '<em>CIM Head Tail Dropper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Head Tail Dropper</em>'.
	 * @generated
	 */
	CIM_HeadTailDropper createCIM_HeadTailDropper();

	/**
	 * Returns a new object of class '<em>CIM IP Network Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Network Connection</em>'.
	 * @generated
	 */
	CIM_IPNetworkConnection createCIM_IPNetworkConnection();

	/**
	 * Returns a new object of class '<em>CIM KVM Redirection SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM KVM Redirection SAP</em>'.
	 * @generated
	 */
	CIM_KVMRedirectionSAP createCIM_KVMRedirectionSAP();

	/**
	 * Returns a new object of class '<em>CIM Marker Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Marker Service</em>'.
	 * @generated
	 */
	CIM_MarkerService createCIM_MarkerService();

	/**
	 * Returns a new object of class '<em>CIM Media Redirection SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Redirection SAP</em>'.
	 * @generated
	 */
	CIM_MediaRedirectionSAP createCIM_MediaRedirectionSAP();

	/**
	 * Returns a new object of class '<em>CIM Meter Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Meter Service</em>'.
	 * @generated
	 */
	CIM_MeterService createCIM_MeterService();

	/**
	 * Returns a new object of class '<em>CIM Network Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Pipe</em>'.
	 * @generated
	 */
	CIM_NetworkPipe createCIM_NetworkPipe();

	/**
	 * Returns a new object of class '<em>CIM Network Pipe Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Pipe Composition</em>'.
	 * @generated
	 */
	CIM_NetworkPipeComposition createCIM_NetworkPipeComposition();

	/**
	 * Returns a new object of class '<em>CIM Network Policy Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Policy Service</em>'.
	 * @generated
	 */
	CIM_NetworkPolicyService createCIM_NetworkPolicyService();

	/**
	 * Returns a new object of class '<em>CIM Next Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Next Service</em>'.
	 * @generated
	 */
	CIM_NextService createCIM_NextService();

	/**
	 * Returns a new object of class '<em>CIM Next Service After Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Next Service After Meter</em>'.
	 * @generated
	 */
	CIM_NextServiceAfterMeter createCIM_NextServiceAfterMeter();

	/**
	 * Returns a new object of class '<em>CIM Packet Scheduling Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Packet Scheduling Service</em>'.
	 * @generated
	 */
	CIM_PacketSchedulingService createCIM_PacketSchedulingService();

	/**
	 * Returns a new object of class '<em>CIM Preamble Marker Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Preamble Marker Service</em>'.
	 * @generated
	 */
	CIM_PreambleMarkerService createCIM_PreambleMarkerService();

	/**
	 * Returns a new object of class '<em>CIM Priority8021 QMarker Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Priority8021 QMarker Service</em>'.
	 * @generated
	 */
	CIM_Priority8021QMarkerService createCIM_Priority8021QMarkerService();

	/**
	 * Returns a new object of class '<em>CIM Qo SService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Qo SService</em>'.
	 * @generated
	 */
	CIM_QoSService createCIM_QoSService();

	/**
	 * Returns a new object of class '<em>CIM Qo SSub Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Qo SSub Service</em>'.
	 * @generated
	 */
	CIM_QoSSubService createCIM_QoSSubService();

	/**
	 * Returns a new object of class '<em>CIM Queuing Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Queuing Service</em>'.
	 * @generated
	 */
	CIM_QueuingService createCIM_QueuingService();

	/**
	 * Returns a new object of class '<em>CIM RED Dropper Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM RED Dropper Service</em>'.
	 * @generated
	 */
	CIM_REDDropperService createCIM_REDDropperService();

	/**
	 * Returns a new object of class '<em>CIM Redirection Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Redirection Service</em>'.
	 * @generated
	 */
	CIM_RedirectionService createCIM_RedirectionService();

	/**
	 * Returns a new object of class '<em>CIM SNMP Community String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SNMP Community String</em>'.
	 * @generated
	 */
	CIM_SNMPCommunityString createCIM_SNMPCommunityString();

	/**
	 * Returns a new object of class '<em>CIM SNMP Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SNMP Service</em>'.
	 * @generated
	 */
	CIM_SNMPService createCIM_SNMPService();

	/**
	 * Returns a new object of class '<em>CIM Scheduling Service To Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Scheduling Service To Schedule</em>'.
	 * @generated
	 */
	CIM_SchedulingServiceToSchedule createCIM_SchedulingServiceToSchedule();

	/**
	 * Returns a new object of class '<em>CIM Text Redirection SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Text Redirection SAP</em>'.
	 * @generated
	 */
	CIM_TextRedirectionSAP createCIM_TextRedirectionSAP();

	/**
	 * Returns a new object of class '<em>CIM Text Redirection Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Text Redirection Service</em>'.
	 * @generated
	 */
	CIM_TextRedirectionService createCIM_TextRedirectionService();

	/**
	 * Returns a new object of class '<em>CIM To SMarker Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM To SMarker Service</em>'.
	 * @generated
	 */
	CIM_ToSMarkerService createCIM_ToSMarkerService();

	/**
	 * Returns a new object of class '<em>CIM Token Bucket Meter Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Token Bucket Meter Service</em>'.
	 * @generated
	 */
	CIM_TokenBucketMeterService createCIM_TokenBucketMeterService();

	/**
	 * Returns a new object of class '<em>CIM USB Redirection SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Redirection SAP</em>'.
	 * @generated
	 */
	CIM_USBRedirectionSAP createCIM_USBRedirectionSAP();

	/**
	 * Returns a new object of class '<em>CIM VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VLAN</em>'.
	 * @generated
	 */
	CIM_VLAN createCIM_VLAN();

	/**
	 * Returns a new object of class '<em>CIM Weighted RED Dropper Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Weighted RED Dropper Service</em>'.
	 * @generated
	 */
	CIM_WeightedREDDropperService createCIM_WeightedREDDropperService();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Connection</em>'.
	 * @generated
	 */
	CIM_iSCSIConnection createCIM_iSCSIConnection();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Session</em>'.
	 * @generated
	 */
	CIM_iSCSISession createCIM_iSCSISession();

	/**
	 * Returns a new object of class '<em>CIM Policy Action In Policy Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Action In Policy Action</em>'.
	 * @generated
	 */
	CIM_PolicyActionInPolicyAction createCIM_PolicyActionInPolicyAction();

	/**
	 * Returns a new object of class '<em>CIM Policy Action In Policy Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Action In Policy Rule</em>'.
	 * @generated
	 */
	CIM_PolicyActionInPolicyRule createCIM_PolicyActionInPolicyRule();

	/**
	 * Returns a new object of class '<em>CIM Associated Job Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Job Method Result</em>'.
	 * @generated
	 */
	CIM_AssociatedJobMethodResult createCIM_AssociatedJobMethodResult();

	/**
	 * Returns a new object of class '<em>CIM BIOS Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Service</em>'.
	 * @generated
	 */
	CIM_BIOSService createCIM_BIOSService();

	/**
	 * Returns a new object of class '<em>CIM Boot Config Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Boot Config Setting</em>'.
	 * @generated
	 */
	CIM_BootConfigSetting createCIM_BootConfigSetting();

	/**
	 * Returns a new object of class '<em>CIM Boot SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Boot SAP</em>'.
	 * @generated
	 */
	CIM_BootSAP createCIM_BootSAP();

	/**
	 * Returns a new object of class '<em>CIM Clustering SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Clustering SAP</em>'.
	 * @generated
	 */
	CIM_ClusteringSAP createCIM_ClusteringSAP();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Test</em>'.
	 * @generated
	 */
	CIM_DiagnosticTest createCIM_DiagnosticTest();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Test In Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Test In Package</em>'.
	 * @generated
	 */
	CIM_DiagnosticTestInPackage createCIM_DiagnosticTestInPackage();

	/**
	 * Returns a new object of class '<em>CIM Disk Drive Diagnostic Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Drive Diagnostic Test</em>'.
	 * @generated
	 */
	CIM_DiskDriveDiagnosticTest createCIM_DiskDriveDiagnosticTest();

	/**
	 * Returns a new object of class '<em>CIM Exported File Share Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Exported File Share Capabilities</em>'.
	 * @generated
	 */
	CIM_ExportedFileShareCapabilities createCIM_ExportedFileShareCapabilities();

	/**
	 * Returns a new object of class '<em>CIM FCHBA Diagnostic Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FCHBA Diagnostic Test</em>'.
	 * @generated
	 */
	CIM_FCHBADiagnosticTest createCIM_FCHBADiagnosticTest();

	/**
	 * Returns a new object of class '<em>CIM File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System</em>'.
	 * @generated
	 */
	CIM_FileSystem createCIM_FileSystem();

	/**
	 * Returns a new object of class '<em>CIM File System Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Capabilities</em>'.
	 * @generated
	 */
	CIM_FileSystemCapabilities createCIM_FileSystemCapabilities();

	/**
	 * Returns a new object of class '<em>CIM File System Statistics Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Statistics Service</em>'.
	 * @generated
	 */
	CIM_FileSystemStatisticsService createCIM_FileSystemStatisticsService();

	/**
	 * Returns a new object of class '<em>CIM Help Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Help Service</em>'.
	 * @generated
	 */
	CIM_HelpService createCIM_HelpService();

	/**
	 * Returns a new object of class '<em>CIM Help Service Available To File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Help Service Available To File</em>'.
	 * @generated
	 */
	CIM_HelpServiceAvailableToFile createCIM_HelpServiceAvailableToFile();

	/**
	 * Returns a new object of class '<em>CIM Job Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Job Destination</em>'.
	 * @generated
	 */
	CIM_JobDestination createCIM_JobDestination();

	/**
	 * Returns a new object of class '<em>CIM Job Destination Jobs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Job Destination Jobs</em>'.
	 * @generated
	 */
	CIM_JobDestinationJobs createCIM_JobDestinationJobs();

	/**
	 * Returns a new object of class '<em>CIM Job Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Job Queue</em>'.
	 * @generated
	 */
	CIM_JobQueue createCIM_JobQueue();

	/**
	 * Returns a new object of class '<em>CIM Local File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Local File System</em>'.
	 * @generated
	 */
	CIM_LocalFileSystem createCIM_LocalFileSystem();

	/**
	 * Returns a new object of class '<em>CIM Log Manages Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Log Manages Record</em>'.
	 * @generated
	 */
	CIM_LogManagesRecord createCIM_LogManagesRecord();

	/**
	 * Returns a new object of class '<em>CIM Message Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Message Log</em>'.
	 * @generated
	 */
	CIM_MessageLog createCIM_MessageLog();

	/**
	 * Returns a new object of class '<em>CIM Mount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Mount</em>'.
	 * @generated
	 */
	CIM_Mount createCIM_Mount();

	/**
	 * Returns a new object of class '<em>CIM OOB Alert Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OOB Alert Service</em>'.
	 * @generated
	 */
	CIM_OOBAlertService createCIM_OOBAlertService();

	/**
	 * Returns a new object of class '<em>CIM Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operating System</em>'.
	 * @generated
	 */
	CIM_OperatingSystem createCIM_OperatingSystem();

	/**
	 * Returns a new object of class '<em>CIM Platform Watchdog Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Platform Watchdog Service</em>'.
	 * @generated
	 */
	CIM_PlatformWatchdogService createCIM_PlatformWatchdogService();

	/**
	 * Returns a new object of class '<em>CIM Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Process</em>'.
	 * @generated
	 */
	CIM_Process createCIM_Process();

	/**
	 * Returns a new object of class '<em>CIM Process Executable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Process Executable</em>'.
	 * @generated
	 */
	CIM_ProcessExecutable createCIM_ProcessExecutable();

	/**
	 * Returns a new object of class '<em>CIM Process Of Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Process Of Job</em>'.
	 * @generated
	 */
	CIM_ProcessOfJob createCIM_ProcessOfJob();

	/**
	 * Returns a new object of class '<em>CIM Record In Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Record In Log</em>'.
	 * @generated
	 */
	CIM_RecordInLog createCIM_RecordInLog();

	/**
	 * Returns a new object of class '<em>CIM Record Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Record Log</em>'.
	 * @generated
	 */
	CIM_RecordLog createCIM_RecordLog();

	/**
	 * Returns a new object of class '<em>CIM Remote File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remote File System</em>'.
	 * @generated
	 */
	CIM_RemoteFileSystem createCIM_RemoteFileSystem();

	/**
	 * Returns a new object of class '<em>CIM Service Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Process</em>'.
	 * @generated
	 */
	CIM_ServiceProcess createCIM_ServiceProcess();

	/**
	 * Returns a new object of class '<em>CIM Shared Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Shared Element</em>'.
	 * @generated
	 */
	CIM_SharedElement createCIM_SharedElement();

	/**
	 * Returns a new object of class '<em>CIM Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Thread</em>'.
	 * @generated
	 */
	CIM_Thread createCIM_Thread();

	/**
	 * Returns a new object of class '<em>CIM Unix Local File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix Local File System</em>'.
	 * @generated
	 */
	CIM_UnixLocalFileSystem createCIM_UnixLocalFileSystem();

	/**
	 * Returns a new object of class '<em>CIM Unix Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix Process</em>'.
	 * @generated
	 */
	CIM_UnixProcess createCIM_UnixProcess();

	/**
	 * Returns a new object of class '<em>CIM Unix Process Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix Process Statistics</em>'.
	 * @generated
	 */
	CIM_UnixProcessStatistics createCIM_UnixProcessStatistics();

	/**
	 * Returns a new object of class '<em>CIM Unix Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unix Thread</em>'.
	 * @generated
	 */
	CIM_UnixThread createCIM_UnixThread();

	/**
	 * Returns a new object of class '<em>CIM Use Of Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Use Of Log</em>'.
	 * @generated
	 */
	CIM_UseOfLog createCIM_UseOfLog();

	/**
	 * Returns a new object of class '<em>CIM Use Of Message Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Use Of Message Log</em>'.
	 * @generated
	 */
	CIM_UseOfMessageLog createCIM_UseOfMessageLog();

	/**
	 * Returns a new object of class '<em>CIM Wake Up Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wake Up Service</em>'.
	 * @generated
	 */
	CIM_WakeUpService createCIM_WakeUpService();

	/**
	 * Returns a new object of class '<em>CIM Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account</em>'.
	 * @generated
	 */
	CIM_Account createCIM_Account();

	/**
	 * Returns a new object of class '<em>CIM Account Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account Identity</em>'.
	 * @generated
	 */
	CIM_AccountIdentity createCIM_AccountIdentity();

	/**
	 * Returns a new object of class '<em>CIM Account Maps To Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account Maps To Account</em>'.
	 * @generated
	 */
	CIM_AccountMapsToAccount createCIM_AccountMapsToAccount();

	/**
	 * Returns a new object of class '<em>CIM Credential Management SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Credential Management SAP</em>'.
	 * @generated
	 */
	CIM_CredentialManagementSAP createCIM_CredentialManagementSAP();

	/**
	 * Returns a new object of class '<em>CIM More Person Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM More Person Info</em>'.
	 * @generated
	 */
	CIM_MorePersonInfo createCIM_MorePersonInfo();

	/**
	 * Returns a new object of class '<em>CIM Security Service Uses Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Security Service Uses Account</em>'.
	 * @generated
	 */
	CIM_SecurityServiceUsesAccount createCIM_SecurityServiceUsesAccount();

	/**
	 * Returns a new object of class '<em>CIM Users Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Users Account</em>'.
	 * @generated
	 */
	CIM_UsersAccount createCIM_UsersAccount();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Test Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Test Software</em>'.
	 * @generated
	 */
	CIM_DiagnosticTestSoftware createCIM_DiagnosticTestSoftware();

	/**
	 * Returns a new object of class '<em>CIM J2ee Entity Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Entity Bean</em>'.
	 * @generated
	 */
	CIM_J2eeEntityBean createCIM_J2eeEntityBean();

	/**
	 * Returns a new object of class '<em>CIM J2ee JCA Connection Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JCA Connection Factory</em>'.
	 * @generated
	 */
	CIM_J2eeJCAConnectionFactory createCIM_J2eeJCAConnectionFactory();

	/**
	 * Returns a new object of class '<em>CIM J2ee JCA Managed Connection Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JCA Managed Connection Factory</em>'.
	 * @generated
	 */
	CIM_J2eeJCAManagedConnectionFactory createCIM_J2eeJCAManagedConnectionFactory();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Data Source</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCDataSource createCIM_J2eeJDBCDataSource();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Driver</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCDriver createCIM_J2eeJDBCDriver();

	/**
	 * Returns a new object of class '<em>CIM J2ee JVM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JVM</em>'.
	 * @generated
	 */
	CIM_J2eeJVM createCIM_J2eeJVM();

	/**
	 * Returns a new object of class '<em>CIM J2ee Message Driven Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Message Driven Bean</em>'.
	 * @generated
	 */
	CIM_J2eeMessageDrivenBean createCIM_J2eeMessageDrivenBean();

	/**
	 * Returns a new object of class '<em>CIM J2ee Module Uses JVM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Module Uses JVM</em>'.
	 * @generated
	 */
	CIM_J2eeModuleUsesJVM createCIM_J2eeModuleUsesJVM();

	/**
	 * Returns a new object of class '<em>CIM J2ee Resource Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Resource Adapter</em>'.
	 * @generated
	 */
	CIM_J2eeResourceAdapter createCIM_J2eeResourceAdapter();

	/**
	 * Returns a new object of class '<em>CIM J2ee Resource Adapter Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Resource Adapter Module</em>'.
	 * @generated
	 */
	CIM_J2eeResourceAdapterModule createCIM_J2eeResourceAdapterModule();

	/**
	 * Returns a new object of class '<em>CIM J2ee Servlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Servlet</em>'.
	 * @generated
	 */
	CIM_J2eeServlet createCIM_J2eeServlet();

	/**
	 * Returns a new object of class '<em>CIM J2ee Stateful Session Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Stateful Session Bean</em>'.
	 * @generated
	 */
	CIM_J2eeStatefulSessionBean createCIM_J2eeStatefulSessionBean();

	/**
	 * Returns a new object of class '<em>CIM J2ee Stateless Session Bean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Stateless Session Bean</em>'.
	 * @generated
	 */
	CIM_J2eeStatelessSessionBean createCIM_J2eeStatelessSessionBean();

	/**
	 * Returns a new object of class '<em>CIM J2ee URL Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee URL Resource</em>'.
	 * @generated
	 */
	CIM_J2eeURLResource createCIM_J2eeURLResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee Web Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Web Module</em>'.
	 * @generated
	 */
	CIM_J2eeWebModule createCIM_J2eeWebModule();

	/**
	 * Returns a new object of class '<em>CIM Operating System Software Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operating System Software Feature</em>'.
	 * @generated
	 */
	CIM_OperatingSystemSoftwareFeature createCIM_OperatingSystemSoftwareFeature();

	/**
	 * Returns a new object of class '<em>CIM Software Element SAP Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Element SAP Implementation</em>'.
	 * @generated
	 */
	CIM_SoftwareElementSAPImplementation createCIM_SoftwareElementSAPImplementation();

	/**
	 * Returns a new object of class '<em>CIM Software Element Service Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Element Service Implementation</em>'.
	 * @generated
	 */
	CIM_SoftwareElementServiceImplementation createCIM_SoftwareElementServiceImplementation();

	/**
	 * Returns a new object of class '<em>CIM Software Feature SAP Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Feature SAP Implementation</em>'.
	 * @generated
	 */
	CIM_SoftwareFeatureSAPImplementation createCIM_SoftwareFeatureSAPImplementation();

	/**
	 * Returns a new object of class '<em>CIM Software Feature Service Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Feature Service Implementation</em>'.
	 * @generated
	 */
	CIM_SoftwareFeatureServiceImplementation createCIM_SoftwareFeatureServiceImplementation();

	/**
	 * Returns a new object of class '<em>CIM Power Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Power Management Service</em>'.
	 * @generated
	 */
	CIM_PowerManagementService createCIM_PowerManagementService();

	/**
	 * Returns a new object of class '<em>CIM Product Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Product Service Component</em>'.
	 * @generated
	 */
	CIM_ProductServiceComponent createCIM_ProductServiceComponent();

	/**
	 * Returns a new object of class '<em>CIM Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_ProtocolEndpoint createCIM_ProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Provides Service To Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Provides Service To Element</em>'.
	 * @generated
	 */
	CIM_ProvidesServiceToElement createCIM_ProvidesServiceToElement();

	/**
	 * Returns a new object of class '<em>CIM Realizes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Realizes</em>'.
	 * @generated
	 */
	CIM_Realizes createCIM_Realizes();

	/**
	 * Returns a new object of class '<em>CIM Remote Service Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remote Service Access Point</em>'.
	 * @generated
	 */
	CIM_RemoteServiceAccessPoint createCIM_RemoteServiceAccessPoint();

	/**
	 * Returns a new object of class '<em>CIM Resource Pool Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Resource Pool Configuration Service</em>'.
	 * @generated
	 */
	CIM_ResourcePoolConfigurationService createCIM_ResourcePoolConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM SAP Available For Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SAP Available For Element</em>'.
	 * @generated
	 */
	CIM_SAPAvailableForElement createCIM_SAPAvailableForElement();

	/**
	 * Returns a new object of class '<em>CIM SAPSAP Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SAPSAP Dependency</em>'.
	 * @generated
	 */
	CIM_SAPSAPDependency createCIM_SAPSAPDependency();

	/**
	 * Returns a new object of class '<em>CIM SAP Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SAP Statistics</em>'.
	 * @generated
	 */
	CIM_SAPStatistics createCIM_SAPStatistics();

	/**
	 * Returns a new object of class '<em>CIM Service Access By SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Access By SAP</em>'.
	 * @generated
	 */
	CIM_ServiceAccessBySAP createCIM_ServiceAccessBySAP();

	/**
	 * Returns a new object of class '<em>CIM Service Service Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Service Dependency</em>'.
	 * @generated
	 */
	CIM_ServiceServiceDependency createCIM_ServiceServiceDependency();

	/**
	 * Returns a new object of class '<em>CIM Storage Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Extent</em>'.
	 * @generated
	 */
	CIM_StorageExtent createCIM_StorageExtent();

	/**
	 * Returns a new object of class '<em>CIM System Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Component</em>'.
	 * @generated
	 */
	CIM_SystemComponent createCIM_SystemComponent();

	/**
	 * Returns a new object of class '<em>CIM System Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Device</em>'.
	 * @generated
	 */
	CIM_SystemDevice createCIM_SystemDevice();

	/**
	 * Returns a new object of class '<em>CIM System Packaging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Packaging</em>'.
	 * @generated
	 */
	CIM_SystemPackaging createCIM_SystemPackaging();

	/**
	 * Returns a new object of class '<em>CIM System Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Statistics</em>'.
	 * @generated
	 */
	CIM_SystemStatistics createCIM_SystemStatistics();

	/**
	 * Returns a new object of class '<em>CIM View On System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM View On System</em>'.
	 * @generated
	 */
	CIM_ViewOnSystem createCIM_ViewOnSystem();

	/**
	 * Returns a new object of class '<em>CIM Database Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Segment</em>'.
	 * @generated
	 */
	CIM_DatabaseSegment createCIM_DatabaseSegment();

	/**
	 * Returns a new object of class '<em>CIM Database Storage Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Storage Area</em>'.
	 * @generated
	 */
	CIM_DatabaseStorageArea createCIM_DatabaseStorageArea();

	/**
	 * Returns a new object of class '<em>CIM Aggregate PExtent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Aggregate PExtent</em>'.
	 * @generated
	 */
	CIM_AggregatePExtent createCIM_AggregatePExtent();

	/**
	 * Returns a new object of class '<em>CIM Aggregate PS Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Aggregate PS Extent</em>'.
	 * @generated
	 */
	CIM_AggregatePSExtent createCIM_AggregatePSExtent();

	/**
	 * Returns a new object of class '<em>CIM Alarm Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Alarm Device</em>'.
	 * @generated
	 */
	CIM_AlarmDevice createCIM_AlarmDevice();

	/**
	 * Returns a new object of class '<em>CIM Associated Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Alarm</em>'.
	 * @generated
	 */
	CIM_AssociatedAlarm createCIM_AssociatedAlarm();

	/**
	 * Returns a new object of class '<em>CIM Associated Resource Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Resource Pool</em>'.
	 * @generated
	 */
	CIM_AssociatedResourcePool createCIM_AssociatedResourcePool();

	/**
	 * Returns a new object of class '<em>CIM Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Battery</em>'.
	 * @generated
	 */
	CIM_Battery createCIM_Battery();

	/**
	 * Returns a new object of class '<em>CIM Block Statistics Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Block Statistics Service</em>'.
	 * @generated
	 */
	CIM_BlockStatisticsService createCIM_BlockStatisticsService();

	/**
	 * Returns a new object of class '<em>CIM Composite Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Composite Extent</em>'.
	 * @generated
	 */
	CIM_CompositeExtent createCIM_CompositeExtent();

	/**
	 * Returns a new object of class '<em>CIM Cooling Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Cooling Device</em>'.
	 * @generated
	 */
	CIM_CoolingDevice createCIM_CoolingDevice();

	/**
	 * Returns a new object of class '<em>CIM Device Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Connection</em>'.
	 * @generated
	 */
	CIM_DeviceConnection createCIM_DeviceConnection();

	/**
	 * Returns a new object of class '<em>CIM Device Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Identity</em>'.
	 * @generated
	 */
	CIM_DeviceIdentity createCIM_DeviceIdentity();

	/**
	 * Returns a new object of class '<em>CIM Device Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Software</em>'.
	 * @generated
	 */
	CIM_DeviceSoftware createCIM_DeviceSoftware();

	/**
	 * Returns a new object of class '<em>CIM Display Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Display Controller</em>'.
	 * @generated
	 */
	CIM_DisplayController createCIM_DisplayController();

	/**
	 * Returns a new object of class '<em>CIM Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Door</em>'.
	 * @generated
	 */
	CIM_Door createCIM_Door();

	/**
	 * Returns a new object of class '<em>CIM Door Access To Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Door Access To Device</em>'.
	 * @generated
	 */
	CIM_DoorAccessToDevice createCIM_DoorAccessToDevice();

	/**
	 * Returns a new object of class '<em>CIM Door Access To Physical Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Door Access To Physical Element</em>'.
	 * @generated
	 */
	CIM_DoorAccessToPhysicalElement createCIM_DoorAccessToPhysicalElement();

	/**
	 * Returns a new object of class '<em>CIM ESCON Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ESCON Controller</em>'.
	 * @generated
	 */
	CIM_ESCONController createCIM_ESCONController();

	/**
	 * Returns a new object of class '<em>CIM Error Counters For Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Error Counters For Device</em>'.
	 * @generated
	 */
	CIM_ErrorCountersForDevice createCIM_ErrorCountersForDevice();

	/**
	 * Returns a new object of class '<em>CIM Extent Component View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Extent Component View</em>'.
	 * @generated
	 */
	CIM_ExtentComponentView createCIM_ExtentComponentView();

	/**
	 * Returns a new object of class '<em>CIM Extent In Disk Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Extent In Disk Group</em>'.
	 * @generated
	 */
	CIM_ExtentInDiskGroup createCIM_ExtentInDiskGroup();

	/**
	 * Returns a new object of class '<em>CIM Fan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fan</em>'.
	 * @generated
	 */
	CIM_Fan createCIM_Fan();

	/**
	 * Returns a new object of class '<em>CIM Heat Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Heat Pipe</em>'.
	 * @generated
	 */
	CIM_HeatPipe createCIM_HeatPipe();

	/**
	 * Returns a new object of class '<em>CIM Hosted Storage Pool View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Storage Pool View</em>'.
	 * @generated
	 */
	CIM_HostedStoragePoolView createCIM_HostedStoragePoolView();

	/**
	 * Returns a new object of class '<em>CIM IDE Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IDE Controller</em>'.
	 * @generated
	 */
	CIM_IDEController createCIM_IDEController();

	/**
	 * Returns a new object of class '<em>CIM Indicator LED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Indicator LED</em>'.
	 * @generated
	 */
	CIM_IndicatorLED createCIM_IndicatorLED();

	/**
	 * Returns a new object of class '<em>CIM Infrared Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Infrared Controller</em>'.
	 * @generated
	 */
	CIM_InfraredController createCIM_InfraredController();

	/**
	 * Returns a new object of class '<em>CIM Initiator Target Logical Unit Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Initiator Target Logical Unit Path</em>'.
	 * @generated
	 */
	CIM_InitiatorTargetLogicalUnitPath createCIM_InitiatorTargetLogicalUnitPath();

	/**
	 * Returns a new object of class '<em>CIM Installed Partition Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Installed Partition Table</em>'.
	 * @generated
	 */
	CIM_InstalledPartitionTable createCIM_InstalledPartitionTable();

	/**
	 * Returns a new object of class '<em>CIM Label Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Label Reader</em>'.
	 * @generated
	 */
	CIM_LabelReader createCIM_LabelReader();

	/**
	 * Returns a new object of class '<em>CIM Logical Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Disk</em>'.
	 * @generated
	 */
	CIM_LogicalDisk createCIM_LogicalDisk();

	/**
	 * Returns a new object of class '<em>CIM Logical Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Module</em>'.
	 * @generated
	 */
	CIM_LogicalModule createCIM_LogicalModule();

	/**
	 * Returns a new object of class '<em>CIM Logical Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Port</em>'.
	 * @generated
	 */
	CIM_LogicalPort createCIM_LogicalPort();

	/**
	 * Returns a new object of class '<em>CIM Management Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Management Controller</em>'.
	 * @generated
	 */
	CIM_ManagementController createCIM_ManagementController();

	/**
	 * Returns a new object of class '<em>CIM Masking Mapping Exposed Device View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Masking Mapping Exposed Device View</em>'.
	 * @generated
	 */
	CIM_MaskingMappingExposedDeviceView createCIM_MaskingMappingExposedDeviceView();

	/**
	 * Returns a new object of class '<em>CIM Masking Mapping View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Masking Mapping View</em>'.
	 * @generated
	 */
	CIM_MaskingMappingView createCIM_MaskingMappingView();

	/**
	 * Returns a new object of class '<em>CIM Media Access Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Access Device</em>'.
	 * @generated
	 */
	CIM_MediaAccessDevice createCIM_MediaAccessDevice();

	/**
	 * Returns a new object of class '<em>CIM Media Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Partition</em>'.
	 * @generated
	 */
	CIM_MediaPartition createCIM_MediaPartition();

	/**
	 * Returns a new object of class '<em>CIM Media Present</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Present</em>'.
	 * @generated
	 */
	CIM_MediaPresent createCIM_MediaPresent();

	/**
	 * Returns a new object of class '<em>CIM Media Transfer Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Media Transfer Device</em>'.
	 * @generated
	 */
	CIM_MediaTransferDevice createCIM_MediaTransferDevice();

	/**
	 * Returns a new object of class '<em>CIM Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory</em>'.
	 * @generated
	 */
	CIM_Memory createCIM_Memory();

	/**
	 * Returns a new object of class '<em>CIM Memory Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Controller</em>'.
	 * @generated
	 */
	CIM_MemoryController createCIM_MemoryController();

	/**
	 * Returns a new object of class '<em>CIM Network Adapter Redundancy Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Adapter Redundancy Component</em>'.
	 * @generated
	 */
	CIM_NetworkAdapterRedundancyComponent createCIM_NetworkAdapterRedundancyComponent();

	/**
	 * Returns a new object of class '<em>CIM Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Port</em>'.
	 * @generated
	 */
	CIM_NetworkPort createCIM_NetworkPort();

	/**
	 * Returns a new object of class '<em>CIM Network Virtual Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Virtual Adapter</em>'.
	 * @generated
	 */
	CIM_NetworkVirtualAdapter createCIM_NetworkVirtualAdapter();

	/**
	 * Returns a new object of class '<em>CIM Non Volatile Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Non Volatile Storage</em>'.
	 * @generated
	 */
	CIM_NonVolatileStorage createCIM_NonVolatileStorage();

	/**
	 * Returns a new object of class '<em>CIM Operational Power Statistics Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operational Power Statistics Service</em>'.
	 * @generated
	 */
	CIM_OperationalPowerStatisticsService createCIM_OperationalPowerStatisticsService();

	/**
	 * Returns a new object of class '<em>CIM PCI Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PCI Controller</em>'.
	 * @generated
	 */
	CIM_PCIController createCIM_PCIController();

	/**
	 * Returns a new object of class '<em>CIM PCI Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PCI Device</em>'.
	 * @generated
	 */
	CIM_PCIDevice createCIM_PCIDevice();

	/**
	 * Returns a new object of class '<em>CIM PCI Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PCI Port</em>'.
	 * @generated
	 */
	CIM_PCIPort createCIM_PCIPort();

	/**
	 * Returns a new object of class '<em>CIM PC Ie Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PC Ie Switch</em>'.
	 * @generated
	 */
	CIM_PCIeSwitch createCIM_PCIeSwitch();

	/**
	 * Returns a new object of class '<em>CIM PCMCIA Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PCMCIA Controller</em>'.
	 * @generated
	 */
	CIM_PCMCIAController createCIM_PCMCIAController();

	/**
	 * Returns a new object of class '<em>CIM Package Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package Dependency</em>'.
	 * @generated
	 */
	CIM_PackageDependency createCIM_PackageDependency();

	/**
	 * Returns a new object of class '<em>CIM Parallel Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Parallel Controller</em>'.
	 * @generated
	 */
	CIM_ParallelController createCIM_ParallelController();

	/**
	 * Returns a new object of class '<em>CIM Pass Through Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Pass Through Module</em>'.
	 * @generated
	 */
	CIM_PassThroughModule createCIM_PassThroughModule();

	/**
	 * Returns a new object of class '<em>CIM Persistent Memory Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Persistent Memory Namespace</em>'.
	 * @generated
	 */
	CIM_PersistentMemoryNamespace createCIM_PersistentMemoryNamespace();

	/**
	 * Returns a new object of class '<em>CIM Persistent Memory Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Persistent Memory Service</em>'.
	 * @generated
	 */
	CIM_PersistentMemoryService createCIM_PersistentMemoryService();

	/**
	 * Returns a new object of class '<em>CIM Physical Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Physical Extent</em>'.
	 * @generated
	 */
	CIM_PhysicalExtent createCIM_PhysicalExtent();

	/**
	 * Returns a new object of class '<em>CIM Picker Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Picker Element</em>'.
	 * @generated
	 */
	CIM_PickerElement createCIM_PickerElement();

	/**
	 * Returns a new object of class '<em>CIM Port Active Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Port Active Connection</em>'.
	 * @generated
	 */
	CIM_PortActiveConnection createCIM_PortActiveConnection();

	/**
	 * Returns a new object of class '<em>CIM Port Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Port Controller</em>'.
	 * @generated
	 */
	CIM_PortController createCIM_PortController();

	/**
	 * Returns a new object of class '<em>CIM Port On Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Port On Device</em>'.
	 * @generated
	 */
	CIM_PortOnDevice createCIM_PortOnDevice();

	/**
	 * Returns a new object of class '<em>CIM Power Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Power Source</em>'.
	 * @generated
	 */
	CIM_PowerSource createCIM_PowerSource();

	/**
	 * Returns a new object of class '<em>CIM Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Power Supply</em>'.
	 * @generated
	 */
	CIM_PowerSupply createCIM_PowerSupply();

	/**
	 * Returns a new object of class '<em>CIM Print Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Print Queue</em>'.
	 * @generated
	 */
	CIM_PrintQueue createCIM_PrintQueue();

	/**
	 * Returns a new object of class '<em>CIM Printer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Printer</em>'.
	 * @generated
	 */
	CIM_Printer createCIM_Printer();

	/**
	 * Returns a new object of class '<em>CIM Printer Servicing Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Printer Servicing Job</em>'.
	 * @generated
	 */
	CIM_PrinterServicingJob createCIM_PrinterServicingJob();

	/**
	 * Returns a new object of class '<em>CIM Printer Servicing Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Printer Servicing Queue</em>'.
	 * @generated
	 */
	CIM_PrinterServicingQueue createCIM_PrinterServicingQueue();

	/**
	 * Returns a new object of class '<em>CIM Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Processor</em>'.
	 * @generated
	 */
	CIM_Processor createCIM_Processor();

	/**
	 * Returns a new object of class '<em>CIM Protected Space Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protected Space Extent</em>'.
	 * @generated
	 */
	CIM_ProtectedSpaceExtent createCIM_ProtectedSpaceExtent();

	/**
	 * Returns a new object of class '<em>CIM Protocol Controller For Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Controller For Port</em>'.
	 * @generated
	 */
	CIM_ProtocolControllerForPort createCIM_ProtocolControllerForPort();

	/**
	 * Returns a new object of class '<em>CIM Protocol Controller For Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Controller For Unit</em>'.
	 * @generated
	 */
	CIM_ProtocolControllerForUnit createCIM_ProtocolControllerForUnit();

	/**
	 * Returns a new object of class '<em>CIM Protocol Controller For Unit View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Controller For Unit View</em>'.
	 * @generated
	 */
	CIM_ProtocolControllerForUnitView createCIM_ProtocolControllerForUnitView();

	/**
	 * Returns a new object of class '<em>CIM Queue For Print Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Queue For Print Service</em>'.
	 * @generated
	 */
	CIM_QueueForPrintService createCIM_QueueForPrintService();

	/**
	 * Returns a new object of class '<em>CIM Queue Forwards To Print SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Queue Forwards To Print SAP</em>'.
	 * @generated
	 */
	CIM_QueueForwardsToPrintSAP createCIM_QueueForwardsToPrintSAP();

	/**
	 * Returns a new object of class '<em>CIM Realizes Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Realizes Extent</em>'.
	 * @generated
	 */
	CIM_RealizesExtent createCIM_RealizesExtent();

	/**
	 * Returns a new object of class '<em>CIM Realizes PExtent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Realizes PExtent</em>'.
	 * @generated
	 */
	CIM_RealizesPExtent createCIM_RealizesPExtent();

	/**
	 * Returns a new object of class '<em>CIM Refrigeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Refrigeration</em>'.
	 * @generated
	 */
	CIM_Refrigeration createCIM_Refrigeration();

	/**
	 * Returns a new object of class '<em>CIM SASPHY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SASPHY</em>'.
	 * @generated
	 */
	CIM_SASPHY createCIM_SASPHY();

	/**
	 * Returns a new object of class '<em>CIM SAS Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SAS Port</em>'.
	 * @generated
	 */
	CIM_SASPort createCIM_SASPort();

	/**
	 * Returns a new object of class '<em>CIM SB Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SB Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_SBProtocolEndpoint createCIM_SBProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM SCSI Arbitrary Logical Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Arbitrary Logical Unit</em>'.
	 * @generated
	 */
	CIM_SCSIArbitraryLogicalUnit createCIM_SCSIArbitraryLogicalUnit();

	/**
	 * Returns a new object of class '<em>CIM SCSI Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Controller</em>'.
	 * @generated
	 */
	CIM_SCSIController createCIM_SCSIController();

	/**
	 * Returns a new object of class '<em>CIM SCSI Initiator Target Logical Unit Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Initiator Target Logical Unit Path</em>'.
	 * @generated
	 */
	CIM_SCSIInitiatorTargetLogicalUnitPath createCIM_SCSIInitiatorTargetLogicalUnitPath();

	/**
	 * Returns a new object of class '<em>CIM SCSI Path Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Path Configuration Service</em>'.
	 * @generated
	 */
	CIM_SCSIPathConfigurationService createCIM_SCSIPathConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM SCSI Protocol Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Protocol Controller</em>'.
	 * @generated
	 */
	CIM_SCSIProtocolController createCIM_SCSIProtocolController();

	/**
	 * Returns a new object of class '<em>CIM SSA Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SSA Controller</em>'.
	 * @generated
	 */
	CIM_SSAController createCIM_SSAController();

	/**
	 * Returns a new object of class '<em>CIM Scanner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Scanner</em>'.
	 * @generated
	 */
	CIM_Scanner createCIM_Scanner();

	/**
	 * Returns a new object of class '<em>CIM Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Sensor</em>'.
	 * @generated
	 */
	CIM_Sensor createCIM_Sensor();

	/**
	 * Returns a new object of class '<em>CIM Serial Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Serial Controller</em>'.
	 * @generated
	 */
	CIM_SerialController createCIM_SerialController();

	/**
	 * Returns a new object of class '<em>CIM Shared Device Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Shared Device Management Service</em>'.
	 * @generated
	 */
	CIM_SharedDeviceManagementService createCIM_SharedDeviceManagementService();

	/**
	 * Returns a new object of class '<em>CIM Sharing Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Sharing Dependency</em>'.
	 * @generated
	 */
	CIM_SharingDependency createCIM_SharingDependency();

	/**
	 * Returns a new object of class '<em>CIM Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Snapshot</em>'.
	 * @generated
	 */
	CIM_Snapshot createCIM_Snapshot();

	/**
	 * Returns a new object of class '<em>CIM Snapshot Of Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Snapshot Of Extent</em>'.
	 * @generated
	 */
	CIM_SnapshotOfExtent createCIM_SnapshotOfExtent();

	/**
	 * Returns a new object of class '<em>CIM Storage Defect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Defect</em>'.
	 * @generated
	 */
	CIM_StorageDefect createCIM_StorageDefect();

	/**
	 * Returns a new object of class '<em>CIM Storage Erasure Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Erasure Service</em>'.
	 * @generated
	 */
	CIM_StorageErasureService createCIM_StorageErasureService();

	/**
	 * Returns a new object of class '<em>CIM Storage Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Library</em>'.
	 * @generated
	 */
	CIM_StorageLibrary createCIM_StorageLibrary();

	/**
	 * Returns a new object of class '<em>CIM Storage Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Pool</em>'.
	 * @generated
	 */
	CIM_StoragePool createCIM_StoragePool();

	/**
	 * Returns a new object of class '<em>CIM Storage Pool Diagnostic Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Pool Diagnostic Test</em>'.
	 * @generated
	 */
	CIM_StoragePoolDiagnosticTest createCIM_StoragePoolDiagnosticTest();

	/**
	 * Returns a new object of class '<em>CIM Storage Protection Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Protection Service</em>'.
	 * @generated
	 */
	CIM_StorageProtectionService createCIM_StorageProtectionService();

	/**
	 * Returns a new object of class '<em>CIM Storage Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Volume</em>'.
	 * @generated
	 */
	CIM_StorageVolume createCIM_StorageVolume();

	/**
	 * Returns a new object of class '<em>CIM Supplies Power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Supplies Power</em>'.
	 * @generated
	 */
	CIM_SuppliesPower createCIM_SuppliesPower();

	/**
	 * Returns a new object of class '<em>CIM Tape Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tape Drive</em>'.
	 * @generated
	 */
	CIM_TapeDrive createCIM_TapeDrive();

	/**
	 * Returns a new object of class '<em>CIM Tape Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tape Partition</em>'.
	 * @generated
	 */
	CIM_TapePartition createCIM_TapePartition();

	/**
	 * Returns a new object of class '<em>CIM Token Ring Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Token Ring Adapter</em>'.
	 * @generated
	 */
	CIM_TokenRingAdapter createCIM_TokenRingAdapter();

	/**
	 * Returns a new object of class '<em>CIM Token Ring Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Token Ring Port</em>'.
	 * @generated
	 */
	CIM_TokenRingPort createCIM_TokenRingPort();

	/**
	 * Returns a new object of class '<em>CIM USB Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Controller</em>'.
	 * @generated
	 */
	CIM_USBController createCIM_USBController();

	/**
	 * Returns a new object of class '<em>CIM USB Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Device</em>'.
	 * @generated
	 */
	CIM_USBDevice createCIM_USBDevice();

	/**
	 * Returns a new object of class '<em>CIM USB Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Hub</em>'.
	 * @generated
	 */
	CIM_USBHub createCIM_USBHub();

	/**
	 * Returns a new object of class '<em>CIM USB Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Port</em>'.
	 * @generated
	 */
	CIM_USBPort createCIM_USBPort();

	/**
	 * Returns a new object of class '<em>CIM USB Port On Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Port On Hub</em>'.
	 * @generated
	 */
	CIM_USBPortOnHub createCIM_USBPortOnHub();

	/**
	 * Returns a new object of class '<em>CIM Uninterruptible Power Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Uninterruptible Power Supply</em>'.
	 * @generated
	 */
	CIM_UninterruptiblePowerSupply createCIM_UninterruptiblePowerSupply();

	/**
	 * Returns a new object of class '<em>CIM Video Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video Controller</em>'.
	 * @generated
	 */
	CIM_VideoController createCIM_VideoController();

	/**
	 * Returns a new object of class '<em>CIM Video Head</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video Head</em>'.
	 * @generated
	 */
	CIM_VideoHead createCIM_VideoHead();

	/**
	 * Returns a new object of class '<em>CIM Video Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Video Setting</em>'.
	 * @generated
	 */
	CIM_VideoSetting createCIM_VideoSetting();

	/**
	 * Returns a new object of class '<em>CIM Volatile Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Volatile Storage</em>'.
	 * @generated
	 */
	CIM_VolatileStorage createCIM_VolatileStorage();

	/**
	 * Returns a new object of class '<em>CIM Volume Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Volume Set</em>'.
	 * @generated
	 */
	CIM_VolumeSet createCIM_VolumeSet();

	/**
	 * Returns a new object of class '<em>CIM WBEM Server Device Registration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WBEM Server Device Registration Service</em>'.
	 * @generated
	 */
	CIM_WBEMServerDeviceRegistrationService createCIM_WBEMServerDeviceRegistrationService();

	/**
	 * Returns a new object of class '<em>CIM WORM Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM WORM Drive</em>'.
	 * @generated
	 */
	CIM_WORMDrive createCIM_WORMDrive();

	/**
	 * Returns a new object of class '<em>CIM Watchdog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Watchdog</em>'.
	 * @generated
	 */
	CIM_Watchdog createCIM_Watchdog();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Port</em>'.
	 * @generated
	 */
	CIM_WiFiPort createCIM_WiFiPort();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Radio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Radio</em>'.
	 * @generated
	 */
	CIM_WiFiRadio createCIM_WiFiRadio();

	/**
	 * Returns a new object of class '<em>CIM IPsec Policy For System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec Policy For System</em>'.
	 * @generated
	 */
	CIM_IPsecPolicyForSystem createCIM_IPsecPolicyForSystem();

	/**
	 * Returns a new object of class '<em>CIM Peer Gateway For Preconfigured Tunnel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Peer Gateway For Preconfigured Tunnel</em>'.
	 * @generated
	 */
	CIM_PeerGatewayForPreconfiguredTunnel createCIM_PeerGatewayForPreconfiguredTunnel();

	/**
	 * Returns a new object of class '<em>CIM Peer Gateway For Tunnel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Peer Gateway For Tunnel</em>'.
	 * @generated
	 */
	CIM_PeerGatewayForTunnel createCIM_PeerGatewayForTunnel();

	/**
	 * Returns a new object of class '<em>CIM CIMXML Communication Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CIMXML Communication Mechanism</em>'.
	 * @generated
	 */
	CIM_CIMXMLCommunicationMechanism createCIM_CIMXMLCommunicationMechanism();

	/**
	 * Returns a new object of class '<em>CIM Identification Of Managed System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Identification Of Managed System</em>'.
	 * @generated
	 */
	CIM_IdentificationOfManagedSystem createCIM_IdentificationOfManagedSystem();

	/**
	 * Returns a new object of class '<em>CIM Object Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Object Manager</em>'.
	 * @generated
	 */
	CIM_ObjectManager createCIM_ObjectManager();

	/**
	 * Returns a new object of class '<em>CIM Object Manager Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Object Manager Adapter</em>'.
	 * @generated
	 */
	CIM_ObjectManagerAdapter createCIM_ObjectManagerAdapter();

	/**
	 * Returns a new object of class '<em>CIM Protocol Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Adapter</em>'.
	 * @generated
	 */
	CIM_ProtocolAdapter createCIM_ProtocolAdapter();

	/**
	 * Returns a new object of class '<em>CIM ATA Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ATA Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_ATAProtocolEndpoint createCIM_ATAProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Associated Next Hop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Next Hop</em>'.
	 * @generated
	 */
	CIM_AssociatedNextHop createCIM_AssociatedNextHop();

	/**
	 * Returns a new object of class '<em>CIM Average Rate Meter Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Average Rate Meter Service</em>'.
	 * @generated
	 */
	CIM_AverageRateMeterService createCIM_AverageRateMeterService();

	/**
	 * Returns a new object of class '<em>CIM BGP Attributes For Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Attributes For Route</em>'.
	 * @generated
	 */
	CIM_BGPAttributesForRoute createCIM_BGPAttributesForRoute();

	/**
	 * Returns a new object of class '<em>CIM BGP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_BGPProtocolEndpoint createCIM_BGPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM BGP Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Service</em>'.
	 * @generated
	 */
	CIM_BGPService createCIM_BGPService();

	/**
	 * Returns a new object of class '<em>CIM BGP Service Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Service Attributes</em>'.
	 * @generated
	 */
	CIM_BGPServiceAttributes createCIM_BGPServiceAttributes();

	/**
	 * Returns a new object of class '<em>CIM BGP Service Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Service Statistics</em>'.
	 * @generated
	 */
	CIM_BGPServiceStatistics createCIM_BGPServiceStatistics();

	/**
	 * Returns a new object of class '<em>CIM CLP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CLP Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_CLPProtocolEndpoint createCIM_CLPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Calculated Routes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Calculated Routes</em>'.
	 * @generated
	 */
	CIM_CalculatedRoutes createCIM_CalculatedRoutes();

	/**
	 * Returns a new object of class '<em>CIM Calculates Among</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Calculates Among</em>'.
	 * @generated
	 */
	CIM_CalculatesAmong createCIM_CalculatesAmong();

	/**
	 * Returns a new object of class '<em>CIM Calculation Based On Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Calculation Based On Queue</em>'.
	 * @generated
	 */
	CIM_CalculationBasedOnQueue createCIM_CalculationBasedOnQueue();

	/**
	 * Returns a new object of class '<em>CIM Calculation Service For Dropper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Calculation Service For Dropper</em>'.
	 * @generated
	 */
	CIM_CalculationServiceForDropper createCIM_CalculationServiceForDropper();

	/**
	 * Returns a new object of class '<em>CIM Classifier Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Classifier Service</em>'.
	 * @generated
	 */
	CIM_ClassifierService createCIM_ClassifierService();

	/**
	 * Returns a new object of class '<em>CIM Conditioning Service On Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Conditioning Service On Endpoint</em>'.
	 * @generated
	 */
	CIM_ConditioningServiceOnEndpoint createCIM_ConditioningServiceOnEndpoint();

	/**
	 * Returns a new object of class '<em>CIM DHCP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DHCP Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_DHCPProtocolEndpoint createCIM_DHCPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM DNS Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DNS Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_DNSProtocolEndpoint createCIM_DNSProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM DSCP Marker Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DSCP Marker Service</em>'.
	 * @generated
	 */
	CIM_DSCPMarkerService createCIM_DSCPMarkerService();

	/**
	 * Returns a new object of class '<em>CIM Diff Serv Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diff Serv Service</em>'.
	 * @generated
	 */
	CIM_DiffServService createCIM_DiffServService();

	/**
	 * Returns a new object of class '<em>CIM EF Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM EF Service</em>'.
	 * @generated
	 */
	CIM_EFService createCIM_EFService();

	/**
	 * Returns a new object of class '<em>CIM EGP Route Calc Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM EGP Route Calc Dependency</em>'.
	 * @generated
	 */
	CIM_EGPRouteCalcDependency createCIM_EGPRouteCalcDependency();

	/**
	 * Returns a new object of class '<em>CIM EWMA Meter Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM EWMA Meter Service</em>'.
	 * @generated
	 */
	CIM_EWMAMeterService createCIM_EWMAMeterService();

	/**
	 * Returns a new object of class '<em>CIM Egress Conditioning Service On Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Egress Conditioning Service On Endpoint</em>'.
	 * @generated
	 */
	CIM_EgressConditioningServiceOnEndpoint createCIM_EgressConditioningServiceOnEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Element In Scheduling Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Element In Scheduling Service</em>'.
	 * @generated
	 */
	CIM_ElementInSchedulingService createCIM_ElementInSchedulingService();

	/**
	 * Returns a new object of class '<em>CIM Endpoint For IP Network Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Endpoint For IP Network Connection</em>'.
	 * @generated
	 */
	CIM_EndpointForIPNetworkConnection createCIM_EndpointForIPNetworkConnection();

	/**
	 * Returns a new object of class '<em>CIM Endpoint Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Endpoint Identity</em>'.
	 * @generated
	 */
	CIM_EndpointIdentity createCIM_EndpointIdentity();

	/**
	 * Returns a new object of class '<em>CIM Endpoint Of Network Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Endpoint Of Network Pipe</em>'.
	 * @generated
	 */
	CIM_EndpointOfNetworkPipe createCIM_EndpointOfNetworkPipe();

	/**
	 * Returns a new object of class '<em>CIM Flow Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Flow Service</em>'.
	 * @generated
	 */
	CIM_FlowService createCIM_FlowService();

	/**
	 * Returns a new object of class '<em>CIM Forwarding Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Forwarding Service</em>'.
	 * @generated
	 */
	CIM_ForwardingService createCIM_ForwardingService();

	/**
	 * Returns a new object of class '<em>CIM Forwards Among</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Forwards Among</em>'.
	 * @generated
	 */
	CIM_ForwardsAmong createCIM_ForwardsAmong();

	/**
	 * Returns a new object of class '<em>CIM Hdr8021 PService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hdr8021 PService</em>'.
	 * @generated
	 */
	CIM_Hdr8021PService createCIM_Hdr8021PService();

	/**
	 * Returns a new object of class '<em>CIM Head Tail Drop Queue Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Head Tail Drop Queue Binding</em>'.
	 * @generated
	 */
	CIM_HeadTailDropQueueBinding createCIM_HeadTailDropQueueBinding();

	/**
	 * Returns a new object of class '<em>CIM Hosted Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Route</em>'.
	 * @generated
	 */
	CIM_HostedRoute createCIM_HostedRoute();

	/**
	 * Returns a new object of class '<em>CIM IP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_IPProtocolEndpoint createCIM_IPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM IPX Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPX Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_IPXProtocolEndpoint createCIM_IPXProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM In Logical Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM In Logical Network</em>'.
	 * @generated
	 */
	CIM_InLogicalNetwork createCIM_InLogicalNetwork();

	/**
	 * Returns a new object of class '<em>CIM Ingress Conditioning Service On Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ingress Conditioning Service On Endpoint</em>'.
	 * @generated
	 */
	CIM_IngressConditioningServiceOnEndpoint createCIM_IngressConditioningServiceOnEndpoint();

	/**
	 * Returns a new object of class '<em>CIM LAN Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM LAN Endpoint</em>'.
	 * @generated
	 */
	CIM_LANEndpoint createCIM_LANEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Logical Network Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Network Service</em>'.
	 * @generated
	 */
	CIM_LogicalNetworkService createCIM_LogicalNetworkService();

	/**
	 * Returns a new object of class '<em>CIM Network Port Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Port Configuration Service</em>'.
	 * @generated
	 */
	CIM_NetworkPortConfigurationService createCIM_NetworkPortConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM Next Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Next Scheduler</em>'.
	 * @generated
	 */
	CIM_NextScheduler createCIM_NextScheduler();

	/**
	 * Returns a new object of class '<em>CIM Non Work Conserving Scheduling Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Non Work Conserving Scheduling Service</em>'.
	 * @generated
	 */
	CIM_NonWorkConservingSchedulingService createCIM_NonWorkConservingSchedulingService();

	/**
	 * Returns a new object of class '<em>CIM OSPF Protocol Endpoint Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Protocol Endpoint Base</em>'.
	 * @generated
	 */
	CIM_OSPFProtocolEndpointBase createCIM_OSPFProtocolEndpointBase();

	/**
	 * Returns a new object of class '<em>CIM OSPF Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Service</em>'.
	 * @generated
	 */
	CIM_OSPFService createCIM_OSPFService();

	/**
	 * Returns a new object of class '<em>CIM OSPF Service Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Service Configuration</em>'.
	 * @generated
	 */
	CIM_OSPFServiceConfiguration createCIM_OSPFServiceConfiguration();

	/**
	 * Returns a new object of class '<em>CIM OSPF Virtual Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Virtual Interface</em>'.
	 * @generated
	 */
	CIM_OSPFVirtualInterface createCIM_OSPFVirtualInterface();

	/**
	 * Returns a new object of class '<em>CIM Precedence Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Precedence Service</em>'.
	 * @generated
	 */
	CIM_PrecedenceService createCIM_PrecedenceService();

	/**
	 * Returns a new object of class '<em>CIM Qo SConditioning Sub Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Qo SConditioning Sub Service</em>'.
	 * @generated
	 */
	CIM_QoSConditioningSubService createCIM_QoSConditioningSubService();

	/**
	 * Returns a new object of class '<em>CIM Queue Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Queue Allocation</em>'.
	 * @generated
	 */
	CIM_QueueAllocation createCIM_QueueAllocation();

	/**
	 * Returns a new object of class '<em>CIM Queue Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Queue Hierarchy</em>'.
	 * @generated
	 */
	CIM_QueueHierarchy createCIM_QueueHierarchy();

	/**
	 * Returns a new object of class '<em>CIM Queue To Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Queue To Schedule</em>'.
	 * @generated
	 */
	CIM_QueueToSchedule createCIM_QueueToSchedule();

	/**
	 * Returns a new object of class '<em>CIM Reflector Client Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Reflector Client Service</em>'.
	 * @generated
	 */
	CIM_ReflectorClientService createCIM_ReflectorClientService();

	/**
	 * Returns a new object of class '<em>CIM Reflector Non Client Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Reflector Non Client Service</em>'.
	 * @generated
	 */
	CIM_ReflectorNonClientService createCIM_ReflectorNonClientService();

	/**
	 * Returns a new object of class '<em>CIM Reflector Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Reflector Service</em>'.
	 * @generated
	 */
	CIM_ReflectorService createCIM_ReflectorService();

	/**
	 * Returns a new object of class '<em>CIM Remote Access Available To Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remote Access Available To Element</em>'.
	 * @generated
	 */
	CIM_RemoteAccessAvailableToElement createCIM_RemoteAccessAvailableToElement();

	/**
	 * Returns a new object of class '<em>CIM Route Forwarded By Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Route Forwarded By Service</em>'.
	 * @generated
	 */
	CIM_RouteForwardedByService createCIM_RouteForwardedByService();

	/**
	 * Returns a new object of class '<em>CIM Route Uses Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Route Uses Endpoint</em>'.
	 * @generated
	 */
	CIM_RouteUsesEndpoint createCIM_RouteUsesEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Routes BGP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Routes BGP</em>'.
	 * @generated
	 */
	CIM_RoutesBGP createCIM_RoutesBGP();

	/**
	 * Returns a new object of class '<em>CIM SCSI Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_SCSIProtocolEndpoint createCIM_SCSIProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM SSH Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SSH Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_SSHProtocolEndpoint createCIM_SSHProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Scheduler Used</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Scheduler Used</em>'.
	 * @generated
	 */
	CIM_SchedulerUsed createCIM_SchedulerUsed();

	/**
	 * Returns a new object of class '<em>CIM Security Association Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Security Association Endpoint</em>'.
	 * @generated
	 */
	CIM_SecurityAssociationEndpoint createCIM_SecurityAssociationEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Source Routing Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Source Routing Service</em>'.
	 * @generated
	 */
	CIM_SourceRoutingService createCIM_SourceRoutingService();

	/**
	 * Returns a new object of class '<em>CIM Spanning Tree Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Spanning Tree Service</em>'.
	 * @generated
	 */
	CIM_SpanningTreeService createCIM_SpanningTreeService();

	/**
	 * Returns a new object of class '<em>CIM Specific802dot1 QVLAN Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Specific802dot1 QVLAN Service</em>'.
	 * @generated
	 */
	CIM_Specific802dot1QVLANService createCIM_Specific802dot1QVLANService();

	/**
	 * Returns a new object of class '<em>CIM Switch Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port</em>'.
	 * @generated
	 */
	CIM_SwitchPort createCIM_SwitchPort();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Dynamic Forwarding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Dynamic Forwarding</em>'.
	 * @generated
	 */
	CIM_SwitchPortDynamicForwarding createCIM_SwitchPortDynamicForwarding();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Pair</em>'.
	 * @generated
	 */
	CIM_SwitchPortPair createCIM_SwitchPortPair();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Source Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Source Routing</em>'.
	 * @generated
	 */
	CIM_SwitchPortSourceRouting createCIM_SwitchPortSourceRouting();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Spanning Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Spanning Tree</em>'.
	 * @generated
	 */
	CIM_SwitchPortSpanningTree createCIM_SwitchPortSpanningTree();

	/**
	 * Returns a new object of class '<em>CIM Switch Port Static Forwarding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Port Static Forwarding</em>'.
	 * @generated
	 */
	CIM_SwitchPortStaticForwarding createCIM_SwitchPortStaticForwarding();

	/**
	 * Returns a new object of class '<em>CIM Switch Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Service</em>'.
	 * @generated
	 */
	CIM_SwitchService createCIM_SwitchService();

	/**
	 * Returns a new object of class '<em>CIM Switch Service Source Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Service Source Routing</em>'.
	 * @generated
	 */
	CIM_SwitchServiceSourceRouting createCIM_SwitchServiceSourceRouting();

	/**
	 * Returns a new object of class '<em>CIM Switch Service Spanning Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Service Spanning Tree</em>'.
	 * @generated
	 */
	CIM_SwitchServiceSpanningTree createCIM_SwitchServiceSpanningTree();

	/**
	 * Returns a new object of class '<em>CIM Switch Service VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Service VLAN</em>'.
	 * @generated
	 */
	CIM_SwitchServiceVLAN createCIM_SwitchServiceVLAN();

	/**
	 * Returns a new object of class '<em>CIM Switch Virtual Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Virtual Interface</em>'.
	 * @generated
	 */
	CIM_SwitchVirtualInterface createCIM_SwitchVirtualInterface();

	/**
	 * Returns a new object of class '<em>CIM Switches Among</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switches Among</em>'.
	 * @generated
	 */
	CIM_SwitchesAmong createCIM_SwitchesAmong();

	/**
	 * Returns a new object of class '<em>CIM TCP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM TCP Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_TCPProtocolEndpoint createCIM_TCPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Telnet Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Telnet Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_TelnetProtocolEndpoint createCIM_TelnetProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Transparent Bridging Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Transparent Bridging Service</em>'.
	 * @generated
	 */
	CIM_TransparentBridgingService createCIM_TransparentBridgingService();

	/**
	 * Returns a new object of class '<em>CIM Transparent Bridging Static Forwarding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Transparent Bridging Static Forwarding</em>'.
	 * @generated
	 */
	CIM_TransparentBridgingStaticForwarding createCIM_TransparentBridgingStaticForwarding();

	/**
	 * Returns a new object of class '<em>CIM Trap Source For SNMP Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Trap Source For SNMP Service</em>'.
	 * @generated
	 */
	CIM_TrapSourceForSNMPService createCIM_TrapSourceForSNMPService();

	/**
	 * Returns a new object of class '<em>CIM UDP Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM UDP Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_UDPProtocolEndpoint createCIM_UDPProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM USB Redirection Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Redirection Service</em>'.
	 * @generated
	 */
	CIM_USBRedirectionService createCIM_USBRedirectionService();

	/**
	 * Returns a new object of class '<em>CIM VLAN Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VLAN Endpoint</em>'.
	 * @generated
	 */
	CIM_VLANEndpoint createCIM_VLANEndpoint();

	/**
	 * Returns a new object of class '<em>CIM VLAN For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VLAN For</em>'.
	 * @generated
	 */
	CIM_VLANFor createCIM_VLANFor();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_iSCSIProtocolEndpoint createCIM_iSCSIProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Allocated Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocated Resource</em>'.
	 * @generated
	 */
	CIM_AllocatedResource createCIM_AllocatedResource();

	/**
	 * Returns a new object of class '<em>CIM Available Diagnostic Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Available Diagnostic Service</em>'.
	 * @generated
	 */
	CIM_AvailableDiagnosticService createCIM_AvailableDiagnosticService();

	/**
	 * Returns a new object of class '<em>CIM Boot OS From FS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Boot OS From FS</em>'.
	 * @generated
	 */
	CIM_BootOSFromFS createCIM_BootOSFromFS();

	/**
	 * Returns a new object of class '<em>CIM Computer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System</em>'.
	 * @generated
	 */
	CIM_ComputerSystem createCIM_ComputerSystem();

	/**
	 * Returns a new object of class '<em>CIM Computer System Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System Package</em>'.
	 * @generated
	 */
	CIM_ComputerSystemPackage createCIM_ComputerSystemPackage();

	/**
	 * Returns a new object of class '<em>CIM DMA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DMA</em>'.
	 * @generated
	 */
	CIM_DMA createCIM_DMA();

	/**
	 * Returns a new object of class '<em>CIM Device Accessed By File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Accessed By File</em>'.
	 * @generated
	 */
	CIM_DeviceAccessedByFile createCIM_DeviceAccessedByFile();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Log</em>'.
	 * @generated
	 */
	CIM_DiagnosticLog createCIM_DiagnosticLog();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Result For Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Result For Test</em>'.
	 * @generated
	 */
	CIM_DiagnosticResultForTest createCIM_DiagnosticResultForTest();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Setting For Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Setting For Test</em>'.
	 * @generated
	 */
	CIM_DiagnosticSettingForTest createCIM_DiagnosticSettingForTest();

	/**
	 * Returns a new object of class '<em>CIM Diagnostic Test For MSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostic Test For MSE</em>'.
	 * @generated
	 */
	CIM_DiagnosticTestForMSE createCIM_DiagnosticTestForMSE();

	/**
	 * Returns a new object of class '<em>CIM Diagnostics Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diagnostics Log</em>'.
	 * @generated
	 */
	CIM_DiagnosticsLog createCIM_DiagnosticsLog();

	/**
	 * Returns a new object of class '<em>CIM Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Export</em>'.
	 * @generated
	 */
	CIM_Export createCIM_Export();

	/**
	 * Returns a new object of class '<em>CIM FS Quota Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FS Quota Management Service</em>'.
	 * @generated
	 */
	CIM_FSQuotaManagementService createCIM_FSQuotaManagementService();

	/**
	 * Returns a new object of class '<em>CIM File Share Setting Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Share Setting Data</em>'.
	 * @generated
	 */
	CIM_FileShareSettingData createCIM_FileShareSettingData();

	/**
	 * Returns a new object of class '<em>CIM File Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Storage</em>'.
	 * @generated
	 */
	CIM_FileStorage createCIM_FileStorage();

	/**
	 * Returns a new object of class '<em>CIM File System Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File System Configuration Service</em>'.
	 * @generated
	 */
	CIM_FileSystemConfigurationService createCIM_FileSystemConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM Hosted File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted File System</em>'.
	 * @generated
	 */
	CIM_HostedFileSystem createCIM_HostedFileSystem();

	/**
	 * Returns a new object of class '<em>CIM Hosted Job Destination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Job Destination</em>'.
	 * @generated
	 */
	CIM_HostedJobDestination createCIM_HostedJobDestination();

	/**
	 * Returns a new object of class '<em>CIM Hosted Share</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Share</em>'.
	 * @generated
	 */
	CIM_HostedShare createCIM_HostedShare();

	/**
	 * Returns a new object of class '<em>CIM IRQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IRQ</em>'.
	 * @generated
	 */
	CIM_IRQ createCIM_IRQ();

	/**
	 * Returns a new object of class '<em>CIM Installed OS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Installed OS</em>'.
	 * @generated
	 */
	CIM_InstalledOS createCIM_InstalledOS();

	/**
	 * Returns a new object of class '<em>CIM Last Applied Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Last Applied Snapshot</em>'.
	 * @generated
	 */
	CIM_LastAppliedSnapshot createCIM_LastAppliedSnapshot();

	/**
	 * Returns a new object of class '<em>CIM Local Access Available To FS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Local Access Available To FS</em>'.
	 * @generated
	 */
	CIM_LocalAccessAvailableToFS createCIM_LocalAccessAvailableToFS();

	/**
	 * Returns a new object of class '<em>CIM Log In Data File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Log In Data File</em>'.
	 * @generated
	 */
	CIM_LogInDataFile createCIM_LogInDataFile();

	/**
	 * Returns a new object of class '<em>CIM Log In Device File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Log In Device File</em>'.
	 * @generated
	 */
	CIM_LogInDeviceFile createCIM_LogInDeviceFile();

	/**
	 * Returns a new object of class '<em>CIM Log In Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Log In Storage</em>'.
	 * @generated
	 */
	CIM_LogInStorage createCIM_LogInStorage();

	/**
	 * Returns a new object of class '<em>CIM Memory Mapped IO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Mapped IO</em>'.
	 * @generated
	 */
	CIM_MemoryMappedIO createCIM_MemoryMappedIO();

	/**
	 * Returns a new object of class '<em>CIM Memory Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Resource</em>'.
	 * @generated
	 */
	CIM_MemoryResource createCIM_MemoryResource();

	/**
	 * Returns a new object of class '<em>CIM NFS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM NFS</em>'.
	 * @generated
	 */
	CIM_NFS createCIM_NFS();

	/**
	 * Returns a new object of class '<em>CIM NFS Share</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM NFS Share</em>'.
	 * @generated
	 */
	CIM_NFSShare createCIM_NFSShare();

	/**
	 * Returns a new object of class '<em>CIM OS Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OS Process</em>'.
	 * @generated
	 */
	CIM_OSProcess createCIM_OSProcess();

	/**
	 * Returns a new object of class '<em>CIM Operation Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Operation Log</em>'.
	 * @generated
	 */
	CIM_OperationLog createCIM_OperationLog();

	/**
	 * Returns a new object of class '<em>CIM Port Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Port Resource</em>'.
	 * @generated
	 */
	CIM_PortResource createCIM_PortResource();

	/**
	 * Returns a new object of class '<em>CIM Process Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Process Thread</em>'.
	 * @generated
	 */
	CIM_ProcessThread createCIM_ProcessThread();

	/**
	 * Returns a new object of class '<em>CIM Resides On Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Resides On Extent</em>'.
	 * @generated
	 */
	CIM_ResidesOnExtent createCIM_ResidesOnExtent();

	/**
	 * Returns a new object of class '<em>CIM Resource Of System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Resource Of System</em>'.
	 * @generated
	 */
	CIM_ResourceOfSystem createCIM_ResourceOfSystem();

	/**
	 * Returns a new object of class '<em>CIM Running OS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Running OS</em>'.
	 * @generated
	 */
	CIM_RunningOS createCIM_RunningOS();

	/**
	 * Returns a new object of class '<em>CIM SAP Available For File Share</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SAP Available For File Share</em>'.
	 * @generated
	 */
	CIM_SAPAvailableForFileShare createCIM_SAPAvailableForFileShare();

	/**
	 * Returns a new object of class '<em>CIM Snapshot Of Virtual System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Snapshot Of Virtual System</em>'.
	 * @generated
	 */
	CIM_SnapshotOfVirtualSystem createCIM_SnapshotOfVirtualSystem();

	/**
	 * Returns a new object of class '<em>CIM Unitary Computer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unitary Computer System</em>'.
	 * @generated
	 */
	CIM_UnitaryComputerSystem createCIM_UnitaryComputerSystem();

	/**
	 * Returns a new object of class '<em>CIM Virtual Computer System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual Computer System</em>'.
	 * @generated
	 */
	CIM_VirtualComputerSystem createCIM_VirtualComputerSystem();

	/**
	 * Returns a new object of class '<em>CIM Account Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account Management Service</em>'.
	 * @generated
	 */
	CIM_AccountManagementService createCIM_AccountManagementService();

	/**
	 * Returns a new object of class '<em>CIM Account On System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Account On System</em>'.
	 * @generated
	 */
	CIM_AccountOnSystem createCIM_AccountOnSystem();

	/**
	 * Returns a new object of class '<em>CIM Authentication Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authentication Service</em>'.
	 * @generated
	 */
	CIM_AuthenticationService createCIM_AuthenticationService();

	/**
	 * Returns a new object of class '<em>CIM Authorization Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authorization Service</em>'.
	 * @generated
	 */
	CIM_AuthorizationService createCIM_AuthorizationService();

	/**
	 * Returns a new object of class '<em>CIM Authorized Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authorized Use</em>'.
	 * @generated
	 */
	CIM_AuthorizedUse createCIM_AuthorizedUse();

	/**
	 * Returns a new object of class '<em>CIM Collection In System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collection In System</em>'.
	 * @generated
	 */
	CIM_CollectionInSystem createCIM_CollectionInSystem();

	/**
	 * Returns a new object of class '<em>CIM Credential Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Credential Management Service</em>'.
	 * @generated
	 */
	CIM_CredentialManagementService createCIM_CredentialManagementService();

	/**
	 * Returns a new object of class '<em>CIM Hosted ACI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted ACI</em>'.
	 * @generated
	 */
	CIM_HostedACI createCIM_HostedACI();

	/**
	 * Returns a new object of class '<em>CIM Hosted Authentication Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Authentication Requirement</em>'.
	 * @generated
	 */
	CIM_HostedAuthenticationRequirement createCIM_HostedAuthenticationRequirement();

	/**
	 * Returns a new object of class '<em>CIM Identity Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Identity Management Service</em>'.
	 * @generated
	 */
	CIM_IdentityManagementService createCIM_IdentityManagementService();

	/**
	 * Returns a new object of class '<em>CIM Kerberos Key Distribution Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Kerberos Key Distribution Center</em>'.
	 * @generated
	 */
	CIM_KerberosKeyDistributionCenter createCIM_KerberosKeyDistributionCenter();

	/**
	 * Returns a new object of class '<em>CIM Key Based Credential Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Key Based Credential Management Service</em>'.
	 * @generated
	 */
	CIM_KeyBasedCredentialManagementService createCIM_KeyBasedCredentialManagementService();

	/**
	 * Returns a new object of class '<em>CIM Local Credential Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Local Credential Management Service</em>'.
	 * @generated
	 */
	CIM_LocalCredentialManagementService createCIM_LocalCredentialManagementService();

	/**
	 * Returns a new object of class '<em>CIM Managed Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Managed Credential</em>'.
	 * @generated
	 */
	CIM_ManagedCredential createCIM_ManagedCredential();

	/**
	 * Returns a new object of class '<em>CIM Manages Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Manages Account</em>'.
	 * @generated
	 */
	CIM_ManagesAccount createCIM_ManagesAccount();

	/**
	 * Returns a new object of class '<em>CIM Notary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Notary</em>'.
	 * @generated
	 */
	CIM_Notary createCIM_Notary();

	/**
	 * Returns a new object of class '<em>CIM Notary Verifies Biometric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Notary Verifies Biometric</em>'.
	 * @generated
	 */
	CIM_NotaryVerifiesBiometric createCIM_NotaryVerifiesBiometric();

	/**
	 * Returns a new object of class '<em>CIM Privilege Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Privilege Management Service</em>'.
	 * @generated
	 */
	CIM_PrivilegeManagementService createCIM_PrivilegeManagementService();

	/**
	 * Returns a new object of class '<em>CIM Public Key Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Public Key Management Service</em>'.
	 * @generated
	 */
	CIM_PublicKeyManagementService createCIM_PublicKeyManagementService();

	/**
	 * Returns a new object of class '<em>CIM Require Credentials From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Require Credentials From</em>'.
	 * @generated
	 */
	CIM_RequireCredentialsFrom createCIM_RequireCredentialsFrom();

	/**
	 * Returns a new object of class '<em>CIM Role Based Authorization Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Role Based Authorization Service</em>'.
	 * @generated
	 */
	CIM_RoleBasedAuthorizationService createCIM_RoleBasedAuthorizationService();

	/**
	 * Returns a new object of class '<em>CIM Security Service For System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Security Service For System</em>'.
	 * @generated
	 */
	CIM_SecurityServiceForSystem createCIM_SecurityServiceForSystem();

	/**
	 * Returns a new object of class '<em>CIM Service Uses Security Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Service Uses Security Service</em>'.
	 * @generated
	 */
	CIM_ServiceUsesSecurityService createCIM_ServiceUsesSecurityService();

	/**
	 * Returns a new object of class '<em>CIM Shared Secret Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Shared Secret Service</em>'.
	 * @generated
	 */
	CIM_SharedSecretService createCIM_SharedSecretService();

	/**
	 * Returns a new object of class '<em>CIM Storage Hardware ID Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Hardware ID Management Service</em>'.
	 * @generated
	 */
	CIM_StorageHardwareIDManagementService createCIM_StorageHardwareIDManagementService();

	/**
	 * Returns a new object of class '<em>CIM System Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Administrator</em>'.
	 * @generated
	 */
	CIM_SystemAdministrator createCIM_SystemAdministrator();

	/**
	 * Returns a new object of class '<em>CIM System Administrator Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Administrator Group</em>'.
	 * @generated
	 */
	CIM_SystemAdministratorGroup createCIM_SystemAdministratorGroup();

	/**
	 * Returns a new object of class '<em>CIM System Administrator Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Administrator Role</em>'.
	 * @generated
	 */
	CIM_SystemAdministratorRole createCIM_SystemAdministratorRole();

	/**
	 * Returns a new object of class '<em>CIM Trust Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Trust Hierarchy</em>'.
	 * @generated
	 */
	CIM_TrustHierarchy createCIM_TrustHierarchy();

	/**
	 * Returns a new object of class '<em>CIM Verification Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Verification Service</em>'.
	 * @generated
	 */
	CIM_VerificationService createCIM_VerificationService();

	/**
	 * Returns a new object of class '<em>CIM Action Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Action Sequence</em>'.
	 * @generated
	 */
	CIM_ActionSequence createCIM_ActionSequence();

	/**
	 * Returns a new object of class '<em>CIM Application System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Application System</em>'.
	 * @generated
	 */
	CIM_ApplicationSystem createCIM_ApplicationSystem();

	/**
	 * Returns a new object of class '<em>CIM Application System Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Application System Dependency</em>'.
	 * @generated
	 */
	CIM_ApplicationSystemDependency createCIM_ApplicationSystemDependency();

	/**
	 * Returns a new object of class '<em>CIM Application System Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Application System Directory</em>'.
	 * @generated
	 */
	CIM_ApplicationSystemDirectory createCIM_ApplicationSystemDirectory();

	/**
	 * Returns a new object of class '<em>CIM Application System Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Application System Hierarchy</em>'.
	 * @generated
	 */
	CIM_ApplicationSystemHierarchy createCIM_ApplicationSystemHierarchy();

	/**
	 * Returns a new object of class '<em>CIM Application System Software Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Application System Software Feature</em>'.
	 * @generated
	 */
	CIM_ApplicationSystemSoftwareFeature createCIM_ApplicationSystemSoftwareFeature();

	/**
	 * Returns a new object of class '<em>CIM Associated App System Overview Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated App System Overview Statistics</em>'.
	 * @generated
	 */
	CIM_AssociatedAppSystemOverviewStatistics createCIM_AssociatedAppSystemOverviewStatistics();

	/**
	 * Returns a new object of class '<em>CIM Directory Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Directory Specification</em>'.
	 * @generated
	 */
	CIM_DirectorySpecification createCIM_DirectorySpecification();

	/**
	 * Returns a new object of class '<em>CIM Disk Space Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Space Check</em>'.
	 * @generated
	 */
	CIM_DiskSpaceCheck createCIM_DiskSpaceCheck();

	/**
	 * Returns a new object of class '<em>CIM Execute Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Execute Program</em>'.
	 * @generated
	 */
	CIM_ExecuteProgram createCIM_ExecuteProgram();

	/**
	 * Returns a new object of class '<em>CIM File Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Specification</em>'.
	 * @generated
	 */
	CIM_FileSpecification createCIM_FileSpecification();

	/**
	 * Returns a new object of class '<em>CIM From Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM From Directory Action</em>'.
	 * @generated
	 */
	CIM_FromDirectoryAction createCIM_FromDirectoryAction();

	/**
	 * Returns a new object of class '<em>CIM From Directory Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM From Directory Specification</em>'.
	 * @generated
	 */
	CIM_FromDirectorySpecification createCIM_FromDirectorySpecification();

	/**
	 * Returns a new object of class '<em>CIM Installed Software Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Installed Software Element</em>'.
	 * @generated
	 */
	CIM_InstalledSoftwareElement createCIM_InstalledSoftwareElement();

	/**
	 * Returns a new object of class '<em>CIM J2ee App Client Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee App Client Module</em>'.
	 * @generated
	 */
	CIM_J2eeAppClientModule createCIM_J2eeAppClientModule();

	/**
	 * Returns a new object of class '<em>CIM J2ee Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Application</em>'.
	 * @generated
	 */
	CIM_J2eeApplication createCIM_J2eeApplication();

	/**
	 * Returns a new object of class '<em>CIM J2ee Application Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Application Module</em>'.
	 * @generated
	 */
	CIM_J2eeApplicationModule createCIM_J2eeApplicationModule();

	/**
	 * Returns a new object of class '<em>CIM J2ee EJB Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee EJB Module</em>'.
	 * @generated
	 */
	CIM_J2eeEJBModule createCIM_J2eeEJBModule();

	/**
	 * Returns a new object of class '<em>CIM J2ee JCA Connection Factory Managed Connection Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JCA Connection Factory Managed Connection Factory</em>'.
	 * @generated
	 */
	CIM_J2eeJCAConnectionFactoryManagedConnectionFactory createCIM_J2eeJCAConnectionFactoryManagedConnectionFactory();

	/**
	 * Returns a new object of class '<em>CIM J2ee JCA Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JCA Resource</em>'.
	 * @generated
	 */
	CIM_J2eeJCAResource createCIM_J2eeJCAResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Data Source Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Data Source Driver</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCDataSourceDriver createCIM_J2eeJDBCDataSourceDriver();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Resource</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCResource createCIM_J2eeJDBCResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee JDBC Resource Uses Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JDBC Resource Uses Data Source</em>'.
	 * @generated
	 */
	CIM_J2eeJDBCResourceUsesDataSource createCIM_J2eeJDBCResourceUsesDataSource();

	/**
	 * Returns a new object of class '<em>CIM J2ee JMS Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JMS Resource</em>'.
	 * @generated
	 */
	CIM_J2eeJMSResource createCIM_J2eeJMSResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee JNDI Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JNDI Resource</em>'.
	 * @generated
	 */
	CIM_J2eeJNDIResource createCIM_J2eeJNDIResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee JTA Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee JTA Resource</em>'.
	 * @generated
	 */
	CIM_J2eeJTAResource createCIM_J2eeJTAResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee Java Mail Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Java Mail Resource</em>'.
	 * @generated
	 */
	CIM_J2eeJavaMailResource createCIM_J2eeJavaMailResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee RMI IIOP Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee RMI IIOP Resource</em>'.
	 * @generated
	 */
	CIM_J2eeRMI_IIOPResource createCIM_J2eeRMI_IIOPResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee Resource Adapter In Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Resource Adapter In Module</em>'.
	 * @generated
	 */
	CIM_J2eeResourceAdapterInModule createCIM_J2eeResourceAdapterInModule();

	/**
	 * Returns a new object of class '<em>CIM J2ee Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Server</em>'.
	 * @generated
	 */
	CIM_J2eeServer createCIM_J2eeServer();

	/**
	 * Returns a new object of class '<em>CIM J2ee Server Uses JVM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Server Uses JVM</em>'.
	 * @generated
	 */
	CIM_J2eeServerUsesJVM createCIM_J2eeServerUsesJVM();

	/**
	 * Returns a new object of class '<em>CIM J2ee Servlet In Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Servlet In Module</em>'.
	 * @generated
	 */
	CIM_J2eeServletInModule createCIM_J2eeServletInModule();

	/**
	 * Returns a new object of class '<em>CIM Memory Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Check</em>'.
	 * @generated
	 */
	CIM_MemoryCheck createCIM_MemoryCheck();

	/**
	 * Returns a new object of class '<em>CIM Modify Setting Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Modify Setting Action</em>'.
	 * @generated
	 */
	CIM_ModifySettingAction createCIM_ModifySettingAction();

	/**
	 * Returns a new object of class '<em>CIM OS Version Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OS Version Check</em>'.
	 * @generated
	 */
	CIM_OSVersionCheck createCIM_OSVersionCheck();

	/**
	 * Returns a new object of class '<em>CIM Reboot Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Reboot Action</em>'.
	 * @generated
	 */
	CIM_RebootAction createCIM_RebootAction();

	/**
	 * Returns a new object of class '<em>CIM Remove Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remove Directory Action</em>'.
	 * @generated
	 */
	CIM_RemoveDirectoryAction createCIM_RemoveDirectoryAction();

	/**
	 * Returns a new object of class '<em>CIM Remove File Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remove File Action</em>'.
	 * @generated
	 */
	CIM_RemoveFileAction createCIM_RemoveFileAction();

	/**
	 * Returns a new object of class '<em>CIM Setting Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Setting Check</em>'.
	 * @generated
	 */
	CIM_SettingCheck createCIM_SettingCheck();

	/**
	 * Returns a new object of class '<em>CIM Software Element Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Element Actions</em>'.
	 * @generated
	 */
	CIM_SoftwareElementActions createCIM_SoftwareElementActions();

	/**
	 * Returns a new object of class '<em>CIM Software Element Checks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Element Checks</em>'.
	 * @generated
	 */
	CIM_SoftwareElementChecks createCIM_SoftwareElementChecks();

	/**
	 * Returns a new object of class '<em>CIM Software Element Version Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Software Element Version Check</em>'.
	 * @generated
	 */
	CIM_SoftwareElementVersionCheck createCIM_SoftwareElementVersionCheck();

	/**
	 * Returns a new object of class '<em>CIM Swap Space Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Swap Space Check</em>'.
	 * @generated
	 */
	CIM_SwapSpaceCheck createCIM_SwapSpaceCheck();

	/**
	 * Returns a new object of class '<em>CIM System BIOS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System BIOS</em>'.
	 * @generated
	 */
	CIM_SystemBIOS createCIM_SystemBIOS();

	/**
	 * Returns a new object of class '<em>CIM Version Compatibility Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Version Compatibility Check</em>'.
	 * @generated
	 */
	CIM_VersionCompatibilityCheck createCIM_VersionCompatibilityCheck();

	/**
	 * Returns a new object of class '<em>CIM Active Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Active Connection</em>'.
	 * @generated
	 */
	CIM_ActiveConnection createCIM_ActiveConnection();

	/**
	 * Returns a new object of class '<em>CIM Admin Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Admin Domain</em>'.
	 * @generated
	 */
	CIM_AdminDomain createCIM_AdminDomain();

	/**
	 * Returns a new object of class '<em>CIM Associated Power Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Power Management Service</em>'.
	 * @generated
	 */
	CIM_AssociatedPowerManagementService createCIM_AssociatedPowerManagementService();

	/**
	 * Returns a new object of class '<em>CIM Based On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Based On</em>'.
	 * @generated
	 */
	CIM_BasedOn createCIM_BasedOn();

	/**
	 * Returns a new object of class '<em>CIM Binds To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Binds To</em>'.
	 * @generated
	 */
	CIM_BindsTo createCIM_BindsTo();

	/**
	 * Returns a new object of class '<em>CIM Configuration For System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Configuration For System</em>'.
	 * @generated
	 */
	CIM_ConfigurationForSystem createCIM_ConfigurationForSystem();

	/**
	 * Returns a new object of class '<em>CIM Contained Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Contained Domain</em>'.
	 * @generated
	 */
	CIM_ContainedDomain createCIM_ContainedDomain();

	/**
	 * Returns a new object of class '<em>CIM Device SAP Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device SAP Implementation</em>'.
	 * @generated
	 */
	CIM_DeviceSAPImplementation createCIM_DeviceSAPImplementation();

	/**
	 * Returns a new object of class '<em>CIM Device Service Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Service Implementation</em>'.
	 * @generated
	 */
	CIM_DeviceServiceImplementation createCIM_DeviceServiceImplementation();

	/**
	 * Returns a new object of class '<em>CIM Device Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Statistics</em>'.
	 * @generated
	 */
	CIM_DeviceStatistics createCIM_DeviceStatistics();

	/**
	 * Returns a new object of class '<em>CIM Extent Redundancy Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Extent Redundancy Component</em>'.
	 * @generated
	 */
	CIM_ExtentRedundancyComponent createCIM_ExtentRedundancyComponent();

	/**
	 * Returns a new object of class '<em>CIM Hosted Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Access Point</em>'.
	 * @generated
	 */
	CIM_HostedAccessPoint createCIM_HostedAccessPoint();

	/**
	 * Returns a new object of class '<em>CIM Hosted Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Collection</em>'.
	 * @generated
	 */
	CIM_HostedCollection createCIM_HostedCollection();

	/**
	 * Returns a new object of class '<em>CIM Hosted IP Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted IP Interface</em>'.
	 * @generated
	 */
	CIM_HostedIPInterface createCIM_HostedIPInterface();

	/**
	 * Returns a new object of class '<em>CIM Hosted Resource Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Resource Pool</em>'.
	 * @generated
	 */
	CIM_HostedResourcePool createCIM_HostedResourcePool();

	/**
	 * Returns a new object of class '<em>CIM Hosted Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Service</em>'.
	 * @generated
	 */
	CIM_HostedService createCIM_HostedService();

	/**
	 * Returns a new object of class '<em>CIM Installed Software Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Installed Software Identity</em>'.
	 * @generated
	 */
	CIM_InstalledSoftwareIdentity createCIM_InstalledSoftwareIdentity();

	/**
	 * Returns a new object of class '<em>CIM Launch In Context SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Launch In Context SAP</em>'.
	 * @generated
	 */
	CIM_LaunchInContextSAP createCIM_LaunchInContextSAP();

	/**
	 * Returns a new object of class '<em>CIM Launch In Context Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Launch In Context Service</em>'.
	 * @generated
	 */
	CIM_LaunchInContextService createCIM_LaunchInContextService();

	/**
	 * Returns a new object of class '<em>CIM Opaque Management Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Opaque Management Data</em>'.
	 * @generated
	 */
	CIM_OpaqueManagementData createCIM_OpaqueManagementData();

	/**
	 * Returns a new object of class '<em>CIM Opaque Management Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Opaque Management Data Service</em>'.
	 * @generated
	 */
	CIM_OpaqueManagementDataService createCIM_OpaqueManagementDataService();

	/**
	 * Returns a new object of class '<em>CIM Protocol Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Service</em>'.
	 * @generated
	 */
	CIM_ProtocolService createCIM_ProtocolService();

	/**
	 * Returns a new object of class '<em>CIM Provides Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Provides Endpoint</em>'.
	 * @generated
	 */
	CIM_ProvidesEndpoint createCIM_ProvidesEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Raw Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Raw Memory</em>'.
	 * @generated
	 */
	CIM_RawMemory createCIM_RawMemory();

	/**
	 * Returns a new object of class '<em>CIM Remote Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Remote Port</em>'.
	 * @generated
	 */
	CIM_RemotePort createCIM_RemotePort();

	/**
	 * Returns a new object of class '<em>CIM Scoped View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Scoped View</em>'.
	 * @generated
	 */
	CIM_ScopedView createCIM_ScopedView();

	/**
	 * Returns a new object of class '<em>CIM Setting For System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Setting For System</em>'.
	 * @generated
	 */
	CIM_SettingForSystem createCIM_SettingForSystem();

	/**
	 * Returns a new object of class '<em>CIM System Device View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Device View</em>'.
	 * @generated
	 */
	CIM_SystemDeviceView createCIM_SystemDeviceView();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Management Service</em>'.
	 * @generated
	 */
	CIM_VirtualSystemManagementService createCIM_VirtualSystemManagementService();

	/**
	 * Returns a new object of class '<em>CIM Virtual System Snapshot Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Virtual System Snapshot Service</em>'.
	 * @generated
	 */
	CIM_VirtualSystemSnapshotService createCIM_VirtualSystemSnapshotService();

	/**
	 * Returns a new object of class '<em>CIM Visible Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Visible Memory</em>'.
	 * @generated
	 */
	CIM_VisibleMemory createCIM_VisibleMemory();

	/**
	 * Returns a new object of class '<em>CIM Database Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database Storage</em>'.
	 * @generated
	 */
	CIM_DatabaseStorage createCIM_DatabaseStorage();

	/**
	 * Returns a new object of class '<em>CIM Database System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Database System</em>'.
	 * @generated
	 */
	CIM_DatabaseSystem createCIM_DatabaseSystem();

	/**
	 * Returns a new object of class '<em>CIM AGP Video Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM AGP Video Controller</em>'.
	 * @generated
	 */
	CIM_AGPVideoController createCIM_AGPVideoController();

	/**
	 * Returns a new object of class '<em>CIM ATA Initiator Target Logical Unit Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ATA Initiator Target Logical Unit Path</em>'.
	 * @generated
	 */
	CIM_ATAInitiatorTargetLogicalUnitPath createCIM_ATAInitiatorTargetLogicalUnitPath();

	/**
	 * Returns a new object of class '<em>CIM ATA Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ATA Port</em>'.
	 * @generated
	 */
	CIM_ATAPort createCIM_ATAPort();

	/**
	 * Returns a new object of class '<em>CIM Adapter Active Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Adapter Active Connection</em>'.
	 * @generated
	 */
	CIM_AdapterActiveConnection createCIM_AdapterActiveConnection();

	/**
	 * Returns a new object of class '<em>CIM Aggregate PS Extent Based On Aggregate PExtent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Aggregate PS Extent Based On Aggregate PExtent</em>'.
	 * @generated
	 */
	CIM_AggregatePSExtentBasedOnAggregatePExtent createCIM_AggregatePSExtentBasedOnAggregatePExtent();

	/**
	 * Returns a new object of class '<em>CIM Aggregate PS Extent Based On PExtent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Aggregate PS Extent Based On PExtent</em>'.
	 * @generated
	 */
	CIM_AggregatePSExtentBasedOnPExtent createCIM_AggregatePSExtentBasedOnPExtent();

	/**
	 * Returns a new object of class '<em>CIM Aggregate Redundancy Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Aggregate Redundancy Component</em>'.
	 * @generated
	 */
	CIM_AggregateRedundancyComponent createCIM_AggregateRedundancyComponent();

	/**
	 * Returns a new object of class '<em>CIM Allocated From Storage Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocated From Storage Pool</em>'.
	 * @generated
	 */
	CIM_AllocatedFromStoragePool createCIM_AllocatedFromStoragePool();

	/**
	 * Returns a new object of class '<em>CIM Associated Battery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Battery</em>'.
	 * @generated
	 */
	CIM_AssociatedBattery createCIM_AssociatedBattery();

	/**
	 * Returns a new object of class '<em>CIM Associated Component Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Component Extent</em>'.
	 * @generated
	 */
	CIM_AssociatedComponentExtent createCIM_AssociatedComponentExtent();

	/**
	 * Returns a new object of class '<em>CIM Associated Cooling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Cooling</em>'.
	 * @generated
	 */
	CIM_AssociatedCooling createCIM_AssociatedCooling();

	/**
	 * Returns a new object of class '<em>CIM Associated Indicator LED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Indicator LED</em>'.
	 * @generated
	 */
	CIM_AssociatedIndicatorLED createCIM_AssociatedIndicatorLED();

	/**
	 * Returns a new object of class '<em>CIM Associated Label Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Label Reader</em>'.
	 * @generated
	 */
	CIM_AssociatedLabelReader createCIM_AssociatedLabelReader();

	/**
	 * Returns a new object of class '<em>CIM Associated Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Masking Group</em>'.
	 * @generated
	 */
	CIM_AssociatedMaskingGroup createCIM_AssociatedMaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM Associated Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Memory</em>'.
	 * @generated
	 */
	CIM_AssociatedMemory createCIM_AssociatedMemory();

	/**
	 * Returns a new object of class '<em>CIM Associated Processor Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Processor Memory</em>'.
	 * @generated
	 */
	CIM_AssociatedProcessorMemory createCIM_AssociatedProcessorMemory();

	/**
	 * Returns a new object of class '<em>CIM Associated Protocol Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Protocol Controller</em>'.
	 * @generated
	 */
	CIM_AssociatedProtocolController createCIM_AssociatedProtocolController();

	/**
	 * Returns a new object of class '<em>CIM Associated Remaining Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Remaining Extent</em>'.
	 * @generated
	 */
	CIM_AssociatedRemainingExtent createCIM_AssociatedRemainingExtent();

	/**
	 * Returns a new object of class '<em>CIM Associated Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Sensor</em>'.
	 * @generated
	 */
	CIM_AssociatedSensor createCIM_AssociatedSensor();

	/**
	 * Returns a new object of class '<em>CIM Associated Target Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Target Masking Group</em>'.
	 * @generated
	 */
	CIM_AssociatedTargetMaskingGroup createCIM_AssociatedTargetMaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM BIOS Loaded In NV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BIOS Loaded In NV</em>'.
	 * @generated
	 */
	CIM_BIOSLoadedInNV createCIM_BIOSLoadedInNV();

	/**
	 * Returns a new object of class '<em>CIM Binary Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Binary Sensor</em>'.
	 * @generated
	 */
	CIM_BinarySensor createCIM_BinarySensor();

	/**
	 * Returns a new object of class '<em>CIM CDROM Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CDROM Drive</em>'.
	 * @generated
	 */
	CIM_CDROMDrive createCIM_CDROMDrive();

	/**
	 * Returns a new object of class '<em>CIM Cache Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Cache Memory</em>'.
	 * @generated
	 */
	CIM_CacheMemory createCIM_CacheMemory();

	/**
	 * Returns a new object of class '<em>CIM Changer Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Changer Device</em>'.
	 * @generated
	 */
	CIM_ChangerDevice createCIM_ChangerDevice();

	/**
	 * Returns a new object of class '<em>CIM Composite Extent Based On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Composite Extent Based On</em>'.
	 * @generated
	 */
	CIM_CompositeExtentBasedOn createCIM_CompositeExtentBasedOn();

	/**
	 * Returns a new object of class '<em>CIM Computer System Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System Memory</em>'.
	 * @generated
	 */
	CIM_ComputerSystemMemory createCIM_ComputerSystemMemory();

	/**
	 * Returns a new object of class '<em>CIM Computer System Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System Processor</em>'.
	 * @generated
	 */
	CIM_ComputerSystemProcessor createCIM_ComputerSystemProcessor();

	/**
	 * Returns a new object of class '<em>CIM Controlled By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Controlled By</em>'.
	 * @generated
	 */
	CIM_ControlledBy createCIM_ControlledBy();

	/**
	 * Returns a new object of class '<em>CIM Controller Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Controller Configuration Service</em>'.
	 * @generated
	 */
	CIM_ControllerConfigurationService createCIM_ControllerConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM DSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DSL Modem</em>'.
	 * @generated
	 */
	CIM_DSLModem createCIM_DSLModem();

	/**
	 * Returns a new object of class '<em>CIM DVD Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM DVD Drive</em>'.
	 * @generated
	 */
	CIM_DVDDrive createCIM_DVDDrive();

	/**
	 * Returns a new object of class '<em>CIM Device Services Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Device Services Location</em>'.
	 * @generated
	 */
	CIM_DeviceServicesLocation createCIM_DeviceServicesLocation();

	/**
	 * Returns a new object of class '<em>CIM Discrete Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Discrete Sensor</em>'.
	 * @generated
	 */
	CIM_DiscreteSensor createCIM_DiscreteSensor();

	/**
	 * Returns a new object of class '<em>CIM Disk Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Drive</em>'.
	 * @generated
	 */
	CIM_DiskDrive createCIM_DiskDrive();

	/**
	 * Returns a new object of class '<em>CIM Diskette Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Diskette Drive</em>'.
	 * @generated
	 */
	CIM_DisketteDrive createCIM_DisketteDrive();

	/**
	 * Returns a new object of class '<em>CIM Drive In Disk Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Drive In Disk Group</em>'.
	 * @generated
	 */
	CIM_DriveInDiskGroup createCIM_DriveInDiskGroup();

	/**
	 * Returns a new object of class '<em>CIM Ethernet Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ethernet Adapter</em>'.
	 * @generated
	 */
	CIM_EthernetAdapter createCIM_EthernetAdapter();

	/**
	 * Returns a new object of class '<em>CIM Ethernet Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Ethernet Port</em>'.
	 * @generated
	 */
	CIM_EthernetPort createCIM_EthernetPort();

	/**
	 * Returns a new object of class '<em>CIM FC Active Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Active Connection</em>'.
	 * @generated
	 */
	CIM_FCActiveConnection createCIM_FCActiveConnection();

	/**
	 * Returns a new object of class '<em>CIM FC Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Port</em>'.
	 * @generated
	 */
	CIM_FCPort createCIM_FCPort();

	/**
	 * Returns a new object of class '<em>CIM FC Topology View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM FC Topology View</em>'.
	 * @generated
	 */
	CIM_FCTopologyView createCIM_FCTopologyView();

	/**
	 * Returns a new object of class '<em>CIM Fibre Channel Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fibre Channel Adapter</em>'.
	 * @generated
	 */
	CIM_FibreChannelAdapter createCIM_FibreChannelAdapter();

	/**
	 * Returns a new object of class '<em>CIM Fibre Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fibre Port</em>'.
	 * @generated
	 */
	CIM_FibrePort createCIM_FibrePort();

	/**
	 * Returns a new object of class '<em>CIM Fibre Port Active Login</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fibre Port Active Login</em>'.
	 * @generated
	 */
	CIM_FibrePortActiveLogin createCIM_FibrePortActiveLogin();

	/**
	 * Returns a new object of class '<em>CIM Fibre Port On FC Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fibre Port On FC Adapter</em>'.
	 * @generated
	 */
	CIM_FibrePortOnFCAdapter createCIM_FibrePortOnFCAdapter();

	/**
	 * Returns a new object of class '<em>CIM Flat Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Flat Panel</em>'.
	 * @generated
	 */
	CIM_FlatPanel createCIM_FlatPanel();

	/**
	 * Returns a new object of class '<em>CIM Generic Disk Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Generic Disk Partition</em>'.
	 * @generated
	 */
	CIM_GenericDiskPartition createCIM_GenericDiskPartition();

	/**
	 * Returns a new object of class '<em>CIM Group Masking Mapping Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Group Masking Mapping Service</em>'.
	 * @generated
	 */
	CIM_GroupMaskingMappingService createCIM_GroupMaskingMappingService();

	/**
	 * Returns a new object of class '<em>CIM HDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM HDSL Modem</em>'.
	 * @generated
	 */
	CIM_HDSLModem createCIM_HDSLModem();

	/**
	 * Returns a new object of class '<em>CIM Hosted Storage Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Storage Pool</em>'.
	 * @generated
	 */
	CIM_HostedStoragePool createCIM_HostedStoragePool();

	/**
	 * Returns a new object of class '<em>CIM ISDN Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ISDN Modem</em>'.
	 * @generated
	 */
	CIM_ISDNModem createCIM_ISDNModem();

	/**
	 * Returns a new object of class '<em>CIM Inter Library Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Inter Library Port</em>'.
	 * @generated
	 */
	CIM_InterLibraryPort createCIM_InterLibraryPort();

	/**
	 * Returns a new object of class '<em>CIM Keyboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Keyboard</em>'.
	 * @generated
	 */
	CIM_Keyboard createCIM_Keyboard();

	/**
	 * Returns a new object of class '<em>CIM LLDP Ethernet Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM LLDP Ethernet Port</em>'.
	 * @generated
	 */
	CIM_LLDPEthernetPort createCIM_LLDPEthernetPort();

	/**
	 * Returns a new object of class '<em>CIM Library Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Library Exchange</em>'.
	 * @generated
	 */
	CIM_LibraryExchange createCIM_LibraryExchange();

	/**
	 * Returns a new object of class '<em>CIM Library Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Library Package</em>'.
	 * @generated
	 */
	CIM_LibraryPackage createCIM_LibraryPackage();

	/**
	 * Returns a new object of class '<em>CIM Limited Access Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Limited Access Port</em>'.
	 * @generated
	 */
	CIM_LimitedAccessPort createCIM_LimitedAccessPort();

	/**
	 * Returns a new object of class '<em>CIM Logical Disk Based On Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Disk Based On Extent</em>'.
	 * @generated
	 */
	CIM_LogicalDiskBasedOnExtent createCIM_LogicalDiskBasedOnExtent();

	/**
	 * Returns a new object of class '<em>CIM Logical Disk Based On Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Disk Based On Partition</em>'.
	 * @generated
	 */
	CIM_LogicalDiskBasedOnPartition createCIM_LogicalDiskBasedOnPartition();

	/**
	 * Returns a new object of class '<em>CIM Logical Disk Based On Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Disk Based On Volume</em>'.
	 * @generated
	 */
	CIM_LogicalDiskBasedOnVolume createCIM_LogicalDiskBasedOnVolume();

	/**
	 * Returns a new object of class '<em>CIM Logical Disk Based On Volume Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Logical Disk Based On Volume Set</em>'.
	 * @generated
	 */
	CIM_LogicalDiskBasedOnVolumeSet createCIM_LogicalDiskBasedOnVolumeSet();

	/**
	 * Returns a new object of class '<em>CIM Magneto Optical Drive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Magneto Optical Drive</em>'.
	 * @generated
	 */
	CIM_MagnetoOpticalDrive createCIM_MagnetoOpticalDrive();

	/**
	 * Returns a new object of class '<em>CIM Memory Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Memory Configuration Service</em>'.
	 * @generated
	 */
	CIM_MemoryConfigurationService createCIM_MemoryConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM Module Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Module Port</em>'.
	 * @generated
	 */
	CIM_ModulePort createCIM_ModulePort();

	/**
	 * Returns a new object of class '<em>CIM Multi State Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Multi State Sensor</em>'.
	 * @generated
	 */
	CIM_MultiStateSensor createCIM_MultiStateSensor();

	/**
	 * Returns a new object of class '<em>CIM Numeric Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Numeric Sensor</em>'.
	 * @generated
	 */
	CIM_NumericSensor createCIM_NumericSensor();

	/**
	 * Returns a new object of class '<em>CIM OOB Alert Service On Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OOB Alert Service On Modem</em>'.
	 * @generated
	 */
	CIM_OOBAlertServiceOnModem createCIM_OOBAlertServiceOnModem();

	/**
	 * Returns a new object of class '<em>CIM OOB Alert Service On Network Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OOB Alert Service On Network Adapter</em>'.
	 * @generated
	 */
	CIM_OOBAlertServiceOnNetworkAdapter createCIM_OOBAlertServiceOnNetworkAdapter();

	/**
	 * Returns a new object of class '<em>CIM OOB Alert Service On Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OOB Alert Service On Network Port</em>'.
	 * @generated
	 */
	CIM_OOBAlertServiceOnNetworkPort createCIM_OOBAlertServiceOnNetworkPort();

	/**
	 * Returns a new object of class '<em>CIM Owning Print Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Owning Print Queue</em>'.
	 * @generated
	 */
	CIM_OwningPrintQueue createCIM_OwningPrintQueue();

	/**
	 * Returns a new object of class '<em>CIM PCI Bridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PCI Bridge</em>'.
	 * @generated
	 */
	CIM_PCIBridge createCIM_PCIBridge();

	/**
	 * Returns a new object of class '<em>CIM PC Video Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PC Video Controller</em>'.
	 * @generated
	 */
	CIM_PCVideoController createCIM_PCVideoController();

	/**
	 * Returns a new object of class '<em>CIM PExtent Redundancy Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PExtent Redundancy Component</em>'.
	 * @generated
	 */
	CIM_PExtentRedundancyComponent createCIM_PExtentRedundancyComponent();

	/**
	 * Returns a new object of class '<em>CIM POTS Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM POTS Modem</em>'.
	 * @generated
	 */
	CIM_POTSModem createCIM_POTSModem();

	/**
	 * Returns a new object of class '<em>CIM PS Extent Based On PExtent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM PS Extent Based On PExtent</em>'.
	 * @generated
	 */
	CIM_PSExtentBasedOnPExtent createCIM_PSExtentBasedOnPExtent();

	/**
	 * Returns a new object of class '<em>CIM Package Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package Alarm</em>'.
	 * @generated
	 */
	CIM_PackageAlarm createCIM_PackageAlarm();

	/**
	 * Returns a new object of class '<em>CIM Package Cooling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package Cooling</em>'.
	 * @generated
	 */
	CIM_PackageCooling createCIM_PackageCooling();

	/**
	 * Returns a new object of class '<em>CIM Picker For Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Picker For Changer</em>'.
	 * @generated
	 */
	CIM_PickerForChanger createCIM_PickerForChanger();

	/**
	 * Returns a new object of class '<em>CIM Picker Label Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Picker Label Reader</em>'.
	 * @generated
	 */
	CIM_PickerLabelReader createCIM_PickerLabelReader();

	/**
	 * Returns a new object of class '<em>CIM Pointing Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Pointing Device</em>'.
	 * @generated
	 */
	CIM_PointingDevice createCIM_PointingDevice();

	/**
	 * Returns a new object of class '<em>CIM Port Implements Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Port Implements Endpoint</em>'.
	 * @generated
	 */
	CIM_PortImplementsEndpoint createCIM_PortImplementsEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Protected Extent Based On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protected Extent Based On</em>'.
	 * @generated
	 */
	CIM_ProtectedExtentBasedOn createCIM_ProtectedExtentBasedOn();

	/**
	 * Returns a new object of class '<em>CIM Protocol Controller Accesses Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Protocol Controller Accesses Unit</em>'.
	 * @generated
	 */
	CIM_ProtocolControllerAccessesUnit createCIM_ProtocolControllerAccessesUnit();

	/**
	 * Returns a new object of class '<em>CIM Realized On Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Realized On Side</em>'.
	 * @generated
	 */
	CIM_RealizedOnSide createCIM_RealizedOnSide();

	/**
	 * Returns a new object of class '<em>CIM Realizes Aggregate PExtent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Realizes Aggregate PExtent</em>'.
	 * @generated
	 */
	CIM_RealizesAggregatePExtent createCIM_RealizesAggregatePExtent();

	/**
	 * Returns a new object of class '<em>CIM Realizes Tape Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Realizes Tape Partition</em>'.
	 * @generated
	 */
	CIM_RealizesTapePartition createCIM_RealizesTapePartition();

	/**
	 * Returns a new object of class '<em>CIM Replica Pool For Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replica Pool For Storage</em>'.
	 * @generated
	 */
	CIM_ReplicaPoolForStorage createCIM_ReplicaPoolForStorage();

	/**
	 * Returns a new object of class '<em>CIM Replication Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replication Service</em>'.
	 * @generated
	 */
	CIM_ReplicationService createCIM_ReplicationService();

	/**
	 * Returns a new object of class '<em>CIM Replication Service Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Replication Service Capabilities</em>'.
	 * @generated
	 */
	CIM_ReplicationServiceCapabilities createCIM_ReplicationServiceCapabilities();

	/**
	 * Returns a new object of class '<em>CIM SCSI Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SCSI Interface</em>'.
	 * @generated
	 */
	CIM_SCSIInterface createCIM_SCSIInterface();

	/**
	 * Returns a new object of class '<em>CIM SDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SDSL Modem</em>'.
	 * @generated
	 */
	CIM_SDSLModem createCIM_SDSLModem();

	/**
	 * Returns a new object of class '<em>CIM Serial Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Serial Interface</em>'.
	 * @generated
	 */
	CIM_SerialInterface createCIM_SerialInterface();

	/**
	 * Returns a new object of class '<em>CIM Spare Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Spare Configuration Service</em>'.
	 * @generated
	 */
	CIM_SpareConfigurationService createCIM_SpareConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM Storage Configuration Capabilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Configuration Capabilities</em>'.
	 * @generated
	 */
	CIM_StorageConfigurationCapabilities createCIM_StorageConfigurationCapabilities();

	/**
	 * Returns a new object of class '<em>CIM Storage Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Configuration Service</em>'.
	 * @generated
	 */
	CIM_StorageConfigurationService createCIM_StorageConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM Storage Element Composition Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Element Composition Service</em>'.
	 * @generated
	 */
	CIM_StorageElementCompositionService createCIM_StorageElementCompositionService();

	/**
	 * Returns a new object of class '<em>CIM Storage Element Drive Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Element Drive Dependency</em>'.
	 * @generated
	 */
	CIM_StorageElementDriveDependency createCIM_StorageElementDriveDependency();

	/**
	 * Returns a new object of class '<em>CIM Storage Processor Affinity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Processor Affinity</em>'.
	 * @generated
	 */
	CIM_StorageProcessorAffinity createCIM_StorageProcessorAffinity();

	/**
	 * Returns a new object of class '<em>CIM Storage Relocation Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Storage Relocation Service</em>'.
	 * @generated
	 */
	CIM_StorageRelocationService createCIM_StorageRelocationService();

	/**
	 * Returns a new object of class '<em>CIM Tachometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tachometer</em>'.
	 * @generated
	 */
	CIM_Tachometer createCIM_Tachometer();

	/**
	 * Returns a new object of class '<em>CIM Tape Partition On Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tape Partition On Surface</em>'.
	 * @generated
	 */
	CIM_TapePartitionOnSurface createCIM_TapePartitionOnSurface();

	/**
	 * Returns a new object of class '<em>CIM Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Temperature Sensor</em>'.
	 * @generated
	 */
	CIM_TemperatureSensor createCIM_TemperatureSensor();

	/**
	 * Returns a new object of class '<em>CIM Tier Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tier Domain</em>'.
	 * @generated
	 */
	CIM_TierDomain createCIM_TierDomain();

	/**
	 * Returns a new object of class '<em>CIM Tier Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Tier Service</em>'.
	 * @generated
	 */
	CIM_TierService createCIM_TierService();

	/**
	 * Returns a new object of class '<em>CIM USB Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Connection</em>'.
	 * @generated
	 */
	CIM_USBConnection createCIM_USBConnection();

	/**
	 * Returns a new object of class '<em>CIM USB Controller Has Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM USB Controller Has Hub</em>'.
	 * @generated
	 */
	CIM_USBControllerHasHub createCIM_USBControllerHasHub();

	/**
	 * Returns a new object of class '<em>CIM Unimodem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Unimodem</em>'.
	 * @generated
	 */
	CIM_Unimodem createCIM_Unimodem();

	/**
	 * Returns a new object of class '<em>CIM VDSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VDSL Modem</em>'.
	 * @generated
	 */
	CIM_VDSLModem createCIM_VDSLModem();

	/**
	 * Returns a new object of class '<em>CIM VTL Statistical Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VTL Statistical Data Service</em>'.
	 * @generated
	 */
	CIM_VTLStatisticalDataService createCIM_VTLStatisticalDataService();

	/**
	 * Returns a new object of class '<em>CIM VTOC Disk Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VTOC Disk Partition</em>'.
	 * @generated
	 */
	CIM_VTOCDiskPartition createCIM_VTOCDiskPartition();

	/**
	 * Returns a new object of class '<em>CIM Voltage Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Voltage Sensor</em>'.
	 * @generated
	 */
	CIM_VoltageSensor createCIM_VoltageSensor();

	/**
	 * Returns a new object of class '<em>CIM Volume Set Based On PS Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Volume Set Based On PS Extent</em>'.
	 * @generated
	 */
	CIM_VolumeSetBasedOnPSExtent createCIM_VolumeSetBasedOnPSExtent();

	/**
	 * Returns a new object of class '<em>CIM Wake Up Service On Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wake Up Service On Modem</em>'.
	 * @generated
	 */
	CIM_WakeUpServiceOnModem createCIM_WakeUpServiceOnModem();

	/**
	 * Returns a new object of class '<em>CIM Wake Up Service On Network Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wake Up Service On Network Adapter</em>'.
	 * @generated
	 */
	CIM_WakeUpServiceOnNetworkAdapter createCIM_WakeUpServiceOnNetworkAdapter();

	/**
	 * Returns a new object of class '<em>CIM Wake Up Service On Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wake Up Service On Network Port</em>'.
	 * @generated
	 */
	CIM_WakeUpServiceOnNetworkPort createCIM_WakeUpServiceOnNetworkPort();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Endpoint</em>'.
	 * @generated
	 */
	CIM_WiFiEndpoint createCIM_WiFiEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Wi Fi Port Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Wi Fi Port Configuration Service</em>'.
	 * @generated
	 */
	CIM_WiFiPortConfigurationService createCIM_WiFiPortConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM IPsec Policy For Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec Policy For Endpoint</em>'.
	 * @generated
	 */
	CIM_IPsecPolicyForEndpoint createCIM_IPsecPolicyForEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Rule That Generated SA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Rule That Generated SA</em>'.
	 * @generated
	 */
	CIM_RuleThatGeneratedSA createCIM_RuleThatGeneratedSA();

	/**
	 * Returns a new object of class '<em>CIM Comm Mechanism For Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Comm Mechanism For Adapter</em>'.
	 * @generated
	 */
	CIM_CommMechanismForAdapter createCIM_CommMechanismForAdapter();

	/**
	 * Returns a new object of class '<em>CIM Comm Mechanism For Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Comm Mechanism For Manager</em>'.
	 * @generated
	 */
	CIM_CommMechanismForManager createCIM_CommMechanismForManager();

	/**
	 * Returns a new object of class '<em>CIM Comm Mechanism For Object Manager Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Comm Mechanism For Object Manager Adapter</em>'.
	 * @generated
	 */
	CIM_CommMechanismForObjectManagerAdapter createCIM_CommMechanismForObjectManagerAdapter();

	/**
	 * Returns a new object of class '<em>CIM Namespace In Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Namespace In Manager</em>'.
	 * @generated
	 */
	CIM_NamespaceInManager createCIM_NamespaceInManager();

	/**
	 * Returns a new object of class '<em>CIM AF Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM AF Service</em>'.
	 * @generated
	 */
	CIM_AFService createCIM_AFService();

	/**
	 * Returns a new object of class '<em>CIM Autonomous System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Autonomous System</em>'.
	 * @generated
	 */
	CIM_AutonomousSystem createCIM_AutonomousSystem();

	/**
	 * Returns a new object of class '<em>CIM BGP Admin Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Admin Distance</em>'.
	 * @generated
	 */
	CIM_BGPAdminDistance createCIM_BGPAdminDistance();

	/**
	 * Returns a new object of class '<em>CIM BGP Clusters In AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Clusters In AS</em>'.
	 * @generated
	 */
	CIM_BGPClustersInAS createCIM_BGPClustersInAS();

	/**
	 * Returns a new object of class '<em>CIM BGP Peer Group Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Peer Group Service</em>'.
	 * @generated
	 */
	CIM_BGPPeerGroupService createCIM_BGPPeerGroupService();

	/**
	 * Returns a new object of class '<em>CIM BGP Routing Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM BGP Routing Policy</em>'.
	 * @generated
	 */
	CIM_BGPRoutingPolicy createCIM_BGPRoutingPolicy();

	/**
	 * Returns a new object of class '<em>CIM Binds To LAN Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Binds To LAN Endpoint</em>'.
	 * @generated
	 */
	CIM_BindsToLANEndpoint createCIM_BindsToLANEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Classifier Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Classifier Element</em>'.
	 * @generated
	 */
	CIM_ClassifierElement createCIM_ClassifierElement();

	/**
	 * Returns a new object of class '<em>CIM Classifier Element In Classifier Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Classifier Element In Classifier Service</em>'.
	 * @generated
	 */
	CIM_ClassifierElementInClassifierService createCIM_ClassifierElementInClassifierService();

	/**
	 * Returns a new object of class '<em>CIM Classifier Element Uses Filter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Classifier Element Uses Filter List</em>'.
	 * @generated
	 */
	CIM_ClassifierElementUsesFilterList createCIM_ClassifierElementUsesFilterList();

	/**
	 * Returns a new object of class '<em>CIM Classifier Filter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Classifier Filter Set</em>'.
	 * @generated
	 */
	CIM_ClassifierFilterSet createCIM_ClassifierFilterSet();

	/**
	 * Returns a new object of class '<em>CIM Confederation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Confederation</em>'.
	 * @generated
	 */
	CIM_Confederation createCIM_Confederation();

	/**
	 * Returns a new object of class '<em>CIM Endpoint In Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Endpoint In Link</em>'.
	 * @generated
	 */
	CIM_EndpointInLink createCIM_EndpointInLink();

	/**
	 * Returns a new object of class '<em>CIM Fail Next Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Fail Next Scheduler</em>'.
	 * @generated
	 */
	CIM_FailNextScheduler createCIM_FailNextScheduler();

	/**
	 * Returns a new object of class '<em>CIM Filter Entry In System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter Entry In System</em>'.
	 * @generated
	 */
	CIM_FilterEntryInSystem createCIM_FilterEntryInSystem();

	/**
	 * Returns a new object of class '<em>CIM Filter List In System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter List In System</em>'.
	 * @generated
	 */
	CIM_FilterListInSystem createCIM_FilterListInSystem();

	/**
	 * Returns a new object of class '<em>CIM Filter Of Security Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Filter Of Security Association</em>'.
	 * @generated
	 */
	CIM_FilterOfSecurityAssociation createCIM_FilterOfSecurityAssociation();

	/**
	 * Returns a new object of class '<em>CIM Forwarded Routes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Forwarded Routes</em>'.
	 * @generated
	 */
	CIM_ForwardedRoutes createCIM_ForwardedRoutes();

	/**
	 * Returns a new object of class '<em>CIM Hosted Admin Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Admin Distance</em>'.
	 * @generated
	 */
	CIM_HostedAdminDistance createCIM_HostedAdminDistance();

	/**
	 * Returns a new object of class '<em>CIM Hosted BGP Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted BGP Attributes</em>'.
	 * @generated
	 */
	CIM_HostedBGPAttributes createCIM_HostedBGPAttributes();

	/**
	 * Returns a new object of class '<em>CIM Hosted BGP Peer Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted BGP Peer Group</em>'.
	 * @generated
	 */
	CIM_HostedBGPPeerGroup createCIM_HostedBGPPeerGroup();

	/**
	 * Returns a new object of class '<em>CIM Hosted BGP Route Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted BGP Route Map</em>'.
	 * @generated
	 */
	CIM_HostedBGPRouteMap createCIM_HostedBGPRouteMap();

	/**
	 * Returns a new object of class '<em>CIM Hosted Filter Entry Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Filter Entry Base</em>'.
	 * @generated
	 */
	CIM_HostedFilterEntryBase createCIM_HostedFilterEntryBase();

	/**
	 * Returns a new object of class '<em>CIM Hosted Filter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Filter List</em>'.
	 * @generated
	 */
	CIM_HostedFilterList createCIM_HostedFilterList();

	/**
	 * Returns a new object of class '<em>CIM Hosted Forwarding Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Forwarding Services</em>'.
	 * @generated
	 */
	CIM_HostedForwardingServices createCIM_HostedForwardingServices();

	/**
	 * Returns a new object of class '<em>CIM Hosted Routing Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Routing Policy</em>'.
	 * @generated
	 */
	CIM_HostedRoutingPolicy createCIM_HostedRoutingPolicy();

	/**
	 * Returns a new object of class '<em>CIM Hosted Routing Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Routing Services</em>'.
	 * @generated
	 */
	CIM_HostedRoutingServices createCIM_HostedRoutingServices();

	/**
	 * Returns a new object of class '<em>CIM IKESA Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IKESA Endpoint</em>'.
	 * @generated
	 */
	CIM_IKESAEndpoint createCIM_IKESAEndpoint();

	/**
	 * Returns a new object of class '<em>CIM IP Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Configuration Service</em>'.
	 * @generated
	 */
	CIM_IPConfigurationService createCIM_IPConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM IP Encapsulation Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Encapsulation Management Service</em>'.
	 * @generated
	 */
	CIM_IPEncapsulationManagementService createCIM_IPEncapsulationManagementService();

	/**
	 * Returns a new object of class '<em>CIM IP Loopback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Loopback</em>'.
	 * @generated
	 */
	CIM_IPLoopback createCIM_IPLoopback();

	/**
	 * Returns a new object of class '<em>CIM IP Subinterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IP Subinterface</em>'.
	 * @generated
	 */
	CIM_IPSubinterface createCIM_IPSubinterface();

	/**
	 * Returns a new object of class '<em>CIM IPsec SA Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IPsec SA Endpoint</em>'.
	 * @generated
	 */
	CIM_IPsecSAEndpoint createCIM_IPsecSAEndpoint();

	/**
	 * Returns a new object of class '<em>CIM In BGP Peer Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM In BGP Peer Group</em>'.
	 * @generated
	 */
	CIM_InBGPPeerGroup createCIM_InBGPPeerGroup();

	/**
	 * Returns a new object of class '<em>CIM In Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM In Segment</em>'.
	 * @generated
	 */
	CIM_InSegment createCIM_InSegment();

	/**
	 * Returns a new object of class '<em>CIM Inbound VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Inbound VLAN</em>'.
	 * @generated
	 */
	CIM_InboundVLAN createCIM_InboundVLAN();

	/**
	 * Returns a new object of class '<em>CIM Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network</em>'.
	 * @generated
	 */
	CIM_Network createCIM_Network();

	/**
	 * Returns a new object of class '<em>CIM Network Services In Admin Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Network Services In Admin Domain</em>'.
	 * @generated
	 */
	CIM_NetworkServicesInAdminDomain createCIM_NetworkServicesInAdminDomain();

	/**
	 * Returns a new object of class '<em>CIM Networks In Admin Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Networks In Admin Domain</em>'.
	 * @generated
	 */
	CIM_NetworksInAdminDomain createCIM_NetworksInAdminDomain();

	/**
	 * Returns a new object of class '<em>CIM Next Service After Classifier Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Next Service After Classifier Element</em>'.
	 * @generated
	 */
	CIM_NextServiceAfterClassifierElement createCIM_NextServiceAfterClassifierElement();

	/**
	 * Returns a new object of class '<em>CIM OSPF Protocol Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Protocol Endpoint</em>'.
	 * @generated
	 */
	CIM_OSPFProtocolEndpoint createCIM_OSPFProtocolEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Outbound VLAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Outbound VLAN</em>'.
	 * @generated
	 */
	CIM_OutboundVLAN createCIM_OutboundVLAN();

	/**
	 * Returns a new object of class '<em>CIM Peer Of SA Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Peer Of SA Endpoint</em>'.
	 * @generated
	 */
	CIM_PeerOfSAEndpoint createCIM_PeerOfSAEndpoint();

	/**
	 * Returns a new object of class '<em>CIM Phase1 SA Used For Phase2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Phase1 SA Used For Phase2</em>'.
	 * @generated
	 */
	CIM_Phase1SAUsedForPhase2 createCIM_Phase1SAUsedForPhase2();

	/**
	 * Returns a new object of class '<em>CIM Related Spanning Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Related Spanning Tree</em>'.
	 * @generated
	 */
	CIM_RelatedSpanningTree createCIM_RelatedSpanningTree();

	/**
	 * Returns a new object of class '<em>CIM Related Transparent Bridging Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Related Transparent Bridging Service</em>'.
	 * @generated
	 */
	CIM_RelatedTransparentBridgingService createCIM_RelatedTransparentBridgingService();

	/**
	 * Returns a new object of class '<em>CIM Routers In AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Routers In AS</em>'.
	 * @generated
	 */
	CIM_RoutersInAS createCIM_RoutersInAS();

	/**
	 * Returns a new object of class '<em>CIM Routers In BGP Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Routers In BGP Cluster</em>'.
	 * @generated
	 */
	CIM_RoutersInBGPCluster createCIM_RoutersInBGPCluster();

	/**
	 * Returns a new object of class '<em>CIM Routing Protocol Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Routing Protocol Domain</em>'.
	 * @generated
	 */
	CIM_RoutingProtocolDomain createCIM_RoutingProtocolDomain();

	/**
	 * Returns a new object of class '<em>CIM Routing Protocol Domain In AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Routing Protocol Domain In AS</em>'.
	 * @generated
	 */
	CIM_RoutingProtocolDomainInAS createCIM_RoutingProtocolDomainInAS();

	/**
	 * Returns a new object of class '<em>CIM SNMP Trap Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM SNMP Trap Target</em>'.
	 * @generated
	 */
	CIM_SNMPTrapTarget createCIM_SNMPTrapTarget();

	/**
	 * Returns a new object of class '<em>CIM Switch Service Transparent Bridging</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switch Service Transparent Bridging</em>'.
	 * @generated
	 */
	CIM_SwitchServiceTransparentBridging createCIM_SwitchServiceTransparentBridging();

	/**
	 * Returns a new object of class '<em>CIM Switchable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Switchable</em>'.
	 * @generated
	 */
	CIM_Switchable createCIM_Switchable();

	/**
	 * Returns a new object of class '<em>CIM Transform Of Security Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Transform Of Security Association</em>'.
	 * @generated
	 */
	CIM_TransformOfSecurityAssociation createCIM_TransformOfSecurityAssociation();

	/**
	 * Returns a new object of class '<em>CIM Transparent Bridging Dynamic Forwarding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Transparent Bridging Dynamic Forwarding</em>'.
	 * @generated
	 */
	CIM_TransparentBridgingDynamicForwarding createCIM_TransparentBridgingDynamicForwarding();

	/**
	 * Returns a new object of class '<em>CIM VLAN Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VLAN Network</em>'.
	 * @generated
	 */
	CIM_VLANNetwork createCIM_VLANNetwork();

	/**
	 * Returns a new object of class '<em>CIM VRF Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM VRF Configuration Service</em>'.
	 * @generated
	 */
	CIM_VRFConfigurationService createCIM_VRFConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM iSCSI Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM iSCSI Configuration Service</em>'.
	 * @generated
	 */
	CIM_iSCSIConfigurationService createCIM_iSCSIConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM Accept Credential From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Accept Credential From</em>'.
	 * @generated
	 */
	CIM_AcceptCredentialFrom createCIM_AcceptCredentialFrom();

	/**
	 * Returns a new object of class '<em>CIM Policy Group In System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Group In System</em>'.
	 * @generated
	 */
	CIM_PolicyGroupInSystem createCIM_PolicyGroupInSystem();

	/**
	 * Returns a new object of class '<em>CIM Policy Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Repository</em>'.
	 * @generated
	 */
	CIM_PolicyRepository createCIM_PolicyRepository();

	/**
	 * Returns a new object of class '<em>CIM Policy Repository In Policy Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Repository In Policy Repository</em>'.
	 * @generated
	 */
	CIM_PolicyRepositoryInPolicyRepository createCIM_PolicyRepositoryInPolicyRepository();

	/**
	 * Returns a new object of class '<em>CIM Policy Role Collection In System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Role Collection In System</em>'.
	 * @generated
	 */
	CIM_PolicyRoleCollectionInSystem createCIM_PolicyRoleCollectionInSystem();

	/**
	 * Returns a new object of class '<em>CIM Policy Rule In System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Rule In System</em>'.
	 * @generated
	 */
	CIM_PolicyRuleInSystem createCIM_PolicyRuleInSystem();

	/**
	 * Returns a new object of class '<em>CIM Reusable Policy Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Reusable Policy Container</em>'.
	 * @generated
	 */
	CIM_ReusablePolicyContainer createCIM_ReusablePolicyContainer();

	/**
	 * Returns a new object of class '<em>CIM Allocated DMA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Allocated DMA</em>'.
	 * @generated
	 */
	CIM_AllocatedDMA createCIM_AllocatedDMA();

	/**
	 * Returns a new object of class '<em>CIM Boot Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Boot Service</em>'.
	 * @generated
	 */
	CIM_BootService createCIM_BootService();

	/**
	 * Returns a new object of class '<em>CIM Boot Service Access By SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Boot Service Access By SAP</em>'.
	 * @generated
	 */
	CIM_BootServiceAccessBySAP createCIM_BootServiceAccessBySAP();

	/**
	 * Returns a new object of class '<em>CIM CIFS Share</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CIFS Share</em>'.
	 * @generated
	 */
	CIM_CIFSShare createCIM_CIFSShare();

	/**
	 * Returns a new object of class '<em>CIM Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Cluster</em>'.
	 * @generated
	 */
	CIM_Cluster createCIM_Cluster();

	/**
	 * Returns a new object of class '<em>CIM Clustering Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Clustering Service</em>'.
	 * @generated
	 */
	CIM_ClusteringService createCIM_ClusteringService();

	/**
	 * Returns a new object of class '<em>CIM Component CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Component CS</em>'.
	 * @generated
	 */
	CIM_ComponentCS createCIM_ComponentCS();

	/**
	 * Returns a new object of class '<em>CIM Computer System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System Resource</em>'.
	 * @generated
	 */
	CIM_ComputerSystemResource createCIM_ComputerSystemResource();

	/**
	 * Returns a new object of class '<em>CIM File Export Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Export Service</em>'.
	 * @generated
	 */
	CIM_FileExportService createCIM_FileExportService();

	/**
	 * Returns a new object of class '<em>CIM File Server Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM File Server Configuration Service</em>'.
	 * @generated
	 */
	CIM_FileServerConfigurationService createCIM_FileServerConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM Hosted Boot SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Boot SAP</em>'.
	 * @generated
	 */
	CIM_HostedBootSAP createCIM_HostedBootSAP();

	/**
	 * Returns a new object of class '<em>CIM Hosted Boot Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Boot Service</em>'.
	 * @generated
	 */
	CIM_HostedBootService createCIM_HostedBootService();

	/**
	 * Returns a new object of class '<em>CIM Hosted Cluster SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Cluster SAP</em>'.
	 * @generated
	 */
	CIM_HostedClusterSAP createCIM_HostedClusterSAP();

	/**
	 * Returns a new object of class '<em>CIM Hosted Cluster Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Cluster Service</em>'.
	 * @generated
	 */
	CIM_HostedClusterService createCIM_HostedClusterService();

	/**
	 * Returns a new object of class '<em>CIM Hosting CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosting CS</em>'.
	 * @generated
	 */
	CIM_HostingCS createCIM_HostingCS();

	/**
	 * Returns a new object of class '<em>CIM Participating CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Participating CS</em>'.
	 * @generated
	 */
	CIM_ParticipatingCS createCIM_ParticipatingCS();

	/**
	 * Returns a new object of class '<em>CIM System Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM System Partition</em>'.
	 * @generated
	 */
	CIM_SystemPartition createCIM_SystemPartition();

	/**
	 * Returns a new object of class '<em>CIM Authenticate For Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Authenticate For Use</em>'.
	 * @generated
	 */
	CIM_AuthenticateForUse createCIM_AuthenticateForUse();

	/**
	 * Returns a new object of class '<em>CIM Certificate Authority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Certificate Authority</em>'.
	 * @generated
	 */
	CIM_CertificateAuthority createCIM_CertificateAuthority();

	/**
	 * Returns a new object of class '<em>CIM Certificate Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Certificate Management Service</em>'.
	 * @generated
	 */
	CIM_CertificateManagementService createCIM_CertificateManagementService();

	/**
	 * Returns a new object of class '<em>CIM IKE Secret Is Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM IKE Secret Is Named</em>'.
	 * @generated
	 */
	CIM_IKESecretIsNamed createCIM_IKESecretIsNamed();

	/**
	 * Returns a new object of class '<em>CIM KDC Issues Kerberos Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM KDC Issues Kerberos Ticket</em>'.
	 * @generated
	 */
	CIM_KDCIssuesKerberosTicket createCIM_KDCIssuesKerberosTicket();

	/**
	 * Returns a new object of class '<em>CIM Locally Managed Public Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Locally Managed Public Key</em>'.
	 * @generated
	 */
	CIM_LocallyManagedPublicKey createCIM_LocallyManagedPublicKey();

	/**
	 * Returns a new object of class '<em>CIM Manages Account On System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Manages Account On System</em>'.
	 * @generated
	 */
	CIM_ManagesAccountOnSystem createCIM_ManagesAccountOnSystem();

	/**
	 * Returns a new object of class '<em>CIM Shared Secret Is Shared</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Shared Secret Is Shared</em>'.
	 * @generated
	 */
	CIM_SharedSecretIsShared createCIM_SharedSecretIsShared();

	/**
	 * Returns a new object of class '<em>CIM Architecture Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Architecture Check</em>'.
	 * @generated
	 */
	CIM_ArchitectureCheck createCIM_ArchitectureCheck();

	/**
	 * Returns a new object of class '<em>CIM Copy File Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Copy File Action</em>'.
	 * @generated
	 */
	CIM_CopyFileAction createCIM_CopyFileAction();

	/**
	 * Returns a new object of class '<em>CIM Create Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Create Directory Action</em>'.
	 * @generated
	 */
	CIM_CreateDirectoryAction createCIM_CreateDirectoryAction();

	/**
	 * Returns a new object of class '<em>CIM Directory Specification File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Directory Specification File</em>'.
	 * @generated
	 */
	CIM_DirectorySpecificationFile createCIM_DirectorySpecificationFile();

	/**
	 * Returns a new object of class '<em>CIM J2ee Application Hosted On Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Application Hosted On Server</em>'.
	 * @generated
	 */
	CIM_J2eeApplicationHostedOnServer createCIM_J2eeApplicationHostedOnServer();

	/**
	 * Returns a new object of class '<em>CIM J2ee Connection Factory Available To JCA Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Connection Factory Available To JCA Resource</em>'.
	 * @generated
	 */
	CIM_J2eeConnectionFactoryAvailableToJCAResource createCIM_J2eeConnectionFactoryAvailableToJCAResource();

	/**
	 * Returns a new object of class '<em>CIM J2ee Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Domain</em>'.
	 * @generated
	 */
	CIM_J2eeDomain createCIM_J2eeDomain();

	/**
	 * Returns a new object of class '<em>CIM J2ee EJB In Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee EJB In Module</em>'.
	 * @generated
	 */
	CIM_J2eeEJBInModule createCIM_J2eeEJBInModule();

	/**
	 * Returns a new object of class '<em>CIM J2ee Resource On Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Resource On Server</em>'.
	 * @generated
	 */
	CIM_J2eeResourceOnServer createCIM_J2eeResourceOnServer();

	/**
	 * Returns a new object of class '<em>CIM J2ee Server In Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM J2ee Server In Domain</em>'.
	 * @generated
	 */
	CIM_J2eeServerInDomain createCIM_J2eeServerInDomain();

	/**
	 * Returns a new object of class '<em>CIM To Directory Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM To Directory Action</em>'.
	 * @generated
	 */
	CIM_ToDirectoryAction createCIM_ToDirectoryAction();

	/**
	 * Returns a new object of class '<em>CIM To Directory Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM To Directory Specification</em>'.
	 * @generated
	 */
	CIM_ToDirectorySpecification createCIM_ToDirectorySpecification();

	/**
	 * Returns a new object of class '<em>CIM Associated Database System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Database System</em>'.
	 * @generated
	 */
	CIM_AssociatedDatabaseSystem createCIM_AssociatedDatabaseSystem();

	/**
	 * Returns a new object of class '<em>CIM ADSL Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ADSL Modem</em>'.
	 * @generated
	 */
	CIM_ADSLModem createCIM_ADSLModem();

	/**
	 * Returns a new object of class '<em>CIM Access Label Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Access Label Reader</em>'.
	 * @generated
	 */
	CIM_AccessLabelReader createCIM_AccessLabelReader();

	/**
	 * Returns a new object of class '<em>CIM Associated Cache Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Cache Memory</em>'.
	 * @generated
	 */
	CIM_AssociatedCacheMemory createCIM_AssociatedCacheMemory();

	/**
	 * Returns a new object of class '<em>CIM Associated Device Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Device Masking Group</em>'.
	 * @generated
	 */
	CIM_AssociatedDeviceMaskingGroup createCIM_AssociatedDeviceMaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM Associated Initiator Masking Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Initiator Masking Group</em>'.
	 * @generated
	 */
	CIM_AssociatedInitiatorMaskingGroup createCIM_AssociatedInitiatorMaskingGroup();

	/**
	 * Returns a new object of class '<em>CIM Associated Supply Voltage Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Supply Voltage Sensor</em>'.
	 * @generated
	 */
	CIM_AssociatedSupplyVoltageSensor createCIM_AssociatedSupplyVoltageSensor();

	/**
	 * Returns a new object of class '<em>CIM Cable Modem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Cable Modem</em>'.
	 * @generated
	 */
	CIM_CableModem createCIM_CableModem();

	/**
	 * Returns a new object of class '<em>CIM Collection Of Sensors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Collection Of Sensors</em>'.
	 * @generated
	 */
	CIM_CollectionOfSensors createCIM_CollectionOfSensors();

	/**
	 * Returns a new object of class '<em>CIM Current Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Current Sensor</em>'.
	 * @generated
	 */
	CIM_CurrentSensor createCIM_CurrentSensor();

	/**
	 * Returns a new object of class '<em>CIM Desktop Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Desktop Monitor</em>'.
	 * @generated
	 */
	CIM_DesktopMonitor createCIM_DesktopMonitor();

	/**
	 * Returns a new object of class '<em>CIM Disk Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Partition</em>'.
	 * @generated
	 */
	CIM_DiskPartition createCIM_DiskPartition();

	/**
	 * Returns a new object of class '<em>CIM Disk Partition Based On Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Partition Based On Volume</em>'.
	 * @generated
	 */
	CIM_DiskPartitionBasedOnVolume createCIM_DiskPartitionBasedOnVolume();

	/**
	 * Returns a new object of class '<em>CIM Disk Partition Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Disk Partition Configuration Service</em>'.
	 * @generated
	 */
	CIM_DiskPartitionConfigurationService createCIM_DiskPartitionConfigurationService();

	/**
	 * Returns a new object of class '<em>CIM GPT Disk Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM GPT Disk Partition</em>'.
	 * @generated
	 */
	CIM_GPTDiskPartition createCIM_GPTDiskPartition();

	/**
	 * Returns a new object of class '<em>CIM Monitor Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Monitor Setting</em>'.
	 * @generated
	 */
	CIM_MonitorSetting createCIM_MonitorSetting();

	/**
	 * Returns a new object of class '<em>CIM Package Temp Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Package Temp Sensor</em>'.
	 * @generated
	 */
	CIM_PackageTempSensor createCIM_PackageTempSensor();

	/**
	 * Returns a new object of class '<em>CIM Realizes Disk Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Realizes Disk Partition</em>'.
	 * @generated
	 */
	CIM_RealizesDiskPartition createCIM_RealizesDiskPartition();

	/**
	 * Returns a new object of class '<em>CIM AF Related Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM AF Related Services</em>'.
	 * @generated
	 */
	CIM_AFRelatedServices createCIM_AFRelatedServices();

	/**
	 * Returns a new object of class '<em>CIM ASBGP Endpoints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM ASBGP Endpoints</em>'.
	 * @generated
	 */
	CIM_ASBGPEndpoints createCIM_ASBGPEndpoints();

	/**
	 * Returns a new object of class '<em>CIM Hosted Network Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Hosted Network Pipe</em>'.
	 * @generated
	 */
	CIM_HostedNetworkPipe createCIM_HostedNetworkPipe();

	/**
	 * Returns a new object of class '<em>CIM OSPF Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM OSPF Area</em>'.
	 * @generated
	 */
	CIM_OSPFArea createCIM_OSPFArea();

	/**
	 * Returns a new object of class '<em>CIM Policy Action In Policy Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Action In Policy Repository</em>'.
	 * @generated
	 */
	CIM_PolicyActionInPolicyRepository createCIM_PolicyActionInPolicyRepository();

	/**
	 * Returns a new object of class '<em>CIM Policy Condition In Policy Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Condition In Policy Repository</em>'.
	 * @generated
	 */
	CIM_PolicyConditionInPolicyRepository createCIM_PolicyConditionInPolicyRepository();

	/**
	 * Returns a new object of class '<em>CIM Policy Container In Policy Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Policy Container In Policy Container</em>'.
	 * @generated
	 */
	CIM_PolicyContainerInPolicyContainer createCIM_PolicyContainerInPolicyContainer();

	/**
	 * Returns a new object of class '<em>CIM Reusable Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Reusable Policy</em>'.
	 * @generated
	 */
	CIM_ReusablePolicy createCIM_ReusablePolicy();

	/**
	 * Returns a new object of class '<em>CIM Cluster Service Access By SAP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Cluster Service Access By SAP</em>'.
	 * @generated
	 */
	CIM_ClusterServiceAccessBySAP createCIM_ClusterServiceAccessBySAP();

	/**
	 * Returns a new object of class '<em>CIM Computer System DMA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System DMA</em>'.
	 * @generated
	 */
	CIM_ComputerSystemDMA createCIM_ComputerSystemDMA();

	/**
	 * Returns a new object of class '<em>CIM Computer System IRQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System IRQ</em>'.
	 * @generated
	 */
	CIM_ComputerSystemIRQ createCIM_ComputerSystemIRQ();

	/**
	 * Returns a new object of class '<em>CIM Computer System Mapped IO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Computer System Mapped IO</em>'.
	 * @generated
	 */
	CIM_ComputerSystemMappedIO createCIM_ComputerSystemMappedIO();

	/**
	 * Returns a new object of class '<em>CIM CA Has Public Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CA Has Public Certificate</em>'.
	 * @generated
	 */
	CIM_CAHasPublicCertificate createCIM_CAHasPublicCertificate();

	/**
	 * Returns a new object of class '<em>CIM CA Signs Public Key Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM CA Signs Public Key Certificate</em>'.
	 * @generated
	 */
	CIM_CASignsPublicKeyCertificate createCIM_CASignsPublicKeyCertificate();

	/**
	 * Returns a new object of class '<em>CIM Associated Supply Current Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Associated Supply Current Sensor</em>'.
	 * @generated
	 */
	CIM_AssociatedSupplyCurrentSensor createCIM_AssociatedSupplyCurrentSensor();

	/**
	 * Returns a new object of class '<em>CIM Area Of Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Area Of Configuration</em>'.
	 * @generated
	 */
	CIM_AreaOfConfiguration createCIM_AreaOfConfiguration();

	/**
	 * Returns a new object of class '<em>CIM Endpoint In Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM Endpoint In Area</em>'.
	 * @generated
	 */
	CIM_EndpointInArea createCIM_EndpointInArea();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CimPackage getCimPackage();

} //CimFactory

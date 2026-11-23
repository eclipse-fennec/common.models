/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim.impl;

import org.dmtf.cim.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CimFactoryImpl extends EFactoryImpl implements CimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CimFactory init() {
		try {
			CimFactory theCimFactory = (CimFactory)EPackage.Registry.INSTANCE.getEFactory(CimPackage.eNS_URI);
			if (theCimFactory != null) {
				return theCimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CimPackage.CIM_PARAMETER_VALUE_SOURCES: return createCIM_ParameterValueSources();
			case CimPackage.CIM_PARAMETERS_FOR_METHOD: return createCIM_ParametersForMethod();
			case CimPackage.CIM_PRODUCT: return createCIM_Product();
			case CimPackage.CIM_PRODUCT_PARENT_CHILD: return createCIM_ProductParentChild();
			case CimPackage.CIM_PRODUCT_PHYSICAL_ELEMENTS: return createCIM_ProductPhysicalElements();
			case CimPackage.CIM_PRODUCT_PRODUCT_DEPENDENCY: return createCIM_ProductProductDependency();
			case CimPackage.CIM_REPLACEMENT_FRU: return createCIM_ReplacementFRU();
			case CimPackage.CIM_SETTINGS_DEFINE_STATE: return createCIM_SettingsDefineState();
			case CimPackage.CIM_STATISTICAL_SETTING: return createCIM_StatisticalSetting();
			case CimPackage.CIM_STATISTICS: return createCIM_Statistics();
			case CimPackage.CIM_SUPPORT_ACCESS: return createCIM_SupportAccess();
			case CimPackage.CIM_SYNCHRONIZED: return createCIM_Synchronized();
			case CimPackage.CIM_SYSTEM_CONFIGURATION: return createCIM_SystemConfiguration();
			case CimPackage.CIM_SYSTEM_STATISTICAL_INFORMATION: return createCIM_SystemStatisticalInformation();
			case CimPackage.CIM_COMMON_DATABASE_SETTING_DATA: return createCIM_CommonDatabaseSettingData();
			case CimPackage.CIM_COMMON_DATABASE_STATISTICS: return createCIM_CommonDatabaseStatistics();
			case CimPackage.CIM_DATABASE_RESOURCE_STATISTICS: return createCIM_DatabaseResourceStatistics();
			case CimPackage.CIM_DATABASE_SERVICE_STATISTICS: return createCIM_DatabaseServiceStatistics();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST: return createCIM_BlockStatisticsManifest();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA: return createCIM_BlockStorageStatisticalData();
			case CimPackage.CIM_DEVICE_ERROR_COUNTS: return createCIM_DeviceErrorCounts();
			case CimPackage.CIM_DEVICE_ERROR_DATA: return createCIM_DeviceErrorData();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS: return createCIM_FCPortRateStatistics();
			case CimPackage.CIM_FC_SWITCH_SETTINGS: return createCIM_FCSwitchSettings();
			case CimPackage.CIM_FILE_SYSTEM_GROUP_SYNCHRONIZED: return createCIM_FileSystemGroupSynchronized();
			case CimPackage.CIM_FILE_SYSTEM_SYNCHRONIZED: return createCIM_FileSystemSynchronized();
			case CimPackage.CIM_LABEL_READER_STAT_DATA: return createCIM_LabelReaderStatData();
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS: return createCIM_LogicalPortSettings();
			case CimPackage.CIM_LOGICAL_PORT_STATISTICS: return createCIM_LogicalPortStatistics();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_DATA: return createCIM_MediaAccessStatData();
			case CimPackage.CIM_NETWORK_PORT_SETTINGS: return createCIM_NetworkPortSettings();
			case CimPackage.CIM_NETWORK_PORT_STATISTICS: return createCIM_NetworkPortStatistics();
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST: return createCIM_OperationalPowerManifest();
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICAL_DATA: return createCIM_OperationalPowerStatisticalData();
			case CimPackage.CIM_PICKER_STAT_DATA: return createCIM_PickerStatData();
			case CimPackage.CIM_POWERED_STATISTICAL_DATA: return createCIM_PoweredStatisticalData();
			case CimPackage.CIM_REPLICATION_SETTING_DATA: return createCIM_ReplicationSettingData();
			case CimPackage.CIM_SCSI_MULTIPATH_SETTINGS: return createCIM_SCSIMultipathSettings();
			case CimPackage.CIM_STORAGE_ERASURE_SETTING: return createCIM_StorageErasureSetting();
			case CimPackage.CIM_STORAGE_ERROR: return createCIM_StorageError();
			case CimPackage.CIM_STORAGE_POOL_VIEW: return createCIM_StoragePoolView();
			case CimPackage.CIM_STORAGE_PROTECTION_SETTING: return createCIM_StorageProtectionSetting();
			case CimPackage.CIM_STORAGE_SETTING: return createCIM_StorageSetting();
			case CimPackage.CIM_STORAGE_SYNCHRONIZED: return createCIM_StorageSynchronized();
			case CimPackage.CIM_SYNCHRONIZATION_ASPECT: return createCIM_SynchronizationAspect();
			case CimPackage.CIM_TAPE_DRIVE_RESOURCE_USAGE: return createCIM_TapeDriveResourceUsage();
			case CimPackage.CIM_TIER_SETTING_DATA: return createCIM_TierSettingData();
			case CimPackage.CIM_TOKEN_RING_PORT_STATISTICS: return createCIM_TokenRingPortStatistics();
			case CimPackage.CIM_VTL_RESOURCE_USAGE: return createCIM_VTLResourceUsage();
			case CimPackage.CIM_VTL_STATISTICAL_DATA: return createCIM_VTLStatisticalData();
			case CimPackage.CIM_VIDEO_HEAD_RESOLUTION: return createCIM_VideoHeadResolution();
			case CimPackage.CIM_INDICATION_FILTER: return createCIM_IndicationFilter();
			case CimPackage.CIM_INDICATION_SERVICE_SETTING_DATA: return createCIM_IndicationServiceSettingData();
			case CimPackage.CIM_INST_METHOD_CALL: return createCIM_InstMethodCall();
			case CimPackage.CIM_INST_MODIFICATION: return createCIM_InstModification();
			case CimPackage.CIM_INST_READ: return createCIM_InstRead();
			case CimPackage.CIM_LISTENER_DESTINATION_CIMXML: return createCIM_ListenerDestinationCIMXML();
			case CimPackage.CIM_LISTENER_DESTINATION_WS_MANAGEMENT: return createCIM_ListenerDestinationWSManagement();
			case CimPackage.CIM_SNMP_TRAP_INDICATION: return createCIM_SNMPTrapIndication();
			case CimPackage.CIM_CIMOM_STATISTICAL_DATA: return createCIM_CIMOMStatisticalData();
			case CimPackage.CIM_ERROR: return createCIM_Error();
			case CimPackage.CIM_GENERIC_OPERATION_CAPABILITIES_STRUCTURE: return createCIM_GenericOperationCapabilitiesStructure();
			case CimPackage.CIM_MESSAGE: return createCIM_Message();
			case CimPackage.CIM_NAMESPACE: return createCIM_Namespace();
			case CimPackage.CIM_REGISTERED_SPECIFICATION: return createCIM_RegisteredSpecification();
			case CimPackage.CIM_SCHEMA_INFORMATION_STRUCTURE: return createCIM_SchemaInformationStructure();
			case CimPackage.CIM_SYSTEM_IDENTIFICATION: return createCIM_SystemIdentification();
			case CimPackage.CIM_SYSTEM_IN_NAMESPACE: return createCIM_SystemInNamespace();
			case CimPackage.CIM_WBEM_SERVER_NAMESPACE: return createCIM_WBEMServerNamespace();
			case CimPackage.CIM_BASE_METRIC_DEFINITION: return createCIM_BaseMetricDefinition();
			case CimPackage.CIM_BASE_METRIC_VALUE: return createCIM_BaseMetricValue();
			case CimPackage.CIM_METRIC_DEFINITION: return createCIM_MetricDefinition();
			case CimPackage.CIM_TRACE_LEVEL_TYPE: return createCIM_TraceLevelType();
			case CimPackage.CIM_UNIT_OF_WORK: return createCIM_UnitOfWork();
			case CimPackage.CIM_BGP_ENDPOINT_STATISTICS: return createCIM_BGPEndpointStatistics();
			case CimPackage.CIM_CLP_SETTING_DATA: return createCIM_CLPSettingData();
			case CimPackage.CIM_CONNECTIVITY_MEMBERSHIP_SETTING_DATA: return createCIM_ConnectivityMembershipSettingData();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA: return createCIM_EncapsulationMappingSettingData();
			case CimPackage.CIM_IEEE802_1X_SETTINGS: return createCIM_IEEE8021xSettings();
			case CimPackage.CIM_IP_ASSIGNMENT_SETTING_DATA: return createCIM_IPAssignmentSettingData();
			case CimPackage.CIM_IP_ENCAPSULATION_INTERFACE: return createCIM_IPEncapsulationInterface();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA: return createCIM_IPInterfaceSettingData();
			case CimPackage.CIM_IP_VERSION_SETTING_DATA: return createCIM_IPVersionSettingData();
			case CimPackage.CIM_NETWORK_POLICY_ACTION_SETTING_DATA: return createCIM_NetworkPolicyActionSettingData();
			case CimPackage.CIM_NETWORK_POLICY_RULE_SETTING_DATA: return createCIM_NetworkPolicyRuleSettingData();
			case CimPackage.CIM_NEXT_HOP_ROUTE: return createCIM_NextHopRoute();
			case CimPackage.CIM_SA_ENDPOINT_CONNECTION_STATISTICS: return createCIM_SAEndpointConnectionStatistics();
			case CimPackage.CIM_SA_ENDPOINT_REFRESH_SETTINGS: return createCIM_SAEndpointRefreshSettings();
			case CimPackage.CIM_SSH_SETTING_DATA: return createCIM_SSHSettingData();
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA: return createCIM_StaticIPAssignmentSettingData();
			case CimPackage.CIM_TELNET_SETTING_DATA: return createCIM_TelnetSettingData();
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA: return createCIM_VLANEndpointSettingData();
			case CimPackage.CIM_WRR_SCHEDULING_ELEMENT: return createCIM_WRRSchedulingElement();
			case CimPackage.CIM_WI_FI_ENDPOINT_SETTINGS: return createCIM_WiFiEndpointSettings();
			case CimPackage.CIM_WI_FI_NETWORK_DETECTION_SETTINGS: return createCIM_WiFiNetworkDetectionSettings();
			case CimPackage.CIM_ISCSI_CONNECTION_SETTINGS: return createCIM_iSCSIConnectionSettings();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS: return createCIM_iSCSILoginStatistics();
			case CimPackage.CIM_ISCSI_SESSION_FAILURES: return createCIM_iSCSISessionFailures();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS: return createCIM_iSCSISessionSettings();
			case CimPackage.CIM_ISCSI_SESSION_STATISTICS: return createCIM_iSCSISessionStatistics();
			case CimPackage.CIM_MEDIA_PHYSICAL_STAT_DATA: return createCIM_MediaPhysicalStatData();
			case CimPackage.CIM_PHYSICAL_COMPONENT: return createCIM_PhysicalComponent();
			case CimPackage.CIM_PHYSICAL_CONNECTOR: return createCIM_PhysicalConnector();
			case CimPackage.CIM_PHYSICAL_LINK: return createCIM_PhysicalLink();
			case CimPackage.CIM_PHYSICAL_MEDIA: return createCIM_PhysicalMedia();
			case CimPackage.CIM_PHYSICAL_PACKAGE: return createCIM_PhysicalPackage();
			case CimPackage.CIM_PHYSICAL_TAPE: return createCIM_PhysicalTape();
			case CimPackage.CIM_SLOT: return createCIM_Slot();
			case CimPackage.CIM_POLICY_SET_APPLIES_TO_ELEMENT: return createCIM_PolicySetAppliesToElement();
			case CimPackage.CIM_POLICY_TIME_PERIOD_CONDITION: return createCIM_PolicyTimePeriodCondition();
			case CimPackage.CIM_QUERY_CONDITION: return createCIM_QueryCondition();
			case CimPackage.CIM_REJECT_CONNECTION_ACTION: return createCIM_RejectConnectionAction();
			case CimPackage.CIM_VENDOR_POLICY_ACTION: return createCIM_VendorPolicyAction();
			case CimPackage.CIM_VENDOR_POLICY_CONDITION: return createCIM_VendorPolicyCondition();
			case CimPackage.CIM_BIOS_ATTRIBUTE: return createCIM_BIOSAttribute();
			case CimPackage.CIM_BIOS_ENUMERATION: return createCIM_BIOSEnumeration();
			case CimPackage.CIM_BIOS_INTEGER: return createCIM_BIOSInteger();
			case CimPackage.CIM_BIOS_PASSWORD: return createCIM_BIOSPassword();
			case CimPackage.CIM_BIOS_STRING: return createCIM_BIOSString();
			case CimPackage.CIM_BOOT_SOURCE_SETTING: return createCIM_BootSourceSetting();
			case CimPackage.CIM_CIFS_SETTING_DATA: return createCIM_CIFSSettingData();
			case CimPackage.CIM_DIAGNOSTIC_RESULT: return createCIM_DiagnosticResult();
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_MSE: return createCIM_DiagnosticResultForMSE();
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE: return createCIM_DiagnosticResultInPackage();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_DATA: return createCIM_DiagnosticSettingData();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SETTING_DATA: return createCIM_DiskDriveDiagnosticSettingData();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_SETTING: return createCIM_ExportedFileShareSetting();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SETTING_DATA: return createCIM_FCHBADiagnosticSettingData();
			case CimPackage.CIM_FSIP_INTERFACE_SETTING_DATA: return createCIM_FSIPInterfaceSettingData();
			case CimPackage.CIM_FS_QUOTA_CONFIG_ENTRY: return createCIM_FSQuotaConfigEntry();
			case CimPackage.CIM_FS_QUOTA_INDICATION: return createCIM_FSQuotaIndication();
			case CimPackage.CIM_FILE_SERVER_SETTINGS: return createCIM_FileServerSettings();
			case CimPackage.CIM_FILE_SYSTEM_SETTING: return createCIM_FileSystemSetting();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA: return createCIM_FileSystemStatisticalData();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST: return createCIM_FileSystemStatisticsManifest();
			case CimPackage.CIM_JOB_SETTING_DATA: return createCIM_JobSettingData();
			case CimPackage.CIM_METHOD_RESULT: return createCIM_MethodResult();
			case CimPackage.CIM_NFS_SETTING_DATA: return createCIM_NFSSettingData();
			case CimPackage.CIM_NIS_SETTING_DATA: return createCIM_NISSettingData();
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS: return createCIM_SummaryDiagnostics();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICAL_INFORMATION: return createCIM_UnixProcessStatisticalInformation();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MIGRATION_SETTING_DATA: return createCIM_VirtualSystemMigrationSettingData();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA: return createCIM_VirtualSystemSettingData();
			case CimPackage.CIM_ACCOUNT_SETTING_DATA: return createCIM_AccountSettingData();
			case CimPackage.CIM_ASSOCIATED_PRIVILEGE: return createCIM_AssociatedPrivilege();
			case CimPackage.CIM_CREDENTIAL_CONTEXT: return createCIM_CredentialContext();
			case CimPackage.CIM_IDENTITY: return createCIM_Identity();
			case CimPackage.CIM_IDENTITY_CONTEXT: return createCIM_IdentityContext();
			case CimPackage.CIM_KERBEROS_CREDENTIAL: return createCIM_KerberosCredential();
			case CimPackage.CIM_KERBEROS_TICKET: return createCIM_KerberosTicket();
			case CimPackage.CIM_NAMED_CREDENTIAL: return createCIM_NamedCredential();
			case CimPackage.CIM_NAMED_SHARED_IKE_SECRET: return createCIM_NamedSharedIKESecret();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_OWNER: return createCIM_OpaqueManagementDataOwner();
			case CimPackage.CIM_OTHER_GROUP_INFORMATION: return createCIM_OtherGroupInformation();
			case CimPackage.CIM_OTHER_ORG_UNIT_INFORMATION: return createCIM_OtherOrgUnitInformation();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION: return createCIM_OtherOrganizationInformation();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION: return createCIM_OtherPersonInformation();
			case CimPackage.CIM_OTHER_ROLE_INFORMATION: return createCIM_OtherRoleInformation();
			case CimPackage.CIM_PRIVILEGE: return createCIM_Privilege();
			case CimPackage.CIM_SECURITY_SENSITIVITY: return createCIM_SecuritySensitivity();
			case CimPackage.CIM_SHARED_CREDENTIAL: return createCIM_SharedCredential();
			case CimPackage.CIM_SHARED_SECRET: return createCIM_SharedSecret();
			case CimPackage.CIM_SIGNED_CREDENTIAL: return createCIM_SignedCredential();
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA: return createCIM_StorageClientSettingData();
			case CimPackage.CIM_STORAGE_HARDWARE_ID: return createCIM_StorageHardwareID();
			case CimPackage.CIM_UNSIGNED_CREDENTIAL: return createCIM_UnsignedCredential();
			case CimPackage.CIM_UNSIGNED_PUBLIC_KEY: return createCIM_UnsignedPublicKey();
			case CimPackage.CIM_USERS_ACCESS: return createCIM_UsersAccess();
			case CimPackage.CIM_X509_INFRASTRUCTURE: return createCIM_X509Infrastructure();
			case CimPackage.CIM_J2EE_NOTIFICATION: return createCIM_J2eeNotification();
			case CimPackage.CIM_STATISTICAL_RUNTIME_OVERVIEW: return createCIM_StatisticalRuntimeOverview();
			case CimPackage.CIM_COMPATIBLE_PRODUCT: return createCIM_CompatibleProduct();
			case CimPackage.CIM_CONCRETE_COLLECTION: return createCIM_ConcreteCollection();
			case CimPackage.CIM_CONCRETE_COMPONENT: return createCIM_ConcreteComponent();
			case CimPackage.CIM_CONCRETE_COMPONENT_VIEW: return createCIM_ConcreteComponentView();
			case CimPackage.CIM_CONFIGURATION: return createCIM_Configuration();
			case CimPackage.CIM_CONFIGURATION_COMPONENT: return createCIM_ConfigurationComponent();
			case CimPackage.CIM_CONFIGURATION_DATA: return createCIM_ConfigurationData();
			case CimPackage.CIM_DEPENDENCY_CONTEXT: return createCIM_DependencyContext();
			case CimPackage.CIM_DEVICE_STATISTICAL_INFORMATION: return createCIM_DeviceStatisticalInformation();
			case CimPackage.CIM_ELEMENT_CAPABILITIES: return createCIM_ElementCapabilities();
			case CimPackage.CIM_ELEMENT_CONFIGURATION: return createCIM_ElementConfiguration();
			case CimPackage.CIM_ELEMENT_SETTING_DATA: return createCIM_ElementSettingData();
			case CimPackage.CIM_ELEMENT_STATISTICAL_DATA: return createCIM_ElementStatisticalData();
			case CimPackage.CIM_ELEMENT_VIEW: return createCIM_ElementView();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT_CAPABILITIES: return createCIM_EnabledLogicalElementCapabilities();
			case CimPackage.CIM_FRU: return createCIM_FRU();
			case CimPackage.CIM_FRU_INCLUDES_PRODUCT: return createCIM_FRUIncludesProduct();
			case CimPackage.CIM_FRU_PHYSICAL_ELEMENTS: return createCIM_FRUPhysicalElements();
			case CimPackage.CIM_GROUP_SYNCHRONIZED: return createCIM_GroupSynchronized();
			case CimPackage.CIM_HOSTED_DEPENDENCY: return createCIM_HostedDependency();
			case CimPackage.CIM_IMPLEMENTATION_CAPABILITIES: return createCIM_ImplementationCapabilities();
			case CimPackage.CIM_JOB_CAPABILITIES: return createCIM_JobCapabilities();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_CAPABILITIES: return createCIM_LaunchInContextCapabilities();
			case CimPackage.CIM_LOCALIZATION_CAPABILITIES: return createCIM_LocalizationCapabilities();
			case CimPackage.CIM_LOCATION: return createCIM_Location();
			case CimPackage.CIM_MEMBER_OF_COLLECTION: return createCIM_MemberOfCollection();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_CAPABILITIES: return createCIM_OpaqueManagementDataCapabilities();
			case CimPackage.CIM_ORDERED_COMPONENT: return createCIM_OrderedComponent();
			case CimPackage.CIM_ORDERED_DEPENDENCY: return createCIM_OrderedDependency();
			case CimPackage.CIM_ORDERED_MEMBER_OF_COLLECTION: return createCIM_OrderedMemberOfCollection();
			case CimPackage.CIM_OWNING_COLLECTION_ELEMENT: return createCIM_OwningCollectionElement();
			case CimPackage.CIM_PHYSICAL_STATISTICAL_INFORMATION: return createCIM_PhysicalStatisticalInformation();
			case CimPackage.CIM_PHYSICAL_STATISTICS: return createCIM_PhysicalStatistics();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES: return createCIM_PowerManagementCapabilities();
			case CimPackage.CIM_PRODUCT_COMPONENT: return createCIM_ProductComponent();
			case CimPackage.CIM_PRODUCT_ELEMENT_COMPONENT: return createCIM_ProductElementComponent();
			case CimPackage.CIM_PRODUCT_FRU: return createCIM_ProductFRU();
			case CimPackage.CIM_PRODUCT_PHYSICAL_COMPONENT: return createCIM_ProductPhysicalComponent();
			case CimPackage.CIM_PRODUCT_SUPPORT: return createCIM_ProductSupport();
			case CimPackage.CIM_PROFILE: return createCIM_Profile();
			case CimPackage.CIM_REDUNDANCY_GROUP: return createCIM_RedundancyGroup();
			case CimPackage.CIM_RELATED_ELEMENT_CAUSING_ERROR: return createCIM_RelatedElementCausingError();
			case CimPackage.CIM_RELATED_STATISTICAL_DATA: return createCIM_RelatedStatisticalData();
			case CimPackage.CIM_RELATED_STATISTICS: return createCIM_RelatedStatistics();
			case CimPackage.CIM_REPLACEABLE_PRODUCT_FRU: return createCIM_ReplaceableProductFRU();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA: return createCIM_ResourceAllocationSettingData();
			case CimPackage.CIM_RESOURCE_POOL: return createCIM_ResourcePool();
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES: return createCIM_ResourcePoolConfigurationCapabilities();
			case CimPackage.CIM_SAP_STATISTICAL_INFORMATION: return createCIM_SAPStatisticalInformation();
			case CimPackage.CIM_SERVICE_STATISTICAL_INFORMATION: return createCIM_ServiceStatisticalInformation();
			case CimPackage.CIM_SETTING_CONTEXT: return createCIM_SettingContext();
			case CimPackage.CIM_SETTINGS_DEFINE_CAPABILITIES: return createCIM_SettingsDefineCapabilities();
			case CimPackage.CIM_SOFTWARE_IDENTITY: return createCIM_SoftwareIdentity();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE_CAPABILITIES: return createCIM_SoftwareInstallationServiceCapabilities();
			case CimPackage.CIM_SPARE_GROUP: return createCIM_SpareGroup();
			case CimPackage.CIM_SPARED: return createCIM_Spared();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA: return createCIM_StorageAllocationSettingData();
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP: return createCIM_StorageRedundancyGroup();
			case CimPackage.CIM_SYSTEM_SETTING_CONTEXT: return createCIM_SystemSettingContext();
			case CimPackage.CIM_SYSTEM_SPECIFIC_COLLECTION: return createCIM_SystemSpecificCollection();
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA: return createCIM_VirtualEthernetSwitchSettingData();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_CAPABILITIES: return createCIM_VirtualSystemManagementCapabilities();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES: return createCIM_VirtualSystemSnapshotCapabilities();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE_CAPABILITIES: return createCIM_VirtualSystemSnapshotServiceCapabilities();
			case CimPackage.CIM_COMMON_DATABASE_CAPABILITIES: return createCIM_CommonDatabaseCapabilities();
			case CimPackage.CIM_DATABASE_SEGMENT_SETTING_DATA: return createCIM_DatabaseSegmentSettingData();
			case CimPackage.CIM_RELATIONAL_DATABASE_CAPABILITIES: return createCIM_RelationalDatabaseCapabilities();
			case CimPackage.CIM_SNMP_DATABASE_PARAMETER: return createCIM_SNMPDatabaseParameter();
			case CimPackage.CIM_ADVANCED_STORAGE_SETTING: return createCIM_AdvancedStorageSetting();
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES: return createCIM_AlarmDeviceCapabilities();
			case CimPackage.CIM_ALLOCATED_RESOURCES: return createCIM_AllocatedResources();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST_COLLECTION: return createCIM_BlockStatisticsManifestCollection();
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES: return createCIM_DeviceSharingCapabilities();
			case CimPackage.CIM_DISK_DRIVE_VIEW: return createCIM_DiskDriveView();
			case CimPackage.CIM_DISK_GROUP: return createCIM_DiskGroup();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_CAPABILITIES: return createCIM_DiskPartitionConfigurationCapabilities();
			case CimPackage.CIM_DRIVE_COMPONENT_VIEW_VIEW: return createCIM_DriveComponentViewView();
			case CimPackage.CIM_ELEMENT_STATISTICAL_DATA_VIEW: return createCIM_ElementStatisticalDataView();
			case CimPackage.CIM_ELEMENT_STORAGE_PROTECTION_SETTING_DATA: return createCIM_ElementStorageProtectionSettingData();
			case CimPackage.CIM_ETHERNET_PORT_STATISTICS: return createCIM_EthernetPortStatistics();
			case CimPackage.CIM_FC_ADAPTER_EVENT_COUNTERS: return createCIM_FCAdapterEventCounters();
			case CimPackage.CIM_FC_PORT_SETTINGS: return createCIM_FCPortSettings();
			case CimPackage.CIM_FC_PORT_STATISTICS: return createCIM_FCPortStatistics();
			case CimPackage.CIM_FC_SWITCH_CAPABILITIES: return createCIM_FCSwitchCapabilities();
			case CimPackage.CIM_FAILOVER_STORAGE_EXTENTS_COLLECTION: return createCIM_FailoverStorageExtentsCollection();
			case CimPackage.CIM_FIBRE_PORT_EVENT_COUNTERS: return createCIM_FibrePortEventCounters();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_CAPABILITIES: return createCIM_FileSystemReplicationCapabilities();
			case CimPackage.CIM_INDICATOR_LED_CAPABILITIES: return createCIM_IndicatorLEDCapabilities();
			case CimPackage.CIM_LLDP_ETHERNET_PORT_STATISTICS: return createCIM_LLDPEthernetPortStatistics();
			case CimPackage.CIM_LABEL_READER_STAT_INFO: return createCIM_LabelReaderStatInfo();
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES: return createCIM_LogicalPortCapabilities();
			case CimPackage.CIM_LOGICAL_PORT_GROUP: return createCIM_LogicalPortGroup();
			case CimPackage.CIM_MAPPING_PROTOCOL_CONTROLLER_VIEW: return createCIM_MappingProtocolControllerView();
			case CimPackage.CIM_MASKING_GROUP: return createCIM_MaskingGroup();
			case CimPackage.CIM_MEDIA_ACCESS_STAT_INFO: return createCIM_MediaAccessStatInfo();
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA: return createCIM_MemoryAllocationSettingData();
			case CimPackage.CIM_MEMORY_CAPABILITIES: return createCIM_MemoryCapabilities();
			case CimPackage.CIM_MEMORY_CONFIGURATION_CAPABILITIES: return createCIM_MemoryConfigurationCapabilities();
			case CimPackage.CIM_MEMORY_ERROR: return createCIM_MemoryError();
			case CimPackage.CIM_MONITOR_RESOLUTION: return createCIM_MonitorResolution();
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES: return createCIM_NetworkPortCapabilities();
			case CimPackage.CIM_OPERATIONAL_POWER_MANIFEST_COLLECTION: return createCIM_OperationalPowerManifestCollection();
			case CimPackage.CIM_PCI_PORT_GROUP: return createCIM_PCIPortGroup();
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES: return createCIM_PersistentConfigurationCapabilities();
			case CimPackage.CIM_PERSISTENT_MEMORY_CAPABILITIES: return createCIM_PersistentMemoryCapabilities();
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE_SETTING_DATA: return createCIM_PersistentMemoryNamespaceSettingData();
			case CimPackage.CIM_PICKER_STAT_INFO: return createCIM_PickerStatInfo();
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA: return createCIM_PowerAllocationSettingData();
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES: return createCIM_PowerUtilizationManagementCapabilities();
			case CimPackage.CIM_PROCESSOR_CAPABILITIES: return createCIM_ProcessorCapabilities();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_MASKING_CAPABILITIES: return createCIM_ProtocolControllerMaskingCapabilities();
			case CimPackage.CIM_REMOTE_RESOURCES: return createCIM_RemoteResources();
			case CimPackage.CIM_REPLICA_PAIR_VIEW: return createCIM_ReplicaPairView();
			case CimPackage.CIM_REPLICATION_GROUP: return createCIM_ReplicationGroup();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES: return createCIM_SCSIMultipathConfigurationCapabilities();
			case CimPackage.CIM_SCSI_TARGET_PORT_GROUP: return createCIM_SCSITargetPortGroup();
			case CimPackage.CIM_SPARE_CONFIGURATION_CAPABILITIES: return createCIM_SpareConfigurationCapabilities();
			case CimPackage.CIM_STATISTICS_CAPABILITIES: return createCIM_StatisticsCapabilities();
			case CimPackage.CIM_STORAGE_CAPABILITIES: return createCIM_StorageCapabilities();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_CAPABILITIES: return createCIM_StorageElementCompositionCapabilities();
			case CimPackage.CIM_STORAGE_ERASURE_CAPABILITIES: return createCIM_StorageErasureCapabilities();
			case CimPackage.CIM_STORAGE_LIBRARY_CAPABILITIES: return createCIM_StorageLibraryCapabilities();
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_SETTING_DATA: return createCIM_StoragePoolDiagnosticSettingData();
			case CimPackage.CIM_STORAGE_PROTECTION_CAPABILITIES: return createCIM_StorageProtectionCapabilities();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES: return createCIM_StorageReplicationCapabilities();
			case CimPackage.CIM_STORAGE_RESOURCE_LOAD_GROUP: return createCIM_StorageResourceLoadGroup();
			case CimPackage.CIM_STORAGE_SERVER_ASYMMETRY_CAPABILITIES: return createCIM_StorageServerAsymmetryCapabilities();
			case CimPackage.CIM_STORAGE_SETTING_WITH_HINTS: return createCIM_StorageSettingWithHints();
			case CimPackage.CIM_STORAGE_TIER: return createCIM_StorageTier();
			case CimPackage.CIM_STORAGE_TIER_CAPABILITIES: return createCIM_StorageTierCapabilities();
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES: return createCIM_SystemRegistrationCapabilities();
			case CimPackage.CIM_TARGET_MASKING_GROUP: return createCIM_TargetMaskingGroup();
			case CimPackage.CIM_TARGET_PORT_GROUP: return createCIM_TargetPortGroup();
			case CimPackage.CIM_TIER_SERVICE_CAPABILITIES: return createCIM_TierServiceCapabilities();
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE_CAPABILITIES: return createCIM_VTLStatisticalDataServiceCapabilities();
			case CimPackage.CIM_VIDEO_CONTROLLER_RESOLUTION: return createCIM_VideoControllerResolution();
			case CimPackage.CIM_VIEW_CAPABILITIES: return createCIM_ViewCapabilities();
			case CimPackage.CIM_VOLUME_VIEW: return createCIM_VolumeView();
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES: return createCIM_WiFiPortCapabilities();
			case CimPackage.CIM_ZONE_CAPABILITIES: return createCIM_ZoneCapabilities();
			case CimPackage.CIM_ZONE_MEMBERSHIP_SETTING_DATA: return createCIM_ZoneMembershipSettingData();
			case CimPackage.CIM_ALERT_INDICATION: return createCIM_AlertIndication();
			case CimPackage.CIM_ALERT_INST_INDICATION: return createCIM_AlertInstIndication();
			case CimPackage.CIM_CLASS_MODIFICATION: return createCIM_ClassModification();
			case CimPackage.CIM_FILTER_COLLECTION: return createCIM_FilterCollection();
			case CimPackage.CIM_FILTER_COLLECTION_SUBSCRIPTION: return createCIM_FilterCollectionSubscription();
			case CimPackage.CIM_INDICATION_HANDLER_CIMXML: return createCIM_IndicationHandlerCIMXML();
			case CimPackage.CIM_INDICATION_SERVICE_CAPABILITIES: return createCIM_IndicationServiceCapabilities();
			case CimPackage.CIM_INDICATION_SUBSCRIPTION: return createCIM_IndicationSubscription();
			case CimPackage.CIM_INST_CREATION: return createCIM_InstCreation();
			case CimPackage.CIM_INST_DELETION: return createCIM_InstDeletion();
			case CimPackage.CIM_THRESHOLD_INDICATION: return createCIM_ThresholdIndication();
			case CimPackage.CIM_SA_STATIC_ACTION: return createCIM_SAStaticAction();
			case CimPackage.CIM_QUERY_CAPABILITIES: return createCIM_QueryCapabilities();
			case CimPackage.CIM_REFERENCED_SPECIFICATION: return createCIM_ReferencedSpecification();
			case CimPackage.CIM_REGISTERED_PROFILE: return createCIM_RegisteredProfile();
			case CimPackage.CIM_REGISTERED_SUB_PROFILE: return createCIM_RegisteredSubProfile();
			case CimPackage.CIM_WBEM_SERVER_CAPABILITIES: return createCIM_WBEMServerCapabilities();
			case CimPackage.CIM_AGGREGATION_METRIC_DEFINITION: return createCIM_AggregationMetricDefinition();
			case CimPackage.CIM_AGGREGATION_METRIC_VALUE: return createCIM_AggregationMetricValue();
			case CimPackage.CIM_LOGICAL_ELEMENT_PERFORMS_UO_W: return createCIM_LogicalElementPerformsUoW();
			case CimPackage.CIM_METRIC_DEF_FOR_ME: return createCIM_MetricDefForME();
			case CimPackage.CIM_METRIC_FOR_ME: return createCIM_MetricForME();
			case CimPackage.CIM_METRIC_INSTANCE: return createCIM_MetricInstance();
			case CimPackage.CIM_METRIC_SERVICE_CAPABILITIES: return createCIM_MetricServiceCapabilities();
			case CimPackage.CIM_SUB_UO_W: return createCIM_SubUoW();
			case CimPackage.CIM_UNIT_OF_WORK_DEFINITION: return createCIM_UnitOfWorkDefinition();
			case CimPackage.CIM_UO_WDEF_TRACE_LEVEL_TYPE: return createCIM_UoWDefTraceLevelType();
			case CimPackage.CIM_UO_WMETRIC: return createCIM_UoWMetric();
			case CimPackage.CIM_UO_WMETRIC_DEFINITION: return createCIM_UoWMetricDefinition();
			case CimPackage.CIM_ADMINISTRATIVE_DISTANCE: return createCIM_AdministrativeDistance();
			case CimPackage.CIM_ALLOCATION_SCHEDULING_ELEMENT: return createCIM_AllocationSchedulingElement();
			case CimPackage.CIM_BGP_ATTRIBUTES: return createCIM_BGPAttributes();
			case CimPackage.CIM_BGP_CLUSTER: return createCIM_BGPCluster();
			case CimPackage.CIM_BGP_PATH_ATTRIBUTES: return createCIM_BGPPathAttributes();
			case CimPackage.CIM_BGP_PEER_GROUP: return createCIM_BGPPeerGroup();
			case CimPackage.CIM_BGP_ROUTE_MAP: return createCIM_BGPRouteMap();
			case CimPackage.CIM_BGP_STATISTICS: return createCIM_BGPStatistics();
			case CimPackage.CIM_BUFFER_POOL: return createCIM_BufferPool();
			case CimPackage.CIM_COLLECTED_BUFFER_POOL: return createCIM_CollectedBufferPool();
			case CimPackage.CIM_CONNECTIVITY_COLLECTION: return createCIM_ConnectivityCollection();
			case CimPackage.CIM_DHCP_CAPABILITIES: return createCIM_DHCPCapabilities();
			case CimPackage.CIM_DHCP_SETTING_DATA: return createCIM_DHCPSettingData();
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA: return createCIM_DNSGeneralSettingData();
			case CimPackage.CIM_DNS_SETTING_DATA: return createCIM_DNSSettingData();
			case CimPackage.CIM_DYNAMIC_FORWARDING_ENTRY: return createCIM_DynamicForwardingEntry();
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA: return createCIM_ExtendedStaticIPAssignmentSettingData();
			case CimPackage.CIM_FILTER_LIST: return createCIM_FilterList();
			case CimPackage.CIM_FILTER_LISTS_IN_BGP_ROUTE_MAP: return createCIM_FilterListsInBGPRouteMap();
			case CimPackage.CIM_HDR8021_FILTER: return createCIM_Hdr8021Filter();
			case CimPackage.CIM_IEEE802_1X_CAPABILITIES: return createCIM_IEEE8021xCapabilities();
			case CimPackage.CIM_IP_CONNECTIVITY_SUBNET: return createCIM_IPConnectivitySubnet();
			case CimPackage.CIM_IP_HEADERS_FILTER: return createCIM_IPHeadersFilter();
			case CimPackage.CIM_IPSO_FILTER_ENTRY: return createCIM_IPSOFilterEntry();
			case CimPackage.CIM_IPX_CONNECTIVITY_NETWORK: return createCIM_IPXConnectivityNetwork();
			case CimPackage.CIM_LAN_CONNECTIVITY_SEGMENT: return createCIM_LANConnectivitySegment();
			case CimPackage.CIM_LOGICAL_NETWORK: return createCIM_LogicalNetwork();
			case CimPackage.CIM_NAMED_ADDRESS_COLLECTION: return createCIM_NamedAddressCollection();
			case CimPackage.CIM_NETWORK_POLICY_ACTION: return createCIM_NetworkPolicyAction();
			case CimPackage.CIM_NETWORK_POLICY_CONDITION: return createCIM_NetworkPolicyCondition();
			case CimPackage.CIM_NETWORK_VLAN: return createCIM_NetworkVLAN();
			case CimPackage.CIM_NEXT_HOP_IP_ROUTE: return createCIM_NextHopIPRoute();
			case CimPackage.CIM_OSPF_AREA_CONFIGURATION: return createCIM_OSPFAreaConfiguration();
			case CimPackage.CIM_OSPF_LINK: return createCIM_OSPFLink();
			case CimPackage.CIM_OSPF_SERVICE_CAPABILITIES: return createCIM_OSPFServiceCapabilities();
			case CimPackage.CIM_PEER_ID_PAYLOAD_FILTER_ENTRY: return createCIM_PeerIDPayloadFilterEntry();
			case CimPackage.CIM_PREAMBLE_FILTER: return createCIM_PreambleFilter();
			case CimPackage.CIM_PRIORITY_SCHEDULING_ELEMENT: return createCIM_PrioritySchedulingElement();
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES: return createCIM_ProtocolServiceCapabilities();
			case CimPackage.CIM_RANGE_OF_IP_ADDRESSES: return createCIM_RangeOfIPAddresses();
			case CimPackage.CIM_RANGES_OF_CONFIGURATION: return createCIM_RangesOfConfiguration();
			case CimPackage.CIM_REDIRECTION_SERVICE_CAPABILITIES: return createCIM_RedirectionServiceCapabilities();
			case CimPackage.CIM_ROUTING_POLICY: return createCIM_RoutingPolicy();
			case CimPackage.CIM_SSH_CAPABILITIES: return createCIM_SSHCapabilities();
			case CimPackage.CIM_SPANNING_TREE_STATISTICS: return createCIM_SpanningTreeStatistics();
			case CimPackage.CIM_STATIC_FORWARDING_ENTRY: return createCIM_StaticForwardingEntry();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING_STATISTICS: return createCIM_SwitchPortSourceRoutingStatistics();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE_STATISTICS: return createCIM_SwitchPortSpanningTreeStatistics();
			case CimPackage.CIM_SWITCH_PORT_STATISTICS: return createCIM_SwitchPortStatistics();
			case CimPackage.CIM_SWITCH_PORT_TRANSPARENT_BRIDGING_STATISTICS: return createCIM_SwitchPortTransparentBridgingStatistics();
			case CimPackage.CIM_TELNET_CAPABILITIES: return createCIM_TelnetCapabilities();
			case CimPackage.CIM_TRANSPARENT_BRIDGING_STATISTICS: return createCIM_TransparentBridgingStatistics();
			case CimPackage.CIM_USB_REDIRECTION_CAPABILITIES: return createCIM_USBRedirectionCapabilities();
			case CimPackage.CIM_VLAN_ENDPOINT_CAPABILITIES: return createCIM_VLANEndpointCapabilities();
			case CimPackage.CIM_VIRTUAL_ROUTING_AND_FORWARDING_TABLE: return createCIM_VirtualRoutingAndForwardingTable();
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES: return createCIM_WiFiEndpointCapabilities();
			case CimPackage.CIM_X509_CREDENTIAL_FILTER_ENTRY: return createCIM_X509CredentialFilterEntry();
			case CimPackage.CIM_ISCSI_CAPABILITIES: return createCIM_iSCSICapabilities();
			case CimPackage.CIM_ISCSI_CONFIGURATION_CAPABILITIES: return createCIM_iSCSIConfigurationCapabilities();
			case CimPackage.CIM_ADJACENT_SLOTS: return createCIM_AdjacentSlots();
			case CimPackage.CIM_CARD: return createCIM_Card();
			case CimPackage.CIM_CHIP: return createCIM_Chip();
			case CimPackage.CIM_CONFIGURATION_CAPACITY: return createCIM_ConfigurationCapacity();
			case CimPackage.CIM_CONNECTED_TO: return createCIM_ConnectedTo();
			case CimPackage.CIM_CONTAINER: return createCIM_Container();
			case CimPackage.CIM_CONTAINER_VIEW: return createCIM_ContainerView();
			case CimPackage.CIM_ELEMENT_CAPACITY: return createCIM_ElementCapacity();
			case CimPackage.CIM_ELEMENT_IN_CONNECTOR: return createCIM_ElementInConnector();
			case CimPackage.CIM_ELEMENTS_LINKED: return createCIM_ElementsLinked();
			case CimPackage.CIM_LINK_HAS_CONNECTOR: return createCIM_LinkHasConnector();
			case CimPackage.CIM_MEDIA_PHYSICAL_STAT_INFO: return createCIM_MediaPhysicalStatInfo();
			case CimPackage.CIM_MEMORY_CAPACITY: return createCIM_MemoryCapacity();
			case CimPackage.CIM_PACKAGE_IN_CONNECTOR: return createCIM_PackageInConnector();
			case CimPackage.CIM_PACKAGE_IN_SLOT: return createCIM_PackageInSlot();
			case CimPackage.CIM_PACKAGE_LOCATION: return createCIM_PackageLocation();
			case CimPackage.CIM_PACKAGED_COMPONENT: return createCIM_PackagedComponent();
			case CimPackage.CIM_PHYSICAL_ASSET_CAPABILITIES: return createCIM_PhysicalAssetCapabilities();
			case CimPackage.CIM_PHYSICAL_FRAME: return createCIM_PhysicalFrame();
			case CimPackage.CIM_PHYSICAL_MEMORY: return createCIM_PhysicalMemory();
			case CimPackage.CIM_RACK: return createCIM_Rack();
			case CimPackage.CIM_REPLACEMENT_SET: return createCIM_ReplacementSet();
			case CimPackage.CIM_SLOT_IN_SLOT: return createCIM_SlotInSlot();
			case CimPackage.CIM_STORAGE_MEDIA_LOCATION: return createCIM_StorageMediaLocation();
			case CimPackage.CIM_SYSTEM_BUS_CARD: return createCIM_SystemBusCard();
			case CimPackage.CIM_BIOMETRIC_AUTHENTICATION: return createCIM_BiometricAuthentication();
			case CimPackage.CIM_COMPOUND_POLICY_ACTION: return createCIM_CompoundPolicyAction();
			case CimPackage.CIM_COMPOUND_POLICY_CONDITION: return createCIM_CompoundPolicyCondition();
			case CimPackage.CIM_DOCUMENT_AUTHENTICATION: return createCIM_DocumentAuthentication();
			case CimPackage.CIM_KERBEROS_AUTHENTICATION: return createCIM_KerberosAuthentication();
			case CimPackage.CIM_METHOD_ACTION: return createCIM_MethodAction();
			case CimPackage.CIM_NETWORK_PACKET_ACTION: return createCIM_NetworkPacketAction();
			case CimPackage.CIM_NETWORKING_ID_AUTHENTICATION: return createCIM_NetworkingIDAuthentication();
			case CimPackage.CIM_PACKET_FILTER_CONDITION: return createCIM_PacketFilterCondition();
			case CimPackage.CIM_PHYSICAL_CREDENTIAL_AUTHENTICATION: return createCIM_PhysicalCredentialAuthentication();
			case CimPackage.CIM_POLICY_GROUP: return createCIM_PolicyGroup();
			case CimPackage.CIM_POLICY_GROUP_IN_POLICY_GROUP: return createCIM_PolicyGroupInPolicyGroup();
			case CimPackage.CIM_POLICY_ROLE_COLLECTION: return createCIM_PolicyRoleCollection();
			case CimPackage.CIM_POLICY_RULE: return createCIM_PolicyRule();
			case CimPackage.CIM_POLICY_RULE_IN_POLICY_GROUP: return createCIM_PolicyRuleInPolicyGroup();
			case CimPackage.CIM_POLICY_RULE_VALIDITY_PERIOD: return createCIM_PolicyRuleValidityPeriod();
			case CimPackage.CIM_POLICY_SET_COMPONENT: return createCIM_PolicySetComponent();
			case CimPackage.CIM_POLICY_SET_IN_ROLE_COLLECTION: return createCIM_PolicySetInRoleCollection();
			case CimPackage.CIM_POLICY_SET_VALIDITY_PERIOD: return createCIM_PolicySetValidityPeriod();
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_AUTHENTICATION: return createCIM_PublicPrivateKeyAuthentication();
			case CimPackage.CIM_SHARED_SECRET_AUTHENTICATION: return createCIM_SharedSecretAuthentication();
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES: return createCIM_BIOSServiceCapabilities();
			case CimPackage.CIM_BOOT_SERVICE_CAPABILITIES: return createCIM_BootServiceCapabilities();
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES: return createCIM_ComputerSystemNodeCapabilities();
			case CimPackage.CIM_DEFAULT_ELEMENT_CAPABILITIES: return createCIM_DefaultElementCapabilities();
			case CimPackage.CIM_DIAGNOSTIC_RECORD: return createCIM_DiagnosticRecord();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_CAPABILITIES: return createCIM_DiagnosticServiceCapabilities();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_JOB_CAPABILITIES: return createCIM_DiagnosticServiceJobCapabilities();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD: return createCIM_DiagnosticServiceRecord();
			case CimPackage.CIM_DIAGNOSTIC_SETTING: return createCIM_DiagnosticSetting();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_DATA_RECORD: return createCIM_DiagnosticSettingDataRecord();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_RECORD: return createCIM_DiagnosticSettingRecord();
			case CimPackage.CIM_DIAGNOSTIC_SUB_TEST_RECORD: return createCIM_DiagnosticSubTestRecord();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_SERVICE_CAPABILITIES: return createCIM_DiskDriveDiagnosticServiceCapabilities();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_SERVICE_CAPABILITIES: return createCIM_FCHBADiagnosticServiceCapabilities();
			case CimPackage.CIM_FS_DOMAIN_IDENTITY: return createCIM_FSDomainIdentity();
			case CimPackage.CIM_FS_QUOTA_APPLIES_TO_ELEMENT: return createCIM_FSQuotaAppliesToElement();
			case CimPackage.CIM_FS_QUOTA_APPLIES_TO_PRINCIPAL: return createCIM_FSQuotaAppliesToPrincipal();
			case CimPackage.CIM_FS_QUOTA_CAPABILITIES: return createCIM_FSQuotaCapabilities();
			case CimPackage.CIM_FS_QUOTA_REPORT_RECORD: return createCIM_FSQuotaReportRecord();
			case CimPackage.CIM_FILE_EXPORT_CAPABILITIES: return createCIM_FileExportCapabilities();
			case CimPackage.CIM_FILE_SERVER_CAPABILITIES: return createCIM_FileServerCapabilities();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_CAPABILITIES: return createCIM_FileServerConfigurationCapabilities();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES: return createCIM_FileSystemConfigurationCapabilities();
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA: return createCIM_FileSystemSettingData();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_CAPABILITIES: return createCIM_FileSystemStatisticsCapabilities();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION: return createCIM_FileSystemStatisticsManifestCollection();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_CAPABILITIES: return createCIM_LocallyAccessibleFileSystemCapabilities();
			case CimPackage.CIM_LOCALLY_ACCESSIBLE_FILE_SYSTEM_SETTING: return createCIM_LocallyAccessibleFileSystemSetting();
			case CimPackage.CIM_LOG_ENTRY: return createCIM_LogEntry();
			case CimPackage.CIM_LOG_RECORD: return createCIM_LogRecord();
			case CimPackage.CIM_LOG_TO_LOG: return createCIM_LogToLog();
			case CimPackage.CIM_LOGICAL_FILE: return createCIM_LogicalFile();
			case CimPackage.CIM_OPERATING_SYSTEM_CAPABILITIES: return createCIM_OperatingSystemCapabilities();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE_CAPABILITIES: return createCIM_PlatformWatchdogServiceCapabilities();
			case CimPackage.CIM_RECORD_APPLIES_TO_ELEMENT: return createCIM_RecordAppliesToElement();
			case CimPackage.CIM_RECORD_LOG_CAPABILITIES: return createCIM_RecordLogCapabilities();
			case CimPackage.CIM_RESOURCE_ALLOCATION_FROM_POOL: return createCIM_ResourceAllocationFromPool();
			case CimPackage.CIM_SETTING_ASSOCIATED_TO_CAPABILITIES: return createCIM_SettingAssociatedToCapabilities();
			case CimPackage.CIM_SYMBOLIC_LINK: return createCIM_SymbolicLink();
			case CimPackage.CIM_TIME_ZONE: return createCIM_TimeZone();
			case CimPackage.CIM_UNIX_FILE: return createCIM_UnixFile();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA_COMPONENT: return createCIM_VirtualSystemSettingDataComponent();
			case CimPackage.CIM_ACCESS_CONTROL_INFORMATION: return createCIM_AccessControlInformation();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES: return createCIM_AccountManagementCapabilities();
			case CimPackage.CIM_ASSIGNED_IDENTITY: return createCIM_AssignedIdentity();
			case CimPackage.CIM_AUTHENTICATION_REQUIREMENT: return createCIM_AuthenticationRequirement();
			case CimPackage.CIM_AUTHENTICATION_TARGET: return createCIM_AuthenticationTarget();
			case CimPackage.CIM_AUTHORIZATION_SUBJECT: return createCIM_AuthorizationSubject();
			case CimPackage.CIM_AUTHORIZATION_TARGET: return createCIM_AuthorizationTarget();
			case CimPackage.CIM_AUTHORIZED_PRIVILEGE: return createCIM_AuthorizedPrivilege();
			case CimPackage.CIM_AUTHORIZED_SUBJECT: return createCIM_AuthorizedSubject();
			case CimPackage.CIM_AUTHORIZED_TARGET: return createCIM_AuthorizedTarget();
			case CimPackage.CIM_COLLECTION_IN_ORGANIZATION: return createCIM_CollectionInOrganization();
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_CAPABILITIES: return createCIM_CredentialManagementCapabilities();
			case CimPackage.CIM_CREDENTIAL_STORE: return createCIM_CredentialStore();
			case CimPackage.CIM_ELEMENT_AS_USER: return createCIM_ElementAsUser();
			case CimPackage.CIM_ELEMENT_SECURITY_SENSITIVITY: return createCIM_ElementSecuritySensitivity();
			case CimPackage.CIM_GATEWAY_PATH_ID: return createCIM_GatewayPathID();
			case CimPackage.CIM_GROUP: return createCIM_Group();
			case CimPackage.CIM_IP_NETWORK_IDENTITY: return createCIM_IPNetworkIdentity();
			case CimPackage.CIM_KEYSTORE: return createCIM_Keystore();
			case CimPackage.CIM_MEMBER_PRINCIPAL: return createCIM_MemberPrincipal();
			case CimPackage.CIM_MORE_GROUP_INFO: return createCIM_MoreGroupInfo();
			case CimPackage.CIM_ORG_STRUCTURE: return createCIM_OrgStructure();
			case CimPackage.CIM_ORG_UNIT: return createCIM_OrgUnit();
			case CimPackage.CIM_ORGANIZATION: return createCIM_Organization();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_CAPABILITIES: return createCIM_PrivilegeManagementCapabilities();
			case CimPackage.CIM_PUBLIC_KEY_CERTIFICATE: return createCIM_PublicKeyCertificate();
			case CimPackage.CIM_ROLE: return createCIM_Role();
			case CimPackage.CIM_ROLE_BASED_MANAGEMENT_CAPABILITIES: return createCIM_RoleBasedManagementCapabilities();
			case CimPackage.CIM_ROLE_LIMITED_TO_TARGET: return createCIM_RoleLimitedToTarget();
			case CimPackage.CIM_USER_CONTACT: return createCIM_UserContact();
			case CimPackage.CIM_USERS_CREDENTIAL: return createCIM_UsersCredential();
			case CimPackage.CIM_X509CRL: return createCIM_X509CRL();
			case CimPackage.CIM_X509_CERTIFICATE: return createCIM_X509Certificate();
			case CimPackage.CIM_INSTALLED_PRODUCT: return createCIM_InstalledProduct();
			case CimPackage.CIM_INSTALLED_PRODUCT_IMAGE: return createCIM_InstalledProductImage();
			case CimPackage.CIM_J2EE_CONNECTION_STATS: return createCIM_J2eeConnectionStats();
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS: return createCIM_J2eeEntityBeanStats();
			case CimPackage.CIM_J2EE_JCA_STATS: return createCIM_J2eeJCAStats();
			case CimPackage.CIM_J2EE_JDBC_STATS: return createCIM_J2eeJDBCStats();
			case CimPackage.CIM_J2EE_JMS_CONNECTION_STATS: return createCIM_J2eeJMSConnectionStats();
			case CimPackage.CIM_J2EE_JMS_PRODUCER_STATS: return createCIM_J2eeJMSProducerStats();
			case CimPackage.CIM_J2EE_JMS_SESSION_STATS: return createCIM_J2eeJMSSessionStats();
			case CimPackage.CIM_J2EE_JMS_STATS: return createCIM_J2eeJMSStats();
			case CimPackage.CIM_J2EE_JTA_STATS: return createCIM_J2eeJTAStats();
			case CimPackage.CIM_J2EE_JVM_STATS: return createCIM_J2eeJVMStats();
			case CimPackage.CIM_J2EE_JAVA_MAIL_STATS: return createCIM_J2eeJavaMailStats();
			case CimPackage.CIM_J2EE_MESSAGE_DRIVEN_BEAN_STATS: return createCIM_J2eeMessageDrivenBeanStats();
			case CimPackage.CIM_J2EE_SERVLET_STATS: return createCIM_J2eeServletStats();
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS: return createCIM_J2eeStatefulSessionBeanStats();
			case CimPackage.CIM_J2EE_STATELESS_SESSION_BEAN_STATS: return createCIM_J2eeStatelessSessionBeanStats();
			case CimPackage.CIM_SOFTWARE_ELEMENT: return createCIM_SoftwareElement();
			case CimPackage.CIM_SOFTWARE_ELEMENT_COMPONENT: return createCIM_SoftwareElementComponent();
			case CimPackage.CIM_SOFTWARE_FEATURE: return createCIM_SoftwareFeature();
			case CimPackage.CIM_SOFTWARE_FEATURE_COMPONENT: return createCIM_SoftwareFeatureComponent();
			case CimPackage.CIM_SOFTWARE_FEATURE_SOFTWARE_ELEMENTS: return createCIM_SoftwareFeatureSoftwareElements();
			case CimPackage.CIM_VIDEO_BIOS_ELEMENT: return createCIM_VideoBIOSElement();
			case CimPackage.CIM_VIDEO_BIOS_FEATURE: return createCIM_VideoBIOSFeature();
			case CimPackage.CIM_VIDEO_BIOS_FEATURE_VIDEO_BIOS_ELEMENTS: return createCIM_VideoBIOSFeatureVideoBIOSElements();
			case CimPackage.CIM_ACTS_AS_SPARE: return createCIM_ActsAsSpare();
			case CimPackage.CIM_ALLOCATION_CAPABILITIES: return createCIM_AllocationCapabilities();
			case CimPackage.CIM_COLLECTED_COLLECTIONS: return createCIM_CollectedCollections();
			case CimPackage.CIM_COLLECTED_MS_ES: return createCIM_CollectedMSEs();
			case CimPackage.CIM_COLLECTION_CONFIGURATION: return createCIM_CollectionConfiguration();
			case CimPackage.CIM_COLLECTION_SETTING: return createCIM_CollectionSetting();
			case CimPackage.CIM_CONCRETE_DEPENDENCY: return createCIM_ConcreteDependency();
			case CimPackage.CIM_CONCRETE_IDENTITY: return createCIM_ConcreteIdentity();
			case CimPackage.CIM_CONTAINED_LOCATION: return createCIM_ContainedLocation();
			case CimPackage.CIM_ELEMENT_ALLOCATED_FROM_POOL: return createCIM_ElementAllocatedFromPool();
			case CimPackage.CIM_ELEMENT_LOCATION: return createCIM_ElementLocation();
			case CimPackage.CIM_ELEMENT_PROFILE: return createCIM_ElementProfile();
			case CimPackage.CIM_ELEMENT_SETTING: return createCIM_ElementSetting();
			case CimPackage.CIM_ELEMENT_SOFTWARE_IDENTITY: return createCIM_ElementSoftwareIdentity();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA: return createCIM_EthernetPortAllocationSettingData();
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP: return createCIM_ExtraCapacityGroup();
			case CimPackage.CIM_PHYSICAL_ELEMENT_LOCATION: return createCIM_PhysicalElementLocation();
			case CimPackage.CIM_PROCESSOR_ALLOCATION_SETTING_DATA: return createCIM_ProcessorAllocationSettingData();
			case CimPackage.CIM_PRODUCT_SOFTWARE_COMPONENT: return createCIM_ProductSoftwareComponent();
			case CimPackage.CIM_REDUNDANCY_COMPONENT: return createCIM_RedundancyComponent();
			case CimPackage.CIM_REDUNDANCY_SET: return createCIM_RedundancySet();
			case CimPackage.CIM_SCOPED_SETTING: return createCIM_ScopedSetting();
			case CimPackage.CIM_STATISTICS_COLLECTION: return createCIM_StatisticsCollection();
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET: return createCIM_StorageRedundancySet();
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL_VIEW: return createCIM_AllocatedFromStoragePoolView();
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL_VIEW_VIEW: return createCIM_AllocatedFromStoragePoolViewView();
			case CimPackage.CIM_ASSOCIATED_BLOCK_STATISTICS_MANIFEST_COLLECTION: return createCIM_AssociatedBlockStatisticsManifestCollection();
			case CimPackage.CIM_ASSOCIATED_ELEMENT_TIER: return createCIM_AssociatedElementTier();
			case CimPackage.CIM_ASYMMETRIC_ACCESSIBILITY: return createCIM_AsymmetricAccessibility();
			case CimPackage.CIM_BASED_ON_VIEW: return createCIM_BasedOnView();
			case CimPackage.CIM_BLOCK_STATISTICS_CAPABILITIES: return createCIM_BlockStatisticsCapabilities();
			case CimPackage.CIM_DEVICE_MASKING_GROUP: return createCIM_DeviceMaskingGroup();
			case CimPackage.CIM_FC_PORT_CAPABILITIES: return createCIM_FCPortCapabilities();
			case CimPackage.CIM_GROUP_IN_DISK_GROUP: return createCIM_GroupInDiskGroup();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_CAPABILITIES: return createCIM_GroupMaskingMappingCapabilities();
			case CimPackage.CIM_INITIATOR_MASKING_GROUP: return createCIM_InitiatorMaskingGroup();
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_CAPABILITIES: return createCIM_OperationalPowerStatisticsCapabilities();
			case CimPackage.CIM_PRINT_INPUT_TRAY: return createCIM_PrintInputTray();
			case CimPackage.CIM_PRINT_INTERPRETER: return createCIM_PrintInterpreter();
			case CimPackage.CIM_PRINT_JOB: return createCIM_PrintJob();
			case CimPackage.CIM_PRINT_MARKER: return createCIM_PrintMarker();
			case CimPackage.CIM_PRINT_SUPPLY: return createCIM_PrintSupply();
			case CimPackage.CIM_QUERY_STATISTICS_COLLECTION: return createCIM_QueryStatisticsCollection();
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION: return createCIM_RemoteReplicationCollection();
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_SERVICE_CAPABILITIES: return createCIM_StoragePoolDiagnosticServiceCapabilities();
			case CimPackage.CIM_STORAGE_SETTINGS_ASSOCIATED_TO_CAPABILITIES: return createCIM_StorageSettingsAssociatedToCapabilities();
			case CimPackage.CIM_STORAGE_SETTINGS_GENERATED_FROM_CAPABILITIES: return createCIM_StorageSettingsGeneratedFromCapabilities();
			case CimPackage.CIM_ZONE: return createCIM_Zone();
			case CimPackage.CIM_ZONE_SET: return createCIM_ZoneSet();
			case CimPackage.CIM_CLASS_CREATION: return createCIM_ClassCreation();
			case CimPackage.CIM_CLASS_DELETION: return createCIM_ClassDeletion();
			case CimPackage.CIM_FORMATTED_INDICATION_SUBSCRIPTION: return createCIM_FormattedIndicationSubscription();
			case CimPackage.CIM_CONTAINED_PROPOSAL: return createCIM_ContainedProposal();
			case CimPackage.CIM_IKE_ACTION: return createCIM_IKEAction();
			case CimPackage.CIM_IKE_PROPOSAL: return createCIM_IKEProposal();
			case CimPackage.CIM_IPSEC_ACTION: return createCIM_IPsecAction();
			case CimPackage.CIM_IPSEC_PROPOSAL: return createCIM_IPsecProposal();
			case CimPackage.CIM_IPSEC_TRANSPORT_ACTION: return createCIM_IPsecTransportAction();
			case CimPackage.CIM_IPSEC_TUNNEL_ACTION: return createCIM_IPsecTunnelAction();
			case CimPackage.CIM_PRECONFIGURED_SA_ACTION: return createCIM_PreconfiguredSAAction();
			case CimPackage.CIM_PRECONFIGURED_TRANSPORT_ACTION: return createCIM_PreconfiguredTransportAction();
			case CimPackage.CIM_PRECONFIGURED_TUNNEL_ACTION: return createCIM_PreconfiguredTunnelAction();
			case CimPackage.CIM_SA_RULE: return createCIM_SARule();
			case CimPackage.CIM_TRANSFORM_OF_PRECONFIGURED_ACTION: return createCIM_TransformOfPreconfiguredAction();
			case CimPackage.CIM_ELEMENT_CONFORMS_TO_PROFILE: return createCIM_ElementConformsToProfile();
			case CimPackage.CIM_REFERENCED_PROFILE: return createCIM_ReferencedProfile();
			case CimPackage.CIM_SUB_PROFILE_REQUIRES_PROFILE: return createCIM_SubProfileRequiresProfile();
			case CimPackage.CIM_WBEM_PROTOCOL_SERVICE_CAPABILITIES: return createCIM_WBEMProtocolServiceCapabilities();
			case CimPackage.CIM_WS_MANAGEMENT_CAPABILITIES: return createCIM_WSManagementCapabilities();
			case CimPackage.CIM_LOGICAL_ELEMENT_UNIT_OF_WORK_DEF: return createCIM_LogicalElementUnitOfWorkDef();
			case CimPackage.CIM_STARTED_UO_W: return createCIM_StartedUoW();
			case CimPackage.CIM_SUB_UO_WDEF: return createCIM_SubUoWDef();
			case CimPackage.CIM_AH_TRANSFORM: return createCIM_AHTransform();
			case CimPackage.CIM_BGP_PEER_USES_ROUTE_MAP: return createCIM_BGPPeerUsesRouteMap();
			case CimPackage.CIM_BGP_ROUTE_MAPS_IN_ROUTING_POLICY: return createCIM_BGPRouteMapsInRoutingPolicy();
			case CimPackage.CIM_BOUNDED_PRIORITY_SCHEDULING_ELEMENT: return createCIM_BoundedPrioritySchedulingElement();
			case CimPackage.CIM_CLP_CAPABILITIES: return createCIM_CLPCapabilities();
			case CimPackage.CIM_ESP_TRANSFORM: return createCIM_ESPTransform();
			case CimPackage.CIM_ENTRIES_IN_FILTER_LIST: return createCIM_EntriesInFilterList();
			case CimPackage.CIM_FILTER_ENTRY: return createCIM_FilterEntry();
			case CimPackage.CIM_FILTERED_BGP_ATTRIBUTES: return createCIM_FilteredBGPAttributes();
			case CimPackage.CIM_IPCOMP_TRANSFORM: return createCIM_IPCOMPTransform();
			case CimPackage.CIM_IP_SUBNET: return createCIM_IPSubnet();
			case CimPackage.CIM_IPX_NETWORK: return createCIM_IPXNetwork();
			case CimPackage.CIM_LAN_SEGMENT: return createCIM_LANSegment();
			case CimPackage.CIM_LISTS_IN_ROUTING_POLICY: return createCIM_ListsInRoutingPolicy();
			case CimPackage.CIM_MEDIA_REDIRECTION_CAPABILITIES: return createCIM_MediaRedirectionCapabilities();
			case CimPackage.CIM_NETWORK_POLICY_RULE: return createCIM_NetworkPolicyRule();
			case CimPackage.CIM_VRF_ROUTE: return createCIM_VRFRoute();
			case CimPackage.CIM_CARD_IN_SLOT: return createCIM_CardInSlot();
			case CimPackage.CIM_CARD_ON_CARD: return createCIM_CardOnCard();
			case CimPackage.CIM_CHASSIS: return createCIM_Chassis();
			case CimPackage.CIM_CHASSIS_IN_RACK: return createCIM_ChassisInRack();
			case CimPackage.CIM_CONNECTOR_ON_PACKAGE: return createCIM_ConnectorOnPackage();
			case CimPackage.CIM_DOCKED: return createCIM_Docked();
			case CimPackage.CIM_HOME_FOR_MEDIA: return createCIM_HomeForMedia();
			case CimPackage.CIM_MAGAZINE: return createCIM_Magazine();
			case CimPackage.CIM_MEMORY_ON_CARD: return createCIM_MemoryOnCard();
			case CimPackage.CIM_MEMORY_WITH_MEDIA: return createCIM_MemoryWithMedia();
			case CimPackage.CIM_PACKAGE_IN_CHASSIS: return createCIM_PackageInChassis();
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION: return createCIM_PhysicalMediaInLocation();
			case CimPackage.CIM_ACCOUNT_AUTHENTICATION: return createCIM_AccountAuthentication();
			case CimPackage.CIM_AUTHENTICATION_RULE: return createCIM_AuthenticationRule();
			case CimPackage.CIM_ELEMENT_IN_POLICY_ROLE_COLLECTION: return createCIM_ElementInPolicyRoleCollection();
			case CimPackage.CIM_FILTER_OF_PACKET_CONDITION: return createCIM_FilterOfPacketCondition();
			case CimPackage.CIM_POLICY_CONDITION_IN_POLICY_CONDITION: return createCIM_PolicyConditionInPolicyCondition();
			case CimPackage.CIM_POLICY_CONDITION_IN_POLICY_RULE: return createCIM_PolicyConditionInPolicyRule();
			case CimPackage.CIM_AFFECTED_JOB_ELEMENT: return createCIM_AffectedJobElement();
			case CimPackage.CIM_ASSOCIATED_FILE_SYSTEM_STATISTICS_MANIFEST_COLLECTION: return createCIM_AssociatedFileSystemStatisticsManifestCollection();
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD: return createCIM_CorrespondingSettingDataRecord();
			case CimPackage.CIM_CORRESPONDING_SETTINGS_RECORD: return createCIM_CorrespondingSettingsRecord();
			case CimPackage.CIM_DATA_FILE: return createCIM_DataFile();
			case CimPackage.CIM_DEVICE_FILE: return createCIM_DeviceFile();
			case CimPackage.CIM_DIAGNOSTIC_COMPLETION_RECORD: return createCIM_DiagnosticCompletionRecord();
			case CimPackage.CIM_DIRECTORY: return createCIM_Directory();
			case CimPackage.CIM_DIRECTORY_CONTAINS_FILE: return createCIM_DirectoryContainsFile();
			case CimPackage.CIM_FIFO_PIPE_FILE: return createCIM_FIFOPipeFile();
			case CimPackage.CIM_FS_QUOTA_APPLIES_TO_TREE: return createCIM_FSQuotaAppliesToTree();
			case CimPackage.CIM_FILE_IDENTITY: return createCIM_FileIdentity();
			case CimPackage.CIM_OWNING_JOB_ELEMENT: return createCIM_OwningJobElement();
			case CimPackage.CIM_UNIX_DEVICE_FILE: return createCIM_UnixDeviceFile();
			case CimPackage.CIM_UNIX_DIRECTORY: return createCIM_UnixDirectory();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES: return createCIM_CertificateManagementCapabilities();
			case CimPackage.CIM_MORE_ORG_UNIT_INFO: return createCIM_MoreOrgUnitInfo();
			case CimPackage.CIM_MORE_ORGANIZATION_INFO: return createCIM_MoreOrganizationInfo();
			case CimPackage.CIM_MORE_ROLE_INFO: return createCIM_MoreRoleInfo();
			case CimPackage.CIM_PERSON: return createCIM_Person();
			case CimPackage.CIM_PUBLIC_PRIVATE_KEY_PAIR: return createCIM_PublicPrivateKeyPair();
			case CimPackage.CIM_AGP_SOFTWARE_FEATURE: return createCIM_AGPSoftwareFeature();
			case CimPackage.CIM_BIOS_ELEMENT: return createCIM_BIOSElement();
			case CimPackage.CIM_BIOS_FEATURE: return createCIM_BIOSFeature();
			case CimPackage.CIM_BIOS_FEATURE_BIOS_ELEMENTS: return createCIM_BIOSFeatureBIOSElements();
			case CimPackage.CIM_COLLECTED_SOFTWARE_ELEMENTS: return createCIM_CollectedSoftwareElements();
			case CimPackage.CIM_COLLECTED_SOFTWARE_FEATURES: return createCIM_CollectedSoftwareFeatures();
			case CimPackage.CIM_FRU_INCLUDES_SOFTWARE_FEATURE: return createCIM_FRUIncludesSoftwareFeature();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS: return createCIM_J2eeConnectionPoolStats();
			case CimPackage.CIM_J2EE_JCA_CONNECTION_POOLS: return createCIM_J2eeJCAConnectionPools();
			case CimPackage.CIM_J2EE_JCA_NONPOOLED_CONNECTIONS: return createCIM_J2eeJCANonpooledConnections();
			case CimPackage.CIM_J2EE_JDBC_CONNECTION_POOLS: return createCIM_J2eeJDBCConnectionPools();
			case CimPackage.CIM_J2EE_JDBC_NONPOOLED_CONNECTIONS: return createCIM_J2eeJDBCNonpooledConnections();
			case CimPackage.CIM_J2EE_JMS_CONNECTION_SESSIONS: return createCIM_J2eeJMSConnectionSessions();
			case CimPackage.CIM_J2EE_JMS_CONSUMER_STATS: return createCIM_J2eeJMSConsumerStats();
			case CimPackage.CIM_J2EE_JMS_SESSION_CONSUMERS: return createCIM_J2eeJMSSessionConsumers();
			case CimPackage.CIM_J2EE_JMS_SESSION_PRODUCERS: return createCIM_J2eeJMSSessionProducers();
			case CimPackage.CIM_J2EE_JMS_STAT_CONNECTIONS: return createCIM_J2eeJMSStatConnections();
			case CimPackage.CIM_PRODUCT_SOFTWARE_FEATURES: return createCIM_ProductSoftwareFeatures();
			case CimPackage.CIM_CONCRETE_JOB: return createCIM_ConcreteJob();
			case CimPackage.CIM_DEFAULT_SETTING: return createCIM_DefaultSetting();
			case CimPackage.CIM_IS_SPARE: return createCIM_IsSpare();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW: return createCIM_PhysicalComputerSystemView();
			case CimPackage.CIM_SERVICE_ACCESS_URI: return createCIM_ServiceAccessURI();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT: return createCIM_ServiceAffectsElement();
			case CimPackage.CIM_SERVICE_AFFECTS_ELEMENT_WITH_QUOTA: return createCIM_ServiceAffectsElementWithQuota();
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_ELEMENT: return createCIM_ServiceAvailableToElement();
			case CimPackage.CIM_SERVICE_COMPONENT: return createCIM_ServiceComponent();
			case CimPackage.CIM_SERVICE_SAP_DEPENDENCY: return createCIM_ServiceSAPDependency();
			case CimPackage.CIM_SERVICE_STATISTICS: return createCIM_ServiceStatistics();
			case CimPackage.CIM_SOFTWARE_INSTALLATION_SERVICE: return createCIM_SoftwareInstallationService();
			case CimPackage.CIM_TIME_SERVICE: return createCIM_TimeService();
			case CimPackage.CIM_COMMON_DATABASE: return createCIM_CommonDatabase();
			case CimPackage.CIM_DATABASE_ADMINISTRATOR: return createCIM_DatabaseAdministrator();
			case CimPackage.CIM_DATABASE_CONTROL_FILE: return createCIM_DatabaseControlFile();
			case CimPackage.CIM_DATABASE_FILE: return createCIM_DatabaseFile();
			case CimPackage.CIM_DATABASE_SERVICE: return createCIM_DatabaseService();
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE: return createCIM_ServiceAvailableToDatabase();
			case CimPackage.CIM_CONFIGURATION_REPORTING_SERVICE: return createCIM_ConfigurationReportingService();
			case CimPackage.CIM_FIBRE_PROTOCOL_SERVICE: return createCIM_FibreProtocolService();
			case CimPackage.CIM_FILE_SYSTEM_REPLICATION_SERVICE_CAPABILITIES: return createCIM_FileSystemReplicationServiceCapabilities();
			case CimPackage.CIM_HARDWARE_THREAD: return createCIM_HardwareThread();
			case CimPackage.CIM_IB_SUBNET_MANAGER: return createCIM_IBSubnetManager();
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_SERVICE: return createCIM_PowerUtilizationManagementService();
			case CimPackage.CIM_PRINT_JOB_FILE: return createCIM_PrintJobFile();
			case CimPackage.CIM_PRINT_SAP: return createCIM_PrintSAP();
			case CimPackage.CIM_PRINT_SERVICE: return createCIM_PrintService();
			case CimPackage.CIM_PROCESSOR_CORE: return createCIM_ProcessorCore();
			case CimPackage.CIM_REPLICATION_ENTITY: return createCIM_ReplicationEntity();
			case CimPackage.CIM_STATISTICS_SERVICE: return createCIM_StatisticsService();
			case CimPackage.CIM_ZONE_SERVICE: return createCIM_ZoneService();
			case CimPackage.CIM_INDICATION_SERVICE: return createCIM_IndicationService();
			case CimPackage.CIM_CONTAINED_TRANSFORM: return createCIM_ContainedTransform();
			case CimPackage.CIM_IKE_RULE: return createCIM_IKERule();
			case CimPackage.CIM_IPSEC_RULE: return createCIM_IPsecRule();
			case CimPackage.CIM_PACKET_CONDITION_IN_SA_RULE: return createCIM_PacketConditionInSARule();
			case CimPackage.CIM_CIMXML_CAPABILITIES: return createCIM_CIMXMLCapabilities();
			case CimPackage.CIM_OBJECT_MANAGER_COMMUNICATION_MECHANISM: return createCIM_ObjectManagerCommunicationMechanism();
			case CimPackage.CIM_WBEM_SERVER: return createCIM_WBEMServer();
			case CimPackage.CIM_METRIC_SERVICE: return createCIM_MetricService();
			case CimPackage.CIM_BGPIP_ROUTE: return createCIM_BGPIPRoute();
			case CimPackage.CIM_CONDITIONING_SERVICE: return createCIM_ConditioningService();
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE: return createCIM_DropThresholdCalculationService();
			case CimPackage.CIM_DROPPER_SERVICE: return createCIM_DropperService();
			case CimPackage.CIM_HEAD_TAIL_DROPPER: return createCIM_HeadTailDropper();
			case CimPackage.CIM_IP_NETWORK_CONNECTION: return createCIM_IPNetworkConnection();
			case CimPackage.CIM_KVM_REDIRECTION_SAP: return createCIM_KVMRedirectionSAP();
			case CimPackage.CIM_MARKER_SERVICE: return createCIM_MarkerService();
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP: return createCIM_MediaRedirectionSAP();
			case CimPackage.CIM_METER_SERVICE: return createCIM_MeterService();
			case CimPackage.CIM_NETWORK_PIPE: return createCIM_NetworkPipe();
			case CimPackage.CIM_NETWORK_PIPE_COMPOSITION: return createCIM_NetworkPipeComposition();
			case CimPackage.CIM_NETWORK_POLICY_SERVICE: return createCIM_NetworkPolicyService();
			case CimPackage.CIM_NEXT_SERVICE: return createCIM_NextService();
			case CimPackage.CIM_NEXT_SERVICE_AFTER_METER: return createCIM_NextServiceAfterMeter();
			case CimPackage.CIM_PACKET_SCHEDULING_SERVICE: return createCIM_PacketSchedulingService();
			case CimPackage.CIM_PREAMBLE_MARKER_SERVICE: return createCIM_PreambleMarkerService();
			case CimPackage.CIM_PRIORITY8021_QMARKER_SERVICE: return createCIM_Priority8021QMarkerService();
			case CimPackage.CIM_QO_SSERVICE: return createCIM_QoSService();
			case CimPackage.CIM_QO_SSUB_SERVICE: return createCIM_QoSSubService();
			case CimPackage.CIM_QUEUING_SERVICE: return createCIM_QueuingService();
			case CimPackage.CIM_RED_DROPPER_SERVICE: return createCIM_REDDropperService();
			case CimPackage.CIM_REDIRECTION_SERVICE: return createCIM_RedirectionService();
			case CimPackage.CIM_SNMP_COMMUNITY_STRING: return createCIM_SNMPCommunityString();
			case CimPackage.CIM_SNMP_SERVICE: return createCIM_SNMPService();
			case CimPackage.CIM_SCHEDULING_SERVICE_TO_SCHEDULE: return createCIM_SchedulingServiceToSchedule();
			case CimPackage.CIM_TEXT_REDIRECTION_SAP: return createCIM_TextRedirectionSAP();
			case CimPackage.CIM_TEXT_REDIRECTION_SERVICE: return createCIM_TextRedirectionService();
			case CimPackage.CIM_TO_SMARKER_SERVICE: return createCIM_ToSMarkerService();
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE: return createCIM_TokenBucketMeterService();
			case CimPackage.CIM_USB_REDIRECTION_SAP: return createCIM_USBRedirectionSAP();
			case CimPackage.CIM_VLAN: return createCIM_VLAN();
			case CimPackage.CIM_WEIGHTED_RED_DROPPER_SERVICE: return createCIM_WeightedREDDropperService();
			case CimPackage.CIM_ISCSI_CONNECTION: return createCIM_iSCSIConnection();
			case CimPackage.CIM_ISCSI_SESSION: return createCIM_iSCSISession();
			case CimPackage.CIM_POLICY_ACTION_IN_POLICY_ACTION: return createCIM_PolicyActionInPolicyAction();
			case CimPackage.CIM_POLICY_ACTION_IN_POLICY_RULE: return createCIM_PolicyActionInPolicyRule();
			case CimPackage.CIM_ASSOCIATED_JOB_METHOD_RESULT: return createCIM_AssociatedJobMethodResult();
			case CimPackage.CIM_BIOS_SERVICE: return createCIM_BIOSService();
			case CimPackage.CIM_BOOT_CONFIG_SETTING: return createCIM_BootConfigSetting();
			case CimPackage.CIM_BOOT_SAP: return createCIM_BootSAP();
			case CimPackage.CIM_CLUSTERING_SAP: return createCIM_ClusteringSAP();
			case CimPackage.CIM_DIAGNOSTIC_TEST: return createCIM_DiagnosticTest();
			case CimPackage.CIM_DIAGNOSTIC_TEST_IN_PACKAGE: return createCIM_DiagnosticTestInPackage();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST: return createCIM_DiskDriveDiagnosticTest();
			case CimPackage.CIM_EXPORTED_FILE_SHARE_CAPABILITIES: return createCIM_ExportedFileShareCapabilities();
			case CimPackage.CIM_FCHBA_DIAGNOSTIC_TEST: return createCIM_FCHBADiagnosticTest();
			case CimPackage.CIM_FILE_SYSTEM: return createCIM_FileSystem();
			case CimPackage.CIM_FILE_SYSTEM_CAPABILITIES: return createCIM_FileSystemCapabilities();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_SERVICE: return createCIM_FileSystemStatisticsService();
			case CimPackage.CIM_HELP_SERVICE: return createCIM_HelpService();
			case CimPackage.CIM_HELP_SERVICE_AVAILABLE_TO_FILE: return createCIM_HelpServiceAvailableToFile();
			case CimPackage.CIM_JOB_DESTINATION: return createCIM_JobDestination();
			case CimPackage.CIM_JOB_DESTINATION_JOBS: return createCIM_JobDestinationJobs();
			case CimPackage.CIM_JOB_QUEUE: return createCIM_JobQueue();
			case CimPackage.CIM_LOCAL_FILE_SYSTEM: return createCIM_LocalFileSystem();
			case CimPackage.CIM_LOG_MANAGES_RECORD: return createCIM_LogManagesRecord();
			case CimPackage.CIM_MESSAGE_LOG: return createCIM_MessageLog();
			case CimPackage.CIM_MOUNT: return createCIM_Mount();
			case CimPackage.CIM_OOB_ALERT_SERVICE: return createCIM_OOBAlertService();
			case CimPackage.CIM_OPERATING_SYSTEM: return createCIM_OperatingSystem();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE: return createCIM_PlatformWatchdogService();
			case CimPackage.CIM_PROCESS: return createCIM_Process();
			case CimPackage.CIM_PROCESS_EXECUTABLE: return createCIM_ProcessExecutable();
			case CimPackage.CIM_PROCESS_OF_JOB: return createCIM_ProcessOfJob();
			case CimPackage.CIM_RECORD_IN_LOG: return createCIM_RecordInLog();
			case CimPackage.CIM_RECORD_LOG: return createCIM_RecordLog();
			case CimPackage.CIM_REMOTE_FILE_SYSTEM: return createCIM_RemoteFileSystem();
			case CimPackage.CIM_SERVICE_PROCESS: return createCIM_ServiceProcess();
			case CimPackage.CIM_SHARED_ELEMENT: return createCIM_SharedElement();
			case CimPackage.CIM_THREAD: return createCIM_Thread();
			case CimPackage.CIM_UNIX_LOCAL_FILE_SYSTEM: return createCIM_UnixLocalFileSystem();
			case CimPackage.CIM_UNIX_PROCESS: return createCIM_UnixProcess();
			case CimPackage.CIM_UNIX_PROCESS_STATISTICS: return createCIM_UnixProcessStatistics();
			case CimPackage.CIM_UNIX_THREAD: return createCIM_UnixThread();
			case CimPackage.CIM_USE_OF_LOG: return createCIM_UseOfLog();
			case CimPackage.CIM_USE_OF_MESSAGE_LOG: return createCIM_UseOfMessageLog();
			case CimPackage.CIM_WAKE_UP_SERVICE: return createCIM_WakeUpService();
			case CimPackage.CIM_ACCOUNT: return createCIM_Account();
			case CimPackage.CIM_ACCOUNT_IDENTITY: return createCIM_AccountIdentity();
			case CimPackage.CIM_ACCOUNT_MAPS_TO_ACCOUNT: return createCIM_AccountMapsToAccount();
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_SAP: return createCIM_CredentialManagementSAP();
			case CimPackage.CIM_MORE_PERSON_INFO: return createCIM_MorePersonInfo();
			case CimPackage.CIM_SECURITY_SERVICE_USES_ACCOUNT: return createCIM_SecurityServiceUsesAccount();
			case CimPackage.CIM_USERS_ACCOUNT: return createCIM_UsersAccount();
			case CimPackage.CIM_DIAGNOSTIC_TEST_SOFTWARE: return createCIM_DiagnosticTestSoftware();
			case CimPackage.CIM_J2EE_ENTITY_BEAN: return createCIM_J2eeEntityBean();
			case CimPackage.CIM_J2EE_JCA_CONNECTION_FACTORY: return createCIM_J2eeJCAConnectionFactory();
			case CimPackage.CIM_J2EE_JCA_MANAGED_CONNECTION_FACTORY: return createCIM_J2eeJCAManagedConnectionFactory();
			case CimPackage.CIM_J2EE_JDBC_DATA_SOURCE: return createCIM_J2eeJDBCDataSource();
			case CimPackage.CIM_J2EE_JDBC_DRIVER: return createCIM_J2eeJDBCDriver();
			case CimPackage.CIM_J2EE_JVM: return createCIM_J2eeJVM();
			case CimPackage.CIM_J2EE_MESSAGE_DRIVEN_BEAN: return createCIM_J2eeMessageDrivenBean();
			case CimPackage.CIM_J2EE_MODULE_USES_JVM: return createCIM_J2eeModuleUsesJVM();
			case CimPackage.CIM_J2EE_RESOURCE_ADAPTER: return createCIM_J2eeResourceAdapter();
			case CimPackage.CIM_J2EE_RESOURCE_ADAPTER_MODULE: return createCIM_J2eeResourceAdapterModule();
			case CimPackage.CIM_J2EE_SERVLET: return createCIM_J2eeServlet();
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN: return createCIM_J2eeStatefulSessionBean();
			case CimPackage.CIM_J2EE_STATELESS_SESSION_BEAN: return createCIM_J2eeStatelessSessionBean();
			case CimPackage.CIM_J2EE_URL_RESOURCE: return createCIM_J2eeURLResource();
			case CimPackage.CIM_J2EE_WEB_MODULE: return createCIM_J2eeWebModule();
			case CimPackage.CIM_OPERATING_SYSTEM_SOFTWARE_FEATURE: return createCIM_OperatingSystemSoftwareFeature();
			case CimPackage.CIM_SOFTWARE_ELEMENT_SAP_IMPLEMENTATION: return createCIM_SoftwareElementSAPImplementation();
			case CimPackage.CIM_SOFTWARE_ELEMENT_SERVICE_IMPLEMENTATION: return createCIM_SoftwareElementServiceImplementation();
			case CimPackage.CIM_SOFTWARE_FEATURE_SAP_IMPLEMENTATION: return createCIM_SoftwareFeatureSAPImplementation();
			case CimPackage.CIM_SOFTWARE_FEATURE_SERVICE_IMPLEMENTATION: return createCIM_SoftwareFeatureServiceImplementation();
			case CimPackage.CIM_POWER_MANAGEMENT_SERVICE: return createCIM_PowerManagementService();
			case CimPackage.CIM_PRODUCT_SERVICE_COMPONENT: return createCIM_ProductServiceComponent();
			case CimPackage.CIM_PROTOCOL_ENDPOINT: return createCIM_ProtocolEndpoint();
			case CimPackage.CIM_PROVIDES_SERVICE_TO_ELEMENT: return createCIM_ProvidesServiceToElement();
			case CimPackage.CIM_REALIZES: return createCIM_Realizes();
			case CimPackage.CIM_REMOTE_SERVICE_ACCESS_POINT: return createCIM_RemoteServiceAccessPoint();
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_SERVICE: return createCIM_ResourcePoolConfigurationService();
			case CimPackage.CIM_SAP_AVAILABLE_FOR_ELEMENT: return createCIM_SAPAvailableForElement();
			case CimPackage.CIM_SAPSAP_DEPENDENCY: return createCIM_SAPSAPDependency();
			case CimPackage.CIM_SAP_STATISTICS: return createCIM_SAPStatistics();
			case CimPackage.CIM_SERVICE_ACCESS_BY_SAP: return createCIM_ServiceAccessBySAP();
			case CimPackage.CIM_SERVICE_SERVICE_DEPENDENCY: return createCIM_ServiceServiceDependency();
			case CimPackage.CIM_STORAGE_EXTENT: return createCIM_StorageExtent();
			case CimPackage.CIM_SYSTEM_COMPONENT: return createCIM_SystemComponent();
			case CimPackage.CIM_SYSTEM_DEVICE: return createCIM_SystemDevice();
			case CimPackage.CIM_SYSTEM_PACKAGING: return createCIM_SystemPackaging();
			case CimPackage.CIM_SYSTEM_STATISTICS: return createCIM_SystemStatistics();
			case CimPackage.CIM_VIEW_ON_SYSTEM: return createCIM_ViewOnSystem();
			case CimPackage.CIM_DATABASE_SEGMENT: return createCIM_DatabaseSegment();
			case CimPackage.CIM_DATABASE_STORAGE_AREA: return createCIM_DatabaseStorageArea();
			case CimPackage.CIM_AGGREGATE_PEXTENT: return createCIM_AggregatePExtent();
			case CimPackage.CIM_AGGREGATE_PS_EXTENT: return createCIM_AggregatePSExtent();
			case CimPackage.CIM_ALARM_DEVICE: return createCIM_AlarmDevice();
			case CimPackage.CIM_ASSOCIATED_ALARM: return createCIM_AssociatedAlarm();
			case CimPackage.CIM_ASSOCIATED_RESOURCE_POOL: return createCIM_AssociatedResourcePool();
			case CimPackage.CIM_BATTERY: return createCIM_Battery();
			case CimPackage.CIM_BLOCK_STATISTICS_SERVICE: return createCIM_BlockStatisticsService();
			case CimPackage.CIM_COMPOSITE_EXTENT: return createCIM_CompositeExtent();
			case CimPackage.CIM_COOLING_DEVICE: return createCIM_CoolingDevice();
			case CimPackage.CIM_DEVICE_CONNECTION: return createCIM_DeviceConnection();
			case CimPackage.CIM_DEVICE_IDENTITY: return createCIM_DeviceIdentity();
			case CimPackage.CIM_DEVICE_SOFTWARE: return createCIM_DeviceSoftware();
			case CimPackage.CIM_DISPLAY_CONTROLLER: return createCIM_DisplayController();
			case CimPackage.CIM_DOOR: return createCIM_Door();
			case CimPackage.CIM_DOOR_ACCESS_TO_DEVICE: return createCIM_DoorAccessToDevice();
			case CimPackage.CIM_DOOR_ACCESS_TO_PHYSICAL_ELEMENT: return createCIM_DoorAccessToPhysicalElement();
			case CimPackage.CIM_ESCON_CONTROLLER: return createCIM_ESCONController();
			case CimPackage.CIM_ERROR_COUNTERS_FOR_DEVICE: return createCIM_ErrorCountersForDevice();
			case CimPackage.CIM_EXTENT_COMPONENT_VIEW: return createCIM_ExtentComponentView();
			case CimPackage.CIM_EXTENT_IN_DISK_GROUP: return createCIM_ExtentInDiskGroup();
			case CimPackage.CIM_FAN: return createCIM_Fan();
			case CimPackage.CIM_HEAT_PIPE: return createCIM_HeatPipe();
			case CimPackage.CIM_HOSTED_STORAGE_POOL_VIEW: return createCIM_HostedStoragePoolView();
			case CimPackage.CIM_IDE_CONTROLLER: return createCIM_IDEController();
			case CimPackage.CIM_INDICATOR_LED: return createCIM_IndicatorLED();
			case CimPackage.CIM_INFRARED_CONTROLLER: return createCIM_InfraredController();
			case CimPackage.CIM_INITIATOR_TARGET_LOGICAL_UNIT_PATH: return createCIM_InitiatorTargetLogicalUnitPath();
			case CimPackage.CIM_INSTALLED_PARTITION_TABLE: return createCIM_InstalledPartitionTable();
			case CimPackage.CIM_LABEL_READER: return createCIM_LabelReader();
			case CimPackage.CIM_LOGICAL_DISK: return createCIM_LogicalDisk();
			case CimPackage.CIM_LOGICAL_MODULE: return createCIM_LogicalModule();
			case CimPackage.CIM_LOGICAL_PORT: return createCIM_LogicalPort();
			case CimPackage.CIM_MANAGEMENT_CONTROLLER: return createCIM_ManagementController();
			case CimPackage.CIM_MASKING_MAPPING_EXPOSED_DEVICE_VIEW: return createCIM_MaskingMappingExposedDeviceView();
			case CimPackage.CIM_MASKING_MAPPING_VIEW: return createCIM_MaskingMappingView();
			case CimPackage.CIM_MEDIA_ACCESS_DEVICE: return createCIM_MediaAccessDevice();
			case CimPackage.CIM_MEDIA_PARTITION: return createCIM_MediaPartition();
			case CimPackage.CIM_MEDIA_PRESENT: return createCIM_MediaPresent();
			case CimPackage.CIM_MEDIA_TRANSFER_DEVICE: return createCIM_MediaTransferDevice();
			case CimPackage.CIM_MEMORY: return createCIM_Memory();
			case CimPackage.CIM_MEMORY_CONTROLLER: return createCIM_MemoryController();
			case CimPackage.CIM_NETWORK_ADAPTER_REDUNDANCY_COMPONENT: return createCIM_NetworkAdapterRedundancyComponent();
			case CimPackage.CIM_NETWORK_PORT: return createCIM_NetworkPort();
			case CimPackage.CIM_NETWORK_VIRTUAL_ADAPTER: return createCIM_NetworkVirtualAdapter();
			case CimPackage.CIM_NON_VOLATILE_STORAGE: return createCIM_NonVolatileStorage();
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_SERVICE: return createCIM_OperationalPowerStatisticsService();
			case CimPackage.CIM_PCI_CONTROLLER: return createCIM_PCIController();
			case CimPackage.CIM_PCI_DEVICE: return createCIM_PCIDevice();
			case CimPackage.CIM_PCI_PORT: return createCIM_PCIPort();
			case CimPackage.CIM_PC_IE_SWITCH: return createCIM_PCIeSwitch();
			case CimPackage.CIM_PCMCIA_CONTROLLER: return createCIM_PCMCIAController();
			case CimPackage.CIM_PACKAGE_DEPENDENCY: return createCIM_PackageDependency();
			case CimPackage.CIM_PARALLEL_CONTROLLER: return createCIM_ParallelController();
			case CimPackage.CIM_PASS_THROUGH_MODULE: return createCIM_PassThroughModule();
			case CimPackage.CIM_PERSISTENT_MEMORY_NAMESPACE: return createCIM_PersistentMemoryNamespace();
			case CimPackage.CIM_PERSISTENT_MEMORY_SERVICE: return createCIM_PersistentMemoryService();
			case CimPackage.CIM_PHYSICAL_EXTENT: return createCIM_PhysicalExtent();
			case CimPackage.CIM_PICKER_ELEMENT: return createCIM_PickerElement();
			case CimPackage.CIM_PORT_ACTIVE_CONNECTION: return createCIM_PortActiveConnection();
			case CimPackage.CIM_PORT_CONTROLLER: return createCIM_PortController();
			case CimPackage.CIM_PORT_ON_DEVICE: return createCIM_PortOnDevice();
			case CimPackage.CIM_POWER_SOURCE: return createCIM_PowerSource();
			case CimPackage.CIM_POWER_SUPPLY: return createCIM_PowerSupply();
			case CimPackage.CIM_PRINT_QUEUE: return createCIM_PrintQueue();
			case CimPackage.CIM_PRINTER: return createCIM_Printer();
			case CimPackage.CIM_PRINTER_SERVICING_JOB: return createCIM_PrinterServicingJob();
			case CimPackage.CIM_PRINTER_SERVICING_QUEUE: return createCIM_PrinterServicingQueue();
			case CimPackage.CIM_PROCESSOR: return createCIM_Processor();
			case CimPackage.CIM_PROTECTED_SPACE_EXTENT: return createCIM_ProtectedSpaceExtent();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_PORT: return createCIM_ProtocolControllerForPort();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT: return createCIM_ProtocolControllerForUnit();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT_VIEW: return createCIM_ProtocolControllerForUnitView();
			case CimPackage.CIM_QUEUE_FOR_PRINT_SERVICE: return createCIM_QueueForPrintService();
			case CimPackage.CIM_QUEUE_FORWARDS_TO_PRINT_SAP: return createCIM_QueueForwardsToPrintSAP();
			case CimPackage.CIM_REALIZES_EXTENT: return createCIM_RealizesExtent();
			case CimPackage.CIM_REALIZES_PEXTENT: return createCIM_RealizesPExtent();
			case CimPackage.CIM_REFRIGERATION: return createCIM_Refrigeration();
			case CimPackage.CIM_SASPHY: return createCIM_SASPHY();
			case CimPackage.CIM_SAS_PORT: return createCIM_SASPort();
			case CimPackage.CIM_SB_PROTOCOL_ENDPOINT: return createCIM_SBProtocolEndpoint();
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT: return createCIM_SCSIArbitraryLogicalUnit();
			case CimPackage.CIM_SCSI_CONTROLLER: return createCIM_SCSIController();
			case CimPackage.CIM_SCSI_INITIATOR_TARGET_LOGICAL_UNIT_PATH: return createCIM_SCSIInitiatorTargetLogicalUnitPath();
			case CimPackage.CIM_SCSI_PATH_CONFIGURATION_SERVICE: return createCIM_SCSIPathConfigurationService();
			case CimPackage.CIM_SCSI_PROTOCOL_CONTROLLER: return createCIM_SCSIProtocolController();
			case CimPackage.CIM_SSA_CONTROLLER: return createCIM_SSAController();
			case CimPackage.CIM_SCANNER: return createCIM_Scanner();
			case CimPackage.CIM_SENSOR: return createCIM_Sensor();
			case CimPackage.CIM_SERIAL_CONTROLLER: return createCIM_SerialController();
			case CimPackage.CIM_SHARED_DEVICE_MANAGEMENT_SERVICE: return createCIM_SharedDeviceManagementService();
			case CimPackage.CIM_SHARING_DEPENDENCY: return createCIM_SharingDependency();
			case CimPackage.CIM_SNAPSHOT: return createCIM_Snapshot();
			case CimPackage.CIM_SNAPSHOT_OF_EXTENT: return createCIM_SnapshotOfExtent();
			case CimPackage.CIM_STORAGE_DEFECT: return createCIM_StorageDefect();
			case CimPackage.CIM_STORAGE_ERASURE_SERVICE: return createCIM_StorageErasureService();
			case CimPackage.CIM_STORAGE_LIBRARY: return createCIM_StorageLibrary();
			case CimPackage.CIM_STORAGE_POOL: return createCIM_StoragePool();
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST: return createCIM_StoragePoolDiagnosticTest();
			case CimPackage.CIM_STORAGE_PROTECTION_SERVICE: return createCIM_StorageProtectionService();
			case CimPackage.CIM_STORAGE_VOLUME: return createCIM_StorageVolume();
			case CimPackage.CIM_SUPPLIES_POWER: return createCIM_SuppliesPower();
			case CimPackage.CIM_TAPE_DRIVE: return createCIM_TapeDrive();
			case CimPackage.CIM_TAPE_PARTITION: return createCIM_TapePartition();
			case CimPackage.CIM_TOKEN_RING_ADAPTER: return createCIM_TokenRingAdapter();
			case CimPackage.CIM_TOKEN_RING_PORT: return createCIM_TokenRingPort();
			case CimPackage.CIM_USB_CONTROLLER: return createCIM_USBController();
			case CimPackage.CIM_USB_DEVICE: return createCIM_USBDevice();
			case CimPackage.CIM_USB_HUB: return createCIM_USBHub();
			case CimPackage.CIM_USB_PORT: return createCIM_USBPort();
			case CimPackage.CIM_USB_PORT_ON_HUB: return createCIM_USBPortOnHub();
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY: return createCIM_UninterruptiblePowerSupply();
			case CimPackage.CIM_VIDEO_CONTROLLER: return createCIM_VideoController();
			case CimPackage.CIM_VIDEO_HEAD: return createCIM_VideoHead();
			case CimPackage.CIM_VIDEO_SETTING: return createCIM_VideoSetting();
			case CimPackage.CIM_VOLATILE_STORAGE: return createCIM_VolatileStorage();
			case CimPackage.CIM_VOLUME_SET: return createCIM_VolumeSet();
			case CimPackage.CIM_WBEM_SERVER_DEVICE_REGISTRATION_SERVICE: return createCIM_WBEMServerDeviceRegistrationService();
			case CimPackage.CIM_WORM_DRIVE: return createCIM_WORMDrive();
			case CimPackage.CIM_WATCHDOG: return createCIM_Watchdog();
			case CimPackage.CIM_WI_FI_PORT: return createCIM_WiFiPort();
			case CimPackage.CIM_WI_FI_RADIO: return createCIM_WiFiRadio();
			case CimPackage.CIM_IPSEC_POLICY_FOR_SYSTEM: return createCIM_IPsecPolicyForSystem();
			case CimPackage.CIM_PEER_GATEWAY_FOR_PRECONFIGURED_TUNNEL: return createCIM_PeerGatewayForPreconfiguredTunnel();
			case CimPackage.CIM_PEER_GATEWAY_FOR_TUNNEL: return createCIM_PeerGatewayForTunnel();
			case CimPackage.CIM_CIMXML_COMMUNICATION_MECHANISM: return createCIM_CIMXMLCommunicationMechanism();
			case CimPackage.CIM_IDENTIFICATION_OF_MANAGED_SYSTEM: return createCIM_IdentificationOfManagedSystem();
			case CimPackage.CIM_OBJECT_MANAGER: return createCIM_ObjectManager();
			case CimPackage.CIM_OBJECT_MANAGER_ADAPTER: return createCIM_ObjectManagerAdapter();
			case CimPackage.CIM_PROTOCOL_ADAPTER: return createCIM_ProtocolAdapter();
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT: return createCIM_ATAProtocolEndpoint();
			case CimPackage.CIM_ASSOCIATED_NEXT_HOP: return createCIM_AssociatedNextHop();
			case CimPackage.CIM_AVERAGE_RATE_METER_SERVICE: return createCIM_AverageRateMeterService();
			case CimPackage.CIM_BGP_ATTRIBUTES_FOR_ROUTE: return createCIM_BGPAttributesForRoute();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT: return createCIM_BGPProtocolEndpoint();
			case CimPackage.CIM_BGP_SERVICE: return createCIM_BGPService();
			case CimPackage.CIM_BGP_SERVICE_ATTRIBUTES: return createCIM_BGPServiceAttributes();
			case CimPackage.CIM_BGP_SERVICE_STATISTICS: return createCIM_BGPServiceStatistics();
			case CimPackage.CIM_CLP_PROTOCOL_ENDPOINT: return createCIM_CLPProtocolEndpoint();
			case CimPackage.CIM_CALCULATED_ROUTES: return createCIM_CalculatedRoutes();
			case CimPackage.CIM_CALCULATES_AMONG: return createCIM_CalculatesAmong();
			case CimPackage.CIM_CALCULATION_BASED_ON_QUEUE: return createCIM_CalculationBasedOnQueue();
			case CimPackage.CIM_CALCULATION_SERVICE_FOR_DROPPER: return createCIM_CalculationServiceForDropper();
			case CimPackage.CIM_CLASSIFIER_SERVICE: return createCIM_ClassifierService();
			case CimPackage.CIM_CONDITIONING_SERVICE_ON_ENDPOINT: return createCIM_ConditioningServiceOnEndpoint();
			case CimPackage.CIM_DHCP_PROTOCOL_ENDPOINT: return createCIM_DHCPProtocolEndpoint();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT: return createCIM_DNSProtocolEndpoint();
			case CimPackage.CIM_DSCP_MARKER_SERVICE: return createCIM_DSCPMarkerService();
			case CimPackage.CIM_DIFF_SERV_SERVICE: return createCIM_DiffServService();
			case CimPackage.CIM_EF_SERVICE: return createCIM_EFService();
			case CimPackage.CIM_EGP_ROUTE_CALC_DEPENDENCY: return createCIM_EGPRouteCalcDependency();
			case CimPackage.CIM_EWMA_METER_SERVICE: return createCIM_EWMAMeterService();
			case CimPackage.CIM_EGRESS_CONDITIONING_SERVICE_ON_ENDPOINT: return createCIM_EgressConditioningServiceOnEndpoint();
			case CimPackage.CIM_ELEMENT_IN_SCHEDULING_SERVICE: return createCIM_ElementInSchedulingService();
			case CimPackage.CIM_ENDPOINT_FOR_IP_NETWORK_CONNECTION: return createCIM_EndpointForIPNetworkConnection();
			case CimPackage.CIM_ENDPOINT_IDENTITY: return createCIM_EndpointIdentity();
			case CimPackage.CIM_ENDPOINT_OF_NETWORK_PIPE: return createCIM_EndpointOfNetworkPipe();
			case CimPackage.CIM_FLOW_SERVICE: return createCIM_FlowService();
			case CimPackage.CIM_FORWARDING_SERVICE: return createCIM_ForwardingService();
			case CimPackage.CIM_FORWARDS_AMONG: return createCIM_ForwardsAmong();
			case CimPackage.CIM_HDR8021_PSERVICE: return createCIM_Hdr8021PService();
			case CimPackage.CIM_HEAD_TAIL_DROP_QUEUE_BINDING: return createCIM_HeadTailDropQueueBinding();
			case CimPackage.CIM_HOSTED_ROUTE: return createCIM_HostedRoute();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT: return createCIM_IPProtocolEndpoint();
			case CimPackage.CIM_IPX_PROTOCOL_ENDPOINT: return createCIM_IPXProtocolEndpoint();
			case CimPackage.CIM_IN_LOGICAL_NETWORK: return createCIM_InLogicalNetwork();
			case CimPackage.CIM_INGRESS_CONDITIONING_SERVICE_ON_ENDPOINT: return createCIM_IngressConditioningServiceOnEndpoint();
			case CimPackage.CIM_LAN_ENDPOINT: return createCIM_LANEndpoint();
			case CimPackage.CIM_LOGICAL_NETWORK_SERVICE: return createCIM_LogicalNetworkService();
			case CimPackage.CIM_NETWORK_PORT_CONFIGURATION_SERVICE: return createCIM_NetworkPortConfigurationService();
			case CimPackage.CIM_NEXT_SCHEDULER: return createCIM_NextScheduler();
			case CimPackage.CIM_NON_WORK_CONSERVING_SCHEDULING_SERVICE: return createCIM_NonWorkConservingSchedulingService();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT_BASE: return createCIM_OSPFProtocolEndpointBase();
			case CimPackage.CIM_OSPF_SERVICE: return createCIM_OSPFService();
			case CimPackage.CIM_OSPF_SERVICE_CONFIGURATION: return createCIM_OSPFServiceConfiguration();
			case CimPackage.CIM_OSPF_VIRTUAL_INTERFACE: return createCIM_OSPFVirtualInterface();
			case CimPackage.CIM_PRECEDENCE_SERVICE: return createCIM_PrecedenceService();
			case CimPackage.CIM_QO_SCONDITIONING_SUB_SERVICE: return createCIM_QoSConditioningSubService();
			case CimPackage.CIM_QUEUE_ALLOCATION: return createCIM_QueueAllocation();
			case CimPackage.CIM_QUEUE_HIERARCHY: return createCIM_QueueHierarchy();
			case CimPackage.CIM_QUEUE_TO_SCHEDULE: return createCIM_QueueToSchedule();
			case CimPackage.CIM_REFLECTOR_CLIENT_SERVICE: return createCIM_ReflectorClientService();
			case CimPackage.CIM_REFLECTOR_NON_CLIENT_SERVICE: return createCIM_ReflectorNonClientService();
			case CimPackage.CIM_REFLECTOR_SERVICE: return createCIM_ReflectorService();
			case CimPackage.CIM_REMOTE_ACCESS_AVAILABLE_TO_ELEMENT: return createCIM_RemoteAccessAvailableToElement();
			case CimPackage.CIM_ROUTE_FORWARDED_BY_SERVICE: return createCIM_RouteForwardedByService();
			case CimPackage.CIM_ROUTE_USES_ENDPOINT: return createCIM_RouteUsesEndpoint();
			case CimPackage.CIM_ROUTES_BGP: return createCIM_RoutesBGP();
			case CimPackage.CIM_SCSI_PROTOCOL_ENDPOINT: return createCIM_SCSIProtocolEndpoint();
			case CimPackage.CIM_SSH_PROTOCOL_ENDPOINT: return createCIM_SSHProtocolEndpoint();
			case CimPackage.CIM_SCHEDULER_USED: return createCIM_SchedulerUsed();
			case CimPackage.CIM_SECURITY_ASSOCIATION_ENDPOINT: return createCIM_SecurityAssociationEndpoint();
			case CimPackage.CIM_SOURCE_ROUTING_SERVICE: return createCIM_SourceRoutingService();
			case CimPackage.CIM_SPANNING_TREE_SERVICE: return createCIM_SpanningTreeService();
			case CimPackage.CIM_SPECIFIC802DOT1_QVLAN_SERVICE: return createCIM_Specific802dot1QVLANService();
			case CimPackage.CIM_SWITCH_PORT: return createCIM_SwitchPort();
			case CimPackage.CIM_SWITCH_PORT_DYNAMIC_FORWARDING: return createCIM_SwitchPortDynamicForwarding();
			case CimPackage.CIM_SWITCH_PORT_PAIR: return createCIM_SwitchPortPair();
			case CimPackage.CIM_SWITCH_PORT_SOURCE_ROUTING: return createCIM_SwitchPortSourceRouting();
			case CimPackage.CIM_SWITCH_PORT_SPANNING_TREE: return createCIM_SwitchPortSpanningTree();
			case CimPackage.CIM_SWITCH_PORT_STATIC_FORWARDING: return createCIM_SwitchPortStaticForwarding();
			case CimPackage.CIM_SWITCH_SERVICE: return createCIM_SwitchService();
			case CimPackage.CIM_SWITCH_SERVICE_SOURCE_ROUTING: return createCIM_SwitchServiceSourceRouting();
			case CimPackage.CIM_SWITCH_SERVICE_SPANNING_TREE: return createCIM_SwitchServiceSpanningTree();
			case CimPackage.CIM_SWITCH_SERVICE_VLAN: return createCIM_SwitchServiceVLAN();
			case CimPackage.CIM_SWITCH_VIRTUAL_INTERFACE: return createCIM_SwitchVirtualInterface();
			case CimPackage.CIM_SWITCHES_AMONG: return createCIM_SwitchesAmong();
			case CimPackage.CIM_TCP_PROTOCOL_ENDPOINT: return createCIM_TCPProtocolEndpoint();
			case CimPackage.CIM_TELNET_PROTOCOL_ENDPOINT: return createCIM_TelnetProtocolEndpoint();
			case CimPackage.CIM_TRANSPARENT_BRIDGING_SERVICE: return createCIM_TransparentBridgingService();
			case CimPackage.CIM_TRANSPARENT_BRIDGING_STATIC_FORWARDING: return createCIM_TransparentBridgingStaticForwarding();
			case CimPackage.CIM_TRAP_SOURCE_FOR_SNMP_SERVICE: return createCIM_TrapSourceForSNMPService();
			case CimPackage.CIM_UDP_PROTOCOL_ENDPOINT: return createCIM_UDPProtocolEndpoint();
			case CimPackage.CIM_USB_REDIRECTION_SERVICE: return createCIM_USBRedirectionService();
			case CimPackage.CIM_VLAN_ENDPOINT: return createCIM_VLANEndpoint();
			case CimPackage.CIM_VLAN_FOR: return createCIM_VLANFor();
			case CimPackage.CIM_ISCSI_PROTOCOL_ENDPOINT: return createCIM_iSCSIProtocolEndpoint();
			case CimPackage.CIM_ALLOCATED_RESOURCE: return createCIM_AllocatedResource();
			case CimPackage.CIM_AVAILABLE_DIAGNOSTIC_SERVICE: return createCIM_AvailableDiagnosticService();
			case CimPackage.CIM_BOOT_OS_FROM_FS: return createCIM_BootOSFromFS();
			case CimPackage.CIM_COMPUTER_SYSTEM: return createCIM_ComputerSystem();
			case CimPackage.CIM_COMPUTER_SYSTEM_PACKAGE: return createCIM_ComputerSystemPackage();
			case CimPackage.CIM_DMA: return createCIM_DMA();
			case CimPackage.CIM_DEVICE_ACCESSED_BY_FILE: return createCIM_DeviceAccessedByFile();
			case CimPackage.CIM_DIAGNOSTIC_LOG: return createCIM_DiagnosticLog();
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST: return createCIM_DiagnosticResultForTest();
			case CimPackage.CIM_DIAGNOSTIC_SETTING_FOR_TEST: return createCIM_DiagnosticSettingForTest();
			case CimPackage.CIM_DIAGNOSTIC_TEST_FOR_MSE: return createCIM_DiagnosticTestForMSE();
			case CimPackage.CIM_DIAGNOSTICS_LOG: return createCIM_DiagnosticsLog();
			case CimPackage.CIM_EXPORT: return createCIM_Export();
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE: return createCIM_FSQuotaManagementService();
			case CimPackage.CIM_FILE_SHARE_SETTING_DATA: return createCIM_FileShareSettingData();
			case CimPackage.CIM_FILE_STORAGE: return createCIM_FileStorage();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_SERVICE: return createCIM_FileSystemConfigurationService();
			case CimPackage.CIM_HOSTED_FILE_SYSTEM: return createCIM_HostedFileSystem();
			case CimPackage.CIM_HOSTED_JOB_DESTINATION: return createCIM_HostedJobDestination();
			case CimPackage.CIM_HOSTED_SHARE: return createCIM_HostedShare();
			case CimPackage.CIM_IRQ: return createCIM_IRQ();
			case CimPackage.CIM_INSTALLED_OS: return createCIM_InstalledOS();
			case CimPackage.CIM_LAST_APPLIED_SNAPSHOT: return createCIM_LastAppliedSnapshot();
			case CimPackage.CIM_LOCAL_ACCESS_AVAILABLE_TO_FS: return createCIM_LocalAccessAvailableToFS();
			case CimPackage.CIM_LOG_IN_DATA_FILE: return createCIM_LogInDataFile();
			case CimPackage.CIM_LOG_IN_DEVICE_FILE: return createCIM_LogInDeviceFile();
			case CimPackage.CIM_LOG_IN_STORAGE: return createCIM_LogInStorage();
			case CimPackage.CIM_MEMORY_MAPPED_IO: return createCIM_MemoryMappedIO();
			case CimPackage.CIM_MEMORY_RESOURCE: return createCIM_MemoryResource();
			case CimPackage.CIM_NFS: return createCIM_NFS();
			case CimPackage.CIM_NFS_SHARE: return createCIM_NFSShare();
			case CimPackage.CIM_OS_PROCESS: return createCIM_OSProcess();
			case CimPackage.CIM_OPERATION_LOG: return createCIM_OperationLog();
			case CimPackage.CIM_PORT_RESOURCE: return createCIM_PortResource();
			case CimPackage.CIM_PROCESS_THREAD: return createCIM_ProcessThread();
			case CimPackage.CIM_RESIDES_ON_EXTENT: return createCIM_ResidesOnExtent();
			case CimPackage.CIM_RESOURCE_OF_SYSTEM: return createCIM_ResourceOfSystem();
			case CimPackage.CIM_RUNNING_OS: return createCIM_RunningOS();
			case CimPackage.CIM_SAP_AVAILABLE_FOR_FILE_SHARE: return createCIM_SAPAvailableForFileShare();
			case CimPackage.CIM_SNAPSHOT_OF_VIRTUAL_SYSTEM: return createCIM_SnapshotOfVirtualSystem();
			case CimPackage.CIM_UNITARY_COMPUTER_SYSTEM: return createCIM_UnitaryComputerSystem();
			case CimPackage.CIM_VIRTUAL_COMPUTER_SYSTEM: return createCIM_VirtualComputerSystem();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_SERVICE: return createCIM_AccountManagementService();
			case CimPackage.CIM_ACCOUNT_ON_SYSTEM: return createCIM_AccountOnSystem();
			case CimPackage.CIM_AUTHENTICATION_SERVICE: return createCIM_AuthenticationService();
			case CimPackage.CIM_AUTHORIZATION_SERVICE: return createCIM_AuthorizationService();
			case CimPackage.CIM_AUTHORIZED_USE: return createCIM_AuthorizedUse();
			case CimPackage.CIM_COLLECTION_IN_SYSTEM: return createCIM_CollectionInSystem();
			case CimPackage.CIM_CREDENTIAL_MANAGEMENT_SERVICE: return createCIM_CredentialManagementService();
			case CimPackage.CIM_HOSTED_ACI: return createCIM_HostedACI();
			case CimPackage.CIM_HOSTED_AUTHENTICATION_REQUIREMENT: return createCIM_HostedAuthenticationRequirement();
			case CimPackage.CIM_IDENTITY_MANAGEMENT_SERVICE: return createCIM_IdentityManagementService();
			case CimPackage.CIM_KERBEROS_KEY_DISTRIBUTION_CENTER: return createCIM_KerberosKeyDistributionCenter();
			case CimPackage.CIM_KEY_BASED_CREDENTIAL_MANAGEMENT_SERVICE: return createCIM_KeyBasedCredentialManagementService();
			case CimPackage.CIM_LOCAL_CREDENTIAL_MANAGEMENT_SERVICE: return createCIM_LocalCredentialManagementService();
			case CimPackage.CIM_MANAGED_CREDENTIAL: return createCIM_ManagedCredential();
			case CimPackage.CIM_MANAGES_ACCOUNT: return createCIM_ManagesAccount();
			case CimPackage.CIM_NOTARY: return createCIM_Notary();
			case CimPackage.CIM_NOTARY_VERIFIES_BIOMETRIC: return createCIM_NotaryVerifiesBiometric();
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_SERVICE: return createCIM_PrivilegeManagementService();
			case CimPackage.CIM_PUBLIC_KEY_MANAGEMENT_SERVICE: return createCIM_PublicKeyManagementService();
			case CimPackage.CIM_REQUIRE_CREDENTIALS_FROM: return createCIM_RequireCredentialsFrom();
			case CimPackage.CIM_ROLE_BASED_AUTHORIZATION_SERVICE: return createCIM_RoleBasedAuthorizationService();
			case CimPackage.CIM_SECURITY_SERVICE_FOR_SYSTEM: return createCIM_SecurityServiceForSystem();
			case CimPackage.CIM_SERVICE_USES_SECURITY_SERVICE: return createCIM_ServiceUsesSecurityService();
			case CimPackage.CIM_SHARED_SECRET_SERVICE: return createCIM_SharedSecretService();
			case CimPackage.CIM_STORAGE_HARDWARE_ID_MANAGEMENT_SERVICE: return createCIM_StorageHardwareIDManagementService();
			case CimPackage.CIM_SYSTEM_ADMINISTRATOR: return createCIM_SystemAdministrator();
			case CimPackage.CIM_SYSTEM_ADMINISTRATOR_GROUP: return createCIM_SystemAdministratorGroup();
			case CimPackage.CIM_SYSTEM_ADMINISTRATOR_ROLE: return createCIM_SystemAdministratorRole();
			case CimPackage.CIM_TRUST_HIERARCHY: return createCIM_TrustHierarchy();
			case CimPackage.CIM_VERIFICATION_SERVICE: return createCIM_VerificationService();
			case CimPackage.CIM_ACTION_SEQUENCE: return createCIM_ActionSequence();
			case CimPackage.CIM_APPLICATION_SYSTEM: return createCIM_ApplicationSystem();
			case CimPackage.CIM_APPLICATION_SYSTEM_DEPENDENCY: return createCIM_ApplicationSystemDependency();
			case CimPackage.CIM_APPLICATION_SYSTEM_DIRECTORY: return createCIM_ApplicationSystemDirectory();
			case CimPackage.CIM_APPLICATION_SYSTEM_HIERARCHY: return createCIM_ApplicationSystemHierarchy();
			case CimPackage.CIM_APPLICATION_SYSTEM_SOFTWARE_FEATURE: return createCIM_ApplicationSystemSoftwareFeature();
			case CimPackage.CIM_ASSOCIATED_APP_SYSTEM_OVERVIEW_STATISTICS: return createCIM_AssociatedAppSystemOverviewStatistics();
			case CimPackage.CIM_DIRECTORY_SPECIFICATION: return createCIM_DirectorySpecification();
			case CimPackage.CIM_DISK_SPACE_CHECK: return createCIM_DiskSpaceCheck();
			case CimPackage.CIM_EXECUTE_PROGRAM: return createCIM_ExecuteProgram();
			case CimPackage.CIM_FILE_SPECIFICATION: return createCIM_FileSpecification();
			case CimPackage.CIM_FROM_DIRECTORY_ACTION: return createCIM_FromDirectoryAction();
			case CimPackage.CIM_FROM_DIRECTORY_SPECIFICATION: return createCIM_FromDirectorySpecification();
			case CimPackage.CIM_INSTALLED_SOFTWARE_ELEMENT: return createCIM_InstalledSoftwareElement();
			case CimPackage.CIM_J2EE_APP_CLIENT_MODULE: return createCIM_J2eeAppClientModule();
			case CimPackage.CIM_J2EE_APPLICATION: return createCIM_J2eeApplication();
			case CimPackage.CIM_J2EE_APPLICATION_MODULE: return createCIM_J2eeApplicationModule();
			case CimPackage.CIM_J2EE_EJB_MODULE: return createCIM_J2eeEJBModule();
			case CimPackage.CIM_J2EE_JCA_CONNECTION_FACTORY_MANAGED_CONNECTION_FACTORY: return createCIM_J2eeJCAConnectionFactoryManagedConnectionFactory();
			case CimPackage.CIM_J2EE_JCA_RESOURCE: return createCIM_J2eeJCAResource();
			case CimPackage.CIM_J2EE_JDBC_DATA_SOURCE_DRIVER: return createCIM_J2eeJDBCDataSourceDriver();
			case CimPackage.CIM_J2EE_JDBC_RESOURCE: return createCIM_J2eeJDBCResource();
			case CimPackage.CIM_J2EE_JDBC_RESOURCE_USES_DATA_SOURCE: return createCIM_J2eeJDBCResourceUsesDataSource();
			case CimPackage.CIM_J2EE_JMS_RESOURCE: return createCIM_J2eeJMSResource();
			case CimPackage.CIM_J2EE_JNDI_RESOURCE: return createCIM_J2eeJNDIResource();
			case CimPackage.CIM_J2EE_JTA_RESOURCE: return createCIM_J2eeJTAResource();
			case CimPackage.CIM_J2EE_JAVA_MAIL_RESOURCE: return createCIM_J2eeJavaMailResource();
			case CimPackage.CIM_J2EE_RMI_IIOP_RESOURCE: return createCIM_J2eeRMI_IIOPResource();
			case CimPackage.CIM_J2EE_RESOURCE_ADAPTER_IN_MODULE: return createCIM_J2eeResourceAdapterInModule();
			case CimPackage.CIM_J2EE_SERVER: return createCIM_J2eeServer();
			case CimPackage.CIM_J2EE_SERVER_USES_JVM: return createCIM_J2eeServerUsesJVM();
			case CimPackage.CIM_J2EE_SERVLET_IN_MODULE: return createCIM_J2eeServletInModule();
			case CimPackage.CIM_MEMORY_CHECK: return createCIM_MemoryCheck();
			case CimPackage.CIM_MODIFY_SETTING_ACTION: return createCIM_ModifySettingAction();
			case CimPackage.CIM_OS_VERSION_CHECK: return createCIM_OSVersionCheck();
			case CimPackage.CIM_REBOOT_ACTION: return createCIM_RebootAction();
			case CimPackage.CIM_REMOVE_DIRECTORY_ACTION: return createCIM_RemoveDirectoryAction();
			case CimPackage.CIM_REMOVE_FILE_ACTION: return createCIM_RemoveFileAction();
			case CimPackage.CIM_SETTING_CHECK: return createCIM_SettingCheck();
			case CimPackage.CIM_SOFTWARE_ELEMENT_ACTIONS: return createCIM_SoftwareElementActions();
			case CimPackage.CIM_SOFTWARE_ELEMENT_CHECKS: return createCIM_SoftwareElementChecks();
			case CimPackage.CIM_SOFTWARE_ELEMENT_VERSION_CHECK: return createCIM_SoftwareElementVersionCheck();
			case CimPackage.CIM_SWAP_SPACE_CHECK: return createCIM_SwapSpaceCheck();
			case CimPackage.CIM_SYSTEM_BIOS: return createCIM_SystemBIOS();
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK: return createCIM_VersionCompatibilityCheck();
			case CimPackage.CIM_ACTIVE_CONNECTION: return createCIM_ActiveConnection();
			case CimPackage.CIM_ADMIN_DOMAIN: return createCIM_AdminDomain();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE: return createCIM_AssociatedPowerManagementService();
			case CimPackage.CIM_BASED_ON: return createCIM_BasedOn();
			case CimPackage.CIM_BINDS_TO: return createCIM_BindsTo();
			case CimPackage.CIM_CONFIGURATION_FOR_SYSTEM: return createCIM_ConfigurationForSystem();
			case CimPackage.CIM_CONTAINED_DOMAIN: return createCIM_ContainedDomain();
			case CimPackage.CIM_DEVICE_SAP_IMPLEMENTATION: return createCIM_DeviceSAPImplementation();
			case CimPackage.CIM_DEVICE_SERVICE_IMPLEMENTATION: return createCIM_DeviceServiceImplementation();
			case CimPackage.CIM_DEVICE_STATISTICS: return createCIM_DeviceStatistics();
			case CimPackage.CIM_EXTENT_REDUNDANCY_COMPONENT: return createCIM_ExtentRedundancyComponent();
			case CimPackage.CIM_HOSTED_ACCESS_POINT: return createCIM_HostedAccessPoint();
			case CimPackage.CIM_HOSTED_COLLECTION: return createCIM_HostedCollection();
			case CimPackage.CIM_HOSTED_IP_INTERFACE: return createCIM_HostedIPInterface();
			case CimPackage.CIM_HOSTED_RESOURCE_POOL: return createCIM_HostedResourcePool();
			case CimPackage.CIM_HOSTED_SERVICE: return createCIM_HostedService();
			case CimPackage.CIM_INSTALLED_SOFTWARE_IDENTITY: return createCIM_InstalledSoftwareIdentity();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SAP: return createCIM_LaunchInContextSAP();
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SERVICE: return createCIM_LaunchInContextService();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA: return createCIM_OpaqueManagementData();
			case CimPackage.CIM_OPAQUE_MANAGEMENT_DATA_SERVICE: return createCIM_OpaqueManagementDataService();
			case CimPackage.CIM_PROTOCOL_SERVICE: return createCIM_ProtocolService();
			case CimPackage.CIM_PROVIDES_ENDPOINT: return createCIM_ProvidesEndpoint();
			case CimPackage.CIM_RAW_MEMORY: return createCIM_RawMemory();
			case CimPackage.CIM_REMOTE_PORT: return createCIM_RemotePort();
			case CimPackage.CIM_SCOPED_VIEW: return createCIM_ScopedView();
			case CimPackage.CIM_SETTING_FOR_SYSTEM: return createCIM_SettingForSystem();
			case CimPackage.CIM_SYSTEM_DEVICE_VIEW: return createCIM_SystemDeviceView();
			case CimPackage.CIM_VIRTUAL_SYSTEM_MANAGEMENT_SERVICE: return createCIM_VirtualSystemManagementService();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_SERVICE: return createCIM_VirtualSystemSnapshotService();
			case CimPackage.CIM_VISIBLE_MEMORY: return createCIM_VisibleMemory();
			case CimPackage.CIM_DATABASE_STORAGE: return createCIM_DatabaseStorage();
			case CimPackage.CIM_DATABASE_SYSTEM: return createCIM_DatabaseSystem();
			case CimPackage.CIM_AGP_VIDEO_CONTROLLER: return createCIM_AGPVideoController();
			case CimPackage.CIM_ATA_INITIATOR_TARGET_LOGICAL_UNIT_PATH: return createCIM_ATAInitiatorTargetLogicalUnitPath();
			case CimPackage.CIM_ATA_PORT: return createCIM_ATAPort();
			case CimPackage.CIM_ADAPTER_ACTIVE_CONNECTION: return createCIM_AdapterActiveConnection();
			case CimPackage.CIM_AGGREGATE_PS_EXTENT_BASED_ON_AGGREGATE_PEXTENT: return createCIM_AggregatePSExtentBasedOnAggregatePExtent();
			case CimPackage.CIM_AGGREGATE_PS_EXTENT_BASED_ON_PEXTENT: return createCIM_AggregatePSExtentBasedOnPExtent();
			case CimPackage.CIM_AGGREGATE_REDUNDANCY_COMPONENT: return createCIM_AggregateRedundancyComponent();
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL: return createCIM_AllocatedFromStoragePool();
			case CimPackage.CIM_ASSOCIATED_BATTERY: return createCIM_AssociatedBattery();
			case CimPackage.CIM_ASSOCIATED_COMPONENT_EXTENT: return createCIM_AssociatedComponentExtent();
			case CimPackage.CIM_ASSOCIATED_COOLING: return createCIM_AssociatedCooling();
			case CimPackage.CIM_ASSOCIATED_INDICATOR_LED: return createCIM_AssociatedIndicatorLED();
			case CimPackage.CIM_ASSOCIATED_LABEL_READER: return createCIM_AssociatedLabelReader();
			case CimPackage.CIM_ASSOCIATED_MASKING_GROUP: return createCIM_AssociatedMaskingGroup();
			case CimPackage.CIM_ASSOCIATED_MEMORY: return createCIM_AssociatedMemory();
			case CimPackage.CIM_ASSOCIATED_PROCESSOR_MEMORY: return createCIM_AssociatedProcessorMemory();
			case CimPackage.CIM_ASSOCIATED_PROTOCOL_CONTROLLER: return createCIM_AssociatedProtocolController();
			case CimPackage.CIM_ASSOCIATED_REMAINING_EXTENT: return createCIM_AssociatedRemainingExtent();
			case CimPackage.CIM_ASSOCIATED_SENSOR: return createCIM_AssociatedSensor();
			case CimPackage.CIM_ASSOCIATED_TARGET_MASKING_GROUP: return createCIM_AssociatedTargetMaskingGroup();
			case CimPackage.CIM_BIOS_LOADED_IN_NV: return createCIM_BIOSLoadedInNV();
			case CimPackage.CIM_BINARY_SENSOR: return createCIM_BinarySensor();
			case CimPackage.CIM_CDROM_DRIVE: return createCIM_CDROMDrive();
			case CimPackage.CIM_CACHE_MEMORY: return createCIM_CacheMemory();
			case CimPackage.CIM_CHANGER_DEVICE: return createCIM_ChangerDevice();
			case CimPackage.CIM_COMPOSITE_EXTENT_BASED_ON: return createCIM_CompositeExtentBasedOn();
			case CimPackage.CIM_COMPUTER_SYSTEM_MEMORY: return createCIM_ComputerSystemMemory();
			case CimPackage.CIM_COMPUTER_SYSTEM_PROCESSOR: return createCIM_ComputerSystemProcessor();
			case CimPackage.CIM_CONTROLLED_BY: return createCIM_ControlledBy();
			case CimPackage.CIM_CONTROLLER_CONFIGURATION_SERVICE: return createCIM_ControllerConfigurationService();
			case CimPackage.CIM_DSL_MODEM: return createCIM_DSLModem();
			case CimPackage.CIM_DVD_DRIVE: return createCIM_DVDDrive();
			case CimPackage.CIM_DEVICE_SERVICES_LOCATION: return createCIM_DeviceServicesLocation();
			case CimPackage.CIM_DISCRETE_SENSOR: return createCIM_DiscreteSensor();
			case CimPackage.CIM_DISK_DRIVE: return createCIM_DiskDrive();
			case CimPackage.CIM_DISKETTE_DRIVE: return createCIM_DisketteDrive();
			case CimPackage.CIM_DRIVE_IN_DISK_GROUP: return createCIM_DriveInDiskGroup();
			case CimPackage.CIM_ETHERNET_ADAPTER: return createCIM_EthernetAdapter();
			case CimPackage.CIM_ETHERNET_PORT: return createCIM_EthernetPort();
			case CimPackage.CIM_FC_ACTIVE_CONNECTION: return createCIM_FCActiveConnection();
			case CimPackage.CIM_FC_PORT: return createCIM_FCPort();
			case CimPackage.CIM_FC_TOPOLOGY_VIEW: return createCIM_FCTopologyView();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER: return createCIM_FibreChannelAdapter();
			case CimPackage.CIM_FIBRE_PORT: return createCIM_FibrePort();
			case CimPackage.CIM_FIBRE_PORT_ACTIVE_LOGIN: return createCIM_FibrePortActiveLogin();
			case CimPackage.CIM_FIBRE_PORT_ON_FC_ADAPTER: return createCIM_FibrePortOnFCAdapter();
			case CimPackage.CIM_FLAT_PANEL: return createCIM_FlatPanel();
			case CimPackage.CIM_GENERIC_DISK_PARTITION: return createCIM_GenericDiskPartition();
			case CimPackage.CIM_GROUP_MASKING_MAPPING_SERVICE: return createCIM_GroupMaskingMappingService();
			case CimPackage.CIM_HDSL_MODEM: return createCIM_HDSLModem();
			case CimPackage.CIM_HOSTED_STORAGE_POOL: return createCIM_HostedStoragePool();
			case CimPackage.CIM_ISDN_MODEM: return createCIM_ISDNModem();
			case CimPackage.CIM_INTER_LIBRARY_PORT: return createCIM_InterLibraryPort();
			case CimPackage.CIM_KEYBOARD: return createCIM_Keyboard();
			case CimPackage.CIM_LLDP_ETHERNET_PORT: return createCIM_LLDPEthernetPort();
			case CimPackage.CIM_LIBRARY_EXCHANGE: return createCIM_LibraryExchange();
			case CimPackage.CIM_LIBRARY_PACKAGE: return createCIM_LibraryPackage();
			case CimPackage.CIM_LIMITED_ACCESS_PORT: return createCIM_LimitedAccessPort();
			case CimPackage.CIM_LOGICAL_DISK_BASED_ON_EXTENT: return createCIM_LogicalDiskBasedOnExtent();
			case CimPackage.CIM_LOGICAL_DISK_BASED_ON_PARTITION: return createCIM_LogicalDiskBasedOnPartition();
			case CimPackage.CIM_LOGICAL_DISK_BASED_ON_VOLUME: return createCIM_LogicalDiskBasedOnVolume();
			case CimPackage.CIM_LOGICAL_DISK_BASED_ON_VOLUME_SET: return createCIM_LogicalDiskBasedOnVolumeSet();
			case CimPackage.CIM_MAGNETO_OPTICAL_DRIVE: return createCIM_MagnetoOpticalDrive();
			case CimPackage.CIM_MEMORY_CONFIGURATION_SERVICE: return createCIM_MemoryConfigurationService();
			case CimPackage.CIM_MODULE_PORT: return createCIM_ModulePort();
			case CimPackage.CIM_MULTI_STATE_SENSOR: return createCIM_MultiStateSensor();
			case CimPackage.CIM_NUMERIC_SENSOR: return createCIM_NumericSensor();
			case CimPackage.CIM_OOB_ALERT_SERVICE_ON_MODEM: return createCIM_OOBAlertServiceOnModem();
			case CimPackage.CIM_OOB_ALERT_SERVICE_ON_NETWORK_ADAPTER: return createCIM_OOBAlertServiceOnNetworkAdapter();
			case CimPackage.CIM_OOB_ALERT_SERVICE_ON_NETWORK_PORT: return createCIM_OOBAlertServiceOnNetworkPort();
			case CimPackage.CIM_OWNING_PRINT_QUEUE: return createCIM_OwningPrintQueue();
			case CimPackage.CIM_PCI_BRIDGE: return createCIM_PCIBridge();
			case CimPackage.CIM_PC_VIDEO_CONTROLLER: return createCIM_PCVideoController();
			case CimPackage.CIM_PEXTENT_REDUNDANCY_COMPONENT: return createCIM_PExtentRedundancyComponent();
			case CimPackage.CIM_POTS_MODEM: return createCIM_POTSModem();
			case CimPackage.CIM_PS_EXTENT_BASED_ON_PEXTENT: return createCIM_PSExtentBasedOnPExtent();
			case CimPackage.CIM_PACKAGE_ALARM: return createCIM_PackageAlarm();
			case CimPackage.CIM_PACKAGE_COOLING: return createCIM_PackageCooling();
			case CimPackage.CIM_PICKER_FOR_CHANGER: return createCIM_PickerForChanger();
			case CimPackage.CIM_PICKER_LABEL_READER: return createCIM_PickerLabelReader();
			case CimPackage.CIM_POINTING_DEVICE: return createCIM_PointingDevice();
			case CimPackage.CIM_PORT_IMPLEMENTS_ENDPOINT: return createCIM_PortImplementsEndpoint();
			case CimPackage.CIM_PROTECTED_EXTENT_BASED_ON: return createCIM_ProtectedExtentBasedOn();
			case CimPackage.CIM_PROTOCOL_CONTROLLER_ACCESSES_UNIT: return createCIM_ProtocolControllerAccessesUnit();
			case CimPackage.CIM_REALIZED_ON_SIDE: return createCIM_RealizedOnSide();
			case CimPackage.CIM_REALIZES_AGGREGATE_PEXTENT: return createCIM_RealizesAggregatePExtent();
			case CimPackage.CIM_REALIZES_TAPE_PARTITION: return createCIM_RealizesTapePartition();
			case CimPackage.CIM_REPLICA_POOL_FOR_STORAGE: return createCIM_ReplicaPoolForStorage();
			case CimPackage.CIM_REPLICATION_SERVICE: return createCIM_ReplicationService();
			case CimPackage.CIM_REPLICATION_SERVICE_CAPABILITIES: return createCIM_ReplicationServiceCapabilities();
			case CimPackage.CIM_SCSI_INTERFACE: return createCIM_SCSIInterface();
			case CimPackage.CIM_SDSL_MODEM: return createCIM_SDSLModem();
			case CimPackage.CIM_SERIAL_INTERFACE: return createCIM_SerialInterface();
			case CimPackage.CIM_SPARE_CONFIGURATION_SERVICE: return createCIM_SpareConfigurationService();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES: return createCIM_StorageConfigurationCapabilities();
			case CimPackage.CIM_STORAGE_CONFIGURATION_SERVICE: return createCIM_StorageConfigurationService();
			case CimPackage.CIM_STORAGE_ELEMENT_COMPOSITION_SERVICE: return createCIM_StorageElementCompositionService();
			case CimPackage.CIM_STORAGE_ELEMENT_DRIVE_DEPENDENCY: return createCIM_StorageElementDriveDependency();
			case CimPackage.CIM_STORAGE_PROCESSOR_AFFINITY: return createCIM_StorageProcessorAffinity();
			case CimPackage.CIM_STORAGE_RELOCATION_SERVICE: return createCIM_StorageRelocationService();
			case CimPackage.CIM_TACHOMETER: return createCIM_Tachometer();
			case CimPackage.CIM_TAPE_PARTITION_ON_SURFACE: return createCIM_TapePartitionOnSurface();
			case CimPackage.CIM_TEMPERATURE_SENSOR: return createCIM_TemperatureSensor();
			case CimPackage.CIM_TIER_DOMAIN: return createCIM_TierDomain();
			case CimPackage.CIM_TIER_SERVICE: return createCIM_TierService();
			case CimPackage.CIM_USB_CONNECTION: return createCIM_USBConnection();
			case CimPackage.CIM_USB_CONTROLLER_HAS_HUB: return createCIM_USBControllerHasHub();
			case CimPackage.CIM_UNIMODEM: return createCIM_Unimodem();
			case CimPackage.CIM_VDSL_MODEM: return createCIM_VDSLModem();
			case CimPackage.CIM_VTL_STATISTICAL_DATA_SERVICE: return createCIM_VTLStatisticalDataService();
			case CimPackage.CIM_VTOC_DISK_PARTITION: return createCIM_VTOCDiskPartition();
			case CimPackage.CIM_VOLTAGE_SENSOR: return createCIM_VoltageSensor();
			case CimPackage.CIM_VOLUME_SET_BASED_ON_PS_EXTENT: return createCIM_VolumeSetBasedOnPSExtent();
			case CimPackage.CIM_WAKE_UP_SERVICE_ON_MODEM: return createCIM_WakeUpServiceOnModem();
			case CimPackage.CIM_WAKE_UP_SERVICE_ON_NETWORK_ADAPTER: return createCIM_WakeUpServiceOnNetworkAdapter();
			case CimPackage.CIM_WAKE_UP_SERVICE_ON_NETWORK_PORT: return createCIM_WakeUpServiceOnNetworkPort();
			case CimPackage.CIM_WI_FI_ENDPOINT: return createCIM_WiFiEndpoint();
			case CimPackage.CIM_WI_FI_PORT_CONFIGURATION_SERVICE: return createCIM_WiFiPortConfigurationService();
			case CimPackage.CIM_IPSEC_POLICY_FOR_ENDPOINT: return createCIM_IPsecPolicyForEndpoint();
			case CimPackage.CIM_RULE_THAT_GENERATED_SA: return createCIM_RuleThatGeneratedSA();
			case CimPackage.CIM_COMM_MECHANISM_FOR_ADAPTER: return createCIM_CommMechanismForAdapter();
			case CimPackage.CIM_COMM_MECHANISM_FOR_MANAGER: return createCIM_CommMechanismForManager();
			case CimPackage.CIM_COMM_MECHANISM_FOR_OBJECT_MANAGER_ADAPTER: return createCIM_CommMechanismForObjectManagerAdapter();
			case CimPackage.CIM_NAMESPACE_IN_MANAGER: return createCIM_NamespaceInManager();
			case CimPackage.CIM_AF_SERVICE: return createCIM_AFService();
			case CimPackage.CIM_AUTONOMOUS_SYSTEM: return createCIM_AutonomousSystem();
			case CimPackage.CIM_BGP_ADMIN_DISTANCE: return createCIM_BGPAdminDistance();
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS: return createCIM_BGPClustersInAS();
			case CimPackage.CIM_BGP_PEER_GROUP_SERVICE: return createCIM_BGPPeerGroupService();
			case CimPackage.CIM_BGP_ROUTING_POLICY: return createCIM_BGPRoutingPolicy();
			case CimPackage.CIM_BINDS_TO_LAN_ENDPOINT: return createCIM_BindsToLANEndpoint();
			case CimPackage.CIM_CLASSIFIER_ELEMENT: return createCIM_ClassifierElement();
			case CimPackage.CIM_CLASSIFIER_ELEMENT_IN_CLASSIFIER_SERVICE: return createCIM_ClassifierElementInClassifierService();
			case CimPackage.CIM_CLASSIFIER_ELEMENT_USES_FILTER_LIST: return createCIM_ClassifierElementUsesFilterList();
			case CimPackage.CIM_CLASSIFIER_FILTER_SET: return createCIM_ClassifierFilterSet();
			case CimPackage.CIM_CONFEDERATION: return createCIM_Confederation();
			case CimPackage.CIM_ENDPOINT_IN_LINK: return createCIM_EndpointInLink();
			case CimPackage.CIM_FAIL_NEXT_SCHEDULER: return createCIM_FailNextScheduler();
			case CimPackage.CIM_FILTER_ENTRY_IN_SYSTEM: return createCIM_FilterEntryInSystem();
			case CimPackage.CIM_FILTER_LIST_IN_SYSTEM: return createCIM_FilterListInSystem();
			case CimPackage.CIM_FILTER_OF_SECURITY_ASSOCIATION: return createCIM_FilterOfSecurityAssociation();
			case CimPackage.CIM_FORWARDED_ROUTES: return createCIM_ForwardedRoutes();
			case CimPackage.CIM_HOSTED_ADMIN_DISTANCE: return createCIM_HostedAdminDistance();
			case CimPackage.CIM_HOSTED_BGP_ATTRIBUTES: return createCIM_HostedBGPAttributes();
			case CimPackage.CIM_HOSTED_BGP_PEER_GROUP: return createCIM_HostedBGPPeerGroup();
			case CimPackage.CIM_HOSTED_BGP_ROUTE_MAP: return createCIM_HostedBGPRouteMap();
			case CimPackage.CIM_HOSTED_FILTER_ENTRY_BASE: return createCIM_HostedFilterEntryBase();
			case CimPackage.CIM_HOSTED_FILTER_LIST: return createCIM_HostedFilterList();
			case CimPackage.CIM_HOSTED_FORWARDING_SERVICES: return createCIM_HostedForwardingServices();
			case CimPackage.CIM_HOSTED_ROUTING_POLICY: return createCIM_HostedRoutingPolicy();
			case CimPackage.CIM_HOSTED_ROUTING_SERVICES: return createCIM_HostedRoutingServices();
			case CimPackage.CIM_IKESA_ENDPOINT: return createCIM_IKESAEndpoint();
			case CimPackage.CIM_IP_CONFIGURATION_SERVICE: return createCIM_IPConfigurationService();
			case CimPackage.CIM_IP_ENCAPSULATION_MANAGEMENT_SERVICE: return createCIM_IPEncapsulationManagementService();
			case CimPackage.CIM_IP_LOOPBACK: return createCIM_IPLoopback();
			case CimPackage.CIM_IP_SUBINTERFACE: return createCIM_IPSubinterface();
			case CimPackage.CIM_IPSEC_SA_ENDPOINT: return createCIM_IPsecSAEndpoint();
			case CimPackage.CIM_IN_BGP_PEER_GROUP: return createCIM_InBGPPeerGroup();
			case CimPackage.CIM_IN_SEGMENT: return createCIM_InSegment();
			case CimPackage.CIM_INBOUND_VLAN: return createCIM_InboundVLAN();
			case CimPackage.CIM_NETWORK: return createCIM_Network();
			case CimPackage.CIM_NETWORK_SERVICES_IN_ADMIN_DOMAIN: return createCIM_NetworkServicesInAdminDomain();
			case CimPackage.CIM_NETWORKS_IN_ADMIN_DOMAIN: return createCIM_NetworksInAdminDomain();
			case CimPackage.CIM_NEXT_SERVICE_AFTER_CLASSIFIER_ELEMENT: return createCIM_NextServiceAfterClassifierElement();
			case CimPackage.CIM_OSPF_PROTOCOL_ENDPOINT: return createCIM_OSPFProtocolEndpoint();
			case CimPackage.CIM_OUTBOUND_VLAN: return createCIM_OutboundVLAN();
			case CimPackage.CIM_PEER_OF_SA_ENDPOINT: return createCIM_PeerOfSAEndpoint();
			case CimPackage.CIM_PHASE1_SA_USED_FOR_PHASE2: return createCIM_Phase1SAUsedForPhase2();
			case CimPackage.CIM_RELATED_SPANNING_TREE: return createCIM_RelatedSpanningTree();
			case CimPackage.CIM_RELATED_TRANSPARENT_BRIDGING_SERVICE: return createCIM_RelatedTransparentBridgingService();
			case CimPackage.CIM_ROUTERS_IN_AS: return createCIM_RoutersInAS();
			case CimPackage.CIM_ROUTERS_IN_BGP_CLUSTER: return createCIM_RoutersInBGPCluster();
			case CimPackage.CIM_ROUTING_PROTOCOL_DOMAIN: return createCIM_RoutingProtocolDomain();
			case CimPackage.CIM_ROUTING_PROTOCOL_DOMAIN_IN_AS: return createCIM_RoutingProtocolDomainInAS();
			case CimPackage.CIM_SNMP_TRAP_TARGET: return createCIM_SNMPTrapTarget();
			case CimPackage.CIM_SWITCH_SERVICE_TRANSPARENT_BRIDGING: return createCIM_SwitchServiceTransparentBridging();
			case CimPackage.CIM_SWITCHABLE: return createCIM_Switchable();
			case CimPackage.CIM_TRANSFORM_OF_SECURITY_ASSOCIATION: return createCIM_TransformOfSecurityAssociation();
			case CimPackage.CIM_TRANSPARENT_BRIDGING_DYNAMIC_FORWARDING: return createCIM_TransparentBridgingDynamicForwarding();
			case CimPackage.CIM_VLAN_NETWORK: return createCIM_VLANNetwork();
			case CimPackage.CIM_VRF_CONFIGURATION_SERVICE: return createCIM_VRFConfigurationService();
			case CimPackage.CIM_ISCSI_CONFIGURATION_SERVICE: return createCIM_iSCSIConfigurationService();
			case CimPackage.CIM_ACCEPT_CREDENTIAL_FROM: return createCIM_AcceptCredentialFrom();
			case CimPackage.CIM_POLICY_GROUP_IN_SYSTEM: return createCIM_PolicyGroupInSystem();
			case CimPackage.CIM_POLICY_REPOSITORY: return createCIM_PolicyRepository();
			case CimPackage.CIM_POLICY_REPOSITORY_IN_POLICY_REPOSITORY: return createCIM_PolicyRepositoryInPolicyRepository();
			case CimPackage.CIM_POLICY_ROLE_COLLECTION_IN_SYSTEM: return createCIM_PolicyRoleCollectionInSystem();
			case CimPackage.CIM_POLICY_RULE_IN_SYSTEM: return createCIM_PolicyRuleInSystem();
			case CimPackage.CIM_REUSABLE_POLICY_CONTAINER: return createCIM_ReusablePolicyContainer();
			case CimPackage.CIM_ALLOCATED_DMA: return createCIM_AllocatedDMA();
			case CimPackage.CIM_BOOT_SERVICE: return createCIM_BootService();
			case CimPackage.CIM_BOOT_SERVICE_ACCESS_BY_SAP: return createCIM_BootServiceAccessBySAP();
			case CimPackage.CIM_CIFS_SHARE: return createCIM_CIFSShare();
			case CimPackage.CIM_CLUSTER: return createCIM_Cluster();
			case CimPackage.CIM_CLUSTERING_SERVICE: return createCIM_ClusteringService();
			case CimPackage.CIM_COMPONENT_CS: return createCIM_ComponentCS();
			case CimPackage.CIM_COMPUTER_SYSTEM_RESOURCE: return createCIM_ComputerSystemResource();
			case CimPackage.CIM_FILE_EXPORT_SERVICE: return createCIM_FileExportService();
			case CimPackage.CIM_FILE_SERVER_CONFIGURATION_SERVICE: return createCIM_FileServerConfigurationService();
			case CimPackage.CIM_HOSTED_BOOT_SAP: return createCIM_HostedBootSAP();
			case CimPackage.CIM_HOSTED_BOOT_SERVICE: return createCIM_HostedBootService();
			case CimPackage.CIM_HOSTED_CLUSTER_SAP: return createCIM_HostedClusterSAP();
			case CimPackage.CIM_HOSTED_CLUSTER_SERVICE: return createCIM_HostedClusterService();
			case CimPackage.CIM_HOSTING_CS: return createCIM_HostingCS();
			case CimPackage.CIM_PARTICIPATING_CS: return createCIM_ParticipatingCS();
			case CimPackage.CIM_SYSTEM_PARTITION: return createCIM_SystemPartition();
			case CimPackage.CIM_AUTHENTICATE_FOR_USE: return createCIM_AuthenticateForUse();
			case CimPackage.CIM_CERTIFICATE_AUTHORITY: return createCIM_CertificateAuthority();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_SERVICE: return createCIM_CertificateManagementService();
			case CimPackage.CIM_IKE_SECRET_IS_NAMED: return createCIM_IKESecretIsNamed();
			case CimPackage.CIM_KDC_ISSUES_KERBEROS_TICKET: return createCIM_KDCIssuesKerberosTicket();
			case CimPackage.CIM_LOCALLY_MANAGED_PUBLIC_KEY: return createCIM_LocallyManagedPublicKey();
			case CimPackage.CIM_MANAGES_ACCOUNT_ON_SYSTEM: return createCIM_ManagesAccountOnSystem();
			case CimPackage.CIM_SHARED_SECRET_IS_SHARED: return createCIM_SharedSecretIsShared();
			case CimPackage.CIM_ARCHITECTURE_CHECK: return createCIM_ArchitectureCheck();
			case CimPackage.CIM_COPY_FILE_ACTION: return createCIM_CopyFileAction();
			case CimPackage.CIM_CREATE_DIRECTORY_ACTION: return createCIM_CreateDirectoryAction();
			case CimPackage.CIM_DIRECTORY_SPECIFICATION_FILE: return createCIM_DirectorySpecificationFile();
			case CimPackage.CIM_J2EE_APPLICATION_HOSTED_ON_SERVER: return createCIM_J2eeApplicationHostedOnServer();
			case CimPackage.CIM_J2EE_CONNECTION_FACTORY_AVAILABLE_TO_JCA_RESOURCE: return createCIM_J2eeConnectionFactoryAvailableToJCAResource();
			case CimPackage.CIM_J2EE_DOMAIN: return createCIM_J2eeDomain();
			case CimPackage.CIM_J2EE_EJB_IN_MODULE: return createCIM_J2eeEJBInModule();
			case CimPackage.CIM_J2EE_RESOURCE_ON_SERVER: return createCIM_J2eeResourceOnServer();
			case CimPackage.CIM_J2EE_SERVER_IN_DOMAIN: return createCIM_J2eeServerInDomain();
			case CimPackage.CIM_TO_DIRECTORY_ACTION: return createCIM_ToDirectoryAction();
			case CimPackage.CIM_TO_DIRECTORY_SPECIFICATION: return createCIM_ToDirectorySpecification();
			case CimPackage.CIM_ASSOCIATED_DATABASE_SYSTEM: return createCIM_AssociatedDatabaseSystem();
			case CimPackage.CIM_ADSL_MODEM: return createCIM_ADSLModem();
			case CimPackage.CIM_ACCESS_LABEL_READER: return createCIM_AccessLabelReader();
			case CimPackage.CIM_ASSOCIATED_CACHE_MEMORY: return createCIM_AssociatedCacheMemory();
			case CimPackage.CIM_ASSOCIATED_DEVICE_MASKING_GROUP: return createCIM_AssociatedDeviceMaskingGroup();
			case CimPackage.CIM_ASSOCIATED_INITIATOR_MASKING_GROUP: return createCIM_AssociatedInitiatorMaskingGroup();
			case CimPackage.CIM_ASSOCIATED_SUPPLY_VOLTAGE_SENSOR: return createCIM_AssociatedSupplyVoltageSensor();
			case CimPackage.CIM_CABLE_MODEM: return createCIM_CableModem();
			case CimPackage.CIM_COLLECTION_OF_SENSORS: return createCIM_CollectionOfSensors();
			case CimPackage.CIM_CURRENT_SENSOR: return createCIM_CurrentSensor();
			case CimPackage.CIM_DESKTOP_MONITOR: return createCIM_DesktopMonitor();
			case CimPackage.CIM_DISK_PARTITION: return createCIM_DiskPartition();
			case CimPackage.CIM_DISK_PARTITION_BASED_ON_VOLUME: return createCIM_DiskPartitionBasedOnVolume();
			case CimPackage.CIM_DISK_PARTITION_CONFIGURATION_SERVICE: return createCIM_DiskPartitionConfigurationService();
			case CimPackage.CIM_GPT_DISK_PARTITION: return createCIM_GPTDiskPartition();
			case CimPackage.CIM_MONITOR_SETTING: return createCIM_MonitorSetting();
			case CimPackage.CIM_PACKAGE_TEMP_SENSOR: return createCIM_PackageTempSensor();
			case CimPackage.CIM_REALIZES_DISK_PARTITION: return createCIM_RealizesDiskPartition();
			case CimPackage.CIM_AF_RELATED_SERVICES: return createCIM_AFRelatedServices();
			case CimPackage.CIM_ASBGP_ENDPOINTS: return createCIM_ASBGPEndpoints();
			case CimPackage.CIM_HOSTED_NETWORK_PIPE: return createCIM_HostedNetworkPipe();
			case CimPackage.CIM_OSPF_AREA: return createCIM_OSPFArea();
			case CimPackage.CIM_POLICY_ACTION_IN_POLICY_REPOSITORY: return createCIM_PolicyActionInPolicyRepository();
			case CimPackage.CIM_POLICY_CONDITION_IN_POLICY_REPOSITORY: return createCIM_PolicyConditionInPolicyRepository();
			case CimPackage.CIM_POLICY_CONTAINER_IN_POLICY_CONTAINER: return createCIM_PolicyContainerInPolicyContainer();
			case CimPackage.CIM_REUSABLE_POLICY: return createCIM_ReusablePolicy();
			case CimPackage.CIM_CLUSTER_SERVICE_ACCESS_BY_SAP: return createCIM_ClusterServiceAccessBySAP();
			case CimPackage.CIM_COMPUTER_SYSTEM_DMA: return createCIM_ComputerSystemDMA();
			case CimPackage.CIM_COMPUTER_SYSTEM_IRQ: return createCIM_ComputerSystemIRQ();
			case CimPackage.CIM_COMPUTER_SYSTEM_MAPPED_IO: return createCIM_ComputerSystemMappedIO();
			case CimPackage.CIM_CA_HAS_PUBLIC_CERTIFICATE: return createCIM_CAHasPublicCertificate();
			case CimPackage.CIM_CA_SIGNS_PUBLIC_KEY_CERTIFICATE: return createCIM_CASignsPublicKeyCertificate();
			case CimPackage.CIM_ASSOCIATED_SUPPLY_CURRENT_SENSOR: return createCIM_AssociatedSupplyCurrentSensor();
			case CimPackage.CIM_AREA_OF_CONFIGURATION: return createCIM_AreaOfConfiguration();
			case CimPackage.CIM_ENDPOINT_IN_AREA: return createCIM_EndpointInArea();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ParameterValueSources createCIM_ParameterValueSources() {
		CIM_ParameterValueSourcesImpl ciM_ParameterValueSources = new CIM_ParameterValueSourcesImpl();
		return ciM_ParameterValueSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ParametersForMethod createCIM_ParametersForMethod() {
		CIM_ParametersForMethodImpl ciM_ParametersForMethod = new CIM_ParametersForMethodImpl();
		return ciM_ParametersForMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Product createCIM_Product() {
		CIM_ProductImpl ciM_Product = new CIM_ProductImpl();
		return ciM_Product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductParentChild createCIM_ProductParentChild() {
		CIM_ProductParentChildImpl ciM_ProductParentChild = new CIM_ProductParentChildImpl();
		return ciM_ProductParentChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductPhysicalElements createCIM_ProductPhysicalElements() {
		CIM_ProductPhysicalElementsImpl ciM_ProductPhysicalElements = new CIM_ProductPhysicalElementsImpl();
		return ciM_ProductPhysicalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductProductDependency createCIM_ProductProductDependency() {
		CIM_ProductProductDependencyImpl ciM_ProductProductDependency = new CIM_ProductProductDependencyImpl();
		return ciM_ProductProductDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplacementFRU createCIM_ReplacementFRU() {
		CIM_ReplacementFRUImpl ciM_ReplacementFRU = new CIM_ReplacementFRUImpl();
		return ciM_ReplacementFRU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingsDefineState createCIM_SettingsDefineState() {
		CIM_SettingsDefineStateImpl ciM_SettingsDefineState = new CIM_SettingsDefineStateImpl();
		return ciM_SettingsDefineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticalSetting createCIM_StatisticalSetting() {
		CIM_StatisticalSettingImpl ciM_StatisticalSetting = new CIM_StatisticalSettingImpl();
		return ciM_StatisticalSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Statistics createCIM_Statistics() {
		CIM_StatisticsImpl ciM_Statistics = new CIM_StatisticsImpl();
		return ciM_Statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SupportAccess createCIM_SupportAccess() {
		CIM_SupportAccessImpl ciM_SupportAccess = new CIM_SupportAccessImpl();
		return ciM_SupportAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Synchronized createCIM_Synchronized() {
		CIM_SynchronizedImpl ciM_Synchronized = new CIM_SynchronizedImpl();
		return ciM_Synchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemConfiguration createCIM_SystemConfiguration() {
		CIM_SystemConfigurationImpl ciM_SystemConfiguration = new CIM_SystemConfigurationImpl();
		return ciM_SystemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemStatisticalInformation createCIM_SystemStatisticalInformation() {
		CIM_SystemStatisticalInformationImpl ciM_SystemStatisticalInformation = new CIM_SystemStatisticalInformationImpl();
		return ciM_SystemStatisticalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CommonDatabaseSettingData createCIM_CommonDatabaseSettingData() {
		CIM_CommonDatabaseSettingDataImpl ciM_CommonDatabaseSettingData = new CIM_CommonDatabaseSettingDataImpl();
		return ciM_CommonDatabaseSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CommonDatabaseStatistics createCIM_CommonDatabaseStatistics() {
		CIM_CommonDatabaseStatisticsImpl ciM_CommonDatabaseStatistics = new CIM_CommonDatabaseStatisticsImpl();
		return ciM_CommonDatabaseStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseResourceStatistics createCIM_DatabaseResourceStatistics() {
		CIM_DatabaseResourceStatisticsImpl ciM_DatabaseResourceStatistics = new CIM_DatabaseResourceStatisticsImpl();
		return ciM_DatabaseResourceStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseServiceStatistics createCIM_DatabaseServiceStatistics() {
		CIM_DatabaseServiceStatisticsImpl ciM_DatabaseServiceStatistics = new CIM_DatabaseServiceStatisticsImpl();
		return ciM_DatabaseServiceStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BlockStatisticsManifest createCIM_BlockStatisticsManifest() {
		CIM_BlockStatisticsManifestImpl ciM_BlockStatisticsManifest = new CIM_BlockStatisticsManifestImpl();
		return ciM_BlockStatisticsManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BlockStorageStatisticalData createCIM_BlockStorageStatisticalData() {
		CIM_BlockStorageStatisticalDataImpl ciM_BlockStorageStatisticalData = new CIM_BlockStorageStatisticalDataImpl();
		return ciM_BlockStorageStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceErrorCounts createCIM_DeviceErrorCounts() {
		CIM_DeviceErrorCountsImpl ciM_DeviceErrorCounts = new CIM_DeviceErrorCountsImpl();
		return ciM_DeviceErrorCounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceErrorData createCIM_DeviceErrorData() {
		CIM_DeviceErrorDataImpl ciM_DeviceErrorData = new CIM_DeviceErrorDataImpl();
		return ciM_DeviceErrorData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCPortRateStatistics createCIM_FCPortRateStatistics() {
		CIM_FCPortRateStatisticsImpl ciM_FCPortRateStatistics = new CIM_FCPortRateStatisticsImpl();
		return ciM_FCPortRateStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCSwitchSettings createCIM_FCSwitchSettings() {
		CIM_FCSwitchSettingsImpl ciM_FCSwitchSettings = new CIM_FCSwitchSettingsImpl();
		return ciM_FCSwitchSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemGroupSynchronized createCIM_FileSystemGroupSynchronized() {
		CIM_FileSystemGroupSynchronizedImpl ciM_FileSystemGroupSynchronized = new CIM_FileSystemGroupSynchronizedImpl();
		return ciM_FileSystemGroupSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemSynchronized createCIM_FileSystemSynchronized() {
		CIM_FileSystemSynchronizedImpl ciM_FileSystemSynchronized = new CIM_FileSystemSynchronizedImpl();
		return ciM_FileSystemSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LabelReaderStatData createCIM_LabelReaderStatData() {
		CIM_LabelReaderStatDataImpl ciM_LabelReaderStatData = new CIM_LabelReaderStatDataImpl();
		return ciM_LabelReaderStatData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalPortSettings createCIM_LogicalPortSettings() {
		CIM_LogicalPortSettingsImpl ciM_LogicalPortSettings = new CIM_LogicalPortSettingsImpl();
		return ciM_LogicalPortSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalPortStatistics createCIM_LogicalPortStatistics() {
		CIM_LogicalPortStatisticsImpl ciM_LogicalPortStatistics = new CIM_LogicalPortStatisticsImpl();
		return ciM_LogicalPortStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaAccessStatData createCIM_MediaAccessStatData() {
		CIM_MediaAccessStatDataImpl ciM_MediaAccessStatData = new CIM_MediaAccessStatDataImpl();
		return ciM_MediaAccessStatData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPortSettings createCIM_NetworkPortSettings() {
		CIM_NetworkPortSettingsImpl ciM_NetworkPortSettings = new CIM_NetworkPortSettingsImpl();
		return ciM_NetworkPortSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPortStatistics createCIM_NetworkPortStatistics() {
		CIM_NetworkPortStatisticsImpl ciM_NetworkPortStatistics = new CIM_NetworkPortStatisticsImpl();
		return ciM_NetworkPortStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperationalPowerManifest createCIM_OperationalPowerManifest() {
		CIM_OperationalPowerManifestImpl ciM_OperationalPowerManifest = new CIM_OperationalPowerManifestImpl();
		return ciM_OperationalPowerManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperationalPowerStatisticalData createCIM_OperationalPowerStatisticalData() {
		CIM_OperationalPowerStatisticalDataImpl ciM_OperationalPowerStatisticalData = new CIM_OperationalPowerStatisticalDataImpl();
		return ciM_OperationalPowerStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PickerStatData createCIM_PickerStatData() {
		CIM_PickerStatDataImpl ciM_PickerStatData = new CIM_PickerStatDataImpl();
		return ciM_PickerStatData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PoweredStatisticalData createCIM_PoweredStatisticalData() {
		CIM_PoweredStatisticalDataImpl ciM_PoweredStatisticalData = new CIM_PoweredStatisticalDataImpl();
		return ciM_PoweredStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplicationSettingData createCIM_ReplicationSettingData() {
		CIM_ReplicationSettingDataImpl ciM_ReplicationSettingData = new CIM_ReplicationSettingDataImpl();
		return ciM_ReplicationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIMultipathSettings createCIM_SCSIMultipathSettings() {
		CIM_SCSIMultipathSettingsImpl ciM_SCSIMultipathSettings = new CIM_SCSIMultipathSettingsImpl();
		return ciM_SCSIMultipathSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageErasureSetting createCIM_StorageErasureSetting() {
		CIM_StorageErasureSettingImpl ciM_StorageErasureSetting = new CIM_StorageErasureSettingImpl();
		return ciM_StorageErasureSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageError createCIM_StorageError() {
		CIM_StorageErrorImpl ciM_StorageError = new CIM_StorageErrorImpl();
		return ciM_StorageError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StoragePoolView createCIM_StoragePoolView() {
		CIM_StoragePoolViewImpl ciM_StoragePoolView = new CIM_StoragePoolViewImpl();
		return ciM_StoragePoolView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageProtectionSetting createCIM_StorageProtectionSetting() {
		CIM_StorageProtectionSettingImpl ciM_StorageProtectionSetting = new CIM_StorageProtectionSettingImpl();
		return ciM_StorageProtectionSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageSetting createCIM_StorageSetting() {
		CIM_StorageSettingImpl ciM_StorageSetting = new CIM_StorageSettingImpl();
		return ciM_StorageSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageSynchronized createCIM_StorageSynchronized() {
		CIM_StorageSynchronizedImpl ciM_StorageSynchronized = new CIM_StorageSynchronizedImpl();
		return ciM_StorageSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SynchronizationAspect createCIM_SynchronizationAspect() {
		CIM_SynchronizationAspectImpl ciM_SynchronizationAspect = new CIM_SynchronizationAspectImpl();
		return ciM_SynchronizationAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TapeDriveResourceUsage createCIM_TapeDriveResourceUsage() {
		CIM_TapeDriveResourceUsageImpl ciM_TapeDriveResourceUsage = new CIM_TapeDriveResourceUsageImpl();
		return ciM_TapeDriveResourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TierSettingData createCIM_TierSettingData() {
		CIM_TierSettingDataImpl ciM_TierSettingData = new CIM_TierSettingDataImpl();
		return ciM_TierSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TokenRingPortStatistics createCIM_TokenRingPortStatistics() {
		CIM_TokenRingPortStatisticsImpl ciM_TokenRingPortStatistics = new CIM_TokenRingPortStatisticsImpl();
		return ciM_TokenRingPortStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VTLResourceUsage createCIM_VTLResourceUsage() {
		CIM_VTLResourceUsageImpl ciM_VTLResourceUsage = new CIM_VTLResourceUsageImpl();
		return ciM_VTLResourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VTLStatisticalData createCIM_VTLStatisticalData() {
		CIM_VTLStatisticalDataImpl ciM_VTLStatisticalData = new CIM_VTLStatisticalDataImpl();
		return ciM_VTLStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoHeadResolution createCIM_VideoHeadResolution() {
		CIM_VideoHeadResolutionImpl ciM_VideoHeadResolution = new CIM_VideoHeadResolutionImpl();
		return ciM_VideoHeadResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicationFilter createCIM_IndicationFilter() {
		CIM_IndicationFilterImpl ciM_IndicationFilter = new CIM_IndicationFilterImpl();
		return ciM_IndicationFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicationServiceSettingData createCIM_IndicationServiceSettingData() {
		CIM_IndicationServiceSettingDataImpl ciM_IndicationServiceSettingData = new CIM_IndicationServiceSettingDataImpl();
		return ciM_IndicationServiceSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstMethodCall createCIM_InstMethodCall() {
		CIM_InstMethodCallImpl ciM_InstMethodCall = new CIM_InstMethodCallImpl();
		return ciM_InstMethodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstModification createCIM_InstModification() {
		CIM_InstModificationImpl ciM_InstModification = new CIM_InstModificationImpl();
		return ciM_InstModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstRead createCIM_InstRead() {
		CIM_InstReadImpl ciM_InstRead = new CIM_InstReadImpl();
		return ciM_InstRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ListenerDestinationCIMXML createCIM_ListenerDestinationCIMXML() {
		CIM_ListenerDestinationCIMXMLImpl ciM_ListenerDestinationCIMXML = new CIM_ListenerDestinationCIMXMLImpl();
		return ciM_ListenerDestinationCIMXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ListenerDestinationWSManagement createCIM_ListenerDestinationWSManagement() {
		CIM_ListenerDestinationWSManagementImpl ciM_ListenerDestinationWSManagement = new CIM_ListenerDestinationWSManagementImpl();
		return ciM_ListenerDestinationWSManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SNMPTrapIndication createCIM_SNMPTrapIndication() {
		CIM_SNMPTrapIndicationImpl ciM_SNMPTrapIndication = new CIM_SNMPTrapIndicationImpl();
		return ciM_SNMPTrapIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CIMOMStatisticalData createCIM_CIMOMStatisticalData() {
		CIM_CIMOMStatisticalDataImpl ciM_CIMOMStatisticalData = new CIM_CIMOMStatisticalDataImpl();
		return ciM_CIMOMStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Error createCIM_Error() {
		CIM_ErrorImpl ciM_Error = new CIM_ErrorImpl();
		return ciM_Error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GenericOperationCapabilitiesStructure createCIM_GenericOperationCapabilitiesStructure() {
		CIM_GenericOperationCapabilitiesStructureImpl ciM_GenericOperationCapabilitiesStructure = new CIM_GenericOperationCapabilitiesStructureImpl();
		return ciM_GenericOperationCapabilitiesStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Message createCIM_Message() {
		CIM_MessageImpl ciM_Message = new CIM_MessageImpl();
		return ciM_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Namespace createCIM_Namespace() {
		CIM_NamespaceImpl ciM_Namespace = new CIM_NamespaceImpl();
		return ciM_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RegisteredSpecification createCIM_RegisteredSpecification() {
		CIM_RegisteredSpecificationImpl ciM_RegisteredSpecification = new CIM_RegisteredSpecificationImpl();
		return ciM_RegisteredSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SchemaInformationStructure createCIM_SchemaInformationStructure() {
		CIM_SchemaInformationStructureImpl ciM_SchemaInformationStructure = new CIM_SchemaInformationStructureImpl();
		return ciM_SchemaInformationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemIdentification createCIM_SystemIdentification() {
		CIM_SystemIdentificationImpl ciM_SystemIdentification = new CIM_SystemIdentificationImpl();
		return ciM_SystemIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemInNamespace createCIM_SystemInNamespace() {
		CIM_SystemInNamespaceImpl ciM_SystemInNamespace = new CIM_SystemInNamespaceImpl();
		return ciM_SystemInNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WBEMServerNamespace createCIM_WBEMServerNamespace() {
		CIM_WBEMServerNamespaceImpl ciM_WBEMServerNamespace = new CIM_WBEMServerNamespaceImpl();
		return ciM_WBEMServerNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BaseMetricDefinition createCIM_BaseMetricDefinition() {
		CIM_BaseMetricDefinitionImpl ciM_BaseMetricDefinition = new CIM_BaseMetricDefinitionImpl();
		return ciM_BaseMetricDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BaseMetricValue createCIM_BaseMetricValue() {
		CIM_BaseMetricValueImpl ciM_BaseMetricValue = new CIM_BaseMetricValueImpl();
		return ciM_BaseMetricValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MetricDefinition createCIM_MetricDefinition() {
		CIM_MetricDefinitionImpl ciM_MetricDefinition = new CIM_MetricDefinitionImpl();
		return ciM_MetricDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TraceLevelType createCIM_TraceLevelType() {
		CIM_TraceLevelTypeImpl ciM_TraceLevelType = new CIM_TraceLevelTypeImpl();
		return ciM_TraceLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnitOfWork createCIM_UnitOfWork() {
		CIM_UnitOfWorkImpl ciM_UnitOfWork = new CIM_UnitOfWorkImpl();
		return ciM_UnitOfWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPEndpointStatistics createCIM_BGPEndpointStatistics() {
		CIM_BGPEndpointStatisticsImpl ciM_BGPEndpointStatistics = new CIM_BGPEndpointStatisticsImpl();
		return ciM_BGPEndpointStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CLPSettingData createCIM_CLPSettingData() {
		CIM_CLPSettingDataImpl ciM_CLPSettingData = new CIM_CLPSettingDataImpl();
		return ciM_CLPSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConnectivityMembershipSettingData createCIM_ConnectivityMembershipSettingData() {
		CIM_ConnectivityMembershipSettingDataImpl ciM_ConnectivityMembershipSettingData = new CIM_ConnectivityMembershipSettingDataImpl();
		return ciM_ConnectivityMembershipSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EncapsulationMappingSettingData createCIM_EncapsulationMappingSettingData() {
		CIM_EncapsulationMappingSettingDataImpl ciM_EncapsulationMappingSettingData = new CIM_EncapsulationMappingSettingDataImpl();
		return ciM_EncapsulationMappingSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IEEE8021xSettings createCIM_IEEE8021xSettings() {
		CIM_IEEE8021xSettingsImpl ciM_IEEE8021xSettings = new CIM_IEEE8021xSettingsImpl();
		return ciM_IEEE8021xSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPAssignmentSettingData createCIM_IPAssignmentSettingData() {
		CIM_IPAssignmentSettingDataImpl ciM_IPAssignmentSettingData = new CIM_IPAssignmentSettingDataImpl();
		return ciM_IPAssignmentSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPEncapsulationInterface createCIM_IPEncapsulationInterface() {
		CIM_IPEncapsulationInterfaceImpl ciM_IPEncapsulationInterface = new CIM_IPEncapsulationInterfaceImpl();
		return ciM_IPEncapsulationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPInterfaceSettingData createCIM_IPInterfaceSettingData() {
		CIM_IPInterfaceSettingDataImpl ciM_IPInterfaceSettingData = new CIM_IPInterfaceSettingDataImpl();
		return ciM_IPInterfaceSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPVersionSettingData createCIM_IPVersionSettingData() {
		CIM_IPVersionSettingDataImpl ciM_IPVersionSettingData = new CIM_IPVersionSettingDataImpl();
		return ciM_IPVersionSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPolicyActionSettingData createCIM_NetworkPolicyActionSettingData() {
		CIM_NetworkPolicyActionSettingDataImpl ciM_NetworkPolicyActionSettingData = new CIM_NetworkPolicyActionSettingDataImpl();
		return ciM_NetworkPolicyActionSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPolicyRuleSettingData createCIM_NetworkPolicyRuleSettingData() {
		CIM_NetworkPolicyRuleSettingDataImpl ciM_NetworkPolicyRuleSettingData = new CIM_NetworkPolicyRuleSettingDataImpl();
		return ciM_NetworkPolicyRuleSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NextHopRoute createCIM_NextHopRoute() {
		CIM_NextHopRouteImpl ciM_NextHopRoute = new CIM_NextHopRouteImpl();
		return ciM_NextHopRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAEndpointConnectionStatistics createCIM_SAEndpointConnectionStatistics() {
		CIM_SAEndpointConnectionStatisticsImpl ciM_SAEndpointConnectionStatistics = new CIM_SAEndpointConnectionStatisticsImpl();
		return ciM_SAEndpointConnectionStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAEndpointRefreshSettings createCIM_SAEndpointRefreshSettings() {
		CIM_SAEndpointRefreshSettingsImpl ciM_SAEndpointRefreshSettings = new CIM_SAEndpointRefreshSettingsImpl();
		return ciM_SAEndpointRefreshSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SSHSettingData createCIM_SSHSettingData() {
		CIM_SSHSettingDataImpl ciM_SSHSettingData = new CIM_SSHSettingDataImpl();
		return ciM_SSHSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StaticIPAssignmentSettingData createCIM_StaticIPAssignmentSettingData() {
		CIM_StaticIPAssignmentSettingDataImpl ciM_StaticIPAssignmentSettingData = new CIM_StaticIPAssignmentSettingDataImpl();
		return ciM_StaticIPAssignmentSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TelnetSettingData createCIM_TelnetSettingData() {
		CIM_TelnetSettingDataImpl ciM_TelnetSettingData = new CIM_TelnetSettingDataImpl();
		return ciM_TelnetSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VLANEndpointSettingData createCIM_VLANEndpointSettingData() {
		CIM_VLANEndpointSettingDataImpl ciM_VLANEndpointSettingData = new CIM_VLANEndpointSettingDataImpl();
		return ciM_VLANEndpointSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WRRSchedulingElement createCIM_WRRSchedulingElement() {
		CIM_WRRSchedulingElementImpl ciM_WRRSchedulingElement = new CIM_WRRSchedulingElementImpl();
		return ciM_WRRSchedulingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiEndpointSettings createCIM_WiFiEndpointSettings() {
		CIM_WiFiEndpointSettingsImpl ciM_WiFiEndpointSettings = new CIM_WiFiEndpointSettingsImpl();
		return ciM_WiFiEndpointSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiNetworkDetectionSettings createCIM_WiFiNetworkDetectionSettings() {
		CIM_WiFiNetworkDetectionSettingsImpl ciM_WiFiNetworkDetectionSettings = new CIM_WiFiNetworkDetectionSettingsImpl();
		return ciM_WiFiNetworkDetectionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSIConnectionSettings createCIM_iSCSIConnectionSettings() {
		CIM_iSCSIConnectionSettingsImpl ciM_iSCSIConnectionSettings = new CIM_iSCSIConnectionSettingsImpl();
		return ciM_iSCSIConnectionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSILoginStatistics createCIM_iSCSILoginStatistics() {
		CIM_iSCSILoginStatisticsImpl ciM_iSCSILoginStatistics = new CIM_iSCSILoginStatisticsImpl();
		return ciM_iSCSILoginStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSISessionFailures createCIM_iSCSISessionFailures() {
		CIM_iSCSISessionFailuresImpl ciM_iSCSISessionFailures = new CIM_iSCSISessionFailuresImpl();
		return ciM_iSCSISessionFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSISessionSettings createCIM_iSCSISessionSettings() {
		CIM_iSCSISessionSettingsImpl ciM_iSCSISessionSettings = new CIM_iSCSISessionSettingsImpl();
		return ciM_iSCSISessionSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSISessionStatistics createCIM_iSCSISessionStatistics() {
		CIM_iSCSISessionStatisticsImpl ciM_iSCSISessionStatistics = new CIM_iSCSISessionStatisticsImpl();
		return ciM_iSCSISessionStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaPhysicalStatData createCIM_MediaPhysicalStatData() {
		CIM_MediaPhysicalStatDataImpl ciM_MediaPhysicalStatData = new CIM_MediaPhysicalStatDataImpl();
		return ciM_MediaPhysicalStatData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalComponent createCIM_PhysicalComponent() {
		CIM_PhysicalComponentImpl ciM_PhysicalComponent = new CIM_PhysicalComponentImpl();
		return ciM_PhysicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalConnector createCIM_PhysicalConnector() {
		CIM_PhysicalConnectorImpl ciM_PhysicalConnector = new CIM_PhysicalConnectorImpl();
		return ciM_PhysicalConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalLink createCIM_PhysicalLink() {
		CIM_PhysicalLinkImpl ciM_PhysicalLink = new CIM_PhysicalLinkImpl();
		return ciM_PhysicalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalMedia createCIM_PhysicalMedia() {
		CIM_PhysicalMediaImpl ciM_PhysicalMedia = new CIM_PhysicalMediaImpl();
		return ciM_PhysicalMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalPackage createCIM_PhysicalPackage() {
		CIM_PhysicalPackageImpl ciM_PhysicalPackage = new CIM_PhysicalPackageImpl();
		return ciM_PhysicalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalTape createCIM_PhysicalTape() {
		CIM_PhysicalTapeImpl ciM_PhysicalTape = new CIM_PhysicalTapeImpl();
		return ciM_PhysicalTape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Slot createCIM_Slot() {
		CIM_SlotImpl ciM_Slot = new CIM_SlotImpl();
		return ciM_Slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicySetAppliesToElement createCIM_PolicySetAppliesToElement() {
		CIM_PolicySetAppliesToElementImpl ciM_PolicySetAppliesToElement = new CIM_PolicySetAppliesToElementImpl();
		return ciM_PolicySetAppliesToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyTimePeriodCondition createCIM_PolicyTimePeriodCondition() {
		CIM_PolicyTimePeriodConditionImpl ciM_PolicyTimePeriodCondition = new CIM_PolicyTimePeriodConditionImpl();
		return ciM_PolicyTimePeriodCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueryCondition createCIM_QueryCondition() {
		CIM_QueryConditionImpl ciM_QueryCondition = new CIM_QueryConditionImpl();
		return ciM_QueryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RejectConnectionAction createCIM_RejectConnectionAction() {
		CIM_RejectConnectionActionImpl ciM_RejectConnectionAction = new CIM_RejectConnectionActionImpl();
		return ciM_RejectConnectionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VendorPolicyAction createCIM_VendorPolicyAction() {
		CIM_VendorPolicyActionImpl ciM_VendorPolicyAction = new CIM_VendorPolicyActionImpl();
		return ciM_VendorPolicyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VendorPolicyCondition createCIM_VendorPolicyCondition() {
		CIM_VendorPolicyConditionImpl ciM_VendorPolicyCondition = new CIM_VendorPolicyConditionImpl();
		return ciM_VendorPolicyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSAttribute createCIM_BIOSAttribute() {
		CIM_BIOSAttributeImpl ciM_BIOSAttribute = new CIM_BIOSAttributeImpl();
		return ciM_BIOSAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSEnumeration createCIM_BIOSEnumeration() {
		CIM_BIOSEnumerationImpl ciM_BIOSEnumeration = new CIM_BIOSEnumerationImpl();
		return ciM_BIOSEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSInteger createCIM_BIOSInteger() {
		CIM_BIOSIntegerImpl ciM_BIOSInteger = new CIM_BIOSIntegerImpl();
		return ciM_BIOSInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSPassword createCIM_BIOSPassword() {
		CIM_BIOSPasswordImpl ciM_BIOSPassword = new CIM_BIOSPasswordImpl();
		return ciM_BIOSPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSString createCIM_BIOSString() {
		CIM_BIOSStringImpl ciM_BIOSString = new CIM_BIOSStringImpl();
		return ciM_BIOSString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BootSourceSetting createCIM_BootSourceSetting() {
		CIM_BootSourceSettingImpl ciM_BootSourceSetting = new CIM_BootSourceSettingImpl();
		return ciM_BootSourceSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CIFSSettingData createCIM_CIFSSettingData() {
		CIM_CIFSSettingDataImpl ciM_CIFSSettingData = new CIM_CIFSSettingDataImpl();
		return ciM_CIFSSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticResult createCIM_DiagnosticResult() {
		CIM_DiagnosticResultImpl ciM_DiagnosticResult = new CIM_DiagnosticResultImpl();
		return ciM_DiagnosticResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticResultForMSE createCIM_DiagnosticResultForMSE() {
		CIM_DiagnosticResultForMSEImpl ciM_DiagnosticResultForMSE = new CIM_DiagnosticResultForMSEImpl();
		return ciM_DiagnosticResultForMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticResultInPackage createCIM_DiagnosticResultInPackage() {
		CIM_DiagnosticResultInPackageImpl ciM_DiagnosticResultInPackage = new CIM_DiagnosticResultInPackageImpl();
		return ciM_DiagnosticResultInPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticSettingData createCIM_DiagnosticSettingData() {
		CIM_DiagnosticSettingDataImpl ciM_DiagnosticSettingData = new CIM_DiagnosticSettingDataImpl();
		return ciM_DiagnosticSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskDriveDiagnosticSettingData createCIM_DiskDriveDiagnosticSettingData() {
		CIM_DiskDriveDiagnosticSettingDataImpl ciM_DiskDriveDiagnosticSettingData = new CIM_DiskDriveDiagnosticSettingDataImpl();
		return ciM_DiskDriveDiagnosticSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExportedFileShareSetting createCIM_ExportedFileShareSetting() {
		CIM_ExportedFileShareSettingImpl ciM_ExportedFileShareSetting = new CIM_ExportedFileShareSettingImpl();
		return ciM_ExportedFileShareSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCHBADiagnosticSettingData createCIM_FCHBADiagnosticSettingData() {
		CIM_FCHBADiagnosticSettingDataImpl ciM_FCHBADiagnosticSettingData = new CIM_FCHBADiagnosticSettingDataImpl();
		return ciM_FCHBADiagnosticSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSIPInterfaceSettingData createCIM_FSIPInterfaceSettingData() {
		CIM_FSIPInterfaceSettingDataImpl ciM_FSIPInterfaceSettingData = new CIM_FSIPInterfaceSettingDataImpl();
		return ciM_FSIPInterfaceSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaConfigEntry createCIM_FSQuotaConfigEntry() {
		CIM_FSQuotaConfigEntryImpl ciM_FSQuotaConfigEntry = new CIM_FSQuotaConfigEntryImpl();
		return ciM_FSQuotaConfigEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaIndication createCIM_FSQuotaIndication() {
		CIM_FSQuotaIndicationImpl ciM_FSQuotaIndication = new CIM_FSQuotaIndicationImpl();
		return ciM_FSQuotaIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileServerSettings createCIM_FileServerSettings() {
		CIM_FileServerSettingsImpl ciM_FileServerSettings = new CIM_FileServerSettingsImpl();
		return ciM_FileServerSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemSetting createCIM_FileSystemSetting() {
		CIM_FileSystemSettingImpl ciM_FileSystemSetting = new CIM_FileSystemSettingImpl();
		return ciM_FileSystemSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemStatisticalData createCIM_FileSystemStatisticalData() {
		CIM_FileSystemStatisticalDataImpl ciM_FileSystemStatisticalData = new CIM_FileSystemStatisticalDataImpl();
		return ciM_FileSystemStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemStatisticsManifest createCIM_FileSystemStatisticsManifest() {
		CIM_FileSystemStatisticsManifestImpl ciM_FileSystemStatisticsManifest = new CIM_FileSystemStatisticsManifestImpl();
		return ciM_FileSystemStatisticsManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_JobSettingData createCIM_JobSettingData() {
		CIM_JobSettingDataImpl ciM_JobSettingData = new CIM_JobSettingDataImpl();
		return ciM_JobSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MethodResult createCIM_MethodResult() {
		CIM_MethodResultImpl ciM_MethodResult = new CIM_MethodResultImpl();
		return ciM_MethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NFSSettingData createCIM_NFSSettingData() {
		CIM_NFSSettingDataImpl ciM_NFSSettingData = new CIM_NFSSettingDataImpl();
		return ciM_NFSSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NISSettingData createCIM_NISSettingData() {
		CIM_NISSettingDataImpl ciM_NISSettingData = new CIM_NISSettingDataImpl();
		return ciM_NISSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SummaryDiagnostics createCIM_SummaryDiagnostics() {
		CIM_SummaryDiagnosticsImpl ciM_SummaryDiagnostics = new CIM_SummaryDiagnosticsImpl();
		return ciM_SummaryDiagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixProcessStatisticalInformation createCIM_UnixProcessStatisticalInformation() {
		CIM_UnixProcessStatisticalInformationImpl ciM_UnixProcessStatisticalInformation = new CIM_UnixProcessStatisticalInformationImpl();
		return ciM_UnixProcessStatisticalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemMigrationSettingData createCIM_VirtualSystemMigrationSettingData() {
		CIM_VirtualSystemMigrationSettingDataImpl ciM_VirtualSystemMigrationSettingData = new CIM_VirtualSystemMigrationSettingDataImpl();
		return ciM_VirtualSystemMigrationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemSettingData createCIM_VirtualSystemSettingData() {
		CIM_VirtualSystemSettingDataImpl ciM_VirtualSystemSettingData = new CIM_VirtualSystemSettingDataImpl();
		return ciM_VirtualSystemSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccountSettingData createCIM_AccountSettingData() {
		CIM_AccountSettingDataImpl ciM_AccountSettingData = new CIM_AccountSettingDataImpl();
		return ciM_AccountSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedPrivilege createCIM_AssociatedPrivilege() {
		CIM_AssociatedPrivilegeImpl ciM_AssociatedPrivilege = new CIM_AssociatedPrivilegeImpl();
		return ciM_AssociatedPrivilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CredentialContext createCIM_CredentialContext() {
		CIM_CredentialContextImpl ciM_CredentialContext = new CIM_CredentialContextImpl();
		return ciM_CredentialContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Identity createCIM_Identity() {
		CIM_IdentityImpl ciM_Identity = new CIM_IdentityImpl();
		return ciM_Identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IdentityContext createCIM_IdentityContext() {
		CIM_IdentityContextImpl ciM_IdentityContext = new CIM_IdentityContextImpl();
		return ciM_IdentityContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_KerberosCredential createCIM_KerberosCredential() {
		CIM_KerberosCredentialImpl ciM_KerberosCredential = new CIM_KerberosCredentialImpl();
		return ciM_KerberosCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_KerberosTicket createCIM_KerberosTicket() {
		CIM_KerberosTicketImpl ciM_KerberosTicket = new CIM_KerberosTicketImpl();
		return ciM_KerberosTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NamedCredential createCIM_NamedCredential() {
		CIM_NamedCredentialImpl ciM_NamedCredential = new CIM_NamedCredentialImpl();
		return ciM_NamedCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NamedSharedIKESecret createCIM_NamedSharedIKESecret() {
		CIM_NamedSharedIKESecretImpl ciM_NamedSharedIKESecret = new CIM_NamedSharedIKESecretImpl();
		return ciM_NamedSharedIKESecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OpaqueManagementDataOwner createCIM_OpaqueManagementDataOwner() {
		CIM_OpaqueManagementDataOwnerImpl ciM_OpaqueManagementDataOwner = new CIM_OpaqueManagementDataOwnerImpl();
		return ciM_OpaqueManagementDataOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OtherGroupInformation createCIM_OtherGroupInformation() {
		CIM_OtherGroupInformationImpl ciM_OtherGroupInformation = new CIM_OtherGroupInformationImpl();
		return ciM_OtherGroupInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OtherOrgUnitInformation createCIM_OtherOrgUnitInformation() {
		CIM_OtherOrgUnitInformationImpl ciM_OtherOrgUnitInformation = new CIM_OtherOrgUnitInformationImpl();
		return ciM_OtherOrgUnitInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OtherOrganizationInformation createCIM_OtherOrganizationInformation() {
		CIM_OtherOrganizationInformationImpl ciM_OtherOrganizationInformation = new CIM_OtherOrganizationInformationImpl();
		return ciM_OtherOrganizationInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OtherPersonInformation createCIM_OtherPersonInformation() {
		CIM_OtherPersonInformationImpl ciM_OtherPersonInformation = new CIM_OtherPersonInformationImpl();
		return ciM_OtherPersonInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OtherRoleInformation createCIM_OtherRoleInformation() {
		CIM_OtherRoleInformationImpl ciM_OtherRoleInformation = new CIM_OtherRoleInformationImpl();
		return ciM_OtherRoleInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Privilege createCIM_Privilege() {
		CIM_PrivilegeImpl ciM_Privilege = new CIM_PrivilegeImpl();
		return ciM_Privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SecuritySensitivity createCIM_SecuritySensitivity() {
		CIM_SecuritySensitivityImpl ciM_SecuritySensitivity = new CIM_SecuritySensitivityImpl();
		return ciM_SecuritySensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharedCredential createCIM_SharedCredential() {
		CIM_SharedCredentialImpl ciM_SharedCredential = new CIM_SharedCredentialImpl();
		return ciM_SharedCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharedSecret createCIM_SharedSecret() {
		CIM_SharedSecretImpl ciM_SharedSecret = new CIM_SharedSecretImpl();
		return ciM_SharedSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SignedCredential createCIM_SignedCredential() {
		CIM_SignedCredentialImpl ciM_SignedCredential = new CIM_SignedCredentialImpl();
		return ciM_SignedCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageClientSettingData createCIM_StorageClientSettingData() {
		CIM_StorageClientSettingDataImpl ciM_StorageClientSettingData = new CIM_StorageClientSettingDataImpl();
		return ciM_StorageClientSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageHardwareID createCIM_StorageHardwareID() {
		CIM_StorageHardwareIDImpl ciM_StorageHardwareID = new CIM_StorageHardwareIDImpl();
		return ciM_StorageHardwareID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnsignedCredential createCIM_UnsignedCredential() {
		CIM_UnsignedCredentialImpl ciM_UnsignedCredential = new CIM_UnsignedCredentialImpl();
		return ciM_UnsignedCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnsignedPublicKey createCIM_UnsignedPublicKey() {
		CIM_UnsignedPublicKeyImpl ciM_UnsignedPublicKey = new CIM_UnsignedPublicKeyImpl();
		return ciM_UnsignedPublicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UsersAccess createCIM_UsersAccess() {
		CIM_UsersAccessImpl ciM_UsersAccess = new CIM_UsersAccessImpl();
		return ciM_UsersAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_X509Infrastructure createCIM_X509Infrastructure() {
		CIM_X509InfrastructureImpl ciM_X509Infrastructure = new CIM_X509InfrastructureImpl();
		return ciM_X509Infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeNotification createCIM_J2eeNotification() {
		CIM_J2eeNotificationImpl ciM_J2eeNotification = new CIM_J2eeNotificationImpl();
		return ciM_J2eeNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticalRuntimeOverview createCIM_StatisticalRuntimeOverview() {
		CIM_StatisticalRuntimeOverviewImpl ciM_StatisticalRuntimeOverview = new CIM_StatisticalRuntimeOverviewImpl();
		return ciM_StatisticalRuntimeOverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CompatibleProduct createCIM_CompatibleProduct() {
		CIM_CompatibleProductImpl ciM_CompatibleProduct = new CIM_CompatibleProductImpl();
		return ciM_CompatibleProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConcreteCollection createCIM_ConcreteCollection() {
		CIM_ConcreteCollectionImpl ciM_ConcreteCollection = new CIM_ConcreteCollectionImpl();
		return ciM_ConcreteCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConcreteComponent createCIM_ConcreteComponent() {
		CIM_ConcreteComponentImpl ciM_ConcreteComponent = new CIM_ConcreteComponentImpl();
		return ciM_ConcreteComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConcreteComponentView createCIM_ConcreteComponentView() {
		CIM_ConcreteComponentViewImpl ciM_ConcreteComponentView = new CIM_ConcreteComponentViewImpl();
		return ciM_ConcreteComponentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Configuration createCIM_Configuration() {
		CIM_ConfigurationImpl ciM_Configuration = new CIM_ConfigurationImpl();
		return ciM_Configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConfigurationComponent createCIM_ConfigurationComponent() {
		CIM_ConfigurationComponentImpl ciM_ConfigurationComponent = new CIM_ConfigurationComponentImpl();
		return ciM_ConfigurationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConfigurationData createCIM_ConfigurationData() {
		CIM_ConfigurationDataImpl ciM_ConfigurationData = new CIM_ConfigurationDataImpl();
		return ciM_ConfigurationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DependencyContext createCIM_DependencyContext() {
		CIM_DependencyContextImpl ciM_DependencyContext = new CIM_DependencyContextImpl();
		return ciM_DependencyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceStatisticalInformation createCIM_DeviceStatisticalInformation() {
		CIM_DeviceStatisticalInformationImpl ciM_DeviceStatisticalInformation = new CIM_DeviceStatisticalInformationImpl();
		return ciM_DeviceStatisticalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementCapabilities createCIM_ElementCapabilities() {
		CIM_ElementCapabilitiesImpl ciM_ElementCapabilities = new CIM_ElementCapabilitiesImpl();
		return ciM_ElementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementConfiguration createCIM_ElementConfiguration() {
		CIM_ElementConfigurationImpl ciM_ElementConfiguration = new CIM_ElementConfigurationImpl();
		return ciM_ElementConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementSettingData createCIM_ElementSettingData() {
		CIM_ElementSettingDataImpl ciM_ElementSettingData = new CIM_ElementSettingDataImpl();
		return ciM_ElementSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementStatisticalData createCIM_ElementStatisticalData() {
		CIM_ElementStatisticalDataImpl ciM_ElementStatisticalData = new CIM_ElementStatisticalDataImpl();
		return ciM_ElementStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementView createCIM_ElementView() {
		CIM_ElementViewImpl ciM_ElementView = new CIM_ElementViewImpl();
		return ciM_ElementView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EnabledLogicalElementCapabilities createCIM_EnabledLogicalElementCapabilities() {
		CIM_EnabledLogicalElementCapabilitiesImpl ciM_EnabledLogicalElementCapabilities = new CIM_EnabledLogicalElementCapabilitiesImpl();
		return ciM_EnabledLogicalElementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FRU createCIM_FRU() {
		CIM_FRUImpl ciM_FRU = new CIM_FRUImpl();
		return ciM_FRU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FRUIncludesProduct createCIM_FRUIncludesProduct() {
		CIM_FRUIncludesProductImpl ciM_FRUIncludesProduct = new CIM_FRUIncludesProductImpl();
		return ciM_FRUIncludesProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FRUPhysicalElements createCIM_FRUPhysicalElements() {
		CIM_FRUPhysicalElementsImpl ciM_FRUPhysicalElements = new CIM_FRUPhysicalElementsImpl();
		return ciM_FRUPhysicalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GroupSynchronized createCIM_GroupSynchronized() {
		CIM_GroupSynchronizedImpl ciM_GroupSynchronized = new CIM_GroupSynchronizedImpl();
		return ciM_GroupSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedDependency createCIM_HostedDependency() {
		CIM_HostedDependencyImpl ciM_HostedDependency = new CIM_HostedDependencyImpl();
		return ciM_HostedDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ImplementationCapabilities createCIM_ImplementationCapabilities() {
		CIM_ImplementationCapabilitiesImpl ciM_ImplementationCapabilities = new CIM_ImplementationCapabilitiesImpl();
		return ciM_ImplementationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_JobCapabilities createCIM_JobCapabilities() {
		CIM_JobCapabilitiesImpl ciM_JobCapabilities = new CIM_JobCapabilitiesImpl();
		return ciM_JobCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LaunchInContextCapabilities createCIM_LaunchInContextCapabilities() {
		CIM_LaunchInContextCapabilitiesImpl ciM_LaunchInContextCapabilities = new CIM_LaunchInContextCapabilitiesImpl();
		return ciM_LaunchInContextCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocalizationCapabilities createCIM_LocalizationCapabilities() {
		CIM_LocalizationCapabilitiesImpl ciM_LocalizationCapabilities = new CIM_LocalizationCapabilitiesImpl();
		return ciM_LocalizationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Location createCIM_Location() {
		CIM_LocationImpl ciM_Location = new CIM_LocationImpl();
		return ciM_Location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemberOfCollection createCIM_MemberOfCollection() {
		CIM_MemberOfCollectionImpl ciM_MemberOfCollection = new CIM_MemberOfCollectionImpl();
		return ciM_MemberOfCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OpaqueManagementDataCapabilities createCIM_OpaqueManagementDataCapabilities() {
		CIM_OpaqueManagementDataCapabilitiesImpl ciM_OpaqueManagementDataCapabilities = new CIM_OpaqueManagementDataCapabilitiesImpl();
		return ciM_OpaqueManagementDataCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OrderedComponent createCIM_OrderedComponent() {
		CIM_OrderedComponentImpl ciM_OrderedComponent = new CIM_OrderedComponentImpl();
		return ciM_OrderedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OrderedDependency createCIM_OrderedDependency() {
		CIM_OrderedDependencyImpl ciM_OrderedDependency = new CIM_OrderedDependencyImpl();
		return ciM_OrderedDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OrderedMemberOfCollection createCIM_OrderedMemberOfCollection() {
		CIM_OrderedMemberOfCollectionImpl ciM_OrderedMemberOfCollection = new CIM_OrderedMemberOfCollectionImpl();
		return ciM_OrderedMemberOfCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OwningCollectionElement createCIM_OwningCollectionElement() {
		CIM_OwningCollectionElementImpl ciM_OwningCollectionElement = new CIM_OwningCollectionElementImpl();
		return ciM_OwningCollectionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalStatisticalInformation createCIM_PhysicalStatisticalInformation() {
		CIM_PhysicalStatisticalInformationImpl ciM_PhysicalStatisticalInformation = new CIM_PhysicalStatisticalInformationImpl();
		return ciM_PhysicalStatisticalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalStatistics createCIM_PhysicalStatistics() {
		CIM_PhysicalStatisticsImpl ciM_PhysicalStatistics = new CIM_PhysicalStatisticsImpl();
		return ciM_PhysicalStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PowerManagementCapabilities createCIM_PowerManagementCapabilities() {
		CIM_PowerManagementCapabilitiesImpl ciM_PowerManagementCapabilities = new CIM_PowerManagementCapabilitiesImpl();
		return ciM_PowerManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductComponent createCIM_ProductComponent() {
		CIM_ProductComponentImpl ciM_ProductComponent = new CIM_ProductComponentImpl();
		return ciM_ProductComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductElementComponent createCIM_ProductElementComponent() {
		CIM_ProductElementComponentImpl ciM_ProductElementComponent = new CIM_ProductElementComponentImpl();
		return ciM_ProductElementComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductFRU createCIM_ProductFRU() {
		CIM_ProductFRUImpl ciM_ProductFRU = new CIM_ProductFRUImpl();
		return ciM_ProductFRU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductPhysicalComponent createCIM_ProductPhysicalComponent() {
		CIM_ProductPhysicalComponentImpl ciM_ProductPhysicalComponent = new CIM_ProductPhysicalComponentImpl();
		return ciM_ProductPhysicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductSupport createCIM_ProductSupport() {
		CIM_ProductSupportImpl ciM_ProductSupport = new CIM_ProductSupportImpl();
		return ciM_ProductSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Profile createCIM_Profile() {
		CIM_ProfileImpl ciM_Profile = new CIM_ProfileImpl();
		return ciM_Profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RedundancyGroup createCIM_RedundancyGroup() {
		CIM_RedundancyGroupImpl ciM_RedundancyGroup = new CIM_RedundancyGroupImpl();
		return ciM_RedundancyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RelatedElementCausingError createCIM_RelatedElementCausingError() {
		CIM_RelatedElementCausingErrorImpl ciM_RelatedElementCausingError = new CIM_RelatedElementCausingErrorImpl();
		return ciM_RelatedElementCausingError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RelatedStatisticalData createCIM_RelatedStatisticalData() {
		CIM_RelatedStatisticalDataImpl ciM_RelatedStatisticalData = new CIM_RelatedStatisticalDataImpl();
		return ciM_RelatedStatisticalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RelatedStatistics createCIM_RelatedStatistics() {
		CIM_RelatedStatisticsImpl ciM_RelatedStatistics = new CIM_RelatedStatisticsImpl();
		return ciM_RelatedStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplaceableProductFRU createCIM_ReplaceableProductFRU() {
		CIM_ReplaceableProductFRUImpl ciM_ReplaceableProductFRU = new CIM_ReplaceableProductFRUImpl();
		return ciM_ReplaceableProductFRU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ResourceAllocationSettingData createCIM_ResourceAllocationSettingData() {
		CIM_ResourceAllocationSettingDataImpl ciM_ResourceAllocationSettingData = new CIM_ResourceAllocationSettingDataImpl();
		return ciM_ResourceAllocationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ResourcePool createCIM_ResourcePool() {
		CIM_ResourcePoolImpl ciM_ResourcePool = new CIM_ResourcePoolImpl();
		return ciM_ResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ResourcePoolConfigurationCapabilities createCIM_ResourcePoolConfigurationCapabilities() {
		CIM_ResourcePoolConfigurationCapabilitiesImpl ciM_ResourcePoolConfigurationCapabilities = new CIM_ResourcePoolConfigurationCapabilitiesImpl();
		return ciM_ResourcePoolConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAPStatisticalInformation createCIM_SAPStatisticalInformation() {
		CIM_SAPStatisticalInformationImpl ciM_SAPStatisticalInformation = new CIM_SAPStatisticalInformationImpl();
		return ciM_SAPStatisticalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceStatisticalInformation createCIM_ServiceStatisticalInformation() {
		CIM_ServiceStatisticalInformationImpl ciM_ServiceStatisticalInformation = new CIM_ServiceStatisticalInformationImpl();
		return ciM_ServiceStatisticalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingContext createCIM_SettingContext() {
		CIM_SettingContextImpl ciM_SettingContext = new CIM_SettingContextImpl();
		return ciM_SettingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingsDefineCapabilities createCIM_SettingsDefineCapabilities() {
		CIM_SettingsDefineCapabilitiesImpl ciM_SettingsDefineCapabilities = new CIM_SettingsDefineCapabilitiesImpl();
		return ciM_SettingsDefineCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareIdentity createCIM_SoftwareIdentity() {
		CIM_SoftwareIdentityImpl ciM_SoftwareIdentity = new CIM_SoftwareIdentityImpl();
		return ciM_SoftwareIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareInstallationServiceCapabilities createCIM_SoftwareInstallationServiceCapabilities() {
		CIM_SoftwareInstallationServiceCapabilitiesImpl ciM_SoftwareInstallationServiceCapabilities = new CIM_SoftwareInstallationServiceCapabilitiesImpl();
		return ciM_SoftwareInstallationServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SpareGroup createCIM_SpareGroup() {
		CIM_SpareGroupImpl ciM_SpareGroup = new CIM_SpareGroupImpl();
		return ciM_SpareGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Spared createCIM_Spared() {
		CIM_SparedImpl ciM_Spared = new CIM_SparedImpl();
		return ciM_Spared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageAllocationSettingData createCIM_StorageAllocationSettingData() {
		CIM_StorageAllocationSettingDataImpl ciM_StorageAllocationSettingData = new CIM_StorageAllocationSettingDataImpl();
		return ciM_StorageAllocationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageRedundancyGroup createCIM_StorageRedundancyGroup() {
		CIM_StorageRedundancyGroupImpl ciM_StorageRedundancyGroup = new CIM_StorageRedundancyGroupImpl();
		return ciM_StorageRedundancyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemSettingContext createCIM_SystemSettingContext() {
		CIM_SystemSettingContextImpl ciM_SystemSettingContext = new CIM_SystemSettingContextImpl();
		return ciM_SystemSettingContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemSpecificCollection createCIM_SystemSpecificCollection() {
		CIM_SystemSpecificCollectionImpl ciM_SystemSpecificCollection = new CIM_SystemSpecificCollectionImpl();
		return ciM_SystemSpecificCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualEthernetSwitchSettingData createCIM_VirtualEthernetSwitchSettingData() {
		CIM_VirtualEthernetSwitchSettingDataImpl ciM_VirtualEthernetSwitchSettingData = new CIM_VirtualEthernetSwitchSettingDataImpl();
		return ciM_VirtualEthernetSwitchSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemManagementCapabilities createCIM_VirtualSystemManagementCapabilities() {
		CIM_VirtualSystemManagementCapabilitiesImpl ciM_VirtualSystemManagementCapabilities = new CIM_VirtualSystemManagementCapabilitiesImpl();
		return ciM_VirtualSystemManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemSnapshotCapabilities createCIM_VirtualSystemSnapshotCapabilities() {
		CIM_VirtualSystemSnapshotCapabilitiesImpl ciM_VirtualSystemSnapshotCapabilities = new CIM_VirtualSystemSnapshotCapabilitiesImpl();
		return ciM_VirtualSystemSnapshotCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemSnapshotServiceCapabilities createCIM_VirtualSystemSnapshotServiceCapabilities() {
		CIM_VirtualSystemSnapshotServiceCapabilitiesImpl ciM_VirtualSystemSnapshotServiceCapabilities = new CIM_VirtualSystemSnapshotServiceCapabilitiesImpl();
		return ciM_VirtualSystemSnapshotServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CommonDatabaseCapabilities createCIM_CommonDatabaseCapabilities() {
		CIM_CommonDatabaseCapabilitiesImpl ciM_CommonDatabaseCapabilities = new CIM_CommonDatabaseCapabilitiesImpl();
		return ciM_CommonDatabaseCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseSegmentSettingData createCIM_DatabaseSegmentSettingData() {
		CIM_DatabaseSegmentSettingDataImpl ciM_DatabaseSegmentSettingData = new CIM_DatabaseSegmentSettingDataImpl();
		return ciM_DatabaseSegmentSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RelationalDatabaseCapabilities createCIM_RelationalDatabaseCapabilities() {
		CIM_RelationalDatabaseCapabilitiesImpl ciM_RelationalDatabaseCapabilities = new CIM_RelationalDatabaseCapabilitiesImpl();
		return ciM_RelationalDatabaseCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SNMPDatabaseParameter createCIM_SNMPDatabaseParameter() {
		CIM_SNMPDatabaseParameterImpl ciM_SNMPDatabaseParameter = new CIM_SNMPDatabaseParameterImpl();
		return ciM_SNMPDatabaseParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AdvancedStorageSetting createCIM_AdvancedStorageSetting() {
		CIM_AdvancedStorageSettingImpl ciM_AdvancedStorageSetting = new CIM_AdvancedStorageSettingImpl();
		return ciM_AdvancedStorageSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AlarmDeviceCapabilities createCIM_AlarmDeviceCapabilities() {
		CIM_AlarmDeviceCapabilitiesImpl ciM_AlarmDeviceCapabilities = new CIM_AlarmDeviceCapabilitiesImpl();
		return ciM_AlarmDeviceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocatedResources createCIM_AllocatedResources() {
		CIM_AllocatedResourcesImpl ciM_AllocatedResources = new CIM_AllocatedResourcesImpl();
		return ciM_AllocatedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BlockStatisticsManifestCollection createCIM_BlockStatisticsManifestCollection() {
		CIM_BlockStatisticsManifestCollectionImpl ciM_BlockStatisticsManifestCollection = new CIM_BlockStatisticsManifestCollectionImpl();
		return ciM_BlockStatisticsManifestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceSharingCapabilities createCIM_DeviceSharingCapabilities() {
		CIM_DeviceSharingCapabilitiesImpl ciM_DeviceSharingCapabilities = new CIM_DeviceSharingCapabilitiesImpl();
		return ciM_DeviceSharingCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskDriveView createCIM_DiskDriveView() {
		CIM_DiskDriveViewImpl ciM_DiskDriveView = new CIM_DiskDriveViewImpl();
		return ciM_DiskDriveView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskGroup createCIM_DiskGroup() {
		CIM_DiskGroupImpl ciM_DiskGroup = new CIM_DiskGroupImpl();
		return ciM_DiskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskPartitionConfigurationCapabilities createCIM_DiskPartitionConfigurationCapabilities() {
		CIM_DiskPartitionConfigurationCapabilitiesImpl ciM_DiskPartitionConfigurationCapabilities = new CIM_DiskPartitionConfigurationCapabilitiesImpl();
		return ciM_DiskPartitionConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DriveComponentViewView createCIM_DriveComponentViewView() {
		CIM_DriveComponentViewViewImpl ciM_DriveComponentViewView = new CIM_DriveComponentViewViewImpl();
		return ciM_DriveComponentViewView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementStatisticalDataView createCIM_ElementStatisticalDataView() {
		CIM_ElementStatisticalDataViewImpl ciM_ElementStatisticalDataView = new CIM_ElementStatisticalDataViewImpl();
		return ciM_ElementStatisticalDataView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementStorageProtectionSettingData createCIM_ElementStorageProtectionSettingData() {
		CIM_ElementStorageProtectionSettingDataImpl ciM_ElementStorageProtectionSettingData = new CIM_ElementStorageProtectionSettingDataImpl();
		return ciM_ElementStorageProtectionSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EthernetPortStatistics createCIM_EthernetPortStatistics() {
		CIM_EthernetPortStatisticsImpl ciM_EthernetPortStatistics = new CIM_EthernetPortStatisticsImpl();
		return ciM_EthernetPortStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCAdapterEventCounters createCIM_FCAdapterEventCounters() {
		CIM_FCAdapterEventCountersImpl ciM_FCAdapterEventCounters = new CIM_FCAdapterEventCountersImpl();
		return ciM_FCAdapterEventCounters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCPortSettings createCIM_FCPortSettings() {
		CIM_FCPortSettingsImpl ciM_FCPortSettings = new CIM_FCPortSettingsImpl();
		return ciM_FCPortSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCPortStatistics createCIM_FCPortStatistics() {
		CIM_FCPortStatisticsImpl ciM_FCPortStatistics = new CIM_FCPortStatisticsImpl();
		return ciM_FCPortStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCSwitchCapabilities createCIM_FCSwitchCapabilities() {
		CIM_FCSwitchCapabilitiesImpl ciM_FCSwitchCapabilities = new CIM_FCSwitchCapabilitiesImpl();
		return ciM_FCSwitchCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FailoverStorageExtentsCollection createCIM_FailoverStorageExtentsCollection() {
		CIM_FailoverStorageExtentsCollectionImpl ciM_FailoverStorageExtentsCollection = new CIM_FailoverStorageExtentsCollectionImpl();
		return ciM_FailoverStorageExtentsCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibrePortEventCounters createCIM_FibrePortEventCounters() {
		CIM_FibrePortEventCountersImpl ciM_FibrePortEventCounters = new CIM_FibrePortEventCountersImpl();
		return ciM_FibrePortEventCounters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemReplicationCapabilities createCIM_FileSystemReplicationCapabilities() {
		CIM_FileSystemReplicationCapabilitiesImpl ciM_FileSystemReplicationCapabilities = new CIM_FileSystemReplicationCapabilitiesImpl();
		return ciM_FileSystemReplicationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicatorLEDCapabilities createCIM_IndicatorLEDCapabilities() {
		CIM_IndicatorLEDCapabilitiesImpl ciM_IndicatorLEDCapabilities = new CIM_IndicatorLEDCapabilitiesImpl();
		return ciM_IndicatorLEDCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LLDPEthernetPortStatistics createCIM_LLDPEthernetPortStatistics() {
		CIM_LLDPEthernetPortStatisticsImpl ciM_LLDPEthernetPortStatistics = new CIM_LLDPEthernetPortStatisticsImpl();
		return ciM_LLDPEthernetPortStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LabelReaderStatInfo createCIM_LabelReaderStatInfo() {
		CIM_LabelReaderStatInfoImpl ciM_LabelReaderStatInfo = new CIM_LabelReaderStatInfoImpl();
		return ciM_LabelReaderStatInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalPortCapabilities createCIM_LogicalPortCapabilities() {
		CIM_LogicalPortCapabilitiesImpl ciM_LogicalPortCapabilities = new CIM_LogicalPortCapabilitiesImpl();
		return ciM_LogicalPortCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalPortGroup createCIM_LogicalPortGroup() {
		CIM_LogicalPortGroupImpl ciM_LogicalPortGroup = new CIM_LogicalPortGroupImpl();
		return ciM_LogicalPortGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MappingProtocolControllerView createCIM_MappingProtocolControllerView() {
		CIM_MappingProtocolControllerViewImpl ciM_MappingProtocolControllerView = new CIM_MappingProtocolControllerViewImpl();
		return ciM_MappingProtocolControllerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MaskingGroup createCIM_MaskingGroup() {
		CIM_MaskingGroupImpl ciM_MaskingGroup = new CIM_MaskingGroupImpl();
		return ciM_MaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaAccessStatInfo createCIM_MediaAccessStatInfo() {
		CIM_MediaAccessStatInfoImpl ciM_MediaAccessStatInfo = new CIM_MediaAccessStatInfoImpl();
		return ciM_MediaAccessStatInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryAllocationSettingData createCIM_MemoryAllocationSettingData() {
		CIM_MemoryAllocationSettingDataImpl ciM_MemoryAllocationSettingData = new CIM_MemoryAllocationSettingDataImpl();
		return ciM_MemoryAllocationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryCapabilities createCIM_MemoryCapabilities() {
		CIM_MemoryCapabilitiesImpl ciM_MemoryCapabilities = new CIM_MemoryCapabilitiesImpl();
		return ciM_MemoryCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryConfigurationCapabilities createCIM_MemoryConfigurationCapabilities() {
		CIM_MemoryConfigurationCapabilitiesImpl ciM_MemoryConfigurationCapabilities = new CIM_MemoryConfigurationCapabilitiesImpl();
		return ciM_MemoryConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryError createCIM_MemoryError() {
		CIM_MemoryErrorImpl ciM_MemoryError = new CIM_MemoryErrorImpl();
		return ciM_MemoryError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MonitorResolution createCIM_MonitorResolution() {
		CIM_MonitorResolutionImpl ciM_MonitorResolution = new CIM_MonitorResolutionImpl();
		return ciM_MonitorResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPortCapabilities createCIM_NetworkPortCapabilities() {
		CIM_NetworkPortCapabilitiesImpl ciM_NetworkPortCapabilities = new CIM_NetworkPortCapabilitiesImpl();
		return ciM_NetworkPortCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperationalPowerManifestCollection createCIM_OperationalPowerManifestCollection() {
		CIM_OperationalPowerManifestCollectionImpl ciM_OperationalPowerManifestCollection = new CIM_OperationalPowerManifestCollectionImpl();
		return ciM_OperationalPowerManifestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCIPortGroup createCIM_PCIPortGroup() {
		CIM_PCIPortGroupImpl ciM_PCIPortGroup = new CIM_PCIPortGroupImpl();
		return ciM_PCIPortGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PersistentConfigurationCapabilities createCIM_PersistentConfigurationCapabilities() {
		CIM_PersistentConfigurationCapabilitiesImpl ciM_PersistentConfigurationCapabilities = new CIM_PersistentConfigurationCapabilitiesImpl();
		return ciM_PersistentConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PersistentMemoryCapabilities createCIM_PersistentMemoryCapabilities() {
		CIM_PersistentMemoryCapabilitiesImpl ciM_PersistentMemoryCapabilities = new CIM_PersistentMemoryCapabilitiesImpl();
		return ciM_PersistentMemoryCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PersistentMemoryNamespaceSettingData createCIM_PersistentMemoryNamespaceSettingData() {
		CIM_PersistentMemoryNamespaceSettingDataImpl ciM_PersistentMemoryNamespaceSettingData = new CIM_PersistentMemoryNamespaceSettingDataImpl();
		return ciM_PersistentMemoryNamespaceSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PickerStatInfo createCIM_PickerStatInfo() {
		CIM_PickerStatInfoImpl ciM_PickerStatInfo = new CIM_PickerStatInfoImpl();
		return ciM_PickerStatInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PowerAllocationSettingData createCIM_PowerAllocationSettingData() {
		CIM_PowerAllocationSettingDataImpl ciM_PowerAllocationSettingData = new CIM_PowerAllocationSettingDataImpl();
		return ciM_PowerAllocationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PowerUtilizationManagementCapabilities createCIM_PowerUtilizationManagementCapabilities() {
		CIM_PowerUtilizationManagementCapabilitiesImpl ciM_PowerUtilizationManagementCapabilities = new CIM_PowerUtilizationManagementCapabilitiesImpl();
		return ciM_PowerUtilizationManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProcessorCapabilities createCIM_ProcessorCapabilities() {
		CIM_ProcessorCapabilitiesImpl ciM_ProcessorCapabilities = new CIM_ProcessorCapabilitiesImpl();
		return ciM_ProcessorCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolControllerMaskingCapabilities createCIM_ProtocolControllerMaskingCapabilities() {
		CIM_ProtocolControllerMaskingCapabilitiesImpl ciM_ProtocolControllerMaskingCapabilities = new CIM_ProtocolControllerMaskingCapabilitiesImpl();
		return ciM_ProtocolControllerMaskingCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemoteResources createCIM_RemoteResources() {
		CIM_RemoteResourcesImpl ciM_RemoteResources = new CIM_RemoteResourcesImpl();
		return ciM_RemoteResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplicaPairView createCIM_ReplicaPairView() {
		CIM_ReplicaPairViewImpl ciM_ReplicaPairView = new CIM_ReplicaPairViewImpl();
		return ciM_ReplicaPairView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplicationGroup createCIM_ReplicationGroup() {
		CIM_ReplicationGroupImpl ciM_ReplicationGroup = new CIM_ReplicationGroupImpl();
		return ciM_ReplicationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIMultipathConfigurationCapabilities createCIM_SCSIMultipathConfigurationCapabilities() {
		CIM_SCSIMultipathConfigurationCapabilitiesImpl ciM_SCSIMultipathConfigurationCapabilities = new CIM_SCSIMultipathConfigurationCapabilitiesImpl();
		return ciM_SCSIMultipathConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSITargetPortGroup createCIM_SCSITargetPortGroup() {
		CIM_SCSITargetPortGroupImpl ciM_SCSITargetPortGroup = new CIM_SCSITargetPortGroupImpl();
		return ciM_SCSITargetPortGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SpareConfigurationCapabilities createCIM_SpareConfigurationCapabilities() {
		CIM_SpareConfigurationCapabilitiesImpl ciM_SpareConfigurationCapabilities = new CIM_SpareConfigurationCapabilitiesImpl();
		return ciM_SpareConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticsCapabilities createCIM_StatisticsCapabilities() {
		CIM_StatisticsCapabilitiesImpl ciM_StatisticsCapabilities = new CIM_StatisticsCapabilitiesImpl();
		return ciM_StatisticsCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageCapabilities createCIM_StorageCapabilities() {
		CIM_StorageCapabilitiesImpl ciM_StorageCapabilities = new CIM_StorageCapabilitiesImpl();
		return ciM_StorageCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageElementCompositionCapabilities createCIM_StorageElementCompositionCapabilities() {
		CIM_StorageElementCompositionCapabilitiesImpl ciM_StorageElementCompositionCapabilities = new CIM_StorageElementCompositionCapabilitiesImpl();
		return ciM_StorageElementCompositionCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageErasureCapabilities createCIM_StorageErasureCapabilities() {
		CIM_StorageErasureCapabilitiesImpl ciM_StorageErasureCapabilities = new CIM_StorageErasureCapabilitiesImpl();
		return ciM_StorageErasureCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageLibraryCapabilities createCIM_StorageLibraryCapabilities() {
		CIM_StorageLibraryCapabilitiesImpl ciM_StorageLibraryCapabilities = new CIM_StorageLibraryCapabilitiesImpl();
		return ciM_StorageLibraryCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StoragePoolDiagnosticSettingData createCIM_StoragePoolDiagnosticSettingData() {
		CIM_StoragePoolDiagnosticSettingDataImpl ciM_StoragePoolDiagnosticSettingData = new CIM_StoragePoolDiagnosticSettingDataImpl();
		return ciM_StoragePoolDiagnosticSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageProtectionCapabilities createCIM_StorageProtectionCapabilities() {
		CIM_StorageProtectionCapabilitiesImpl ciM_StorageProtectionCapabilities = new CIM_StorageProtectionCapabilitiesImpl();
		return ciM_StorageProtectionCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageReplicationCapabilities createCIM_StorageReplicationCapabilities() {
		CIM_StorageReplicationCapabilitiesImpl ciM_StorageReplicationCapabilities = new CIM_StorageReplicationCapabilitiesImpl();
		return ciM_StorageReplicationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageResourceLoadGroup createCIM_StorageResourceLoadGroup() {
		CIM_StorageResourceLoadGroupImpl ciM_StorageResourceLoadGroup = new CIM_StorageResourceLoadGroupImpl();
		return ciM_StorageResourceLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageServerAsymmetryCapabilities createCIM_StorageServerAsymmetryCapabilities() {
		CIM_StorageServerAsymmetryCapabilitiesImpl ciM_StorageServerAsymmetryCapabilities = new CIM_StorageServerAsymmetryCapabilitiesImpl();
		return ciM_StorageServerAsymmetryCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageSettingWithHints createCIM_StorageSettingWithHints() {
		CIM_StorageSettingWithHintsImpl ciM_StorageSettingWithHints = new CIM_StorageSettingWithHintsImpl();
		return ciM_StorageSettingWithHints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageTier createCIM_StorageTier() {
		CIM_StorageTierImpl ciM_StorageTier = new CIM_StorageTierImpl();
		return ciM_StorageTier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageTierCapabilities createCIM_StorageTierCapabilities() {
		CIM_StorageTierCapabilitiesImpl ciM_StorageTierCapabilities = new CIM_StorageTierCapabilitiesImpl();
		return ciM_StorageTierCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemRegistrationCapabilities createCIM_SystemRegistrationCapabilities() {
		CIM_SystemRegistrationCapabilitiesImpl ciM_SystemRegistrationCapabilities = new CIM_SystemRegistrationCapabilitiesImpl();
		return ciM_SystemRegistrationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TargetMaskingGroup createCIM_TargetMaskingGroup() {
		CIM_TargetMaskingGroupImpl ciM_TargetMaskingGroup = new CIM_TargetMaskingGroupImpl();
		return ciM_TargetMaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TargetPortGroup createCIM_TargetPortGroup() {
		CIM_TargetPortGroupImpl ciM_TargetPortGroup = new CIM_TargetPortGroupImpl();
		return ciM_TargetPortGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TierServiceCapabilities createCIM_TierServiceCapabilities() {
		CIM_TierServiceCapabilitiesImpl ciM_TierServiceCapabilities = new CIM_TierServiceCapabilitiesImpl();
		return ciM_TierServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VTLStatisticalDataServiceCapabilities createCIM_VTLStatisticalDataServiceCapabilities() {
		CIM_VTLStatisticalDataServiceCapabilitiesImpl ciM_VTLStatisticalDataServiceCapabilities = new CIM_VTLStatisticalDataServiceCapabilitiesImpl();
		return ciM_VTLStatisticalDataServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoControllerResolution createCIM_VideoControllerResolution() {
		CIM_VideoControllerResolutionImpl ciM_VideoControllerResolution = new CIM_VideoControllerResolutionImpl();
		return ciM_VideoControllerResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ViewCapabilities createCIM_ViewCapabilities() {
		CIM_ViewCapabilitiesImpl ciM_ViewCapabilities = new CIM_ViewCapabilitiesImpl();
		return ciM_ViewCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VolumeView createCIM_VolumeView() {
		CIM_VolumeViewImpl ciM_VolumeView = new CIM_VolumeViewImpl();
		return ciM_VolumeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiPortCapabilities createCIM_WiFiPortCapabilities() {
		CIM_WiFiPortCapabilitiesImpl ciM_WiFiPortCapabilities = new CIM_WiFiPortCapabilitiesImpl();
		return ciM_WiFiPortCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ZoneCapabilities createCIM_ZoneCapabilities() {
		CIM_ZoneCapabilitiesImpl ciM_ZoneCapabilities = new CIM_ZoneCapabilitiesImpl();
		return ciM_ZoneCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ZoneMembershipSettingData createCIM_ZoneMembershipSettingData() {
		CIM_ZoneMembershipSettingDataImpl ciM_ZoneMembershipSettingData = new CIM_ZoneMembershipSettingDataImpl();
		return ciM_ZoneMembershipSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AlertIndication createCIM_AlertIndication() {
		CIM_AlertIndicationImpl ciM_AlertIndication = new CIM_AlertIndicationImpl();
		return ciM_AlertIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AlertInstIndication createCIM_AlertInstIndication() {
		CIM_AlertInstIndicationImpl ciM_AlertInstIndication = new CIM_AlertInstIndicationImpl();
		return ciM_AlertInstIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassModification createCIM_ClassModification() {
		CIM_ClassModificationImpl ciM_ClassModification = new CIM_ClassModificationImpl();
		return ciM_ClassModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterCollection createCIM_FilterCollection() {
		CIM_FilterCollectionImpl ciM_FilterCollection = new CIM_FilterCollectionImpl();
		return ciM_FilterCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterCollectionSubscription createCIM_FilterCollectionSubscription() {
		CIM_FilterCollectionSubscriptionImpl ciM_FilterCollectionSubscription = new CIM_FilterCollectionSubscriptionImpl();
		return ciM_FilterCollectionSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicationHandlerCIMXML createCIM_IndicationHandlerCIMXML() {
		CIM_IndicationHandlerCIMXMLImpl ciM_IndicationHandlerCIMXML = new CIM_IndicationHandlerCIMXMLImpl();
		return ciM_IndicationHandlerCIMXML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicationServiceCapabilities createCIM_IndicationServiceCapabilities() {
		CIM_IndicationServiceCapabilitiesImpl ciM_IndicationServiceCapabilities = new CIM_IndicationServiceCapabilitiesImpl();
		return ciM_IndicationServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicationSubscription createCIM_IndicationSubscription() {
		CIM_IndicationSubscriptionImpl ciM_IndicationSubscription = new CIM_IndicationSubscriptionImpl();
		return ciM_IndicationSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstCreation createCIM_InstCreation() {
		CIM_InstCreationImpl ciM_InstCreation = new CIM_InstCreationImpl();
		return ciM_InstCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstDeletion createCIM_InstDeletion() {
		CIM_InstDeletionImpl ciM_InstDeletion = new CIM_InstDeletionImpl();
		return ciM_InstDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ThresholdIndication createCIM_ThresholdIndication() {
		CIM_ThresholdIndicationImpl ciM_ThresholdIndication = new CIM_ThresholdIndicationImpl();
		return ciM_ThresholdIndication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAStaticAction createCIM_SAStaticAction() {
		CIM_SAStaticActionImpl ciM_SAStaticAction = new CIM_SAStaticActionImpl();
		return ciM_SAStaticAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueryCapabilities createCIM_QueryCapabilities() {
		CIM_QueryCapabilitiesImpl ciM_QueryCapabilities = new CIM_QueryCapabilitiesImpl();
		return ciM_QueryCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReferencedSpecification createCIM_ReferencedSpecification() {
		CIM_ReferencedSpecificationImpl ciM_ReferencedSpecification = new CIM_ReferencedSpecificationImpl();
		return ciM_ReferencedSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RegisteredProfile createCIM_RegisteredProfile() {
		CIM_RegisteredProfileImpl ciM_RegisteredProfile = new CIM_RegisteredProfileImpl();
		return ciM_RegisteredProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RegisteredSubProfile createCIM_RegisteredSubProfile() {
		CIM_RegisteredSubProfileImpl ciM_RegisteredSubProfile = new CIM_RegisteredSubProfileImpl();
		return ciM_RegisteredSubProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WBEMServerCapabilities createCIM_WBEMServerCapabilities() {
		CIM_WBEMServerCapabilitiesImpl ciM_WBEMServerCapabilities = new CIM_WBEMServerCapabilitiesImpl();
		return ciM_WBEMServerCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AggregationMetricDefinition createCIM_AggregationMetricDefinition() {
		CIM_AggregationMetricDefinitionImpl ciM_AggregationMetricDefinition = new CIM_AggregationMetricDefinitionImpl();
		return ciM_AggregationMetricDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AggregationMetricValue createCIM_AggregationMetricValue() {
		CIM_AggregationMetricValueImpl ciM_AggregationMetricValue = new CIM_AggregationMetricValueImpl();
		return ciM_AggregationMetricValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalElementPerformsUoW createCIM_LogicalElementPerformsUoW() {
		CIM_LogicalElementPerformsUoWImpl ciM_LogicalElementPerformsUoW = new CIM_LogicalElementPerformsUoWImpl();
		return ciM_LogicalElementPerformsUoW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MetricDefForME createCIM_MetricDefForME() {
		CIM_MetricDefForMEImpl ciM_MetricDefForME = new CIM_MetricDefForMEImpl();
		return ciM_MetricDefForME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MetricForME createCIM_MetricForME() {
		CIM_MetricForMEImpl ciM_MetricForME = new CIM_MetricForMEImpl();
		return ciM_MetricForME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MetricInstance createCIM_MetricInstance() {
		CIM_MetricInstanceImpl ciM_MetricInstance = new CIM_MetricInstanceImpl();
		return ciM_MetricInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MetricServiceCapabilities createCIM_MetricServiceCapabilities() {
		CIM_MetricServiceCapabilitiesImpl ciM_MetricServiceCapabilities = new CIM_MetricServiceCapabilitiesImpl();
		return ciM_MetricServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SubUoW createCIM_SubUoW() {
		CIM_SubUoWImpl ciM_SubUoW = new CIM_SubUoWImpl();
		return ciM_SubUoW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnitOfWorkDefinition createCIM_UnitOfWorkDefinition() {
		CIM_UnitOfWorkDefinitionImpl ciM_UnitOfWorkDefinition = new CIM_UnitOfWorkDefinitionImpl();
		return ciM_UnitOfWorkDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UoWDefTraceLevelType createCIM_UoWDefTraceLevelType() {
		CIM_UoWDefTraceLevelTypeImpl ciM_UoWDefTraceLevelType = new CIM_UoWDefTraceLevelTypeImpl();
		return ciM_UoWDefTraceLevelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UoWMetric createCIM_UoWMetric() {
		CIM_UoWMetricImpl ciM_UoWMetric = new CIM_UoWMetricImpl();
		return ciM_UoWMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UoWMetricDefinition createCIM_UoWMetricDefinition() {
		CIM_UoWMetricDefinitionImpl ciM_UoWMetricDefinition = new CIM_UoWMetricDefinitionImpl();
		return ciM_UoWMetricDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AdministrativeDistance createCIM_AdministrativeDistance() {
		CIM_AdministrativeDistanceImpl ciM_AdministrativeDistance = new CIM_AdministrativeDistanceImpl();
		return ciM_AdministrativeDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocationSchedulingElement createCIM_AllocationSchedulingElement() {
		CIM_AllocationSchedulingElementImpl ciM_AllocationSchedulingElement = new CIM_AllocationSchedulingElementImpl();
		return ciM_AllocationSchedulingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPAttributes createCIM_BGPAttributes() {
		CIM_BGPAttributesImpl ciM_BGPAttributes = new CIM_BGPAttributesImpl();
		return ciM_BGPAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPCluster createCIM_BGPCluster() {
		CIM_BGPClusterImpl ciM_BGPCluster = new CIM_BGPClusterImpl();
		return ciM_BGPCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPPathAttributes createCIM_BGPPathAttributes() {
		CIM_BGPPathAttributesImpl ciM_BGPPathAttributes = new CIM_BGPPathAttributesImpl();
		return ciM_BGPPathAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPPeerGroup createCIM_BGPPeerGroup() {
		CIM_BGPPeerGroupImpl ciM_BGPPeerGroup = new CIM_BGPPeerGroupImpl();
		return ciM_BGPPeerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPRouteMap createCIM_BGPRouteMap() {
		CIM_BGPRouteMapImpl ciM_BGPRouteMap = new CIM_BGPRouteMapImpl();
		return ciM_BGPRouteMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPStatistics createCIM_BGPStatistics() {
		CIM_BGPStatisticsImpl ciM_BGPStatistics = new CIM_BGPStatisticsImpl();
		return ciM_BGPStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BufferPool createCIM_BufferPool() {
		CIM_BufferPoolImpl ciM_BufferPool = new CIM_BufferPoolImpl();
		return ciM_BufferPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectedBufferPool createCIM_CollectedBufferPool() {
		CIM_CollectedBufferPoolImpl ciM_CollectedBufferPool = new CIM_CollectedBufferPoolImpl();
		return ciM_CollectedBufferPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConnectivityCollection createCIM_ConnectivityCollection() {
		CIM_ConnectivityCollectionImpl ciM_ConnectivityCollection = new CIM_ConnectivityCollectionImpl();
		return ciM_ConnectivityCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DHCPCapabilities createCIM_DHCPCapabilities() {
		CIM_DHCPCapabilitiesImpl ciM_DHCPCapabilities = new CIM_DHCPCapabilitiesImpl();
		return ciM_DHCPCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DHCPSettingData createCIM_DHCPSettingData() {
		CIM_DHCPSettingDataImpl ciM_DHCPSettingData = new CIM_DHCPSettingDataImpl();
		return ciM_DHCPSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DNSGeneralSettingData createCIM_DNSGeneralSettingData() {
		CIM_DNSGeneralSettingDataImpl ciM_DNSGeneralSettingData = new CIM_DNSGeneralSettingDataImpl();
		return ciM_DNSGeneralSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DNSSettingData createCIM_DNSSettingData() {
		CIM_DNSSettingDataImpl ciM_DNSSettingData = new CIM_DNSSettingDataImpl();
		return ciM_DNSSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DynamicForwardingEntry createCIM_DynamicForwardingEntry() {
		CIM_DynamicForwardingEntryImpl ciM_DynamicForwardingEntry = new CIM_DynamicForwardingEntryImpl();
		return ciM_DynamicForwardingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExtendedStaticIPAssignmentSettingData createCIM_ExtendedStaticIPAssignmentSettingData() {
		CIM_ExtendedStaticIPAssignmentSettingDataImpl ciM_ExtendedStaticIPAssignmentSettingData = new CIM_ExtendedStaticIPAssignmentSettingDataImpl();
		return ciM_ExtendedStaticIPAssignmentSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterList createCIM_FilterList() {
		CIM_FilterListImpl ciM_FilterList = new CIM_FilterListImpl();
		return ciM_FilterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterListsInBGPRouteMap createCIM_FilterListsInBGPRouteMap() {
		CIM_FilterListsInBGPRouteMapImpl ciM_FilterListsInBGPRouteMap = new CIM_FilterListsInBGPRouteMapImpl();
		return ciM_FilterListsInBGPRouteMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Hdr8021Filter createCIM_Hdr8021Filter() {
		CIM_Hdr8021FilterImpl ciM_Hdr8021Filter = new CIM_Hdr8021FilterImpl();
		return ciM_Hdr8021Filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IEEE8021xCapabilities createCIM_IEEE8021xCapabilities() {
		CIM_IEEE8021xCapabilitiesImpl ciM_IEEE8021xCapabilities = new CIM_IEEE8021xCapabilitiesImpl();
		return ciM_IEEE8021xCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPConnectivitySubnet createCIM_IPConnectivitySubnet() {
		CIM_IPConnectivitySubnetImpl ciM_IPConnectivitySubnet = new CIM_IPConnectivitySubnetImpl();
		return ciM_IPConnectivitySubnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPHeadersFilter createCIM_IPHeadersFilter() {
		CIM_IPHeadersFilterImpl ciM_IPHeadersFilter = new CIM_IPHeadersFilterImpl();
		return ciM_IPHeadersFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPSOFilterEntry createCIM_IPSOFilterEntry() {
		CIM_IPSOFilterEntryImpl ciM_IPSOFilterEntry = new CIM_IPSOFilterEntryImpl();
		return ciM_IPSOFilterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPXConnectivityNetwork createCIM_IPXConnectivityNetwork() {
		CIM_IPXConnectivityNetworkImpl ciM_IPXConnectivityNetwork = new CIM_IPXConnectivityNetworkImpl();
		return ciM_IPXConnectivityNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LANConnectivitySegment createCIM_LANConnectivitySegment() {
		CIM_LANConnectivitySegmentImpl ciM_LANConnectivitySegment = new CIM_LANConnectivitySegmentImpl();
		return ciM_LANConnectivitySegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalNetwork createCIM_LogicalNetwork() {
		CIM_LogicalNetworkImpl ciM_LogicalNetwork = new CIM_LogicalNetworkImpl();
		return ciM_LogicalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NamedAddressCollection createCIM_NamedAddressCollection() {
		CIM_NamedAddressCollectionImpl ciM_NamedAddressCollection = new CIM_NamedAddressCollectionImpl();
		return ciM_NamedAddressCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPolicyAction createCIM_NetworkPolicyAction() {
		CIM_NetworkPolicyActionImpl ciM_NetworkPolicyAction = new CIM_NetworkPolicyActionImpl();
		return ciM_NetworkPolicyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPolicyCondition createCIM_NetworkPolicyCondition() {
		CIM_NetworkPolicyConditionImpl ciM_NetworkPolicyCondition = new CIM_NetworkPolicyConditionImpl();
		return ciM_NetworkPolicyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkVLAN createCIM_NetworkVLAN() {
		CIM_NetworkVLANImpl ciM_NetworkVLAN = new CIM_NetworkVLANImpl();
		return ciM_NetworkVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NextHopIPRoute createCIM_NextHopIPRoute() {
		CIM_NextHopIPRouteImpl ciM_NextHopIPRoute = new CIM_NextHopIPRouteImpl();
		return ciM_NextHopIPRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFAreaConfiguration createCIM_OSPFAreaConfiguration() {
		CIM_OSPFAreaConfigurationImpl ciM_OSPFAreaConfiguration = new CIM_OSPFAreaConfigurationImpl();
		return ciM_OSPFAreaConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFLink createCIM_OSPFLink() {
		CIM_OSPFLinkImpl ciM_OSPFLink = new CIM_OSPFLinkImpl();
		return ciM_OSPFLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFServiceCapabilities createCIM_OSPFServiceCapabilities() {
		CIM_OSPFServiceCapabilitiesImpl ciM_OSPFServiceCapabilities = new CIM_OSPFServiceCapabilitiesImpl();
		return ciM_OSPFServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PeerIDPayloadFilterEntry createCIM_PeerIDPayloadFilterEntry() {
		CIM_PeerIDPayloadFilterEntryImpl ciM_PeerIDPayloadFilterEntry = new CIM_PeerIDPayloadFilterEntryImpl();
		return ciM_PeerIDPayloadFilterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PreambleFilter createCIM_PreambleFilter() {
		CIM_PreambleFilterImpl ciM_PreambleFilter = new CIM_PreambleFilterImpl();
		return ciM_PreambleFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrioritySchedulingElement createCIM_PrioritySchedulingElement() {
		CIM_PrioritySchedulingElementImpl ciM_PrioritySchedulingElement = new CIM_PrioritySchedulingElementImpl();
		return ciM_PrioritySchedulingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolServiceCapabilities createCIM_ProtocolServiceCapabilities() {
		CIM_ProtocolServiceCapabilitiesImpl ciM_ProtocolServiceCapabilities = new CIM_ProtocolServiceCapabilitiesImpl();
		return ciM_ProtocolServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RangeOfIPAddresses createCIM_RangeOfIPAddresses() {
		CIM_RangeOfIPAddressesImpl ciM_RangeOfIPAddresses = new CIM_RangeOfIPAddressesImpl();
		return ciM_RangeOfIPAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RangesOfConfiguration createCIM_RangesOfConfiguration() {
		CIM_RangesOfConfigurationImpl ciM_RangesOfConfiguration = new CIM_RangesOfConfigurationImpl();
		return ciM_RangesOfConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RedirectionServiceCapabilities createCIM_RedirectionServiceCapabilities() {
		CIM_RedirectionServiceCapabilitiesImpl ciM_RedirectionServiceCapabilities = new CIM_RedirectionServiceCapabilitiesImpl();
		return ciM_RedirectionServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoutingPolicy createCIM_RoutingPolicy() {
		CIM_RoutingPolicyImpl ciM_RoutingPolicy = new CIM_RoutingPolicyImpl();
		return ciM_RoutingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SSHCapabilities createCIM_SSHCapabilities() {
		CIM_SSHCapabilitiesImpl ciM_SSHCapabilities = new CIM_SSHCapabilitiesImpl();
		return ciM_SSHCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SpanningTreeStatistics createCIM_SpanningTreeStatistics() {
		CIM_SpanningTreeStatisticsImpl ciM_SpanningTreeStatistics = new CIM_SpanningTreeStatisticsImpl();
		return ciM_SpanningTreeStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StaticForwardingEntry createCIM_StaticForwardingEntry() {
		CIM_StaticForwardingEntryImpl ciM_StaticForwardingEntry = new CIM_StaticForwardingEntryImpl();
		return ciM_StaticForwardingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortSourceRoutingStatistics createCIM_SwitchPortSourceRoutingStatistics() {
		CIM_SwitchPortSourceRoutingStatisticsImpl ciM_SwitchPortSourceRoutingStatistics = new CIM_SwitchPortSourceRoutingStatisticsImpl();
		return ciM_SwitchPortSourceRoutingStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortSpanningTreeStatistics createCIM_SwitchPortSpanningTreeStatistics() {
		CIM_SwitchPortSpanningTreeStatisticsImpl ciM_SwitchPortSpanningTreeStatistics = new CIM_SwitchPortSpanningTreeStatisticsImpl();
		return ciM_SwitchPortSpanningTreeStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortStatistics createCIM_SwitchPortStatistics() {
		CIM_SwitchPortStatisticsImpl ciM_SwitchPortStatistics = new CIM_SwitchPortStatisticsImpl();
		return ciM_SwitchPortStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortTransparentBridgingStatistics createCIM_SwitchPortTransparentBridgingStatistics() {
		CIM_SwitchPortTransparentBridgingStatisticsImpl ciM_SwitchPortTransparentBridgingStatistics = new CIM_SwitchPortTransparentBridgingStatisticsImpl();
		return ciM_SwitchPortTransparentBridgingStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TelnetCapabilities createCIM_TelnetCapabilities() {
		CIM_TelnetCapabilitiesImpl ciM_TelnetCapabilities = new CIM_TelnetCapabilitiesImpl();
		return ciM_TelnetCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TransparentBridgingStatistics createCIM_TransparentBridgingStatistics() {
		CIM_TransparentBridgingStatisticsImpl ciM_TransparentBridgingStatistics = new CIM_TransparentBridgingStatisticsImpl();
		return ciM_TransparentBridgingStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBRedirectionCapabilities createCIM_USBRedirectionCapabilities() {
		CIM_USBRedirectionCapabilitiesImpl ciM_USBRedirectionCapabilities = new CIM_USBRedirectionCapabilitiesImpl();
		return ciM_USBRedirectionCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VLANEndpointCapabilities createCIM_VLANEndpointCapabilities() {
		CIM_VLANEndpointCapabilitiesImpl ciM_VLANEndpointCapabilities = new CIM_VLANEndpointCapabilitiesImpl();
		return ciM_VLANEndpointCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualRoutingAndForwardingTable createCIM_VirtualRoutingAndForwardingTable() {
		CIM_VirtualRoutingAndForwardingTableImpl ciM_VirtualRoutingAndForwardingTable = new CIM_VirtualRoutingAndForwardingTableImpl();
		return ciM_VirtualRoutingAndForwardingTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiEndpointCapabilities createCIM_WiFiEndpointCapabilities() {
		CIM_WiFiEndpointCapabilitiesImpl ciM_WiFiEndpointCapabilities = new CIM_WiFiEndpointCapabilitiesImpl();
		return ciM_WiFiEndpointCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_X509CredentialFilterEntry createCIM_X509CredentialFilterEntry() {
		CIM_X509CredentialFilterEntryImpl ciM_X509CredentialFilterEntry = new CIM_X509CredentialFilterEntryImpl();
		return ciM_X509CredentialFilterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSICapabilities createCIM_iSCSICapabilities() {
		CIM_iSCSICapabilitiesImpl ciM_iSCSICapabilities = new CIM_iSCSICapabilitiesImpl();
		return ciM_iSCSICapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSIConfigurationCapabilities createCIM_iSCSIConfigurationCapabilities() {
		CIM_iSCSIConfigurationCapabilitiesImpl ciM_iSCSIConfigurationCapabilities = new CIM_iSCSIConfigurationCapabilitiesImpl();
		return ciM_iSCSIConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AdjacentSlots createCIM_AdjacentSlots() {
		CIM_AdjacentSlotsImpl ciM_AdjacentSlots = new CIM_AdjacentSlotsImpl();
		return ciM_AdjacentSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Card createCIM_Card() {
		CIM_CardImpl ciM_Card = new CIM_CardImpl();
		return ciM_Card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Chip createCIM_Chip() {
		CIM_ChipImpl ciM_Chip = new CIM_ChipImpl();
		return ciM_Chip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConfigurationCapacity createCIM_ConfigurationCapacity() {
		CIM_ConfigurationCapacityImpl ciM_ConfigurationCapacity = new CIM_ConfigurationCapacityImpl();
		return ciM_ConfigurationCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConnectedTo createCIM_ConnectedTo() {
		CIM_ConnectedToImpl ciM_ConnectedTo = new CIM_ConnectedToImpl();
		return ciM_ConnectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Container createCIM_Container() {
		CIM_ContainerImpl ciM_Container = new CIM_ContainerImpl();
		return ciM_Container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ContainerView createCIM_ContainerView() {
		CIM_ContainerViewImpl ciM_ContainerView = new CIM_ContainerViewImpl();
		return ciM_ContainerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementCapacity createCIM_ElementCapacity() {
		CIM_ElementCapacityImpl ciM_ElementCapacity = new CIM_ElementCapacityImpl();
		return ciM_ElementCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementInConnector createCIM_ElementInConnector() {
		CIM_ElementInConnectorImpl ciM_ElementInConnector = new CIM_ElementInConnectorImpl();
		return ciM_ElementInConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementsLinked createCIM_ElementsLinked() {
		CIM_ElementsLinkedImpl ciM_ElementsLinked = new CIM_ElementsLinkedImpl();
		return ciM_ElementsLinked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LinkHasConnector createCIM_LinkHasConnector() {
		CIM_LinkHasConnectorImpl ciM_LinkHasConnector = new CIM_LinkHasConnectorImpl();
		return ciM_LinkHasConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaPhysicalStatInfo createCIM_MediaPhysicalStatInfo() {
		CIM_MediaPhysicalStatInfoImpl ciM_MediaPhysicalStatInfo = new CIM_MediaPhysicalStatInfoImpl();
		return ciM_MediaPhysicalStatInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryCapacity createCIM_MemoryCapacity() {
		CIM_MemoryCapacityImpl ciM_MemoryCapacity = new CIM_MemoryCapacityImpl();
		return ciM_MemoryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageInConnector createCIM_PackageInConnector() {
		CIM_PackageInConnectorImpl ciM_PackageInConnector = new CIM_PackageInConnectorImpl();
		return ciM_PackageInConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageInSlot createCIM_PackageInSlot() {
		CIM_PackageInSlotImpl ciM_PackageInSlot = new CIM_PackageInSlotImpl();
		return ciM_PackageInSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageLocation createCIM_PackageLocation() {
		CIM_PackageLocationImpl ciM_PackageLocation = new CIM_PackageLocationImpl();
		return ciM_PackageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackagedComponent createCIM_PackagedComponent() {
		CIM_PackagedComponentImpl ciM_PackagedComponent = new CIM_PackagedComponentImpl();
		return ciM_PackagedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalAssetCapabilities createCIM_PhysicalAssetCapabilities() {
		CIM_PhysicalAssetCapabilitiesImpl ciM_PhysicalAssetCapabilities = new CIM_PhysicalAssetCapabilitiesImpl();
		return ciM_PhysicalAssetCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalFrame createCIM_PhysicalFrame() {
		CIM_PhysicalFrameImpl ciM_PhysicalFrame = new CIM_PhysicalFrameImpl();
		return ciM_PhysicalFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalMemory createCIM_PhysicalMemory() {
		CIM_PhysicalMemoryImpl ciM_PhysicalMemory = new CIM_PhysicalMemoryImpl();
		return ciM_PhysicalMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Rack createCIM_Rack() {
		CIM_RackImpl ciM_Rack = new CIM_RackImpl();
		return ciM_Rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplacementSet createCIM_ReplacementSet() {
		CIM_ReplacementSetImpl ciM_ReplacementSet = new CIM_ReplacementSetImpl();
		return ciM_ReplacementSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SlotInSlot createCIM_SlotInSlot() {
		CIM_SlotInSlotImpl ciM_SlotInSlot = new CIM_SlotInSlotImpl();
		return ciM_SlotInSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageMediaLocation createCIM_StorageMediaLocation() {
		CIM_StorageMediaLocationImpl ciM_StorageMediaLocation = new CIM_StorageMediaLocationImpl();
		return ciM_StorageMediaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemBusCard createCIM_SystemBusCard() {
		CIM_SystemBusCardImpl ciM_SystemBusCard = new CIM_SystemBusCardImpl();
		return ciM_SystemBusCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BiometricAuthentication createCIM_BiometricAuthentication() {
		CIM_BiometricAuthenticationImpl ciM_BiometricAuthentication = new CIM_BiometricAuthenticationImpl();
		return ciM_BiometricAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CompoundPolicyAction createCIM_CompoundPolicyAction() {
		CIM_CompoundPolicyActionImpl ciM_CompoundPolicyAction = new CIM_CompoundPolicyActionImpl();
		return ciM_CompoundPolicyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CompoundPolicyCondition createCIM_CompoundPolicyCondition() {
		CIM_CompoundPolicyConditionImpl ciM_CompoundPolicyCondition = new CIM_CompoundPolicyConditionImpl();
		return ciM_CompoundPolicyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DocumentAuthentication createCIM_DocumentAuthentication() {
		CIM_DocumentAuthenticationImpl ciM_DocumentAuthentication = new CIM_DocumentAuthenticationImpl();
		return ciM_DocumentAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_KerberosAuthentication createCIM_KerberosAuthentication() {
		CIM_KerberosAuthenticationImpl ciM_KerberosAuthentication = new CIM_KerberosAuthenticationImpl();
		return ciM_KerberosAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MethodAction createCIM_MethodAction() {
		CIM_MethodActionImpl ciM_MethodAction = new CIM_MethodActionImpl();
		return ciM_MethodAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPacketAction createCIM_NetworkPacketAction() {
		CIM_NetworkPacketActionImpl ciM_NetworkPacketAction = new CIM_NetworkPacketActionImpl();
		return ciM_NetworkPacketAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkingIDAuthentication createCIM_NetworkingIDAuthentication() {
		CIM_NetworkingIDAuthenticationImpl ciM_NetworkingIDAuthentication = new CIM_NetworkingIDAuthenticationImpl();
		return ciM_NetworkingIDAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PacketFilterCondition createCIM_PacketFilterCondition() {
		CIM_PacketFilterConditionImpl ciM_PacketFilterCondition = new CIM_PacketFilterConditionImpl();
		return ciM_PacketFilterCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalCredentialAuthentication createCIM_PhysicalCredentialAuthentication() {
		CIM_PhysicalCredentialAuthenticationImpl ciM_PhysicalCredentialAuthentication = new CIM_PhysicalCredentialAuthenticationImpl();
		return ciM_PhysicalCredentialAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyGroup createCIM_PolicyGroup() {
		CIM_PolicyGroupImpl ciM_PolicyGroup = new CIM_PolicyGroupImpl();
		return ciM_PolicyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyGroupInPolicyGroup createCIM_PolicyGroupInPolicyGroup() {
		CIM_PolicyGroupInPolicyGroupImpl ciM_PolicyGroupInPolicyGroup = new CIM_PolicyGroupInPolicyGroupImpl();
		return ciM_PolicyGroupInPolicyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRoleCollection createCIM_PolicyRoleCollection() {
		CIM_PolicyRoleCollectionImpl ciM_PolicyRoleCollection = new CIM_PolicyRoleCollectionImpl();
		return ciM_PolicyRoleCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRule createCIM_PolicyRule() {
		CIM_PolicyRuleImpl ciM_PolicyRule = new CIM_PolicyRuleImpl();
		return ciM_PolicyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRuleInPolicyGroup createCIM_PolicyRuleInPolicyGroup() {
		CIM_PolicyRuleInPolicyGroupImpl ciM_PolicyRuleInPolicyGroup = new CIM_PolicyRuleInPolicyGroupImpl();
		return ciM_PolicyRuleInPolicyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRuleValidityPeriod createCIM_PolicyRuleValidityPeriod() {
		CIM_PolicyRuleValidityPeriodImpl ciM_PolicyRuleValidityPeriod = new CIM_PolicyRuleValidityPeriodImpl();
		return ciM_PolicyRuleValidityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicySetComponent createCIM_PolicySetComponent() {
		CIM_PolicySetComponentImpl ciM_PolicySetComponent = new CIM_PolicySetComponentImpl();
		return ciM_PolicySetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicySetInRoleCollection createCIM_PolicySetInRoleCollection() {
		CIM_PolicySetInRoleCollectionImpl ciM_PolicySetInRoleCollection = new CIM_PolicySetInRoleCollectionImpl();
		return ciM_PolicySetInRoleCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicySetValidityPeriod createCIM_PolicySetValidityPeriod() {
		CIM_PolicySetValidityPeriodImpl ciM_PolicySetValidityPeriod = new CIM_PolicySetValidityPeriodImpl();
		return ciM_PolicySetValidityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PublicPrivateKeyAuthentication createCIM_PublicPrivateKeyAuthentication() {
		CIM_PublicPrivateKeyAuthenticationImpl ciM_PublicPrivateKeyAuthentication = new CIM_PublicPrivateKeyAuthenticationImpl();
		return ciM_PublicPrivateKeyAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharedSecretAuthentication createCIM_SharedSecretAuthentication() {
		CIM_SharedSecretAuthenticationImpl ciM_SharedSecretAuthentication = new CIM_SharedSecretAuthenticationImpl();
		return ciM_SharedSecretAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSServiceCapabilities createCIM_BIOSServiceCapabilities() {
		CIM_BIOSServiceCapabilitiesImpl ciM_BIOSServiceCapabilities = new CIM_BIOSServiceCapabilitiesImpl();
		return ciM_BIOSServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BootServiceCapabilities createCIM_BootServiceCapabilities() {
		CIM_BootServiceCapabilitiesImpl ciM_BootServiceCapabilities = new CIM_BootServiceCapabilitiesImpl();
		return ciM_BootServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemNodeCapabilities createCIM_ComputerSystemNodeCapabilities() {
		CIM_ComputerSystemNodeCapabilitiesImpl ciM_ComputerSystemNodeCapabilities = new CIM_ComputerSystemNodeCapabilitiesImpl();
		return ciM_ComputerSystemNodeCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DefaultElementCapabilities createCIM_DefaultElementCapabilities() {
		CIM_DefaultElementCapabilitiesImpl ciM_DefaultElementCapabilities = new CIM_DefaultElementCapabilitiesImpl();
		return ciM_DefaultElementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticRecord createCIM_DiagnosticRecord() {
		CIM_DiagnosticRecordImpl ciM_DiagnosticRecord = new CIM_DiagnosticRecordImpl();
		return ciM_DiagnosticRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticServiceCapabilities createCIM_DiagnosticServiceCapabilities() {
		CIM_DiagnosticServiceCapabilitiesImpl ciM_DiagnosticServiceCapabilities = new CIM_DiagnosticServiceCapabilitiesImpl();
		return ciM_DiagnosticServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticServiceJobCapabilities createCIM_DiagnosticServiceJobCapabilities() {
		CIM_DiagnosticServiceJobCapabilitiesImpl ciM_DiagnosticServiceJobCapabilities = new CIM_DiagnosticServiceJobCapabilitiesImpl();
		return ciM_DiagnosticServiceJobCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticServiceRecord createCIM_DiagnosticServiceRecord() {
		CIM_DiagnosticServiceRecordImpl ciM_DiagnosticServiceRecord = new CIM_DiagnosticServiceRecordImpl();
		return ciM_DiagnosticServiceRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticSetting createCIM_DiagnosticSetting() {
		CIM_DiagnosticSettingImpl ciM_DiagnosticSetting = new CIM_DiagnosticSettingImpl();
		return ciM_DiagnosticSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticSettingDataRecord createCIM_DiagnosticSettingDataRecord() {
		CIM_DiagnosticSettingDataRecordImpl ciM_DiagnosticSettingDataRecord = new CIM_DiagnosticSettingDataRecordImpl();
		return ciM_DiagnosticSettingDataRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticSettingRecord createCIM_DiagnosticSettingRecord() {
		CIM_DiagnosticSettingRecordImpl ciM_DiagnosticSettingRecord = new CIM_DiagnosticSettingRecordImpl();
		return ciM_DiagnosticSettingRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticSubTestRecord createCIM_DiagnosticSubTestRecord() {
		CIM_DiagnosticSubTestRecordImpl ciM_DiagnosticSubTestRecord = new CIM_DiagnosticSubTestRecordImpl();
		return ciM_DiagnosticSubTestRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskDriveDiagnosticServiceCapabilities createCIM_DiskDriveDiagnosticServiceCapabilities() {
		CIM_DiskDriveDiagnosticServiceCapabilitiesImpl ciM_DiskDriveDiagnosticServiceCapabilities = new CIM_DiskDriveDiagnosticServiceCapabilitiesImpl();
		return ciM_DiskDriveDiagnosticServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCHBADiagnosticServiceCapabilities createCIM_FCHBADiagnosticServiceCapabilities() {
		CIM_FCHBADiagnosticServiceCapabilitiesImpl ciM_FCHBADiagnosticServiceCapabilities = new CIM_FCHBADiagnosticServiceCapabilitiesImpl();
		return ciM_FCHBADiagnosticServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSDomainIdentity createCIM_FSDomainIdentity() {
		CIM_FSDomainIdentityImpl ciM_FSDomainIdentity = new CIM_FSDomainIdentityImpl();
		return ciM_FSDomainIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaAppliesToElement createCIM_FSQuotaAppliesToElement() {
		CIM_FSQuotaAppliesToElementImpl ciM_FSQuotaAppliesToElement = new CIM_FSQuotaAppliesToElementImpl();
		return ciM_FSQuotaAppliesToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaAppliesToPrincipal createCIM_FSQuotaAppliesToPrincipal() {
		CIM_FSQuotaAppliesToPrincipalImpl ciM_FSQuotaAppliesToPrincipal = new CIM_FSQuotaAppliesToPrincipalImpl();
		return ciM_FSQuotaAppliesToPrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaCapabilities createCIM_FSQuotaCapabilities() {
		CIM_FSQuotaCapabilitiesImpl ciM_FSQuotaCapabilities = new CIM_FSQuotaCapabilitiesImpl();
		return ciM_FSQuotaCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaReportRecord createCIM_FSQuotaReportRecord() {
		CIM_FSQuotaReportRecordImpl ciM_FSQuotaReportRecord = new CIM_FSQuotaReportRecordImpl();
		return ciM_FSQuotaReportRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileExportCapabilities createCIM_FileExportCapabilities() {
		CIM_FileExportCapabilitiesImpl ciM_FileExportCapabilities = new CIM_FileExportCapabilitiesImpl();
		return ciM_FileExportCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileServerCapabilities createCIM_FileServerCapabilities() {
		CIM_FileServerCapabilitiesImpl ciM_FileServerCapabilities = new CIM_FileServerCapabilitiesImpl();
		return ciM_FileServerCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileServerConfigurationCapabilities createCIM_FileServerConfigurationCapabilities() {
		CIM_FileServerConfigurationCapabilitiesImpl ciM_FileServerConfigurationCapabilities = new CIM_FileServerConfigurationCapabilitiesImpl();
		return ciM_FileServerConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemConfigurationCapabilities createCIM_FileSystemConfigurationCapabilities() {
		CIM_FileSystemConfigurationCapabilitiesImpl ciM_FileSystemConfigurationCapabilities = new CIM_FileSystemConfigurationCapabilitiesImpl();
		return ciM_FileSystemConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemSettingData createCIM_FileSystemSettingData() {
		CIM_FileSystemSettingDataImpl ciM_FileSystemSettingData = new CIM_FileSystemSettingDataImpl();
		return ciM_FileSystemSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemStatisticsCapabilities createCIM_FileSystemStatisticsCapabilities() {
		CIM_FileSystemStatisticsCapabilitiesImpl ciM_FileSystemStatisticsCapabilities = new CIM_FileSystemStatisticsCapabilitiesImpl();
		return ciM_FileSystemStatisticsCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemStatisticsManifestCollection createCIM_FileSystemStatisticsManifestCollection() {
		CIM_FileSystemStatisticsManifestCollectionImpl ciM_FileSystemStatisticsManifestCollection = new CIM_FileSystemStatisticsManifestCollectionImpl();
		return ciM_FileSystemStatisticsManifestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocallyAccessibleFileSystemCapabilities createCIM_LocallyAccessibleFileSystemCapabilities() {
		CIM_LocallyAccessibleFileSystemCapabilitiesImpl ciM_LocallyAccessibleFileSystemCapabilities = new CIM_LocallyAccessibleFileSystemCapabilitiesImpl();
		return ciM_LocallyAccessibleFileSystemCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocallyAccessibleFileSystemSetting createCIM_LocallyAccessibleFileSystemSetting() {
		CIM_LocallyAccessibleFileSystemSettingImpl ciM_LocallyAccessibleFileSystemSetting = new CIM_LocallyAccessibleFileSystemSettingImpl();
		return ciM_LocallyAccessibleFileSystemSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogEntry createCIM_LogEntry() {
		CIM_LogEntryImpl ciM_LogEntry = new CIM_LogEntryImpl();
		return ciM_LogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogRecord createCIM_LogRecord() {
		CIM_LogRecordImpl ciM_LogRecord = new CIM_LogRecordImpl();
		return ciM_LogRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogToLog createCIM_LogToLog() {
		CIM_LogToLogImpl ciM_LogToLog = new CIM_LogToLogImpl();
		return ciM_LogToLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalFile createCIM_LogicalFile() {
		CIM_LogicalFileImpl ciM_LogicalFile = new CIM_LogicalFileImpl();
		return ciM_LogicalFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperatingSystemCapabilities createCIM_OperatingSystemCapabilities() {
		CIM_OperatingSystemCapabilitiesImpl ciM_OperatingSystemCapabilities = new CIM_OperatingSystemCapabilitiesImpl();
		return ciM_OperatingSystemCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PlatformWatchdogServiceCapabilities createCIM_PlatformWatchdogServiceCapabilities() {
		CIM_PlatformWatchdogServiceCapabilitiesImpl ciM_PlatformWatchdogServiceCapabilities = new CIM_PlatformWatchdogServiceCapabilitiesImpl();
		return ciM_PlatformWatchdogServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RecordAppliesToElement createCIM_RecordAppliesToElement() {
		CIM_RecordAppliesToElementImpl ciM_RecordAppliesToElement = new CIM_RecordAppliesToElementImpl();
		return ciM_RecordAppliesToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RecordLogCapabilities createCIM_RecordLogCapabilities() {
		CIM_RecordLogCapabilitiesImpl ciM_RecordLogCapabilities = new CIM_RecordLogCapabilitiesImpl();
		return ciM_RecordLogCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ResourceAllocationFromPool createCIM_ResourceAllocationFromPool() {
		CIM_ResourceAllocationFromPoolImpl ciM_ResourceAllocationFromPool = new CIM_ResourceAllocationFromPoolImpl();
		return ciM_ResourceAllocationFromPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingAssociatedToCapabilities createCIM_SettingAssociatedToCapabilities() {
		CIM_SettingAssociatedToCapabilitiesImpl ciM_SettingAssociatedToCapabilities = new CIM_SettingAssociatedToCapabilitiesImpl();
		return ciM_SettingAssociatedToCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SymbolicLink createCIM_SymbolicLink() {
		CIM_SymbolicLinkImpl ciM_SymbolicLink = new CIM_SymbolicLinkImpl();
		return ciM_SymbolicLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TimeZone createCIM_TimeZone() {
		CIM_TimeZoneImpl ciM_TimeZone = new CIM_TimeZoneImpl();
		return ciM_TimeZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixFile createCIM_UnixFile() {
		CIM_UnixFileImpl ciM_UnixFile = new CIM_UnixFileImpl();
		return ciM_UnixFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemSettingDataComponent createCIM_VirtualSystemSettingDataComponent() {
		CIM_VirtualSystemSettingDataComponentImpl ciM_VirtualSystemSettingDataComponent = new CIM_VirtualSystemSettingDataComponentImpl();
		return ciM_VirtualSystemSettingDataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccessControlInformation createCIM_AccessControlInformation() {
		CIM_AccessControlInformationImpl ciM_AccessControlInformation = new CIM_AccessControlInformationImpl();
		return ciM_AccessControlInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccountManagementCapabilities createCIM_AccountManagementCapabilities() {
		CIM_AccountManagementCapabilitiesImpl ciM_AccountManagementCapabilities = new CIM_AccountManagementCapabilitiesImpl();
		return ciM_AccountManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssignedIdentity createCIM_AssignedIdentity() {
		CIM_AssignedIdentityImpl ciM_AssignedIdentity = new CIM_AssignedIdentityImpl();
		return ciM_AssignedIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthenticationRequirement createCIM_AuthenticationRequirement() {
		CIM_AuthenticationRequirementImpl ciM_AuthenticationRequirement = new CIM_AuthenticationRequirementImpl();
		return ciM_AuthenticationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthenticationTarget createCIM_AuthenticationTarget() {
		CIM_AuthenticationTargetImpl ciM_AuthenticationTarget = new CIM_AuthenticationTargetImpl();
		return ciM_AuthenticationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizationSubject createCIM_AuthorizationSubject() {
		CIM_AuthorizationSubjectImpl ciM_AuthorizationSubject = new CIM_AuthorizationSubjectImpl();
		return ciM_AuthorizationSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizationTarget createCIM_AuthorizationTarget() {
		CIM_AuthorizationTargetImpl ciM_AuthorizationTarget = new CIM_AuthorizationTargetImpl();
		return ciM_AuthorizationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizedPrivilege createCIM_AuthorizedPrivilege() {
		CIM_AuthorizedPrivilegeImpl ciM_AuthorizedPrivilege = new CIM_AuthorizedPrivilegeImpl();
		return ciM_AuthorizedPrivilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizedSubject createCIM_AuthorizedSubject() {
		CIM_AuthorizedSubjectImpl ciM_AuthorizedSubject = new CIM_AuthorizedSubjectImpl();
		return ciM_AuthorizedSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizedTarget createCIM_AuthorizedTarget() {
		CIM_AuthorizedTargetImpl ciM_AuthorizedTarget = new CIM_AuthorizedTargetImpl();
		return ciM_AuthorizedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectionInOrganization createCIM_CollectionInOrganization() {
		CIM_CollectionInOrganizationImpl ciM_CollectionInOrganization = new CIM_CollectionInOrganizationImpl();
		return ciM_CollectionInOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CredentialManagementCapabilities createCIM_CredentialManagementCapabilities() {
		CIM_CredentialManagementCapabilitiesImpl ciM_CredentialManagementCapabilities = new CIM_CredentialManagementCapabilitiesImpl();
		return ciM_CredentialManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CredentialStore createCIM_CredentialStore() {
		CIM_CredentialStoreImpl ciM_CredentialStore = new CIM_CredentialStoreImpl();
		return ciM_CredentialStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementAsUser createCIM_ElementAsUser() {
		CIM_ElementAsUserImpl ciM_ElementAsUser = new CIM_ElementAsUserImpl();
		return ciM_ElementAsUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementSecuritySensitivity createCIM_ElementSecuritySensitivity() {
		CIM_ElementSecuritySensitivityImpl ciM_ElementSecuritySensitivity = new CIM_ElementSecuritySensitivityImpl();
		return ciM_ElementSecuritySensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GatewayPathID createCIM_GatewayPathID() {
		CIM_GatewayPathIDImpl ciM_GatewayPathID = new CIM_GatewayPathIDImpl();
		return ciM_GatewayPathID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Group createCIM_Group() {
		CIM_GroupImpl ciM_Group = new CIM_GroupImpl();
		return ciM_Group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPNetworkIdentity createCIM_IPNetworkIdentity() {
		CIM_IPNetworkIdentityImpl ciM_IPNetworkIdentity = new CIM_IPNetworkIdentityImpl();
		return ciM_IPNetworkIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Keystore createCIM_Keystore() {
		CIM_KeystoreImpl ciM_Keystore = new CIM_KeystoreImpl();
		return ciM_Keystore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemberPrincipal createCIM_MemberPrincipal() {
		CIM_MemberPrincipalImpl ciM_MemberPrincipal = new CIM_MemberPrincipalImpl();
		return ciM_MemberPrincipal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MoreGroupInfo createCIM_MoreGroupInfo() {
		CIM_MoreGroupInfoImpl ciM_MoreGroupInfo = new CIM_MoreGroupInfoImpl();
		return ciM_MoreGroupInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OrgStructure createCIM_OrgStructure() {
		CIM_OrgStructureImpl ciM_OrgStructure = new CIM_OrgStructureImpl();
		return ciM_OrgStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OrgUnit createCIM_OrgUnit() {
		CIM_OrgUnitImpl ciM_OrgUnit = new CIM_OrgUnitImpl();
		return ciM_OrgUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Organization createCIM_Organization() {
		CIM_OrganizationImpl ciM_Organization = new CIM_OrganizationImpl();
		return ciM_Organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrivilegeManagementCapabilities createCIM_PrivilegeManagementCapabilities() {
		CIM_PrivilegeManagementCapabilitiesImpl ciM_PrivilegeManagementCapabilities = new CIM_PrivilegeManagementCapabilitiesImpl();
		return ciM_PrivilegeManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PublicKeyCertificate createCIM_PublicKeyCertificate() {
		CIM_PublicKeyCertificateImpl ciM_PublicKeyCertificate = new CIM_PublicKeyCertificateImpl();
		return ciM_PublicKeyCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Role createCIM_Role() {
		CIM_RoleImpl ciM_Role = new CIM_RoleImpl();
		return ciM_Role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoleBasedManagementCapabilities createCIM_RoleBasedManagementCapabilities() {
		CIM_RoleBasedManagementCapabilitiesImpl ciM_RoleBasedManagementCapabilities = new CIM_RoleBasedManagementCapabilitiesImpl();
		return ciM_RoleBasedManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoleLimitedToTarget createCIM_RoleLimitedToTarget() {
		CIM_RoleLimitedToTargetImpl ciM_RoleLimitedToTarget = new CIM_RoleLimitedToTargetImpl();
		return ciM_RoleLimitedToTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UserContact createCIM_UserContact() {
		CIM_UserContactImpl ciM_UserContact = new CIM_UserContactImpl();
		return ciM_UserContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UsersCredential createCIM_UsersCredential() {
		CIM_UsersCredentialImpl ciM_UsersCredential = new CIM_UsersCredentialImpl();
		return ciM_UsersCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_X509CRL createCIM_X509CRL() {
		CIM_X509CRLImpl ciM_X509CRL = new CIM_X509CRLImpl();
		return ciM_X509CRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_X509Certificate createCIM_X509Certificate() {
		CIM_X509CertificateImpl ciM_X509Certificate = new CIM_X509CertificateImpl();
		return ciM_X509Certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstalledProduct createCIM_InstalledProduct() {
		CIM_InstalledProductImpl ciM_InstalledProduct = new CIM_InstalledProductImpl();
		return ciM_InstalledProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstalledProductImage createCIM_InstalledProductImage() {
		CIM_InstalledProductImageImpl ciM_InstalledProductImage = new CIM_InstalledProductImageImpl();
		return ciM_InstalledProductImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeConnectionStats createCIM_J2eeConnectionStats() {
		CIM_J2eeConnectionStatsImpl ciM_J2eeConnectionStats = new CIM_J2eeConnectionStatsImpl();
		return ciM_J2eeConnectionStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeEntityBeanStats createCIM_J2eeEntityBeanStats() {
		CIM_J2eeEntityBeanStatsImpl ciM_J2eeEntityBeanStats = new CIM_J2eeEntityBeanStatsImpl();
		return ciM_J2eeEntityBeanStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJCAStats createCIM_J2eeJCAStats() {
		CIM_J2eeJCAStatsImpl ciM_J2eeJCAStats = new CIM_J2eeJCAStatsImpl();
		return ciM_J2eeJCAStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCStats createCIM_J2eeJDBCStats() {
		CIM_J2eeJDBCStatsImpl ciM_J2eeJDBCStats = new CIM_J2eeJDBCStatsImpl();
		return ciM_J2eeJDBCStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSConnectionStats createCIM_J2eeJMSConnectionStats() {
		CIM_J2eeJMSConnectionStatsImpl ciM_J2eeJMSConnectionStats = new CIM_J2eeJMSConnectionStatsImpl();
		return ciM_J2eeJMSConnectionStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSProducerStats createCIM_J2eeJMSProducerStats() {
		CIM_J2eeJMSProducerStatsImpl ciM_J2eeJMSProducerStats = new CIM_J2eeJMSProducerStatsImpl();
		return ciM_J2eeJMSProducerStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSSessionStats createCIM_J2eeJMSSessionStats() {
		CIM_J2eeJMSSessionStatsImpl ciM_J2eeJMSSessionStats = new CIM_J2eeJMSSessionStatsImpl();
		return ciM_J2eeJMSSessionStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSStats createCIM_J2eeJMSStats() {
		CIM_J2eeJMSStatsImpl ciM_J2eeJMSStats = new CIM_J2eeJMSStatsImpl();
		return ciM_J2eeJMSStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJTAStats createCIM_J2eeJTAStats() {
		CIM_J2eeJTAStatsImpl ciM_J2eeJTAStats = new CIM_J2eeJTAStatsImpl();
		return ciM_J2eeJTAStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJVMStats createCIM_J2eeJVMStats() {
		CIM_J2eeJVMStatsImpl ciM_J2eeJVMStats = new CIM_J2eeJVMStatsImpl();
		return ciM_J2eeJVMStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJavaMailStats createCIM_J2eeJavaMailStats() {
		CIM_J2eeJavaMailStatsImpl ciM_J2eeJavaMailStats = new CIM_J2eeJavaMailStatsImpl();
		return ciM_J2eeJavaMailStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeMessageDrivenBeanStats createCIM_J2eeMessageDrivenBeanStats() {
		CIM_J2eeMessageDrivenBeanStatsImpl ciM_J2eeMessageDrivenBeanStats = new CIM_J2eeMessageDrivenBeanStatsImpl();
		return ciM_J2eeMessageDrivenBeanStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeServletStats createCIM_J2eeServletStats() {
		CIM_J2eeServletStatsImpl ciM_J2eeServletStats = new CIM_J2eeServletStatsImpl();
		return ciM_J2eeServletStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeStatefulSessionBeanStats createCIM_J2eeStatefulSessionBeanStats() {
		CIM_J2eeStatefulSessionBeanStatsImpl ciM_J2eeStatefulSessionBeanStats = new CIM_J2eeStatefulSessionBeanStatsImpl();
		return ciM_J2eeStatefulSessionBeanStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeStatelessSessionBeanStats createCIM_J2eeStatelessSessionBeanStats() {
		CIM_J2eeStatelessSessionBeanStatsImpl ciM_J2eeStatelessSessionBeanStats = new CIM_J2eeStatelessSessionBeanStatsImpl();
		return ciM_J2eeStatelessSessionBeanStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElement createCIM_SoftwareElement() {
		CIM_SoftwareElementImpl ciM_SoftwareElement = new CIM_SoftwareElementImpl();
		return ciM_SoftwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElementComponent createCIM_SoftwareElementComponent() {
		CIM_SoftwareElementComponentImpl ciM_SoftwareElementComponent = new CIM_SoftwareElementComponentImpl();
		return ciM_SoftwareElementComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareFeature createCIM_SoftwareFeature() {
		CIM_SoftwareFeatureImpl ciM_SoftwareFeature = new CIM_SoftwareFeatureImpl();
		return ciM_SoftwareFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareFeatureComponent createCIM_SoftwareFeatureComponent() {
		CIM_SoftwareFeatureComponentImpl ciM_SoftwareFeatureComponent = new CIM_SoftwareFeatureComponentImpl();
		return ciM_SoftwareFeatureComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareFeatureSoftwareElements createCIM_SoftwareFeatureSoftwareElements() {
		CIM_SoftwareFeatureSoftwareElementsImpl ciM_SoftwareFeatureSoftwareElements = new CIM_SoftwareFeatureSoftwareElementsImpl();
		return ciM_SoftwareFeatureSoftwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoBIOSElement createCIM_VideoBIOSElement() {
		CIM_VideoBIOSElementImpl ciM_VideoBIOSElement = new CIM_VideoBIOSElementImpl();
		return ciM_VideoBIOSElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoBIOSFeature createCIM_VideoBIOSFeature() {
		CIM_VideoBIOSFeatureImpl ciM_VideoBIOSFeature = new CIM_VideoBIOSFeatureImpl();
		return ciM_VideoBIOSFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoBIOSFeatureVideoBIOSElements createCIM_VideoBIOSFeatureVideoBIOSElements() {
		CIM_VideoBIOSFeatureVideoBIOSElementsImpl ciM_VideoBIOSFeatureVideoBIOSElements = new CIM_VideoBIOSFeatureVideoBIOSElementsImpl();
		return ciM_VideoBIOSFeatureVideoBIOSElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ActsAsSpare createCIM_ActsAsSpare() {
		CIM_ActsAsSpareImpl ciM_ActsAsSpare = new CIM_ActsAsSpareImpl();
		return ciM_ActsAsSpare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocationCapabilities createCIM_AllocationCapabilities() {
		CIM_AllocationCapabilitiesImpl ciM_AllocationCapabilities = new CIM_AllocationCapabilitiesImpl();
		return ciM_AllocationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectedCollections createCIM_CollectedCollections() {
		CIM_CollectedCollectionsImpl ciM_CollectedCollections = new CIM_CollectedCollectionsImpl();
		return ciM_CollectedCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectedMSEs createCIM_CollectedMSEs() {
		CIM_CollectedMSEsImpl ciM_CollectedMSEs = new CIM_CollectedMSEsImpl();
		return ciM_CollectedMSEs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectionConfiguration createCIM_CollectionConfiguration() {
		CIM_CollectionConfigurationImpl ciM_CollectionConfiguration = new CIM_CollectionConfigurationImpl();
		return ciM_CollectionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectionSetting createCIM_CollectionSetting() {
		CIM_CollectionSettingImpl ciM_CollectionSetting = new CIM_CollectionSettingImpl();
		return ciM_CollectionSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConcreteDependency createCIM_ConcreteDependency() {
		CIM_ConcreteDependencyImpl ciM_ConcreteDependency = new CIM_ConcreteDependencyImpl();
		return ciM_ConcreteDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConcreteIdentity createCIM_ConcreteIdentity() {
		CIM_ConcreteIdentityImpl ciM_ConcreteIdentity = new CIM_ConcreteIdentityImpl();
		return ciM_ConcreteIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ContainedLocation createCIM_ContainedLocation() {
		CIM_ContainedLocationImpl ciM_ContainedLocation = new CIM_ContainedLocationImpl();
		return ciM_ContainedLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementAllocatedFromPool createCIM_ElementAllocatedFromPool() {
		CIM_ElementAllocatedFromPoolImpl ciM_ElementAllocatedFromPool = new CIM_ElementAllocatedFromPoolImpl();
		return ciM_ElementAllocatedFromPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementLocation createCIM_ElementLocation() {
		CIM_ElementLocationImpl ciM_ElementLocation = new CIM_ElementLocationImpl();
		return ciM_ElementLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementProfile createCIM_ElementProfile() {
		CIM_ElementProfileImpl ciM_ElementProfile = new CIM_ElementProfileImpl();
		return ciM_ElementProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementSetting createCIM_ElementSetting() {
		CIM_ElementSettingImpl ciM_ElementSetting = new CIM_ElementSettingImpl();
		return ciM_ElementSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementSoftwareIdentity createCIM_ElementSoftwareIdentity() {
		CIM_ElementSoftwareIdentityImpl ciM_ElementSoftwareIdentity = new CIM_ElementSoftwareIdentityImpl();
		return ciM_ElementSoftwareIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EthernetPortAllocationSettingData createCIM_EthernetPortAllocationSettingData() {
		CIM_EthernetPortAllocationSettingDataImpl ciM_EthernetPortAllocationSettingData = new CIM_EthernetPortAllocationSettingDataImpl();
		return ciM_EthernetPortAllocationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExtraCapacityGroup createCIM_ExtraCapacityGroup() {
		CIM_ExtraCapacityGroupImpl ciM_ExtraCapacityGroup = new CIM_ExtraCapacityGroupImpl();
		return ciM_ExtraCapacityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalElementLocation createCIM_PhysicalElementLocation() {
		CIM_PhysicalElementLocationImpl ciM_PhysicalElementLocation = new CIM_PhysicalElementLocationImpl();
		return ciM_PhysicalElementLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProcessorAllocationSettingData createCIM_ProcessorAllocationSettingData() {
		CIM_ProcessorAllocationSettingDataImpl ciM_ProcessorAllocationSettingData = new CIM_ProcessorAllocationSettingDataImpl();
		return ciM_ProcessorAllocationSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductSoftwareComponent createCIM_ProductSoftwareComponent() {
		CIM_ProductSoftwareComponentImpl ciM_ProductSoftwareComponent = new CIM_ProductSoftwareComponentImpl();
		return ciM_ProductSoftwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RedundancyComponent createCIM_RedundancyComponent() {
		CIM_RedundancyComponentImpl ciM_RedundancyComponent = new CIM_RedundancyComponentImpl();
		return ciM_RedundancyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RedundancySet createCIM_RedundancySet() {
		CIM_RedundancySetImpl ciM_RedundancySet = new CIM_RedundancySetImpl();
		return ciM_RedundancySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ScopedSetting createCIM_ScopedSetting() {
		CIM_ScopedSettingImpl ciM_ScopedSetting = new CIM_ScopedSettingImpl();
		return ciM_ScopedSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticsCollection createCIM_StatisticsCollection() {
		CIM_StatisticsCollectionImpl ciM_StatisticsCollection = new CIM_StatisticsCollectionImpl();
		return ciM_StatisticsCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageRedundancySet createCIM_StorageRedundancySet() {
		CIM_StorageRedundancySetImpl ciM_StorageRedundancySet = new CIM_StorageRedundancySetImpl();
		return ciM_StorageRedundancySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocatedFromStoragePoolView createCIM_AllocatedFromStoragePoolView() {
		CIM_AllocatedFromStoragePoolViewImpl ciM_AllocatedFromStoragePoolView = new CIM_AllocatedFromStoragePoolViewImpl();
		return ciM_AllocatedFromStoragePoolView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocatedFromStoragePoolViewView createCIM_AllocatedFromStoragePoolViewView() {
		CIM_AllocatedFromStoragePoolViewViewImpl ciM_AllocatedFromStoragePoolViewView = new CIM_AllocatedFromStoragePoolViewViewImpl();
		return ciM_AllocatedFromStoragePoolViewView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedBlockStatisticsManifestCollection createCIM_AssociatedBlockStatisticsManifestCollection() {
		CIM_AssociatedBlockStatisticsManifestCollectionImpl ciM_AssociatedBlockStatisticsManifestCollection = new CIM_AssociatedBlockStatisticsManifestCollectionImpl();
		return ciM_AssociatedBlockStatisticsManifestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedElementTier createCIM_AssociatedElementTier() {
		CIM_AssociatedElementTierImpl ciM_AssociatedElementTier = new CIM_AssociatedElementTierImpl();
		return ciM_AssociatedElementTier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AsymmetricAccessibility createCIM_AsymmetricAccessibility() {
		CIM_AsymmetricAccessibilityImpl ciM_AsymmetricAccessibility = new CIM_AsymmetricAccessibilityImpl();
		return ciM_AsymmetricAccessibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BasedOnView createCIM_BasedOnView() {
		CIM_BasedOnViewImpl ciM_BasedOnView = new CIM_BasedOnViewImpl();
		return ciM_BasedOnView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BlockStatisticsCapabilities createCIM_BlockStatisticsCapabilities() {
		CIM_BlockStatisticsCapabilitiesImpl ciM_BlockStatisticsCapabilities = new CIM_BlockStatisticsCapabilitiesImpl();
		return ciM_BlockStatisticsCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceMaskingGroup createCIM_DeviceMaskingGroup() {
		CIM_DeviceMaskingGroupImpl ciM_DeviceMaskingGroup = new CIM_DeviceMaskingGroupImpl();
		return ciM_DeviceMaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCPortCapabilities createCIM_FCPortCapabilities() {
		CIM_FCPortCapabilitiesImpl ciM_FCPortCapabilities = new CIM_FCPortCapabilitiesImpl();
		return ciM_FCPortCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GroupInDiskGroup createCIM_GroupInDiskGroup() {
		CIM_GroupInDiskGroupImpl ciM_GroupInDiskGroup = new CIM_GroupInDiskGroupImpl();
		return ciM_GroupInDiskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GroupMaskingMappingCapabilities createCIM_GroupMaskingMappingCapabilities() {
		CIM_GroupMaskingMappingCapabilitiesImpl ciM_GroupMaskingMappingCapabilities = new CIM_GroupMaskingMappingCapabilitiesImpl();
		return ciM_GroupMaskingMappingCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InitiatorMaskingGroup createCIM_InitiatorMaskingGroup() {
		CIM_InitiatorMaskingGroupImpl ciM_InitiatorMaskingGroup = new CIM_InitiatorMaskingGroupImpl();
		return ciM_InitiatorMaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperationalPowerStatisticsCapabilities createCIM_OperationalPowerStatisticsCapabilities() {
		CIM_OperationalPowerStatisticsCapabilitiesImpl ciM_OperationalPowerStatisticsCapabilities = new CIM_OperationalPowerStatisticsCapabilitiesImpl();
		return ciM_OperationalPowerStatisticsCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintInputTray createCIM_PrintInputTray() {
		CIM_PrintInputTrayImpl ciM_PrintInputTray = new CIM_PrintInputTrayImpl();
		return ciM_PrintInputTray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintInterpreter createCIM_PrintInterpreter() {
		CIM_PrintInterpreterImpl ciM_PrintInterpreter = new CIM_PrintInterpreterImpl();
		return ciM_PrintInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintJob createCIM_PrintJob() {
		CIM_PrintJobImpl ciM_PrintJob = new CIM_PrintJobImpl();
		return ciM_PrintJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintMarker createCIM_PrintMarker() {
		CIM_PrintMarkerImpl ciM_PrintMarker = new CIM_PrintMarkerImpl();
		return ciM_PrintMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintSupply createCIM_PrintSupply() {
		CIM_PrintSupplyImpl ciM_PrintSupply = new CIM_PrintSupplyImpl();
		return ciM_PrintSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueryStatisticsCollection createCIM_QueryStatisticsCollection() {
		CIM_QueryStatisticsCollectionImpl ciM_QueryStatisticsCollection = new CIM_QueryStatisticsCollectionImpl();
		return ciM_QueryStatisticsCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemoteReplicationCollection createCIM_RemoteReplicationCollection() {
		CIM_RemoteReplicationCollectionImpl ciM_RemoteReplicationCollection = new CIM_RemoteReplicationCollectionImpl();
		return ciM_RemoteReplicationCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StoragePoolDiagnosticServiceCapabilities createCIM_StoragePoolDiagnosticServiceCapabilities() {
		CIM_StoragePoolDiagnosticServiceCapabilitiesImpl ciM_StoragePoolDiagnosticServiceCapabilities = new CIM_StoragePoolDiagnosticServiceCapabilitiesImpl();
		return ciM_StoragePoolDiagnosticServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageSettingsAssociatedToCapabilities createCIM_StorageSettingsAssociatedToCapabilities() {
		CIM_StorageSettingsAssociatedToCapabilitiesImpl ciM_StorageSettingsAssociatedToCapabilities = new CIM_StorageSettingsAssociatedToCapabilitiesImpl();
		return ciM_StorageSettingsAssociatedToCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageSettingsGeneratedFromCapabilities createCIM_StorageSettingsGeneratedFromCapabilities() {
		CIM_StorageSettingsGeneratedFromCapabilitiesImpl ciM_StorageSettingsGeneratedFromCapabilities = new CIM_StorageSettingsGeneratedFromCapabilitiesImpl();
		return ciM_StorageSettingsGeneratedFromCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Zone createCIM_Zone() {
		CIM_ZoneImpl ciM_Zone = new CIM_ZoneImpl();
		return ciM_Zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ZoneSet createCIM_ZoneSet() {
		CIM_ZoneSetImpl ciM_ZoneSet = new CIM_ZoneSetImpl();
		return ciM_ZoneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassCreation createCIM_ClassCreation() {
		CIM_ClassCreationImpl ciM_ClassCreation = new CIM_ClassCreationImpl();
		return ciM_ClassCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassDeletion createCIM_ClassDeletion() {
		CIM_ClassDeletionImpl ciM_ClassDeletion = new CIM_ClassDeletionImpl();
		return ciM_ClassDeletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FormattedIndicationSubscription createCIM_FormattedIndicationSubscription() {
		CIM_FormattedIndicationSubscriptionImpl ciM_FormattedIndicationSubscription = new CIM_FormattedIndicationSubscriptionImpl();
		return ciM_FormattedIndicationSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ContainedProposal createCIM_ContainedProposal() {
		CIM_ContainedProposalImpl ciM_ContainedProposal = new CIM_ContainedProposalImpl();
		return ciM_ContainedProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IKEAction createCIM_IKEAction() {
		CIM_IKEActionImpl ciM_IKEAction = new CIM_IKEActionImpl();
		return ciM_IKEAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IKEProposal createCIM_IKEProposal() {
		CIM_IKEProposalImpl ciM_IKEProposal = new CIM_IKEProposalImpl();
		return ciM_IKEProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecAction createCIM_IPsecAction() {
		CIM_IPsecActionImpl ciM_IPsecAction = new CIM_IPsecActionImpl();
		return ciM_IPsecAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecProposal createCIM_IPsecProposal() {
		CIM_IPsecProposalImpl ciM_IPsecProposal = new CIM_IPsecProposalImpl();
		return ciM_IPsecProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecTransportAction createCIM_IPsecTransportAction() {
		CIM_IPsecTransportActionImpl ciM_IPsecTransportAction = new CIM_IPsecTransportActionImpl();
		return ciM_IPsecTransportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecTunnelAction createCIM_IPsecTunnelAction() {
		CIM_IPsecTunnelActionImpl ciM_IPsecTunnelAction = new CIM_IPsecTunnelActionImpl();
		return ciM_IPsecTunnelAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PreconfiguredSAAction createCIM_PreconfiguredSAAction() {
		CIM_PreconfiguredSAActionImpl ciM_PreconfiguredSAAction = new CIM_PreconfiguredSAActionImpl();
		return ciM_PreconfiguredSAAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PreconfiguredTransportAction createCIM_PreconfiguredTransportAction() {
		CIM_PreconfiguredTransportActionImpl ciM_PreconfiguredTransportAction = new CIM_PreconfiguredTransportActionImpl();
		return ciM_PreconfiguredTransportAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PreconfiguredTunnelAction createCIM_PreconfiguredTunnelAction() {
		CIM_PreconfiguredTunnelActionImpl ciM_PreconfiguredTunnelAction = new CIM_PreconfiguredTunnelActionImpl();
		return ciM_PreconfiguredTunnelAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SARule createCIM_SARule() {
		CIM_SARuleImpl ciM_SARule = new CIM_SARuleImpl();
		return ciM_SARule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TransformOfPreconfiguredAction createCIM_TransformOfPreconfiguredAction() {
		CIM_TransformOfPreconfiguredActionImpl ciM_TransformOfPreconfiguredAction = new CIM_TransformOfPreconfiguredActionImpl();
		return ciM_TransformOfPreconfiguredAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementConformsToProfile createCIM_ElementConformsToProfile() {
		CIM_ElementConformsToProfileImpl ciM_ElementConformsToProfile = new CIM_ElementConformsToProfileImpl();
		return ciM_ElementConformsToProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReferencedProfile createCIM_ReferencedProfile() {
		CIM_ReferencedProfileImpl ciM_ReferencedProfile = new CIM_ReferencedProfileImpl();
		return ciM_ReferencedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SubProfileRequiresProfile createCIM_SubProfileRequiresProfile() {
		CIM_SubProfileRequiresProfileImpl ciM_SubProfileRequiresProfile = new CIM_SubProfileRequiresProfileImpl();
		return ciM_SubProfileRequiresProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WBEMProtocolServiceCapabilities createCIM_WBEMProtocolServiceCapabilities() {
		CIM_WBEMProtocolServiceCapabilitiesImpl ciM_WBEMProtocolServiceCapabilities = new CIM_WBEMProtocolServiceCapabilitiesImpl();
		return ciM_WBEMProtocolServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WSManagementCapabilities createCIM_WSManagementCapabilities() {
		CIM_WSManagementCapabilitiesImpl ciM_WSManagementCapabilities = new CIM_WSManagementCapabilitiesImpl();
		return ciM_WSManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalElementUnitOfWorkDef createCIM_LogicalElementUnitOfWorkDef() {
		CIM_LogicalElementUnitOfWorkDefImpl ciM_LogicalElementUnitOfWorkDef = new CIM_LogicalElementUnitOfWorkDefImpl();
		return ciM_LogicalElementUnitOfWorkDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StartedUoW createCIM_StartedUoW() {
		CIM_StartedUoWImpl ciM_StartedUoW = new CIM_StartedUoWImpl();
		return ciM_StartedUoW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SubUoWDef createCIM_SubUoWDef() {
		CIM_SubUoWDefImpl ciM_SubUoWDef = new CIM_SubUoWDefImpl();
		return ciM_SubUoWDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AHTransform createCIM_AHTransform() {
		CIM_AHTransformImpl ciM_AHTransform = new CIM_AHTransformImpl();
		return ciM_AHTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPPeerUsesRouteMap createCIM_BGPPeerUsesRouteMap() {
		CIM_BGPPeerUsesRouteMapImpl ciM_BGPPeerUsesRouteMap = new CIM_BGPPeerUsesRouteMapImpl();
		return ciM_BGPPeerUsesRouteMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPRouteMapsInRoutingPolicy createCIM_BGPRouteMapsInRoutingPolicy() {
		CIM_BGPRouteMapsInRoutingPolicyImpl ciM_BGPRouteMapsInRoutingPolicy = new CIM_BGPRouteMapsInRoutingPolicyImpl();
		return ciM_BGPRouteMapsInRoutingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BoundedPrioritySchedulingElement createCIM_BoundedPrioritySchedulingElement() {
		CIM_BoundedPrioritySchedulingElementImpl ciM_BoundedPrioritySchedulingElement = new CIM_BoundedPrioritySchedulingElementImpl();
		return ciM_BoundedPrioritySchedulingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CLPCapabilities createCIM_CLPCapabilities() {
		CIM_CLPCapabilitiesImpl ciM_CLPCapabilities = new CIM_CLPCapabilitiesImpl();
		return ciM_CLPCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ESPTransform createCIM_ESPTransform() {
		CIM_ESPTransformImpl ciM_ESPTransform = new CIM_ESPTransformImpl();
		return ciM_ESPTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EntriesInFilterList createCIM_EntriesInFilterList() {
		CIM_EntriesInFilterListImpl ciM_EntriesInFilterList = new CIM_EntriesInFilterListImpl();
		return ciM_EntriesInFilterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterEntry createCIM_FilterEntry() {
		CIM_FilterEntryImpl ciM_FilterEntry = new CIM_FilterEntryImpl();
		return ciM_FilterEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilteredBGPAttributes createCIM_FilteredBGPAttributes() {
		CIM_FilteredBGPAttributesImpl ciM_FilteredBGPAttributes = new CIM_FilteredBGPAttributesImpl();
		return ciM_FilteredBGPAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPCOMPTransform createCIM_IPCOMPTransform() {
		CIM_IPCOMPTransformImpl ciM_IPCOMPTransform = new CIM_IPCOMPTransformImpl();
		return ciM_IPCOMPTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPSubnet createCIM_IPSubnet() {
		CIM_IPSubnetImpl ciM_IPSubnet = new CIM_IPSubnetImpl();
		return ciM_IPSubnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPXNetwork createCIM_IPXNetwork() {
		CIM_IPXNetworkImpl ciM_IPXNetwork = new CIM_IPXNetworkImpl();
		return ciM_IPXNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LANSegment createCIM_LANSegment() {
		CIM_LANSegmentImpl ciM_LANSegment = new CIM_LANSegmentImpl();
		return ciM_LANSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ListsInRoutingPolicy createCIM_ListsInRoutingPolicy() {
		CIM_ListsInRoutingPolicyImpl ciM_ListsInRoutingPolicy = new CIM_ListsInRoutingPolicyImpl();
		return ciM_ListsInRoutingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaRedirectionCapabilities createCIM_MediaRedirectionCapabilities() {
		CIM_MediaRedirectionCapabilitiesImpl ciM_MediaRedirectionCapabilities = new CIM_MediaRedirectionCapabilitiesImpl();
		return ciM_MediaRedirectionCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPolicyRule createCIM_NetworkPolicyRule() {
		CIM_NetworkPolicyRuleImpl ciM_NetworkPolicyRule = new CIM_NetworkPolicyRuleImpl();
		return ciM_NetworkPolicyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VRFRoute createCIM_VRFRoute() {
		CIM_VRFRouteImpl ciM_VRFRoute = new CIM_VRFRouteImpl();
		return ciM_VRFRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CardInSlot createCIM_CardInSlot() {
		CIM_CardInSlotImpl ciM_CardInSlot = new CIM_CardInSlotImpl();
		return ciM_CardInSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CardOnCard createCIM_CardOnCard() {
		CIM_CardOnCardImpl ciM_CardOnCard = new CIM_CardOnCardImpl();
		return ciM_CardOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Chassis createCIM_Chassis() {
		CIM_ChassisImpl ciM_Chassis = new CIM_ChassisImpl();
		return ciM_Chassis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ChassisInRack createCIM_ChassisInRack() {
		CIM_ChassisInRackImpl ciM_ChassisInRack = new CIM_ChassisInRackImpl();
		return ciM_ChassisInRack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConnectorOnPackage createCIM_ConnectorOnPackage() {
		CIM_ConnectorOnPackageImpl ciM_ConnectorOnPackage = new CIM_ConnectorOnPackageImpl();
		return ciM_ConnectorOnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Docked createCIM_Docked() {
		CIM_DockedImpl ciM_Docked = new CIM_DockedImpl();
		return ciM_Docked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HomeForMedia createCIM_HomeForMedia() {
		CIM_HomeForMediaImpl ciM_HomeForMedia = new CIM_HomeForMediaImpl();
		return ciM_HomeForMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Magazine createCIM_Magazine() {
		CIM_MagazineImpl ciM_Magazine = new CIM_MagazineImpl();
		return ciM_Magazine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryOnCard createCIM_MemoryOnCard() {
		CIM_MemoryOnCardImpl ciM_MemoryOnCard = new CIM_MemoryOnCardImpl();
		return ciM_MemoryOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryWithMedia createCIM_MemoryWithMedia() {
		CIM_MemoryWithMediaImpl ciM_MemoryWithMedia = new CIM_MemoryWithMediaImpl();
		return ciM_MemoryWithMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageInChassis createCIM_PackageInChassis() {
		CIM_PackageInChassisImpl ciM_PackageInChassis = new CIM_PackageInChassisImpl();
		return ciM_PackageInChassis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalMediaInLocation createCIM_PhysicalMediaInLocation() {
		CIM_PhysicalMediaInLocationImpl ciM_PhysicalMediaInLocation = new CIM_PhysicalMediaInLocationImpl();
		return ciM_PhysicalMediaInLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccountAuthentication createCIM_AccountAuthentication() {
		CIM_AccountAuthenticationImpl ciM_AccountAuthentication = new CIM_AccountAuthenticationImpl();
		return ciM_AccountAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthenticationRule createCIM_AuthenticationRule() {
		CIM_AuthenticationRuleImpl ciM_AuthenticationRule = new CIM_AuthenticationRuleImpl();
		return ciM_AuthenticationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementInPolicyRoleCollection createCIM_ElementInPolicyRoleCollection() {
		CIM_ElementInPolicyRoleCollectionImpl ciM_ElementInPolicyRoleCollection = new CIM_ElementInPolicyRoleCollectionImpl();
		return ciM_ElementInPolicyRoleCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterOfPacketCondition createCIM_FilterOfPacketCondition() {
		CIM_FilterOfPacketConditionImpl ciM_FilterOfPacketCondition = new CIM_FilterOfPacketConditionImpl();
		return ciM_FilterOfPacketCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyConditionInPolicyCondition createCIM_PolicyConditionInPolicyCondition() {
		CIM_PolicyConditionInPolicyConditionImpl ciM_PolicyConditionInPolicyCondition = new CIM_PolicyConditionInPolicyConditionImpl();
		return ciM_PolicyConditionInPolicyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyConditionInPolicyRule createCIM_PolicyConditionInPolicyRule() {
		CIM_PolicyConditionInPolicyRuleImpl ciM_PolicyConditionInPolicyRule = new CIM_PolicyConditionInPolicyRuleImpl();
		return ciM_PolicyConditionInPolicyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AffectedJobElement createCIM_AffectedJobElement() {
		CIM_AffectedJobElementImpl ciM_AffectedJobElement = new CIM_AffectedJobElementImpl();
		return ciM_AffectedJobElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedFileSystemStatisticsManifestCollection createCIM_AssociatedFileSystemStatisticsManifestCollection() {
		CIM_AssociatedFileSystemStatisticsManifestCollectionImpl ciM_AssociatedFileSystemStatisticsManifestCollection = new CIM_AssociatedFileSystemStatisticsManifestCollectionImpl();
		return ciM_AssociatedFileSystemStatisticsManifestCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CorrespondingSettingDataRecord createCIM_CorrespondingSettingDataRecord() {
		CIM_CorrespondingSettingDataRecordImpl ciM_CorrespondingSettingDataRecord = new CIM_CorrespondingSettingDataRecordImpl();
		return ciM_CorrespondingSettingDataRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CorrespondingSettingsRecord createCIM_CorrespondingSettingsRecord() {
		CIM_CorrespondingSettingsRecordImpl ciM_CorrespondingSettingsRecord = new CIM_CorrespondingSettingsRecordImpl();
		return ciM_CorrespondingSettingsRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DataFile createCIM_DataFile() {
		CIM_DataFileImpl ciM_DataFile = new CIM_DataFileImpl();
		return ciM_DataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceFile createCIM_DeviceFile() {
		CIM_DeviceFileImpl ciM_DeviceFile = new CIM_DeviceFileImpl();
		return ciM_DeviceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticCompletionRecord createCIM_DiagnosticCompletionRecord() {
		CIM_DiagnosticCompletionRecordImpl ciM_DiagnosticCompletionRecord = new CIM_DiagnosticCompletionRecordImpl();
		return ciM_DiagnosticCompletionRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Directory createCIM_Directory() {
		CIM_DirectoryImpl ciM_Directory = new CIM_DirectoryImpl();
		return ciM_Directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DirectoryContainsFile createCIM_DirectoryContainsFile() {
		CIM_DirectoryContainsFileImpl ciM_DirectoryContainsFile = new CIM_DirectoryContainsFileImpl();
		return ciM_DirectoryContainsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FIFOPipeFile createCIM_FIFOPipeFile() {
		CIM_FIFOPipeFileImpl ciM_FIFOPipeFile = new CIM_FIFOPipeFileImpl();
		return ciM_FIFOPipeFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaAppliesToTree createCIM_FSQuotaAppliesToTree() {
		CIM_FSQuotaAppliesToTreeImpl ciM_FSQuotaAppliesToTree = new CIM_FSQuotaAppliesToTreeImpl();
		return ciM_FSQuotaAppliesToTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileIdentity createCIM_FileIdentity() {
		CIM_FileIdentityImpl ciM_FileIdentity = new CIM_FileIdentityImpl();
		return ciM_FileIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OwningJobElement createCIM_OwningJobElement() {
		CIM_OwningJobElementImpl ciM_OwningJobElement = new CIM_OwningJobElementImpl();
		return ciM_OwningJobElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixDeviceFile createCIM_UnixDeviceFile() {
		CIM_UnixDeviceFileImpl ciM_UnixDeviceFile = new CIM_UnixDeviceFileImpl();
		return ciM_UnixDeviceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixDirectory createCIM_UnixDirectory() {
		CIM_UnixDirectoryImpl ciM_UnixDirectory = new CIM_UnixDirectoryImpl();
		return ciM_UnixDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CertificateManagementCapabilities createCIM_CertificateManagementCapabilities() {
		CIM_CertificateManagementCapabilitiesImpl ciM_CertificateManagementCapabilities = new CIM_CertificateManagementCapabilitiesImpl();
		return ciM_CertificateManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MoreOrgUnitInfo createCIM_MoreOrgUnitInfo() {
		CIM_MoreOrgUnitInfoImpl ciM_MoreOrgUnitInfo = new CIM_MoreOrgUnitInfoImpl();
		return ciM_MoreOrgUnitInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MoreOrganizationInfo createCIM_MoreOrganizationInfo() {
		CIM_MoreOrganizationInfoImpl ciM_MoreOrganizationInfo = new CIM_MoreOrganizationInfoImpl();
		return ciM_MoreOrganizationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MoreRoleInfo createCIM_MoreRoleInfo() {
		CIM_MoreRoleInfoImpl ciM_MoreRoleInfo = new CIM_MoreRoleInfoImpl();
		return ciM_MoreRoleInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Person createCIM_Person() {
		CIM_PersonImpl ciM_Person = new CIM_PersonImpl();
		return ciM_Person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PublicPrivateKeyPair createCIM_PublicPrivateKeyPair() {
		CIM_PublicPrivateKeyPairImpl ciM_PublicPrivateKeyPair = new CIM_PublicPrivateKeyPairImpl();
		return ciM_PublicPrivateKeyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AGPSoftwareFeature createCIM_AGPSoftwareFeature() {
		CIM_AGPSoftwareFeatureImpl ciM_AGPSoftwareFeature = new CIM_AGPSoftwareFeatureImpl();
		return ciM_AGPSoftwareFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSElement createCIM_BIOSElement() {
		CIM_BIOSElementImpl ciM_BIOSElement = new CIM_BIOSElementImpl();
		return ciM_BIOSElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSFeature createCIM_BIOSFeature() {
		CIM_BIOSFeatureImpl ciM_BIOSFeature = new CIM_BIOSFeatureImpl();
		return ciM_BIOSFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSFeatureBIOSElements createCIM_BIOSFeatureBIOSElements() {
		CIM_BIOSFeatureBIOSElementsImpl ciM_BIOSFeatureBIOSElements = new CIM_BIOSFeatureBIOSElementsImpl();
		return ciM_BIOSFeatureBIOSElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectedSoftwareElements createCIM_CollectedSoftwareElements() {
		CIM_CollectedSoftwareElementsImpl ciM_CollectedSoftwareElements = new CIM_CollectedSoftwareElementsImpl();
		return ciM_CollectedSoftwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectedSoftwareFeatures createCIM_CollectedSoftwareFeatures() {
		CIM_CollectedSoftwareFeaturesImpl ciM_CollectedSoftwareFeatures = new CIM_CollectedSoftwareFeaturesImpl();
		return ciM_CollectedSoftwareFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FRUIncludesSoftwareFeature createCIM_FRUIncludesSoftwareFeature() {
		CIM_FRUIncludesSoftwareFeatureImpl ciM_FRUIncludesSoftwareFeature = new CIM_FRUIncludesSoftwareFeatureImpl();
		return ciM_FRUIncludesSoftwareFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeConnectionPoolStats createCIM_J2eeConnectionPoolStats() {
		CIM_J2eeConnectionPoolStatsImpl ciM_J2eeConnectionPoolStats = new CIM_J2eeConnectionPoolStatsImpl();
		return ciM_J2eeConnectionPoolStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJCAConnectionPools createCIM_J2eeJCAConnectionPools() {
		CIM_J2eeJCAConnectionPoolsImpl ciM_J2eeJCAConnectionPools = new CIM_J2eeJCAConnectionPoolsImpl();
		return ciM_J2eeJCAConnectionPools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJCANonpooledConnections createCIM_J2eeJCANonpooledConnections() {
		CIM_J2eeJCANonpooledConnectionsImpl ciM_J2eeJCANonpooledConnections = new CIM_J2eeJCANonpooledConnectionsImpl();
		return ciM_J2eeJCANonpooledConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCConnectionPools createCIM_J2eeJDBCConnectionPools() {
		CIM_J2eeJDBCConnectionPoolsImpl ciM_J2eeJDBCConnectionPools = new CIM_J2eeJDBCConnectionPoolsImpl();
		return ciM_J2eeJDBCConnectionPools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCNonpooledConnections createCIM_J2eeJDBCNonpooledConnections() {
		CIM_J2eeJDBCNonpooledConnectionsImpl ciM_J2eeJDBCNonpooledConnections = new CIM_J2eeJDBCNonpooledConnectionsImpl();
		return ciM_J2eeJDBCNonpooledConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSConnectionSessions createCIM_J2eeJMSConnectionSessions() {
		CIM_J2eeJMSConnectionSessionsImpl ciM_J2eeJMSConnectionSessions = new CIM_J2eeJMSConnectionSessionsImpl();
		return ciM_J2eeJMSConnectionSessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSConsumerStats createCIM_J2eeJMSConsumerStats() {
		CIM_J2eeJMSConsumerStatsImpl ciM_J2eeJMSConsumerStats = new CIM_J2eeJMSConsumerStatsImpl();
		return ciM_J2eeJMSConsumerStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSSessionConsumers createCIM_J2eeJMSSessionConsumers() {
		CIM_J2eeJMSSessionConsumersImpl ciM_J2eeJMSSessionConsumers = new CIM_J2eeJMSSessionConsumersImpl();
		return ciM_J2eeJMSSessionConsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSSessionProducers createCIM_J2eeJMSSessionProducers() {
		CIM_J2eeJMSSessionProducersImpl ciM_J2eeJMSSessionProducers = new CIM_J2eeJMSSessionProducersImpl();
		return ciM_J2eeJMSSessionProducers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSStatConnections createCIM_J2eeJMSStatConnections() {
		CIM_J2eeJMSStatConnectionsImpl ciM_J2eeJMSStatConnections = new CIM_J2eeJMSStatConnectionsImpl();
		return ciM_J2eeJMSStatConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductSoftwareFeatures createCIM_ProductSoftwareFeatures() {
		CIM_ProductSoftwareFeaturesImpl ciM_ProductSoftwareFeatures = new CIM_ProductSoftwareFeaturesImpl();
		return ciM_ProductSoftwareFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConcreteJob createCIM_ConcreteJob() {
		CIM_ConcreteJobImpl ciM_ConcreteJob = new CIM_ConcreteJobImpl();
		return ciM_ConcreteJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DefaultSetting createCIM_DefaultSetting() {
		CIM_DefaultSettingImpl ciM_DefaultSetting = new CIM_DefaultSettingImpl();
		return ciM_DefaultSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IsSpare createCIM_IsSpare() {
		CIM_IsSpareImpl ciM_IsSpare = new CIM_IsSpareImpl();
		return ciM_IsSpare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalComputerSystemView createCIM_PhysicalComputerSystemView() {
		CIM_PhysicalComputerSystemViewImpl ciM_PhysicalComputerSystemView = new CIM_PhysicalComputerSystemViewImpl();
		return ciM_PhysicalComputerSystemView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceAccessURI createCIM_ServiceAccessURI() {
		CIM_ServiceAccessURIImpl ciM_ServiceAccessURI = new CIM_ServiceAccessURIImpl();
		return ciM_ServiceAccessURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceAffectsElement createCIM_ServiceAffectsElement() {
		CIM_ServiceAffectsElementImpl ciM_ServiceAffectsElement = new CIM_ServiceAffectsElementImpl();
		return ciM_ServiceAffectsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceAffectsElementWithQuota createCIM_ServiceAffectsElementWithQuota() {
		CIM_ServiceAffectsElementWithQuotaImpl ciM_ServiceAffectsElementWithQuota = new CIM_ServiceAffectsElementWithQuotaImpl();
		return ciM_ServiceAffectsElementWithQuota;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceAvailableToElement createCIM_ServiceAvailableToElement() {
		CIM_ServiceAvailableToElementImpl ciM_ServiceAvailableToElement = new CIM_ServiceAvailableToElementImpl();
		return ciM_ServiceAvailableToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceComponent createCIM_ServiceComponent() {
		CIM_ServiceComponentImpl ciM_ServiceComponent = new CIM_ServiceComponentImpl();
		return ciM_ServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceSAPDependency createCIM_ServiceSAPDependency() {
		CIM_ServiceSAPDependencyImpl ciM_ServiceSAPDependency = new CIM_ServiceSAPDependencyImpl();
		return ciM_ServiceSAPDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceStatistics createCIM_ServiceStatistics() {
		CIM_ServiceStatisticsImpl ciM_ServiceStatistics = new CIM_ServiceStatisticsImpl();
		return ciM_ServiceStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareInstallationService createCIM_SoftwareInstallationService() {
		CIM_SoftwareInstallationServiceImpl ciM_SoftwareInstallationService = new CIM_SoftwareInstallationServiceImpl();
		return ciM_SoftwareInstallationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TimeService createCIM_TimeService() {
		CIM_TimeServiceImpl ciM_TimeService = new CIM_TimeServiceImpl();
		return ciM_TimeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CommonDatabase createCIM_CommonDatabase() {
		CIM_CommonDatabaseImpl ciM_CommonDatabase = new CIM_CommonDatabaseImpl();
		return ciM_CommonDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseAdministrator createCIM_DatabaseAdministrator() {
		CIM_DatabaseAdministratorImpl ciM_DatabaseAdministrator = new CIM_DatabaseAdministratorImpl();
		return ciM_DatabaseAdministrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseControlFile createCIM_DatabaseControlFile() {
		CIM_DatabaseControlFileImpl ciM_DatabaseControlFile = new CIM_DatabaseControlFileImpl();
		return ciM_DatabaseControlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseFile createCIM_DatabaseFile() {
		CIM_DatabaseFileImpl ciM_DatabaseFile = new CIM_DatabaseFileImpl();
		return ciM_DatabaseFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseService createCIM_DatabaseService() {
		CIM_DatabaseServiceImpl ciM_DatabaseService = new CIM_DatabaseServiceImpl();
		return ciM_DatabaseService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceAvailableToDatabase createCIM_ServiceAvailableToDatabase() {
		CIM_ServiceAvailableToDatabaseImpl ciM_ServiceAvailableToDatabase = new CIM_ServiceAvailableToDatabaseImpl();
		return ciM_ServiceAvailableToDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConfigurationReportingService createCIM_ConfigurationReportingService() {
		CIM_ConfigurationReportingServiceImpl ciM_ConfigurationReportingService = new CIM_ConfigurationReportingServiceImpl();
		return ciM_ConfigurationReportingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibreProtocolService createCIM_FibreProtocolService() {
		CIM_FibreProtocolServiceImpl ciM_FibreProtocolService = new CIM_FibreProtocolServiceImpl();
		return ciM_FibreProtocolService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemReplicationServiceCapabilities createCIM_FileSystemReplicationServiceCapabilities() {
		CIM_FileSystemReplicationServiceCapabilitiesImpl ciM_FileSystemReplicationServiceCapabilities = new CIM_FileSystemReplicationServiceCapabilitiesImpl();
		return ciM_FileSystemReplicationServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HardwareThread createCIM_HardwareThread() {
		CIM_HardwareThreadImpl ciM_HardwareThread = new CIM_HardwareThreadImpl();
		return ciM_HardwareThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IBSubnetManager createCIM_IBSubnetManager() {
		CIM_IBSubnetManagerImpl ciM_IBSubnetManager = new CIM_IBSubnetManagerImpl();
		return ciM_IBSubnetManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PowerUtilizationManagementService createCIM_PowerUtilizationManagementService() {
		CIM_PowerUtilizationManagementServiceImpl ciM_PowerUtilizationManagementService = new CIM_PowerUtilizationManagementServiceImpl();
		return ciM_PowerUtilizationManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintJobFile createCIM_PrintJobFile() {
		CIM_PrintJobFileImpl ciM_PrintJobFile = new CIM_PrintJobFileImpl();
		return ciM_PrintJobFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintSAP createCIM_PrintSAP() {
		CIM_PrintSAPImpl ciM_PrintSAP = new CIM_PrintSAPImpl();
		return ciM_PrintSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintService createCIM_PrintService() {
		CIM_PrintServiceImpl ciM_PrintService = new CIM_PrintServiceImpl();
		return ciM_PrintService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProcessorCore createCIM_ProcessorCore() {
		CIM_ProcessorCoreImpl ciM_ProcessorCore = new CIM_ProcessorCoreImpl();
		return ciM_ProcessorCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplicationEntity createCIM_ReplicationEntity() {
		CIM_ReplicationEntityImpl ciM_ReplicationEntity = new CIM_ReplicationEntityImpl();
		return ciM_ReplicationEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StatisticsService createCIM_StatisticsService() {
		CIM_StatisticsServiceImpl ciM_StatisticsService = new CIM_StatisticsServiceImpl();
		return ciM_StatisticsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ZoneService createCIM_ZoneService() {
		CIM_ZoneServiceImpl ciM_ZoneService = new CIM_ZoneServiceImpl();
		return ciM_ZoneService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicationService createCIM_IndicationService() {
		CIM_IndicationServiceImpl ciM_IndicationService = new CIM_IndicationServiceImpl();
		return ciM_IndicationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ContainedTransform createCIM_ContainedTransform() {
		CIM_ContainedTransformImpl ciM_ContainedTransform = new CIM_ContainedTransformImpl();
		return ciM_ContainedTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IKERule createCIM_IKERule() {
		CIM_IKERuleImpl ciM_IKERule = new CIM_IKERuleImpl();
		return ciM_IKERule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecRule createCIM_IPsecRule() {
		CIM_IPsecRuleImpl ciM_IPsecRule = new CIM_IPsecRuleImpl();
		return ciM_IPsecRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PacketConditionInSARule createCIM_PacketConditionInSARule() {
		CIM_PacketConditionInSARuleImpl ciM_PacketConditionInSARule = new CIM_PacketConditionInSARuleImpl();
		return ciM_PacketConditionInSARule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CIMXMLCapabilities createCIM_CIMXMLCapabilities() {
		CIM_CIMXMLCapabilitiesImpl ciM_CIMXMLCapabilities = new CIM_CIMXMLCapabilitiesImpl();
		return ciM_CIMXMLCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ObjectManagerCommunicationMechanism createCIM_ObjectManagerCommunicationMechanism() {
		CIM_ObjectManagerCommunicationMechanismImpl ciM_ObjectManagerCommunicationMechanism = new CIM_ObjectManagerCommunicationMechanismImpl();
		return ciM_ObjectManagerCommunicationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WBEMServer createCIM_WBEMServer() {
		CIM_WBEMServerImpl ciM_WBEMServer = new CIM_WBEMServerImpl();
		return ciM_WBEMServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MetricService createCIM_MetricService() {
		CIM_MetricServiceImpl ciM_MetricService = new CIM_MetricServiceImpl();
		return ciM_MetricService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPIPRoute createCIM_BGPIPRoute() {
		CIM_BGPIPRouteImpl ciM_BGPIPRoute = new CIM_BGPIPRouteImpl();
		return ciM_BGPIPRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConditioningService createCIM_ConditioningService() {
		CIM_ConditioningServiceImpl ciM_ConditioningService = new CIM_ConditioningServiceImpl();
		return ciM_ConditioningService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DropThresholdCalculationService createCIM_DropThresholdCalculationService() {
		CIM_DropThresholdCalculationServiceImpl ciM_DropThresholdCalculationService = new CIM_DropThresholdCalculationServiceImpl();
		return ciM_DropThresholdCalculationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DropperService createCIM_DropperService() {
		CIM_DropperServiceImpl ciM_DropperService = new CIM_DropperServiceImpl();
		return ciM_DropperService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HeadTailDropper createCIM_HeadTailDropper() {
		CIM_HeadTailDropperImpl ciM_HeadTailDropper = new CIM_HeadTailDropperImpl();
		return ciM_HeadTailDropper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPNetworkConnection createCIM_IPNetworkConnection() {
		CIM_IPNetworkConnectionImpl ciM_IPNetworkConnection = new CIM_IPNetworkConnectionImpl();
		return ciM_IPNetworkConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_KVMRedirectionSAP createCIM_KVMRedirectionSAP() {
		CIM_KVMRedirectionSAPImpl ciM_KVMRedirectionSAP = new CIM_KVMRedirectionSAPImpl();
		return ciM_KVMRedirectionSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MarkerService createCIM_MarkerService() {
		CIM_MarkerServiceImpl ciM_MarkerService = new CIM_MarkerServiceImpl();
		return ciM_MarkerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaRedirectionSAP createCIM_MediaRedirectionSAP() {
		CIM_MediaRedirectionSAPImpl ciM_MediaRedirectionSAP = new CIM_MediaRedirectionSAPImpl();
		return ciM_MediaRedirectionSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MeterService createCIM_MeterService() {
		CIM_MeterServiceImpl ciM_MeterService = new CIM_MeterServiceImpl();
		return ciM_MeterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPipe createCIM_NetworkPipe() {
		CIM_NetworkPipeImpl ciM_NetworkPipe = new CIM_NetworkPipeImpl();
		return ciM_NetworkPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPipeComposition createCIM_NetworkPipeComposition() {
		CIM_NetworkPipeCompositionImpl ciM_NetworkPipeComposition = new CIM_NetworkPipeCompositionImpl();
		return ciM_NetworkPipeComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPolicyService createCIM_NetworkPolicyService() {
		CIM_NetworkPolicyServiceImpl ciM_NetworkPolicyService = new CIM_NetworkPolicyServiceImpl();
		return ciM_NetworkPolicyService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NextService createCIM_NextService() {
		CIM_NextServiceImpl ciM_NextService = new CIM_NextServiceImpl();
		return ciM_NextService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NextServiceAfterMeter createCIM_NextServiceAfterMeter() {
		CIM_NextServiceAfterMeterImpl ciM_NextServiceAfterMeter = new CIM_NextServiceAfterMeterImpl();
		return ciM_NextServiceAfterMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PacketSchedulingService createCIM_PacketSchedulingService() {
		CIM_PacketSchedulingServiceImpl ciM_PacketSchedulingService = new CIM_PacketSchedulingServiceImpl();
		return ciM_PacketSchedulingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PreambleMarkerService createCIM_PreambleMarkerService() {
		CIM_PreambleMarkerServiceImpl ciM_PreambleMarkerService = new CIM_PreambleMarkerServiceImpl();
		return ciM_PreambleMarkerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Priority8021QMarkerService createCIM_Priority8021QMarkerService() {
		CIM_Priority8021QMarkerServiceImpl ciM_Priority8021QMarkerService = new CIM_Priority8021QMarkerServiceImpl();
		return ciM_Priority8021QMarkerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QoSService createCIM_QoSService() {
		CIM_QoSServiceImpl ciM_QoSService = new CIM_QoSServiceImpl();
		return ciM_QoSService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QoSSubService createCIM_QoSSubService() {
		CIM_QoSSubServiceImpl ciM_QoSSubService = new CIM_QoSSubServiceImpl();
		return ciM_QoSSubService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueuingService createCIM_QueuingService() {
		CIM_QueuingServiceImpl ciM_QueuingService = new CIM_QueuingServiceImpl();
		return ciM_QueuingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_REDDropperService createCIM_REDDropperService() {
		CIM_REDDropperServiceImpl ciM_REDDropperService = new CIM_REDDropperServiceImpl();
		return ciM_REDDropperService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RedirectionService createCIM_RedirectionService() {
		CIM_RedirectionServiceImpl ciM_RedirectionService = new CIM_RedirectionServiceImpl();
		return ciM_RedirectionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SNMPCommunityString createCIM_SNMPCommunityString() {
		CIM_SNMPCommunityStringImpl ciM_SNMPCommunityString = new CIM_SNMPCommunityStringImpl();
		return ciM_SNMPCommunityString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SNMPService createCIM_SNMPService() {
		CIM_SNMPServiceImpl ciM_SNMPService = new CIM_SNMPServiceImpl();
		return ciM_SNMPService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SchedulingServiceToSchedule createCIM_SchedulingServiceToSchedule() {
		CIM_SchedulingServiceToScheduleImpl ciM_SchedulingServiceToSchedule = new CIM_SchedulingServiceToScheduleImpl();
		return ciM_SchedulingServiceToSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TextRedirectionSAP createCIM_TextRedirectionSAP() {
		CIM_TextRedirectionSAPImpl ciM_TextRedirectionSAP = new CIM_TextRedirectionSAPImpl();
		return ciM_TextRedirectionSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TextRedirectionService createCIM_TextRedirectionService() {
		CIM_TextRedirectionServiceImpl ciM_TextRedirectionService = new CIM_TextRedirectionServiceImpl();
		return ciM_TextRedirectionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ToSMarkerService createCIM_ToSMarkerService() {
		CIM_ToSMarkerServiceImpl ciM_ToSMarkerService = new CIM_ToSMarkerServiceImpl();
		return ciM_ToSMarkerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TokenBucketMeterService createCIM_TokenBucketMeterService() {
		CIM_TokenBucketMeterServiceImpl ciM_TokenBucketMeterService = new CIM_TokenBucketMeterServiceImpl();
		return ciM_TokenBucketMeterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBRedirectionSAP createCIM_USBRedirectionSAP() {
		CIM_USBRedirectionSAPImpl ciM_USBRedirectionSAP = new CIM_USBRedirectionSAPImpl();
		return ciM_USBRedirectionSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VLAN createCIM_VLAN() {
		CIM_VLANImpl ciM_VLAN = new CIM_VLANImpl();
		return ciM_VLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WeightedREDDropperService createCIM_WeightedREDDropperService() {
		CIM_WeightedREDDropperServiceImpl ciM_WeightedREDDropperService = new CIM_WeightedREDDropperServiceImpl();
		return ciM_WeightedREDDropperService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSIConnection createCIM_iSCSIConnection() {
		CIM_iSCSIConnectionImpl ciM_iSCSIConnection = new CIM_iSCSIConnectionImpl();
		return ciM_iSCSIConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSISession createCIM_iSCSISession() {
		CIM_iSCSISessionImpl ciM_iSCSISession = new CIM_iSCSISessionImpl();
		return ciM_iSCSISession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyActionInPolicyAction createCIM_PolicyActionInPolicyAction() {
		CIM_PolicyActionInPolicyActionImpl ciM_PolicyActionInPolicyAction = new CIM_PolicyActionInPolicyActionImpl();
		return ciM_PolicyActionInPolicyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyActionInPolicyRule createCIM_PolicyActionInPolicyRule() {
		CIM_PolicyActionInPolicyRuleImpl ciM_PolicyActionInPolicyRule = new CIM_PolicyActionInPolicyRuleImpl();
		return ciM_PolicyActionInPolicyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedJobMethodResult createCIM_AssociatedJobMethodResult() {
		CIM_AssociatedJobMethodResultImpl ciM_AssociatedJobMethodResult = new CIM_AssociatedJobMethodResultImpl();
		return ciM_AssociatedJobMethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSService createCIM_BIOSService() {
		CIM_BIOSServiceImpl ciM_BIOSService = new CIM_BIOSServiceImpl();
		return ciM_BIOSService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BootConfigSetting createCIM_BootConfigSetting() {
		CIM_BootConfigSettingImpl ciM_BootConfigSetting = new CIM_BootConfigSettingImpl();
		return ciM_BootConfigSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BootSAP createCIM_BootSAP() {
		CIM_BootSAPImpl ciM_BootSAP = new CIM_BootSAPImpl();
		return ciM_BootSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClusteringSAP createCIM_ClusteringSAP() {
		CIM_ClusteringSAPImpl ciM_ClusteringSAP = new CIM_ClusteringSAPImpl();
		return ciM_ClusteringSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticTest createCIM_DiagnosticTest() {
		CIM_DiagnosticTestImpl ciM_DiagnosticTest = new CIM_DiagnosticTestImpl();
		return ciM_DiagnosticTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticTestInPackage createCIM_DiagnosticTestInPackage() {
		CIM_DiagnosticTestInPackageImpl ciM_DiagnosticTestInPackage = new CIM_DiagnosticTestInPackageImpl();
		return ciM_DiagnosticTestInPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskDriveDiagnosticTest createCIM_DiskDriveDiagnosticTest() {
		CIM_DiskDriveDiagnosticTestImpl ciM_DiskDriveDiagnosticTest = new CIM_DiskDriveDiagnosticTestImpl();
		return ciM_DiskDriveDiagnosticTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExportedFileShareCapabilities createCIM_ExportedFileShareCapabilities() {
		CIM_ExportedFileShareCapabilitiesImpl ciM_ExportedFileShareCapabilities = new CIM_ExportedFileShareCapabilitiesImpl();
		return ciM_ExportedFileShareCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCHBADiagnosticTest createCIM_FCHBADiagnosticTest() {
		CIM_FCHBADiagnosticTestImpl ciM_FCHBADiagnosticTest = new CIM_FCHBADiagnosticTestImpl();
		return ciM_FCHBADiagnosticTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystem createCIM_FileSystem() {
		CIM_FileSystemImpl ciM_FileSystem = new CIM_FileSystemImpl();
		return ciM_FileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemCapabilities createCIM_FileSystemCapabilities() {
		CIM_FileSystemCapabilitiesImpl ciM_FileSystemCapabilities = new CIM_FileSystemCapabilitiesImpl();
		return ciM_FileSystemCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemStatisticsService createCIM_FileSystemStatisticsService() {
		CIM_FileSystemStatisticsServiceImpl ciM_FileSystemStatisticsService = new CIM_FileSystemStatisticsServiceImpl();
		return ciM_FileSystemStatisticsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HelpService createCIM_HelpService() {
		CIM_HelpServiceImpl ciM_HelpService = new CIM_HelpServiceImpl();
		return ciM_HelpService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HelpServiceAvailableToFile createCIM_HelpServiceAvailableToFile() {
		CIM_HelpServiceAvailableToFileImpl ciM_HelpServiceAvailableToFile = new CIM_HelpServiceAvailableToFileImpl();
		return ciM_HelpServiceAvailableToFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_JobDestination createCIM_JobDestination() {
		CIM_JobDestinationImpl ciM_JobDestination = new CIM_JobDestinationImpl();
		return ciM_JobDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_JobDestinationJobs createCIM_JobDestinationJobs() {
		CIM_JobDestinationJobsImpl ciM_JobDestinationJobs = new CIM_JobDestinationJobsImpl();
		return ciM_JobDestinationJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_JobQueue createCIM_JobQueue() {
		CIM_JobQueueImpl ciM_JobQueue = new CIM_JobQueueImpl();
		return ciM_JobQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocalFileSystem createCIM_LocalFileSystem() {
		CIM_LocalFileSystemImpl ciM_LocalFileSystem = new CIM_LocalFileSystemImpl();
		return ciM_LocalFileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogManagesRecord createCIM_LogManagesRecord() {
		CIM_LogManagesRecordImpl ciM_LogManagesRecord = new CIM_LogManagesRecordImpl();
		return ciM_LogManagesRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MessageLog createCIM_MessageLog() {
		CIM_MessageLogImpl ciM_MessageLog = new CIM_MessageLogImpl();
		return ciM_MessageLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Mount createCIM_Mount() {
		CIM_MountImpl ciM_Mount = new CIM_MountImpl();
		return ciM_Mount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OOBAlertService createCIM_OOBAlertService() {
		CIM_OOBAlertServiceImpl ciM_OOBAlertService = new CIM_OOBAlertServiceImpl();
		return ciM_OOBAlertService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperatingSystem createCIM_OperatingSystem() {
		CIM_OperatingSystemImpl ciM_OperatingSystem = new CIM_OperatingSystemImpl();
		return ciM_OperatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PlatformWatchdogService createCIM_PlatformWatchdogService() {
		CIM_PlatformWatchdogServiceImpl ciM_PlatformWatchdogService = new CIM_PlatformWatchdogServiceImpl();
		return ciM_PlatformWatchdogService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Process createCIM_Process() {
		CIM_ProcessImpl ciM_Process = new CIM_ProcessImpl();
		return ciM_Process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProcessExecutable createCIM_ProcessExecutable() {
		CIM_ProcessExecutableImpl ciM_ProcessExecutable = new CIM_ProcessExecutableImpl();
		return ciM_ProcessExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProcessOfJob createCIM_ProcessOfJob() {
		CIM_ProcessOfJobImpl ciM_ProcessOfJob = new CIM_ProcessOfJobImpl();
		return ciM_ProcessOfJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RecordInLog createCIM_RecordInLog() {
		CIM_RecordInLogImpl ciM_RecordInLog = new CIM_RecordInLogImpl();
		return ciM_RecordInLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RecordLog createCIM_RecordLog() {
		CIM_RecordLogImpl ciM_RecordLog = new CIM_RecordLogImpl();
		return ciM_RecordLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemoteFileSystem createCIM_RemoteFileSystem() {
		CIM_RemoteFileSystemImpl ciM_RemoteFileSystem = new CIM_RemoteFileSystemImpl();
		return ciM_RemoteFileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceProcess createCIM_ServiceProcess() {
		CIM_ServiceProcessImpl ciM_ServiceProcess = new CIM_ServiceProcessImpl();
		return ciM_ServiceProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharedElement createCIM_SharedElement() {
		CIM_SharedElementImpl ciM_SharedElement = new CIM_SharedElementImpl();
		return ciM_SharedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Thread createCIM_Thread() {
		CIM_ThreadImpl ciM_Thread = new CIM_ThreadImpl();
		return ciM_Thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixLocalFileSystem createCIM_UnixLocalFileSystem() {
		CIM_UnixLocalFileSystemImpl ciM_UnixLocalFileSystem = new CIM_UnixLocalFileSystemImpl();
		return ciM_UnixLocalFileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixProcess createCIM_UnixProcess() {
		CIM_UnixProcessImpl ciM_UnixProcess = new CIM_UnixProcessImpl();
		return ciM_UnixProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixProcessStatistics createCIM_UnixProcessStatistics() {
		CIM_UnixProcessStatisticsImpl ciM_UnixProcessStatistics = new CIM_UnixProcessStatisticsImpl();
		return ciM_UnixProcessStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnixThread createCIM_UnixThread() {
		CIM_UnixThreadImpl ciM_UnixThread = new CIM_UnixThreadImpl();
		return ciM_UnixThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UseOfLog createCIM_UseOfLog() {
		CIM_UseOfLogImpl ciM_UseOfLog = new CIM_UseOfLogImpl();
		return ciM_UseOfLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UseOfMessageLog createCIM_UseOfMessageLog() {
		CIM_UseOfMessageLogImpl ciM_UseOfMessageLog = new CIM_UseOfMessageLogImpl();
		return ciM_UseOfMessageLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WakeUpService createCIM_WakeUpService() {
		CIM_WakeUpServiceImpl ciM_WakeUpService = new CIM_WakeUpServiceImpl();
		return ciM_WakeUpService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Account createCIM_Account() {
		CIM_AccountImpl ciM_Account = new CIM_AccountImpl();
		return ciM_Account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccountIdentity createCIM_AccountIdentity() {
		CIM_AccountIdentityImpl ciM_AccountIdentity = new CIM_AccountIdentityImpl();
		return ciM_AccountIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccountMapsToAccount createCIM_AccountMapsToAccount() {
		CIM_AccountMapsToAccountImpl ciM_AccountMapsToAccount = new CIM_AccountMapsToAccountImpl();
		return ciM_AccountMapsToAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CredentialManagementSAP createCIM_CredentialManagementSAP() {
		CIM_CredentialManagementSAPImpl ciM_CredentialManagementSAP = new CIM_CredentialManagementSAPImpl();
		return ciM_CredentialManagementSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MorePersonInfo createCIM_MorePersonInfo() {
		CIM_MorePersonInfoImpl ciM_MorePersonInfo = new CIM_MorePersonInfoImpl();
		return ciM_MorePersonInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SecurityServiceUsesAccount createCIM_SecurityServiceUsesAccount() {
		CIM_SecurityServiceUsesAccountImpl ciM_SecurityServiceUsesAccount = new CIM_SecurityServiceUsesAccountImpl();
		return ciM_SecurityServiceUsesAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UsersAccount createCIM_UsersAccount() {
		CIM_UsersAccountImpl ciM_UsersAccount = new CIM_UsersAccountImpl();
		return ciM_UsersAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticTestSoftware createCIM_DiagnosticTestSoftware() {
		CIM_DiagnosticTestSoftwareImpl ciM_DiagnosticTestSoftware = new CIM_DiagnosticTestSoftwareImpl();
		return ciM_DiagnosticTestSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeEntityBean createCIM_J2eeEntityBean() {
		CIM_J2eeEntityBeanImpl ciM_J2eeEntityBean = new CIM_J2eeEntityBeanImpl();
		return ciM_J2eeEntityBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJCAConnectionFactory createCIM_J2eeJCAConnectionFactory() {
		CIM_J2eeJCAConnectionFactoryImpl ciM_J2eeJCAConnectionFactory = new CIM_J2eeJCAConnectionFactoryImpl();
		return ciM_J2eeJCAConnectionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJCAManagedConnectionFactory createCIM_J2eeJCAManagedConnectionFactory() {
		CIM_J2eeJCAManagedConnectionFactoryImpl ciM_J2eeJCAManagedConnectionFactory = new CIM_J2eeJCAManagedConnectionFactoryImpl();
		return ciM_J2eeJCAManagedConnectionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCDataSource createCIM_J2eeJDBCDataSource() {
		CIM_J2eeJDBCDataSourceImpl ciM_J2eeJDBCDataSource = new CIM_J2eeJDBCDataSourceImpl();
		return ciM_J2eeJDBCDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCDriver createCIM_J2eeJDBCDriver() {
		CIM_J2eeJDBCDriverImpl ciM_J2eeJDBCDriver = new CIM_J2eeJDBCDriverImpl();
		return ciM_J2eeJDBCDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJVM createCIM_J2eeJVM() {
		CIM_J2eeJVMImpl ciM_J2eeJVM = new CIM_J2eeJVMImpl();
		return ciM_J2eeJVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeMessageDrivenBean createCIM_J2eeMessageDrivenBean() {
		CIM_J2eeMessageDrivenBeanImpl ciM_J2eeMessageDrivenBean = new CIM_J2eeMessageDrivenBeanImpl();
		return ciM_J2eeMessageDrivenBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeModuleUsesJVM createCIM_J2eeModuleUsesJVM() {
		CIM_J2eeModuleUsesJVMImpl ciM_J2eeModuleUsesJVM = new CIM_J2eeModuleUsesJVMImpl();
		return ciM_J2eeModuleUsesJVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeResourceAdapter createCIM_J2eeResourceAdapter() {
		CIM_J2eeResourceAdapterImpl ciM_J2eeResourceAdapter = new CIM_J2eeResourceAdapterImpl();
		return ciM_J2eeResourceAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeResourceAdapterModule createCIM_J2eeResourceAdapterModule() {
		CIM_J2eeResourceAdapterModuleImpl ciM_J2eeResourceAdapterModule = new CIM_J2eeResourceAdapterModuleImpl();
		return ciM_J2eeResourceAdapterModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeServlet createCIM_J2eeServlet() {
		CIM_J2eeServletImpl ciM_J2eeServlet = new CIM_J2eeServletImpl();
		return ciM_J2eeServlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeStatefulSessionBean createCIM_J2eeStatefulSessionBean() {
		CIM_J2eeStatefulSessionBeanImpl ciM_J2eeStatefulSessionBean = new CIM_J2eeStatefulSessionBeanImpl();
		return ciM_J2eeStatefulSessionBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeStatelessSessionBean createCIM_J2eeStatelessSessionBean() {
		CIM_J2eeStatelessSessionBeanImpl ciM_J2eeStatelessSessionBean = new CIM_J2eeStatelessSessionBeanImpl();
		return ciM_J2eeStatelessSessionBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeURLResource createCIM_J2eeURLResource() {
		CIM_J2eeURLResourceImpl ciM_J2eeURLResource = new CIM_J2eeURLResourceImpl();
		return ciM_J2eeURLResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeWebModule createCIM_J2eeWebModule() {
		CIM_J2eeWebModuleImpl ciM_J2eeWebModule = new CIM_J2eeWebModuleImpl();
		return ciM_J2eeWebModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperatingSystemSoftwareFeature createCIM_OperatingSystemSoftwareFeature() {
		CIM_OperatingSystemSoftwareFeatureImpl ciM_OperatingSystemSoftwareFeature = new CIM_OperatingSystemSoftwareFeatureImpl();
		return ciM_OperatingSystemSoftwareFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElementSAPImplementation createCIM_SoftwareElementSAPImplementation() {
		CIM_SoftwareElementSAPImplementationImpl ciM_SoftwareElementSAPImplementation = new CIM_SoftwareElementSAPImplementationImpl();
		return ciM_SoftwareElementSAPImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElementServiceImplementation createCIM_SoftwareElementServiceImplementation() {
		CIM_SoftwareElementServiceImplementationImpl ciM_SoftwareElementServiceImplementation = new CIM_SoftwareElementServiceImplementationImpl();
		return ciM_SoftwareElementServiceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareFeatureSAPImplementation createCIM_SoftwareFeatureSAPImplementation() {
		CIM_SoftwareFeatureSAPImplementationImpl ciM_SoftwareFeatureSAPImplementation = new CIM_SoftwareFeatureSAPImplementationImpl();
		return ciM_SoftwareFeatureSAPImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareFeatureServiceImplementation createCIM_SoftwareFeatureServiceImplementation() {
		CIM_SoftwareFeatureServiceImplementationImpl ciM_SoftwareFeatureServiceImplementation = new CIM_SoftwareFeatureServiceImplementationImpl();
		return ciM_SoftwareFeatureServiceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PowerManagementService createCIM_PowerManagementService() {
		CIM_PowerManagementServiceImpl ciM_PowerManagementService = new CIM_PowerManagementServiceImpl();
		return ciM_PowerManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProductServiceComponent createCIM_ProductServiceComponent() {
		CIM_ProductServiceComponentImpl ciM_ProductServiceComponent = new CIM_ProductServiceComponentImpl();
		return ciM_ProductServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolEndpoint createCIM_ProtocolEndpoint() {
		CIM_ProtocolEndpointImpl ciM_ProtocolEndpoint = new CIM_ProtocolEndpointImpl();
		return ciM_ProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProvidesServiceToElement createCIM_ProvidesServiceToElement() {
		CIM_ProvidesServiceToElementImpl ciM_ProvidesServiceToElement = new CIM_ProvidesServiceToElementImpl();
		return ciM_ProvidesServiceToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Realizes createCIM_Realizes() {
		CIM_RealizesImpl ciM_Realizes = new CIM_RealizesImpl();
		return ciM_Realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemoteServiceAccessPoint createCIM_RemoteServiceAccessPoint() {
		CIM_RemoteServiceAccessPointImpl ciM_RemoteServiceAccessPoint = new CIM_RemoteServiceAccessPointImpl();
		return ciM_RemoteServiceAccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ResourcePoolConfigurationService createCIM_ResourcePoolConfigurationService() {
		CIM_ResourcePoolConfigurationServiceImpl ciM_ResourcePoolConfigurationService = new CIM_ResourcePoolConfigurationServiceImpl();
		return ciM_ResourcePoolConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAPAvailableForElement createCIM_SAPAvailableForElement() {
		CIM_SAPAvailableForElementImpl ciM_SAPAvailableForElement = new CIM_SAPAvailableForElementImpl();
		return ciM_SAPAvailableForElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAPSAPDependency createCIM_SAPSAPDependency() {
		CIM_SAPSAPDependencyImpl ciM_SAPSAPDependency = new CIM_SAPSAPDependencyImpl();
		return ciM_SAPSAPDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAPStatistics createCIM_SAPStatistics() {
		CIM_SAPStatisticsImpl ciM_SAPStatistics = new CIM_SAPStatisticsImpl();
		return ciM_SAPStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceAccessBySAP createCIM_ServiceAccessBySAP() {
		CIM_ServiceAccessBySAPImpl ciM_ServiceAccessBySAP = new CIM_ServiceAccessBySAPImpl();
		return ciM_ServiceAccessBySAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceServiceDependency createCIM_ServiceServiceDependency() {
		CIM_ServiceServiceDependencyImpl ciM_ServiceServiceDependency = new CIM_ServiceServiceDependencyImpl();
		return ciM_ServiceServiceDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageExtent createCIM_StorageExtent() {
		CIM_StorageExtentImpl ciM_StorageExtent = new CIM_StorageExtentImpl();
		return ciM_StorageExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemComponent createCIM_SystemComponent() {
		CIM_SystemComponentImpl ciM_SystemComponent = new CIM_SystemComponentImpl();
		return ciM_SystemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemDevice createCIM_SystemDevice() {
		CIM_SystemDeviceImpl ciM_SystemDevice = new CIM_SystemDeviceImpl();
		return ciM_SystemDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemPackaging createCIM_SystemPackaging() {
		CIM_SystemPackagingImpl ciM_SystemPackaging = new CIM_SystemPackagingImpl();
		return ciM_SystemPackaging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemStatistics createCIM_SystemStatistics() {
		CIM_SystemStatisticsImpl ciM_SystemStatistics = new CIM_SystemStatisticsImpl();
		return ciM_SystemStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ViewOnSystem createCIM_ViewOnSystem() {
		CIM_ViewOnSystemImpl ciM_ViewOnSystem = new CIM_ViewOnSystemImpl();
		return ciM_ViewOnSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseSegment createCIM_DatabaseSegment() {
		CIM_DatabaseSegmentImpl ciM_DatabaseSegment = new CIM_DatabaseSegmentImpl();
		return ciM_DatabaseSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseStorageArea createCIM_DatabaseStorageArea() {
		CIM_DatabaseStorageAreaImpl ciM_DatabaseStorageArea = new CIM_DatabaseStorageAreaImpl();
		return ciM_DatabaseStorageArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AggregatePExtent createCIM_AggregatePExtent() {
		CIM_AggregatePExtentImpl ciM_AggregatePExtent = new CIM_AggregatePExtentImpl();
		return ciM_AggregatePExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AggregatePSExtent createCIM_AggregatePSExtent() {
		CIM_AggregatePSExtentImpl ciM_AggregatePSExtent = new CIM_AggregatePSExtentImpl();
		return ciM_AggregatePSExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AlarmDevice createCIM_AlarmDevice() {
		CIM_AlarmDeviceImpl ciM_AlarmDevice = new CIM_AlarmDeviceImpl();
		return ciM_AlarmDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedAlarm createCIM_AssociatedAlarm() {
		CIM_AssociatedAlarmImpl ciM_AssociatedAlarm = new CIM_AssociatedAlarmImpl();
		return ciM_AssociatedAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedResourcePool createCIM_AssociatedResourcePool() {
		CIM_AssociatedResourcePoolImpl ciM_AssociatedResourcePool = new CIM_AssociatedResourcePoolImpl();
		return ciM_AssociatedResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Battery createCIM_Battery() {
		CIM_BatteryImpl ciM_Battery = new CIM_BatteryImpl();
		return ciM_Battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BlockStatisticsService createCIM_BlockStatisticsService() {
		CIM_BlockStatisticsServiceImpl ciM_BlockStatisticsService = new CIM_BlockStatisticsServiceImpl();
		return ciM_BlockStatisticsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CompositeExtent createCIM_CompositeExtent() {
		CIM_CompositeExtentImpl ciM_CompositeExtent = new CIM_CompositeExtentImpl();
		return ciM_CompositeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CoolingDevice createCIM_CoolingDevice() {
		CIM_CoolingDeviceImpl ciM_CoolingDevice = new CIM_CoolingDeviceImpl();
		return ciM_CoolingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceConnection createCIM_DeviceConnection() {
		CIM_DeviceConnectionImpl ciM_DeviceConnection = new CIM_DeviceConnectionImpl();
		return ciM_DeviceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceIdentity createCIM_DeviceIdentity() {
		CIM_DeviceIdentityImpl ciM_DeviceIdentity = new CIM_DeviceIdentityImpl();
		return ciM_DeviceIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceSoftware createCIM_DeviceSoftware() {
		CIM_DeviceSoftwareImpl ciM_DeviceSoftware = new CIM_DeviceSoftwareImpl();
		return ciM_DeviceSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DisplayController createCIM_DisplayController() {
		CIM_DisplayControllerImpl ciM_DisplayController = new CIM_DisplayControllerImpl();
		return ciM_DisplayController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Door createCIM_Door() {
		CIM_DoorImpl ciM_Door = new CIM_DoorImpl();
		return ciM_Door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DoorAccessToDevice createCIM_DoorAccessToDevice() {
		CIM_DoorAccessToDeviceImpl ciM_DoorAccessToDevice = new CIM_DoorAccessToDeviceImpl();
		return ciM_DoorAccessToDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DoorAccessToPhysicalElement createCIM_DoorAccessToPhysicalElement() {
		CIM_DoorAccessToPhysicalElementImpl ciM_DoorAccessToPhysicalElement = new CIM_DoorAccessToPhysicalElementImpl();
		return ciM_DoorAccessToPhysicalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ESCONController createCIM_ESCONController() {
		CIM_ESCONControllerImpl ciM_ESCONController = new CIM_ESCONControllerImpl();
		return ciM_ESCONController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ErrorCountersForDevice createCIM_ErrorCountersForDevice() {
		CIM_ErrorCountersForDeviceImpl ciM_ErrorCountersForDevice = new CIM_ErrorCountersForDeviceImpl();
		return ciM_ErrorCountersForDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExtentComponentView createCIM_ExtentComponentView() {
		CIM_ExtentComponentViewImpl ciM_ExtentComponentView = new CIM_ExtentComponentViewImpl();
		return ciM_ExtentComponentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExtentInDiskGroup createCIM_ExtentInDiskGroup() {
		CIM_ExtentInDiskGroupImpl ciM_ExtentInDiskGroup = new CIM_ExtentInDiskGroupImpl();
		return ciM_ExtentInDiskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Fan createCIM_Fan() {
		CIM_FanImpl ciM_Fan = new CIM_FanImpl();
		return ciM_Fan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HeatPipe createCIM_HeatPipe() {
		CIM_HeatPipeImpl ciM_HeatPipe = new CIM_HeatPipeImpl();
		return ciM_HeatPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedStoragePoolView createCIM_HostedStoragePoolView() {
		CIM_HostedStoragePoolViewImpl ciM_HostedStoragePoolView = new CIM_HostedStoragePoolViewImpl();
		return ciM_HostedStoragePoolView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IDEController createCIM_IDEController() {
		CIM_IDEControllerImpl ciM_IDEController = new CIM_IDEControllerImpl();
		return ciM_IDEController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IndicatorLED createCIM_IndicatorLED() {
		CIM_IndicatorLEDImpl ciM_IndicatorLED = new CIM_IndicatorLEDImpl();
		return ciM_IndicatorLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InfraredController createCIM_InfraredController() {
		CIM_InfraredControllerImpl ciM_InfraredController = new CIM_InfraredControllerImpl();
		return ciM_InfraredController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InitiatorTargetLogicalUnitPath createCIM_InitiatorTargetLogicalUnitPath() {
		CIM_InitiatorTargetLogicalUnitPathImpl ciM_InitiatorTargetLogicalUnitPath = new CIM_InitiatorTargetLogicalUnitPathImpl();
		return ciM_InitiatorTargetLogicalUnitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstalledPartitionTable createCIM_InstalledPartitionTable() {
		CIM_InstalledPartitionTableImpl ciM_InstalledPartitionTable = new CIM_InstalledPartitionTableImpl();
		return ciM_InstalledPartitionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LabelReader createCIM_LabelReader() {
		CIM_LabelReaderImpl ciM_LabelReader = new CIM_LabelReaderImpl();
		return ciM_LabelReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalDisk createCIM_LogicalDisk() {
		CIM_LogicalDiskImpl ciM_LogicalDisk = new CIM_LogicalDiskImpl();
		return ciM_LogicalDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalModule createCIM_LogicalModule() {
		CIM_LogicalModuleImpl ciM_LogicalModule = new CIM_LogicalModuleImpl();
		return ciM_LogicalModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalPort createCIM_LogicalPort() {
		CIM_LogicalPortImpl ciM_LogicalPort = new CIM_LogicalPortImpl();
		return ciM_LogicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagementController createCIM_ManagementController() {
		CIM_ManagementControllerImpl ciM_ManagementController = new CIM_ManagementControllerImpl();
		return ciM_ManagementController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MaskingMappingExposedDeviceView createCIM_MaskingMappingExposedDeviceView() {
		CIM_MaskingMappingExposedDeviceViewImpl ciM_MaskingMappingExposedDeviceView = new CIM_MaskingMappingExposedDeviceViewImpl();
		return ciM_MaskingMappingExposedDeviceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MaskingMappingView createCIM_MaskingMappingView() {
		CIM_MaskingMappingViewImpl ciM_MaskingMappingView = new CIM_MaskingMappingViewImpl();
		return ciM_MaskingMappingView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaAccessDevice createCIM_MediaAccessDevice() {
		CIM_MediaAccessDeviceImpl ciM_MediaAccessDevice = new CIM_MediaAccessDeviceImpl();
		return ciM_MediaAccessDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaPartition createCIM_MediaPartition() {
		CIM_MediaPartitionImpl ciM_MediaPartition = new CIM_MediaPartitionImpl();
		return ciM_MediaPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaPresent createCIM_MediaPresent() {
		CIM_MediaPresentImpl ciM_MediaPresent = new CIM_MediaPresentImpl();
		return ciM_MediaPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MediaTransferDevice createCIM_MediaTransferDevice() {
		CIM_MediaTransferDeviceImpl ciM_MediaTransferDevice = new CIM_MediaTransferDeviceImpl();
		return ciM_MediaTransferDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Memory createCIM_Memory() {
		CIM_MemoryImpl ciM_Memory = new CIM_MemoryImpl();
		return ciM_Memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryController createCIM_MemoryController() {
		CIM_MemoryControllerImpl ciM_MemoryController = new CIM_MemoryControllerImpl();
		return ciM_MemoryController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkAdapterRedundancyComponent createCIM_NetworkAdapterRedundancyComponent() {
		CIM_NetworkAdapterRedundancyComponentImpl ciM_NetworkAdapterRedundancyComponent = new CIM_NetworkAdapterRedundancyComponentImpl();
		return ciM_NetworkAdapterRedundancyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPort createCIM_NetworkPort() {
		CIM_NetworkPortImpl ciM_NetworkPort = new CIM_NetworkPortImpl();
		return ciM_NetworkPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkVirtualAdapter createCIM_NetworkVirtualAdapter() {
		CIM_NetworkVirtualAdapterImpl ciM_NetworkVirtualAdapter = new CIM_NetworkVirtualAdapterImpl();
		return ciM_NetworkVirtualAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NonVolatileStorage createCIM_NonVolatileStorage() {
		CIM_NonVolatileStorageImpl ciM_NonVolatileStorage = new CIM_NonVolatileStorageImpl();
		return ciM_NonVolatileStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperationalPowerStatisticsService createCIM_OperationalPowerStatisticsService() {
		CIM_OperationalPowerStatisticsServiceImpl ciM_OperationalPowerStatisticsService = new CIM_OperationalPowerStatisticsServiceImpl();
		return ciM_OperationalPowerStatisticsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCIController createCIM_PCIController() {
		CIM_PCIControllerImpl ciM_PCIController = new CIM_PCIControllerImpl();
		return ciM_PCIController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCIDevice createCIM_PCIDevice() {
		CIM_PCIDeviceImpl ciM_PCIDevice = new CIM_PCIDeviceImpl();
		return ciM_PCIDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCIPort createCIM_PCIPort() {
		CIM_PCIPortImpl ciM_PCIPort = new CIM_PCIPortImpl();
		return ciM_PCIPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCIeSwitch createCIM_PCIeSwitch() {
		CIM_PCIeSwitchImpl ciM_PCIeSwitch = new CIM_PCIeSwitchImpl();
		return ciM_PCIeSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCMCIAController createCIM_PCMCIAController() {
		CIM_PCMCIAControllerImpl ciM_PCMCIAController = new CIM_PCMCIAControllerImpl();
		return ciM_PCMCIAController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageDependency createCIM_PackageDependency() {
		CIM_PackageDependencyImpl ciM_PackageDependency = new CIM_PackageDependencyImpl();
		return ciM_PackageDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ParallelController createCIM_ParallelController() {
		CIM_ParallelControllerImpl ciM_ParallelController = new CIM_ParallelControllerImpl();
		return ciM_ParallelController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PassThroughModule createCIM_PassThroughModule() {
		CIM_PassThroughModuleImpl ciM_PassThroughModule = new CIM_PassThroughModuleImpl();
		return ciM_PassThroughModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PersistentMemoryNamespace createCIM_PersistentMemoryNamespace() {
		CIM_PersistentMemoryNamespaceImpl ciM_PersistentMemoryNamespace = new CIM_PersistentMemoryNamespaceImpl();
		return ciM_PersistentMemoryNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PersistentMemoryService createCIM_PersistentMemoryService() {
		CIM_PersistentMemoryServiceImpl ciM_PersistentMemoryService = new CIM_PersistentMemoryServiceImpl();
		return ciM_PersistentMemoryService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PhysicalExtent createCIM_PhysicalExtent() {
		CIM_PhysicalExtentImpl ciM_PhysicalExtent = new CIM_PhysicalExtentImpl();
		return ciM_PhysicalExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PickerElement createCIM_PickerElement() {
		CIM_PickerElementImpl ciM_PickerElement = new CIM_PickerElementImpl();
		return ciM_PickerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PortActiveConnection createCIM_PortActiveConnection() {
		CIM_PortActiveConnectionImpl ciM_PortActiveConnection = new CIM_PortActiveConnectionImpl();
		return ciM_PortActiveConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PortController createCIM_PortController() {
		CIM_PortControllerImpl ciM_PortController = new CIM_PortControllerImpl();
		return ciM_PortController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PortOnDevice createCIM_PortOnDevice() {
		CIM_PortOnDeviceImpl ciM_PortOnDevice = new CIM_PortOnDeviceImpl();
		return ciM_PortOnDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PowerSource createCIM_PowerSource() {
		CIM_PowerSourceImpl ciM_PowerSource = new CIM_PowerSourceImpl();
		return ciM_PowerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PowerSupply createCIM_PowerSupply() {
		CIM_PowerSupplyImpl ciM_PowerSupply = new CIM_PowerSupplyImpl();
		return ciM_PowerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrintQueue createCIM_PrintQueue() {
		CIM_PrintQueueImpl ciM_PrintQueue = new CIM_PrintQueueImpl();
		return ciM_PrintQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Printer createCIM_Printer() {
		CIM_PrinterImpl ciM_Printer = new CIM_PrinterImpl();
		return ciM_Printer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrinterServicingJob createCIM_PrinterServicingJob() {
		CIM_PrinterServicingJobImpl ciM_PrinterServicingJob = new CIM_PrinterServicingJobImpl();
		return ciM_PrinterServicingJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrinterServicingQueue createCIM_PrinterServicingQueue() {
		CIM_PrinterServicingQueueImpl ciM_PrinterServicingQueue = new CIM_PrinterServicingQueueImpl();
		return ciM_PrinterServicingQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Processor createCIM_Processor() {
		CIM_ProcessorImpl ciM_Processor = new CIM_ProcessorImpl();
		return ciM_Processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtectedSpaceExtent createCIM_ProtectedSpaceExtent() {
		CIM_ProtectedSpaceExtentImpl ciM_ProtectedSpaceExtent = new CIM_ProtectedSpaceExtentImpl();
		return ciM_ProtectedSpaceExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolControllerForPort createCIM_ProtocolControllerForPort() {
		CIM_ProtocolControllerForPortImpl ciM_ProtocolControllerForPort = new CIM_ProtocolControllerForPortImpl();
		return ciM_ProtocolControllerForPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolControllerForUnit createCIM_ProtocolControllerForUnit() {
		CIM_ProtocolControllerForUnitImpl ciM_ProtocolControllerForUnit = new CIM_ProtocolControllerForUnitImpl();
		return ciM_ProtocolControllerForUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolControllerForUnitView createCIM_ProtocolControllerForUnitView() {
		CIM_ProtocolControllerForUnitViewImpl ciM_ProtocolControllerForUnitView = new CIM_ProtocolControllerForUnitViewImpl();
		return ciM_ProtocolControllerForUnitView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueueForPrintService createCIM_QueueForPrintService() {
		CIM_QueueForPrintServiceImpl ciM_QueueForPrintService = new CIM_QueueForPrintServiceImpl();
		return ciM_QueueForPrintService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueueForwardsToPrintSAP createCIM_QueueForwardsToPrintSAP() {
		CIM_QueueForwardsToPrintSAPImpl ciM_QueueForwardsToPrintSAP = new CIM_QueueForwardsToPrintSAPImpl();
		return ciM_QueueForwardsToPrintSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RealizesExtent createCIM_RealizesExtent() {
		CIM_RealizesExtentImpl ciM_RealizesExtent = new CIM_RealizesExtentImpl();
		return ciM_RealizesExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RealizesPExtent createCIM_RealizesPExtent() {
		CIM_RealizesPExtentImpl ciM_RealizesPExtent = new CIM_RealizesPExtentImpl();
		return ciM_RealizesPExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Refrigeration createCIM_Refrigeration() {
		CIM_RefrigerationImpl ciM_Refrigeration = new CIM_RefrigerationImpl();
		return ciM_Refrigeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SASPHY createCIM_SASPHY() {
		CIM_SASPHYImpl ciM_SASPHY = new CIM_SASPHYImpl();
		return ciM_SASPHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SASPort createCIM_SASPort() {
		CIM_SASPortImpl ciM_SASPort = new CIM_SASPortImpl();
		return ciM_SASPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SBProtocolEndpoint createCIM_SBProtocolEndpoint() {
		CIM_SBProtocolEndpointImpl ciM_SBProtocolEndpoint = new CIM_SBProtocolEndpointImpl();
		return ciM_SBProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIArbitraryLogicalUnit createCIM_SCSIArbitraryLogicalUnit() {
		CIM_SCSIArbitraryLogicalUnitImpl ciM_SCSIArbitraryLogicalUnit = new CIM_SCSIArbitraryLogicalUnitImpl();
		return ciM_SCSIArbitraryLogicalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIController createCIM_SCSIController() {
		CIM_SCSIControllerImpl ciM_SCSIController = new CIM_SCSIControllerImpl();
		return ciM_SCSIController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIInitiatorTargetLogicalUnitPath createCIM_SCSIInitiatorTargetLogicalUnitPath() {
		CIM_SCSIInitiatorTargetLogicalUnitPathImpl ciM_SCSIInitiatorTargetLogicalUnitPath = new CIM_SCSIInitiatorTargetLogicalUnitPathImpl();
		return ciM_SCSIInitiatorTargetLogicalUnitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIPathConfigurationService createCIM_SCSIPathConfigurationService() {
		CIM_SCSIPathConfigurationServiceImpl ciM_SCSIPathConfigurationService = new CIM_SCSIPathConfigurationServiceImpl();
		return ciM_SCSIPathConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIProtocolController createCIM_SCSIProtocolController() {
		CIM_SCSIProtocolControllerImpl ciM_SCSIProtocolController = new CIM_SCSIProtocolControllerImpl();
		return ciM_SCSIProtocolController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SSAController createCIM_SSAController() {
		CIM_SSAControllerImpl ciM_SSAController = new CIM_SSAControllerImpl();
		return ciM_SSAController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Scanner createCIM_Scanner() {
		CIM_ScannerImpl ciM_Scanner = new CIM_ScannerImpl();
		return ciM_Scanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Sensor createCIM_Sensor() {
		CIM_SensorImpl ciM_Sensor = new CIM_SensorImpl();
		return ciM_Sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SerialController createCIM_SerialController() {
		CIM_SerialControllerImpl ciM_SerialController = new CIM_SerialControllerImpl();
		return ciM_SerialController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharedDeviceManagementService createCIM_SharedDeviceManagementService() {
		CIM_SharedDeviceManagementServiceImpl ciM_SharedDeviceManagementService = new CIM_SharedDeviceManagementServiceImpl();
		return ciM_SharedDeviceManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharingDependency createCIM_SharingDependency() {
		CIM_SharingDependencyImpl ciM_SharingDependency = new CIM_SharingDependencyImpl();
		return ciM_SharingDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Snapshot createCIM_Snapshot() {
		CIM_SnapshotImpl ciM_Snapshot = new CIM_SnapshotImpl();
		return ciM_Snapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SnapshotOfExtent createCIM_SnapshotOfExtent() {
		CIM_SnapshotOfExtentImpl ciM_SnapshotOfExtent = new CIM_SnapshotOfExtentImpl();
		return ciM_SnapshotOfExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageDefect createCIM_StorageDefect() {
		CIM_StorageDefectImpl ciM_StorageDefect = new CIM_StorageDefectImpl();
		return ciM_StorageDefect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageErasureService createCIM_StorageErasureService() {
		CIM_StorageErasureServiceImpl ciM_StorageErasureService = new CIM_StorageErasureServiceImpl();
		return ciM_StorageErasureService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageLibrary createCIM_StorageLibrary() {
		CIM_StorageLibraryImpl ciM_StorageLibrary = new CIM_StorageLibraryImpl();
		return ciM_StorageLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StoragePool createCIM_StoragePool() {
		CIM_StoragePoolImpl ciM_StoragePool = new CIM_StoragePoolImpl();
		return ciM_StoragePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StoragePoolDiagnosticTest createCIM_StoragePoolDiagnosticTest() {
		CIM_StoragePoolDiagnosticTestImpl ciM_StoragePoolDiagnosticTest = new CIM_StoragePoolDiagnosticTestImpl();
		return ciM_StoragePoolDiagnosticTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageProtectionService createCIM_StorageProtectionService() {
		CIM_StorageProtectionServiceImpl ciM_StorageProtectionService = new CIM_StorageProtectionServiceImpl();
		return ciM_StorageProtectionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageVolume createCIM_StorageVolume() {
		CIM_StorageVolumeImpl ciM_StorageVolume = new CIM_StorageVolumeImpl();
		return ciM_StorageVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SuppliesPower createCIM_SuppliesPower() {
		CIM_SuppliesPowerImpl ciM_SuppliesPower = new CIM_SuppliesPowerImpl();
		return ciM_SuppliesPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TapeDrive createCIM_TapeDrive() {
		CIM_TapeDriveImpl ciM_TapeDrive = new CIM_TapeDriveImpl();
		return ciM_TapeDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TapePartition createCIM_TapePartition() {
		CIM_TapePartitionImpl ciM_TapePartition = new CIM_TapePartitionImpl();
		return ciM_TapePartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TokenRingAdapter createCIM_TokenRingAdapter() {
		CIM_TokenRingAdapterImpl ciM_TokenRingAdapter = new CIM_TokenRingAdapterImpl();
		return ciM_TokenRingAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TokenRingPort createCIM_TokenRingPort() {
		CIM_TokenRingPortImpl ciM_TokenRingPort = new CIM_TokenRingPortImpl();
		return ciM_TokenRingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBController createCIM_USBController() {
		CIM_USBControllerImpl ciM_USBController = new CIM_USBControllerImpl();
		return ciM_USBController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBDevice createCIM_USBDevice() {
		CIM_USBDeviceImpl ciM_USBDevice = new CIM_USBDeviceImpl();
		return ciM_USBDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBHub createCIM_USBHub() {
		CIM_USBHubImpl ciM_USBHub = new CIM_USBHubImpl();
		return ciM_USBHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBPort createCIM_USBPort() {
		CIM_USBPortImpl ciM_USBPort = new CIM_USBPortImpl();
		return ciM_USBPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBPortOnHub createCIM_USBPortOnHub() {
		CIM_USBPortOnHubImpl ciM_USBPortOnHub = new CIM_USBPortOnHubImpl();
		return ciM_USBPortOnHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UninterruptiblePowerSupply createCIM_UninterruptiblePowerSupply() {
		CIM_UninterruptiblePowerSupplyImpl ciM_UninterruptiblePowerSupply = new CIM_UninterruptiblePowerSupplyImpl();
		return ciM_UninterruptiblePowerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoController createCIM_VideoController() {
		CIM_VideoControllerImpl ciM_VideoController = new CIM_VideoControllerImpl();
		return ciM_VideoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoHead createCIM_VideoHead() {
		CIM_VideoHeadImpl ciM_VideoHead = new CIM_VideoHeadImpl();
		return ciM_VideoHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VideoSetting createCIM_VideoSetting() {
		CIM_VideoSettingImpl ciM_VideoSetting = new CIM_VideoSettingImpl();
		return ciM_VideoSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VolatileStorage createCIM_VolatileStorage() {
		CIM_VolatileStorageImpl ciM_VolatileStorage = new CIM_VolatileStorageImpl();
		return ciM_VolatileStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VolumeSet createCIM_VolumeSet() {
		CIM_VolumeSetImpl ciM_VolumeSet = new CIM_VolumeSetImpl();
		return ciM_VolumeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WBEMServerDeviceRegistrationService createCIM_WBEMServerDeviceRegistrationService() {
		CIM_WBEMServerDeviceRegistrationServiceImpl ciM_WBEMServerDeviceRegistrationService = new CIM_WBEMServerDeviceRegistrationServiceImpl();
		return ciM_WBEMServerDeviceRegistrationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WORMDrive createCIM_WORMDrive() {
		CIM_WORMDriveImpl ciM_WORMDrive = new CIM_WORMDriveImpl();
		return ciM_WORMDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Watchdog createCIM_Watchdog() {
		CIM_WatchdogImpl ciM_Watchdog = new CIM_WatchdogImpl();
		return ciM_Watchdog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiPort createCIM_WiFiPort() {
		CIM_WiFiPortImpl ciM_WiFiPort = new CIM_WiFiPortImpl();
		return ciM_WiFiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiRadio createCIM_WiFiRadio() {
		CIM_WiFiRadioImpl ciM_WiFiRadio = new CIM_WiFiRadioImpl();
		return ciM_WiFiRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecPolicyForSystem createCIM_IPsecPolicyForSystem() {
		CIM_IPsecPolicyForSystemImpl ciM_IPsecPolicyForSystem = new CIM_IPsecPolicyForSystemImpl();
		return ciM_IPsecPolicyForSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PeerGatewayForPreconfiguredTunnel createCIM_PeerGatewayForPreconfiguredTunnel() {
		CIM_PeerGatewayForPreconfiguredTunnelImpl ciM_PeerGatewayForPreconfiguredTunnel = new CIM_PeerGatewayForPreconfiguredTunnelImpl();
		return ciM_PeerGatewayForPreconfiguredTunnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PeerGatewayForTunnel createCIM_PeerGatewayForTunnel() {
		CIM_PeerGatewayForTunnelImpl ciM_PeerGatewayForTunnel = new CIM_PeerGatewayForTunnelImpl();
		return ciM_PeerGatewayForTunnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CIMXMLCommunicationMechanism createCIM_CIMXMLCommunicationMechanism() {
		CIM_CIMXMLCommunicationMechanismImpl ciM_CIMXMLCommunicationMechanism = new CIM_CIMXMLCommunicationMechanismImpl();
		return ciM_CIMXMLCommunicationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IdentificationOfManagedSystem createCIM_IdentificationOfManagedSystem() {
		CIM_IdentificationOfManagedSystemImpl ciM_IdentificationOfManagedSystem = new CIM_IdentificationOfManagedSystemImpl();
		return ciM_IdentificationOfManagedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ObjectManager createCIM_ObjectManager() {
		CIM_ObjectManagerImpl ciM_ObjectManager = new CIM_ObjectManagerImpl();
		return ciM_ObjectManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ObjectManagerAdapter createCIM_ObjectManagerAdapter() {
		CIM_ObjectManagerAdapterImpl ciM_ObjectManagerAdapter = new CIM_ObjectManagerAdapterImpl();
		return ciM_ObjectManagerAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolAdapter createCIM_ProtocolAdapter() {
		CIM_ProtocolAdapterImpl ciM_ProtocolAdapter = new CIM_ProtocolAdapterImpl();
		return ciM_ProtocolAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ATAProtocolEndpoint createCIM_ATAProtocolEndpoint() {
		CIM_ATAProtocolEndpointImpl ciM_ATAProtocolEndpoint = new CIM_ATAProtocolEndpointImpl();
		return ciM_ATAProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedNextHop createCIM_AssociatedNextHop() {
		CIM_AssociatedNextHopImpl ciM_AssociatedNextHop = new CIM_AssociatedNextHopImpl();
		return ciM_AssociatedNextHop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AverageRateMeterService createCIM_AverageRateMeterService() {
		CIM_AverageRateMeterServiceImpl ciM_AverageRateMeterService = new CIM_AverageRateMeterServiceImpl();
		return ciM_AverageRateMeterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPAttributesForRoute createCIM_BGPAttributesForRoute() {
		CIM_BGPAttributesForRouteImpl ciM_BGPAttributesForRoute = new CIM_BGPAttributesForRouteImpl();
		return ciM_BGPAttributesForRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPProtocolEndpoint createCIM_BGPProtocolEndpoint() {
		CIM_BGPProtocolEndpointImpl ciM_BGPProtocolEndpoint = new CIM_BGPProtocolEndpointImpl();
		return ciM_BGPProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPService createCIM_BGPService() {
		CIM_BGPServiceImpl ciM_BGPService = new CIM_BGPServiceImpl();
		return ciM_BGPService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPServiceAttributes createCIM_BGPServiceAttributes() {
		CIM_BGPServiceAttributesImpl ciM_BGPServiceAttributes = new CIM_BGPServiceAttributesImpl();
		return ciM_BGPServiceAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPServiceStatistics createCIM_BGPServiceStatistics() {
		CIM_BGPServiceStatisticsImpl ciM_BGPServiceStatistics = new CIM_BGPServiceStatisticsImpl();
		return ciM_BGPServiceStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CLPProtocolEndpoint createCIM_CLPProtocolEndpoint() {
		CIM_CLPProtocolEndpointImpl ciM_CLPProtocolEndpoint = new CIM_CLPProtocolEndpointImpl();
		return ciM_CLPProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CalculatedRoutes createCIM_CalculatedRoutes() {
		CIM_CalculatedRoutesImpl ciM_CalculatedRoutes = new CIM_CalculatedRoutesImpl();
		return ciM_CalculatedRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CalculatesAmong createCIM_CalculatesAmong() {
		CIM_CalculatesAmongImpl ciM_CalculatesAmong = new CIM_CalculatesAmongImpl();
		return ciM_CalculatesAmong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CalculationBasedOnQueue createCIM_CalculationBasedOnQueue() {
		CIM_CalculationBasedOnQueueImpl ciM_CalculationBasedOnQueue = new CIM_CalculationBasedOnQueueImpl();
		return ciM_CalculationBasedOnQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CalculationServiceForDropper createCIM_CalculationServiceForDropper() {
		CIM_CalculationServiceForDropperImpl ciM_CalculationServiceForDropper = new CIM_CalculationServiceForDropperImpl();
		return ciM_CalculationServiceForDropper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassifierService createCIM_ClassifierService() {
		CIM_ClassifierServiceImpl ciM_ClassifierService = new CIM_ClassifierServiceImpl();
		return ciM_ClassifierService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConditioningServiceOnEndpoint createCIM_ConditioningServiceOnEndpoint() {
		CIM_ConditioningServiceOnEndpointImpl ciM_ConditioningServiceOnEndpoint = new CIM_ConditioningServiceOnEndpointImpl();
		return ciM_ConditioningServiceOnEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DHCPProtocolEndpoint createCIM_DHCPProtocolEndpoint() {
		CIM_DHCPProtocolEndpointImpl ciM_DHCPProtocolEndpoint = new CIM_DHCPProtocolEndpointImpl();
		return ciM_DHCPProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DNSProtocolEndpoint createCIM_DNSProtocolEndpoint() {
		CIM_DNSProtocolEndpointImpl ciM_DNSProtocolEndpoint = new CIM_DNSProtocolEndpointImpl();
		return ciM_DNSProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DSCPMarkerService createCIM_DSCPMarkerService() {
		CIM_DSCPMarkerServiceImpl ciM_DSCPMarkerService = new CIM_DSCPMarkerServiceImpl();
		return ciM_DSCPMarkerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiffServService createCIM_DiffServService() {
		CIM_DiffServServiceImpl ciM_DiffServService = new CIM_DiffServServiceImpl();
		return ciM_DiffServService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EFService createCIM_EFService() {
		CIM_EFServiceImpl ciM_EFService = new CIM_EFServiceImpl();
		return ciM_EFService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EGPRouteCalcDependency createCIM_EGPRouteCalcDependency() {
		CIM_EGPRouteCalcDependencyImpl ciM_EGPRouteCalcDependency = new CIM_EGPRouteCalcDependencyImpl();
		return ciM_EGPRouteCalcDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EWMAMeterService createCIM_EWMAMeterService() {
		CIM_EWMAMeterServiceImpl ciM_EWMAMeterService = new CIM_EWMAMeterServiceImpl();
		return ciM_EWMAMeterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EgressConditioningServiceOnEndpoint createCIM_EgressConditioningServiceOnEndpoint() {
		CIM_EgressConditioningServiceOnEndpointImpl ciM_EgressConditioningServiceOnEndpoint = new CIM_EgressConditioningServiceOnEndpointImpl();
		return ciM_EgressConditioningServiceOnEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ElementInSchedulingService createCIM_ElementInSchedulingService() {
		CIM_ElementInSchedulingServiceImpl ciM_ElementInSchedulingService = new CIM_ElementInSchedulingServiceImpl();
		return ciM_ElementInSchedulingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EndpointForIPNetworkConnection createCIM_EndpointForIPNetworkConnection() {
		CIM_EndpointForIPNetworkConnectionImpl ciM_EndpointForIPNetworkConnection = new CIM_EndpointForIPNetworkConnectionImpl();
		return ciM_EndpointForIPNetworkConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EndpointIdentity createCIM_EndpointIdentity() {
		CIM_EndpointIdentityImpl ciM_EndpointIdentity = new CIM_EndpointIdentityImpl();
		return ciM_EndpointIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EndpointOfNetworkPipe createCIM_EndpointOfNetworkPipe() {
		CIM_EndpointOfNetworkPipeImpl ciM_EndpointOfNetworkPipe = new CIM_EndpointOfNetworkPipeImpl();
		return ciM_EndpointOfNetworkPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FlowService createCIM_FlowService() {
		CIM_FlowServiceImpl ciM_FlowService = new CIM_FlowServiceImpl();
		return ciM_FlowService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ForwardingService createCIM_ForwardingService() {
		CIM_ForwardingServiceImpl ciM_ForwardingService = new CIM_ForwardingServiceImpl();
		return ciM_ForwardingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ForwardsAmong createCIM_ForwardsAmong() {
		CIM_ForwardsAmongImpl ciM_ForwardsAmong = new CIM_ForwardsAmongImpl();
		return ciM_ForwardsAmong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Hdr8021PService createCIM_Hdr8021PService() {
		CIM_Hdr8021PServiceImpl ciM_Hdr8021PService = new CIM_Hdr8021PServiceImpl();
		return ciM_Hdr8021PService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HeadTailDropQueueBinding createCIM_HeadTailDropQueueBinding() {
		CIM_HeadTailDropQueueBindingImpl ciM_HeadTailDropQueueBinding = new CIM_HeadTailDropQueueBindingImpl();
		return ciM_HeadTailDropQueueBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedRoute createCIM_HostedRoute() {
		CIM_HostedRouteImpl ciM_HostedRoute = new CIM_HostedRouteImpl();
		return ciM_HostedRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPProtocolEndpoint createCIM_IPProtocolEndpoint() {
		CIM_IPProtocolEndpointImpl ciM_IPProtocolEndpoint = new CIM_IPProtocolEndpointImpl();
		return ciM_IPProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPXProtocolEndpoint createCIM_IPXProtocolEndpoint() {
		CIM_IPXProtocolEndpointImpl ciM_IPXProtocolEndpoint = new CIM_IPXProtocolEndpointImpl();
		return ciM_IPXProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InLogicalNetwork createCIM_InLogicalNetwork() {
		CIM_InLogicalNetworkImpl ciM_InLogicalNetwork = new CIM_InLogicalNetworkImpl();
		return ciM_InLogicalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IngressConditioningServiceOnEndpoint createCIM_IngressConditioningServiceOnEndpoint() {
		CIM_IngressConditioningServiceOnEndpointImpl ciM_IngressConditioningServiceOnEndpoint = new CIM_IngressConditioningServiceOnEndpointImpl();
		return ciM_IngressConditioningServiceOnEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LANEndpoint createCIM_LANEndpoint() {
		CIM_LANEndpointImpl ciM_LANEndpoint = new CIM_LANEndpointImpl();
		return ciM_LANEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalNetworkService createCIM_LogicalNetworkService() {
		CIM_LogicalNetworkServiceImpl ciM_LogicalNetworkService = new CIM_LogicalNetworkServiceImpl();
		return ciM_LogicalNetworkService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkPortConfigurationService createCIM_NetworkPortConfigurationService() {
		CIM_NetworkPortConfigurationServiceImpl ciM_NetworkPortConfigurationService = new CIM_NetworkPortConfigurationServiceImpl();
		return ciM_NetworkPortConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NextScheduler createCIM_NextScheduler() {
		CIM_NextSchedulerImpl ciM_NextScheduler = new CIM_NextSchedulerImpl();
		return ciM_NextScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NonWorkConservingSchedulingService createCIM_NonWorkConservingSchedulingService() {
		CIM_NonWorkConservingSchedulingServiceImpl ciM_NonWorkConservingSchedulingService = new CIM_NonWorkConservingSchedulingServiceImpl();
		return ciM_NonWorkConservingSchedulingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFProtocolEndpointBase createCIM_OSPFProtocolEndpointBase() {
		CIM_OSPFProtocolEndpointBaseImpl ciM_OSPFProtocolEndpointBase = new CIM_OSPFProtocolEndpointBaseImpl();
		return ciM_OSPFProtocolEndpointBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFService createCIM_OSPFService() {
		CIM_OSPFServiceImpl ciM_OSPFService = new CIM_OSPFServiceImpl();
		return ciM_OSPFService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFServiceConfiguration createCIM_OSPFServiceConfiguration() {
		CIM_OSPFServiceConfigurationImpl ciM_OSPFServiceConfiguration = new CIM_OSPFServiceConfigurationImpl();
		return ciM_OSPFServiceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFVirtualInterface createCIM_OSPFVirtualInterface() {
		CIM_OSPFVirtualInterfaceImpl ciM_OSPFVirtualInterface = new CIM_OSPFVirtualInterfaceImpl();
		return ciM_OSPFVirtualInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrecedenceService createCIM_PrecedenceService() {
		CIM_PrecedenceServiceImpl ciM_PrecedenceService = new CIM_PrecedenceServiceImpl();
		return ciM_PrecedenceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QoSConditioningSubService createCIM_QoSConditioningSubService() {
		CIM_QoSConditioningSubServiceImpl ciM_QoSConditioningSubService = new CIM_QoSConditioningSubServiceImpl();
		return ciM_QoSConditioningSubService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueueAllocation createCIM_QueueAllocation() {
		CIM_QueueAllocationImpl ciM_QueueAllocation = new CIM_QueueAllocationImpl();
		return ciM_QueueAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueueHierarchy createCIM_QueueHierarchy() {
		CIM_QueueHierarchyImpl ciM_QueueHierarchy = new CIM_QueueHierarchyImpl();
		return ciM_QueueHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_QueueToSchedule createCIM_QueueToSchedule() {
		CIM_QueueToScheduleImpl ciM_QueueToSchedule = new CIM_QueueToScheduleImpl();
		return ciM_QueueToSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReflectorClientService createCIM_ReflectorClientService() {
		CIM_ReflectorClientServiceImpl ciM_ReflectorClientService = new CIM_ReflectorClientServiceImpl();
		return ciM_ReflectorClientService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReflectorNonClientService createCIM_ReflectorNonClientService() {
		CIM_ReflectorNonClientServiceImpl ciM_ReflectorNonClientService = new CIM_ReflectorNonClientServiceImpl();
		return ciM_ReflectorNonClientService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReflectorService createCIM_ReflectorService() {
		CIM_ReflectorServiceImpl ciM_ReflectorService = new CIM_ReflectorServiceImpl();
		return ciM_ReflectorService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemoteAccessAvailableToElement createCIM_RemoteAccessAvailableToElement() {
		CIM_RemoteAccessAvailableToElementImpl ciM_RemoteAccessAvailableToElement = new CIM_RemoteAccessAvailableToElementImpl();
		return ciM_RemoteAccessAvailableToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RouteForwardedByService createCIM_RouteForwardedByService() {
		CIM_RouteForwardedByServiceImpl ciM_RouteForwardedByService = new CIM_RouteForwardedByServiceImpl();
		return ciM_RouteForwardedByService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RouteUsesEndpoint createCIM_RouteUsesEndpoint() {
		CIM_RouteUsesEndpointImpl ciM_RouteUsesEndpoint = new CIM_RouteUsesEndpointImpl();
		return ciM_RouteUsesEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoutesBGP createCIM_RoutesBGP() {
		CIM_RoutesBGPImpl ciM_RoutesBGP = new CIM_RoutesBGPImpl();
		return ciM_RoutesBGP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIProtocolEndpoint createCIM_SCSIProtocolEndpoint() {
		CIM_SCSIProtocolEndpointImpl ciM_SCSIProtocolEndpoint = new CIM_SCSIProtocolEndpointImpl();
		return ciM_SCSIProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SSHProtocolEndpoint createCIM_SSHProtocolEndpoint() {
		CIM_SSHProtocolEndpointImpl ciM_SSHProtocolEndpoint = new CIM_SSHProtocolEndpointImpl();
		return ciM_SSHProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SchedulerUsed createCIM_SchedulerUsed() {
		CIM_SchedulerUsedImpl ciM_SchedulerUsed = new CIM_SchedulerUsedImpl();
		return ciM_SchedulerUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SecurityAssociationEndpoint createCIM_SecurityAssociationEndpoint() {
		CIM_SecurityAssociationEndpointImpl ciM_SecurityAssociationEndpoint = new CIM_SecurityAssociationEndpointImpl();
		return ciM_SecurityAssociationEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SourceRoutingService createCIM_SourceRoutingService() {
		CIM_SourceRoutingServiceImpl ciM_SourceRoutingService = new CIM_SourceRoutingServiceImpl();
		return ciM_SourceRoutingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SpanningTreeService createCIM_SpanningTreeService() {
		CIM_SpanningTreeServiceImpl ciM_SpanningTreeService = new CIM_SpanningTreeServiceImpl();
		return ciM_SpanningTreeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Specific802dot1QVLANService createCIM_Specific802dot1QVLANService() {
		CIM_Specific802dot1QVLANServiceImpl ciM_Specific802dot1QVLANService = new CIM_Specific802dot1QVLANServiceImpl();
		return ciM_Specific802dot1QVLANService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPort createCIM_SwitchPort() {
		CIM_SwitchPortImpl ciM_SwitchPort = new CIM_SwitchPortImpl();
		return ciM_SwitchPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortDynamicForwarding createCIM_SwitchPortDynamicForwarding() {
		CIM_SwitchPortDynamicForwardingImpl ciM_SwitchPortDynamicForwarding = new CIM_SwitchPortDynamicForwardingImpl();
		return ciM_SwitchPortDynamicForwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortPair createCIM_SwitchPortPair() {
		CIM_SwitchPortPairImpl ciM_SwitchPortPair = new CIM_SwitchPortPairImpl();
		return ciM_SwitchPortPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortSourceRouting createCIM_SwitchPortSourceRouting() {
		CIM_SwitchPortSourceRoutingImpl ciM_SwitchPortSourceRouting = new CIM_SwitchPortSourceRoutingImpl();
		return ciM_SwitchPortSourceRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortSpanningTree createCIM_SwitchPortSpanningTree() {
		CIM_SwitchPortSpanningTreeImpl ciM_SwitchPortSpanningTree = new CIM_SwitchPortSpanningTreeImpl();
		return ciM_SwitchPortSpanningTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchPortStaticForwarding createCIM_SwitchPortStaticForwarding() {
		CIM_SwitchPortStaticForwardingImpl ciM_SwitchPortStaticForwarding = new CIM_SwitchPortStaticForwardingImpl();
		return ciM_SwitchPortStaticForwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchService createCIM_SwitchService() {
		CIM_SwitchServiceImpl ciM_SwitchService = new CIM_SwitchServiceImpl();
		return ciM_SwitchService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchServiceSourceRouting createCIM_SwitchServiceSourceRouting() {
		CIM_SwitchServiceSourceRoutingImpl ciM_SwitchServiceSourceRouting = new CIM_SwitchServiceSourceRoutingImpl();
		return ciM_SwitchServiceSourceRouting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchServiceSpanningTree createCIM_SwitchServiceSpanningTree() {
		CIM_SwitchServiceSpanningTreeImpl ciM_SwitchServiceSpanningTree = new CIM_SwitchServiceSpanningTreeImpl();
		return ciM_SwitchServiceSpanningTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchServiceVLAN createCIM_SwitchServiceVLAN() {
		CIM_SwitchServiceVLANImpl ciM_SwitchServiceVLAN = new CIM_SwitchServiceVLANImpl();
		return ciM_SwitchServiceVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchVirtualInterface createCIM_SwitchVirtualInterface() {
		CIM_SwitchVirtualInterfaceImpl ciM_SwitchVirtualInterface = new CIM_SwitchVirtualInterfaceImpl();
		return ciM_SwitchVirtualInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchesAmong createCIM_SwitchesAmong() {
		CIM_SwitchesAmongImpl ciM_SwitchesAmong = new CIM_SwitchesAmongImpl();
		return ciM_SwitchesAmong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TCPProtocolEndpoint createCIM_TCPProtocolEndpoint() {
		CIM_TCPProtocolEndpointImpl ciM_TCPProtocolEndpoint = new CIM_TCPProtocolEndpointImpl();
		return ciM_TCPProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TelnetProtocolEndpoint createCIM_TelnetProtocolEndpoint() {
		CIM_TelnetProtocolEndpointImpl ciM_TelnetProtocolEndpoint = new CIM_TelnetProtocolEndpointImpl();
		return ciM_TelnetProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TransparentBridgingService createCIM_TransparentBridgingService() {
		CIM_TransparentBridgingServiceImpl ciM_TransparentBridgingService = new CIM_TransparentBridgingServiceImpl();
		return ciM_TransparentBridgingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TransparentBridgingStaticForwarding createCIM_TransparentBridgingStaticForwarding() {
		CIM_TransparentBridgingStaticForwardingImpl ciM_TransparentBridgingStaticForwarding = new CIM_TransparentBridgingStaticForwardingImpl();
		return ciM_TransparentBridgingStaticForwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TrapSourceForSNMPService createCIM_TrapSourceForSNMPService() {
		CIM_TrapSourceForSNMPServiceImpl ciM_TrapSourceForSNMPService = new CIM_TrapSourceForSNMPServiceImpl();
		return ciM_TrapSourceForSNMPService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UDPProtocolEndpoint createCIM_UDPProtocolEndpoint() {
		CIM_UDPProtocolEndpointImpl ciM_UDPProtocolEndpoint = new CIM_UDPProtocolEndpointImpl();
		return ciM_UDPProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBRedirectionService createCIM_USBRedirectionService() {
		CIM_USBRedirectionServiceImpl ciM_USBRedirectionService = new CIM_USBRedirectionServiceImpl();
		return ciM_USBRedirectionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VLANEndpoint createCIM_VLANEndpoint() {
		CIM_VLANEndpointImpl ciM_VLANEndpoint = new CIM_VLANEndpointImpl();
		return ciM_VLANEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VLANFor createCIM_VLANFor() {
		CIM_VLANForImpl ciM_VLANFor = new CIM_VLANForImpl();
		return ciM_VLANFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSIProtocolEndpoint createCIM_iSCSIProtocolEndpoint() {
		CIM_iSCSIProtocolEndpointImpl ciM_iSCSIProtocolEndpoint = new CIM_iSCSIProtocolEndpointImpl();
		return ciM_iSCSIProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocatedResource createCIM_AllocatedResource() {
		CIM_AllocatedResourceImpl ciM_AllocatedResource = new CIM_AllocatedResourceImpl();
		return ciM_AllocatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AvailableDiagnosticService createCIM_AvailableDiagnosticService() {
		CIM_AvailableDiagnosticServiceImpl ciM_AvailableDiagnosticService = new CIM_AvailableDiagnosticServiceImpl();
		return ciM_AvailableDiagnosticService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BootOSFromFS createCIM_BootOSFromFS() {
		CIM_BootOSFromFSImpl ciM_BootOSFromFS = new CIM_BootOSFromFSImpl();
		return ciM_BootOSFromFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystem createCIM_ComputerSystem() {
		CIM_ComputerSystemImpl ciM_ComputerSystem = new CIM_ComputerSystemImpl();
		return ciM_ComputerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemPackage createCIM_ComputerSystemPackage() {
		CIM_ComputerSystemPackageImpl ciM_ComputerSystemPackage = new CIM_ComputerSystemPackageImpl();
		return ciM_ComputerSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DMA createCIM_DMA() {
		CIM_DMAImpl ciM_DMA = new CIM_DMAImpl();
		return ciM_DMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceAccessedByFile createCIM_DeviceAccessedByFile() {
		CIM_DeviceAccessedByFileImpl ciM_DeviceAccessedByFile = new CIM_DeviceAccessedByFileImpl();
		return ciM_DeviceAccessedByFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticLog createCIM_DiagnosticLog() {
		CIM_DiagnosticLogImpl ciM_DiagnosticLog = new CIM_DiagnosticLogImpl();
		return ciM_DiagnosticLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticResultForTest createCIM_DiagnosticResultForTest() {
		CIM_DiagnosticResultForTestImpl ciM_DiagnosticResultForTest = new CIM_DiagnosticResultForTestImpl();
		return ciM_DiagnosticResultForTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticSettingForTest createCIM_DiagnosticSettingForTest() {
		CIM_DiagnosticSettingForTestImpl ciM_DiagnosticSettingForTest = new CIM_DiagnosticSettingForTestImpl();
		return ciM_DiagnosticSettingForTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticTestForMSE createCIM_DiagnosticTestForMSE() {
		CIM_DiagnosticTestForMSEImpl ciM_DiagnosticTestForMSE = new CIM_DiagnosticTestForMSEImpl();
		return ciM_DiagnosticTestForMSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticsLog createCIM_DiagnosticsLog() {
		CIM_DiagnosticsLogImpl ciM_DiagnosticsLog = new CIM_DiagnosticsLogImpl();
		return ciM_DiagnosticsLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Export createCIM_Export() {
		CIM_ExportImpl ciM_Export = new CIM_ExportImpl();
		return ciM_Export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FSQuotaManagementService createCIM_FSQuotaManagementService() {
		CIM_FSQuotaManagementServiceImpl ciM_FSQuotaManagementService = new CIM_FSQuotaManagementServiceImpl();
		return ciM_FSQuotaManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileShareSettingData createCIM_FileShareSettingData() {
		CIM_FileShareSettingDataImpl ciM_FileShareSettingData = new CIM_FileShareSettingDataImpl();
		return ciM_FileShareSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileStorage createCIM_FileStorage() {
		CIM_FileStorageImpl ciM_FileStorage = new CIM_FileStorageImpl();
		return ciM_FileStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSystemConfigurationService createCIM_FileSystemConfigurationService() {
		CIM_FileSystemConfigurationServiceImpl ciM_FileSystemConfigurationService = new CIM_FileSystemConfigurationServiceImpl();
		return ciM_FileSystemConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedFileSystem createCIM_HostedFileSystem() {
		CIM_HostedFileSystemImpl ciM_HostedFileSystem = new CIM_HostedFileSystemImpl();
		return ciM_HostedFileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedJobDestination createCIM_HostedJobDestination() {
		CIM_HostedJobDestinationImpl ciM_HostedJobDestination = new CIM_HostedJobDestinationImpl();
		return ciM_HostedJobDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedShare createCIM_HostedShare() {
		CIM_HostedShareImpl ciM_HostedShare = new CIM_HostedShareImpl();
		return ciM_HostedShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IRQ createCIM_IRQ() {
		CIM_IRQImpl ciM_IRQ = new CIM_IRQImpl();
		return ciM_IRQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstalledOS createCIM_InstalledOS() {
		CIM_InstalledOSImpl ciM_InstalledOS = new CIM_InstalledOSImpl();
		return ciM_InstalledOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LastAppliedSnapshot createCIM_LastAppliedSnapshot() {
		CIM_LastAppliedSnapshotImpl ciM_LastAppliedSnapshot = new CIM_LastAppliedSnapshotImpl();
		return ciM_LastAppliedSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocalAccessAvailableToFS createCIM_LocalAccessAvailableToFS() {
		CIM_LocalAccessAvailableToFSImpl ciM_LocalAccessAvailableToFS = new CIM_LocalAccessAvailableToFSImpl();
		return ciM_LocalAccessAvailableToFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogInDataFile createCIM_LogInDataFile() {
		CIM_LogInDataFileImpl ciM_LogInDataFile = new CIM_LogInDataFileImpl();
		return ciM_LogInDataFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogInDeviceFile createCIM_LogInDeviceFile() {
		CIM_LogInDeviceFileImpl ciM_LogInDeviceFile = new CIM_LogInDeviceFileImpl();
		return ciM_LogInDeviceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogInStorage createCIM_LogInStorage() {
		CIM_LogInStorageImpl ciM_LogInStorage = new CIM_LogInStorageImpl();
		return ciM_LogInStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryMappedIO createCIM_MemoryMappedIO() {
		CIM_MemoryMappedIOImpl ciM_MemoryMappedIO = new CIM_MemoryMappedIOImpl();
		return ciM_MemoryMappedIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryResource createCIM_MemoryResource() {
		CIM_MemoryResourceImpl ciM_MemoryResource = new CIM_MemoryResourceImpl();
		return ciM_MemoryResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NFS createCIM_NFS() {
		CIM_NFSImpl ciM_NFS = new CIM_NFSImpl();
		return ciM_NFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NFSShare createCIM_NFSShare() {
		CIM_NFSShareImpl ciM_NFSShare = new CIM_NFSShareImpl();
		return ciM_NFSShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSProcess createCIM_OSProcess() {
		CIM_OSProcessImpl ciM_OSProcess = new CIM_OSProcessImpl();
		return ciM_OSProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OperationLog createCIM_OperationLog() {
		CIM_OperationLogImpl ciM_OperationLog = new CIM_OperationLogImpl();
		return ciM_OperationLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PortResource createCIM_PortResource() {
		CIM_PortResourceImpl ciM_PortResource = new CIM_PortResourceImpl();
		return ciM_PortResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProcessThread createCIM_ProcessThread() {
		CIM_ProcessThreadImpl ciM_ProcessThread = new CIM_ProcessThreadImpl();
		return ciM_ProcessThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ResidesOnExtent createCIM_ResidesOnExtent() {
		CIM_ResidesOnExtentImpl ciM_ResidesOnExtent = new CIM_ResidesOnExtentImpl();
		return ciM_ResidesOnExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ResourceOfSystem createCIM_ResourceOfSystem() {
		CIM_ResourceOfSystemImpl ciM_ResourceOfSystem = new CIM_ResourceOfSystemImpl();
		return ciM_ResourceOfSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RunningOS createCIM_RunningOS() {
		CIM_RunningOSImpl ciM_RunningOS = new CIM_RunningOSImpl();
		return ciM_RunningOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SAPAvailableForFileShare createCIM_SAPAvailableForFileShare() {
		CIM_SAPAvailableForFileShareImpl ciM_SAPAvailableForFileShare = new CIM_SAPAvailableForFileShareImpl();
		return ciM_SAPAvailableForFileShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SnapshotOfVirtualSystem createCIM_SnapshotOfVirtualSystem() {
		CIM_SnapshotOfVirtualSystemImpl ciM_SnapshotOfVirtualSystem = new CIM_SnapshotOfVirtualSystemImpl();
		return ciM_SnapshotOfVirtualSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_UnitaryComputerSystem createCIM_UnitaryComputerSystem() {
		CIM_UnitaryComputerSystemImpl ciM_UnitaryComputerSystem = new CIM_UnitaryComputerSystemImpl();
		return ciM_UnitaryComputerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualComputerSystem createCIM_VirtualComputerSystem() {
		CIM_VirtualComputerSystemImpl ciM_VirtualComputerSystem = new CIM_VirtualComputerSystemImpl();
		return ciM_VirtualComputerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccountManagementService createCIM_AccountManagementService() {
		CIM_AccountManagementServiceImpl ciM_AccountManagementService = new CIM_AccountManagementServiceImpl();
		return ciM_AccountManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccountOnSystem createCIM_AccountOnSystem() {
		CIM_AccountOnSystemImpl ciM_AccountOnSystem = new CIM_AccountOnSystemImpl();
		return ciM_AccountOnSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthenticationService createCIM_AuthenticationService() {
		CIM_AuthenticationServiceImpl ciM_AuthenticationService = new CIM_AuthenticationServiceImpl();
		return ciM_AuthenticationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizationService createCIM_AuthorizationService() {
		CIM_AuthorizationServiceImpl ciM_AuthorizationService = new CIM_AuthorizationServiceImpl();
		return ciM_AuthorizationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthorizedUse createCIM_AuthorizedUse() {
		CIM_AuthorizedUseImpl ciM_AuthorizedUse = new CIM_AuthorizedUseImpl();
		return ciM_AuthorizedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectionInSystem createCIM_CollectionInSystem() {
		CIM_CollectionInSystemImpl ciM_CollectionInSystem = new CIM_CollectionInSystemImpl();
		return ciM_CollectionInSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CredentialManagementService createCIM_CredentialManagementService() {
		CIM_CredentialManagementServiceImpl ciM_CredentialManagementService = new CIM_CredentialManagementServiceImpl();
		return ciM_CredentialManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedACI createCIM_HostedACI() {
		CIM_HostedACIImpl ciM_HostedACI = new CIM_HostedACIImpl();
		return ciM_HostedACI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedAuthenticationRequirement createCIM_HostedAuthenticationRequirement() {
		CIM_HostedAuthenticationRequirementImpl ciM_HostedAuthenticationRequirement = new CIM_HostedAuthenticationRequirementImpl();
		return ciM_HostedAuthenticationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IdentityManagementService createCIM_IdentityManagementService() {
		CIM_IdentityManagementServiceImpl ciM_IdentityManagementService = new CIM_IdentityManagementServiceImpl();
		return ciM_IdentityManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_KerberosKeyDistributionCenter createCIM_KerberosKeyDistributionCenter() {
		CIM_KerberosKeyDistributionCenterImpl ciM_KerberosKeyDistributionCenter = new CIM_KerberosKeyDistributionCenterImpl();
		return ciM_KerberosKeyDistributionCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_KeyBasedCredentialManagementService createCIM_KeyBasedCredentialManagementService() {
		CIM_KeyBasedCredentialManagementServiceImpl ciM_KeyBasedCredentialManagementService = new CIM_KeyBasedCredentialManagementServiceImpl();
		return ciM_KeyBasedCredentialManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocalCredentialManagementService createCIM_LocalCredentialManagementService() {
		CIM_LocalCredentialManagementServiceImpl ciM_LocalCredentialManagementService = new CIM_LocalCredentialManagementServiceImpl();
		return ciM_LocalCredentialManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedCredential createCIM_ManagedCredential() {
		CIM_ManagedCredentialImpl ciM_ManagedCredential = new CIM_ManagedCredentialImpl();
		return ciM_ManagedCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagesAccount createCIM_ManagesAccount() {
		CIM_ManagesAccountImpl ciM_ManagesAccount = new CIM_ManagesAccountImpl();
		return ciM_ManagesAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Notary createCIM_Notary() {
		CIM_NotaryImpl ciM_Notary = new CIM_NotaryImpl();
		return ciM_Notary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NotaryVerifiesBiometric createCIM_NotaryVerifiesBiometric() {
		CIM_NotaryVerifiesBiometricImpl ciM_NotaryVerifiesBiometric = new CIM_NotaryVerifiesBiometricImpl();
		return ciM_NotaryVerifiesBiometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PrivilegeManagementService createCIM_PrivilegeManagementService() {
		CIM_PrivilegeManagementServiceImpl ciM_PrivilegeManagementService = new CIM_PrivilegeManagementServiceImpl();
		return ciM_PrivilegeManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PublicKeyManagementService createCIM_PublicKeyManagementService() {
		CIM_PublicKeyManagementServiceImpl ciM_PublicKeyManagementService = new CIM_PublicKeyManagementServiceImpl();
		return ciM_PublicKeyManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RequireCredentialsFrom createCIM_RequireCredentialsFrom() {
		CIM_RequireCredentialsFromImpl ciM_RequireCredentialsFrom = new CIM_RequireCredentialsFromImpl();
		return ciM_RequireCredentialsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoleBasedAuthorizationService createCIM_RoleBasedAuthorizationService() {
		CIM_RoleBasedAuthorizationServiceImpl ciM_RoleBasedAuthorizationService = new CIM_RoleBasedAuthorizationServiceImpl();
		return ciM_RoleBasedAuthorizationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SecurityServiceForSystem createCIM_SecurityServiceForSystem() {
		CIM_SecurityServiceForSystemImpl ciM_SecurityServiceForSystem = new CIM_SecurityServiceForSystemImpl();
		return ciM_SecurityServiceForSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ServiceUsesSecurityService createCIM_ServiceUsesSecurityService() {
		CIM_ServiceUsesSecurityServiceImpl ciM_ServiceUsesSecurityService = new CIM_ServiceUsesSecurityServiceImpl();
		return ciM_ServiceUsesSecurityService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharedSecretService createCIM_SharedSecretService() {
		CIM_SharedSecretServiceImpl ciM_SharedSecretService = new CIM_SharedSecretServiceImpl();
		return ciM_SharedSecretService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageHardwareIDManagementService createCIM_StorageHardwareIDManagementService() {
		CIM_StorageHardwareIDManagementServiceImpl ciM_StorageHardwareIDManagementService = new CIM_StorageHardwareIDManagementServiceImpl();
		return ciM_StorageHardwareIDManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemAdministrator createCIM_SystemAdministrator() {
		CIM_SystemAdministratorImpl ciM_SystemAdministrator = new CIM_SystemAdministratorImpl();
		return ciM_SystemAdministrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemAdministratorGroup createCIM_SystemAdministratorGroup() {
		CIM_SystemAdministratorGroupImpl ciM_SystemAdministratorGroup = new CIM_SystemAdministratorGroupImpl();
		return ciM_SystemAdministratorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemAdministratorRole createCIM_SystemAdministratorRole() {
		CIM_SystemAdministratorRoleImpl ciM_SystemAdministratorRole = new CIM_SystemAdministratorRoleImpl();
		return ciM_SystemAdministratorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TrustHierarchy createCIM_TrustHierarchy() {
		CIM_TrustHierarchyImpl ciM_TrustHierarchy = new CIM_TrustHierarchyImpl();
		return ciM_TrustHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VerificationService createCIM_VerificationService() {
		CIM_VerificationServiceImpl ciM_VerificationService = new CIM_VerificationServiceImpl();
		return ciM_VerificationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ActionSequence createCIM_ActionSequence() {
		CIM_ActionSequenceImpl ciM_ActionSequence = new CIM_ActionSequenceImpl();
		return ciM_ActionSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ApplicationSystem createCIM_ApplicationSystem() {
		CIM_ApplicationSystemImpl ciM_ApplicationSystem = new CIM_ApplicationSystemImpl();
		return ciM_ApplicationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ApplicationSystemDependency createCIM_ApplicationSystemDependency() {
		CIM_ApplicationSystemDependencyImpl ciM_ApplicationSystemDependency = new CIM_ApplicationSystemDependencyImpl();
		return ciM_ApplicationSystemDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ApplicationSystemDirectory createCIM_ApplicationSystemDirectory() {
		CIM_ApplicationSystemDirectoryImpl ciM_ApplicationSystemDirectory = new CIM_ApplicationSystemDirectoryImpl();
		return ciM_ApplicationSystemDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ApplicationSystemHierarchy createCIM_ApplicationSystemHierarchy() {
		CIM_ApplicationSystemHierarchyImpl ciM_ApplicationSystemHierarchy = new CIM_ApplicationSystemHierarchyImpl();
		return ciM_ApplicationSystemHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ApplicationSystemSoftwareFeature createCIM_ApplicationSystemSoftwareFeature() {
		CIM_ApplicationSystemSoftwareFeatureImpl ciM_ApplicationSystemSoftwareFeature = new CIM_ApplicationSystemSoftwareFeatureImpl();
		return ciM_ApplicationSystemSoftwareFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedAppSystemOverviewStatistics createCIM_AssociatedAppSystemOverviewStatistics() {
		CIM_AssociatedAppSystemOverviewStatisticsImpl ciM_AssociatedAppSystemOverviewStatistics = new CIM_AssociatedAppSystemOverviewStatisticsImpl();
		return ciM_AssociatedAppSystemOverviewStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DirectorySpecification createCIM_DirectorySpecification() {
		CIM_DirectorySpecificationImpl ciM_DirectorySpecification = new CIM_DirectorySpecificationImpl();
		return ciM_DirectorySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskSpaceCheck createCIM_DiskSpaceCheck() {
		CIM_DiskSpaceCheckImpl ciM_DiskSpaceCheck = new CIM_DiskSpaceCheckImpl();
		return ciM_DiskSpaceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExecuteProgram createCIM_ExecuteProgram() {
		CIM_ExecuteProgramImpl ciM_ExecuteProgram = new CIM_ExecuteProgramImpl();
		return ciM_ExecuteProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileSpecification createCIM_FileSpecification() {
		CIM_FileSpecificationImpl ciM_FileSpecification = new CIM_FileSpecificationImpl();
		return ciM_FileSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FromDirectoryAction createCIM_FromDirectoryAction() {
		CIM_FromDirectoryActionImpl ciM_FromDirectoryAction = new CIM_FromDirectoryActionImpl();
		return ciM_FromDirectoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FromDirectorySpecification createCIM_FromDirectorySpecification() {
		CIM_FromDirectorySpecificationImpl ciM_FromDirectorySpecification = new CIM_FromDirectorySpecificationImpl();
		return ciM_FromDirectorySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstalledSoftwareElement createCIM_InstalledSoftwareElement() {
		CIM_InstalledSoftwareElementImpl ciM_InstalledSoftwareElement = new CIM_InstalledSoftwareElementImpl();
		return ciM_InstalledSoftwareElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeAppClientModule createCIM_J2eeAppClientModule() {
		CIM_J2eeAppClientModuleImpl ciM_J2eeAppClientModule = new CIM_J2eeAppClientModuleImpl();
		return ciM_J2eeAppClientModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeApplication createCIM_J2eeApplication() {
		CIM_J2eeApplicationImpl ciM_J2eeApplication = new CIM_J2eeApplicationImpl();
		return ciM_J2eeApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeApplicationModule createCIM_J2eeApplicationModule() {
		CIM_J2eeApplicationModuleImpl ciM_J2eeApplicationModule = new CIM_J2eeApplicationModuleImpl();
		return ciM_J2eeApplicationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeEJBModule createCIM_J2eeEJBModule() {
		CIM_J2eeEJBModuleImpl ciM_J2eeEJBModule = new CIM_J2eeEJBModuleImpl();
		return ciM_J2eeEJBModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJCAConnectionFactoryManagedConnectionFactory createCIM_J2eeJCAConnectionFactoryManagedConnectionFactory() {
		CIM_J2eeJCAConnectionFactoryManagedConnectionFactoryImpl ciM_J2eeJCAConnectionFactoryManagedConnectionFactory = new CIM_J2eeJCAConnectionFactoryManagedConnectionFactoryImpl();
		return ciM_J2eeJCAConnectionFactoryManagedConnectionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJCAResource createCIM_J2eeJCAResource() {
		CIM_J2eeJCAResourceImpl ciM_J2eeJCAResource = new CIM_J2eeJCAResourceImpl();
		return ciM_J2eeJCAResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCDataSourceDriver createCIM_J2eeJDBCDataSourceDriver() {
		CIM_J2eeJDBCDataSourceDriverImpl ciM_J2eeJDBCDataSourceDriver = new CIM_J2eeJDBCDataSourceDriverImpl();
		return ciM_J2eeJDBCDataSourceDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCResource createCIM_J2eeJDBCResource() {
		CIM_J2eeJDBCResourceImpl ciM_J2eeJDBCResource = new CIM_J2eeJDBCResourceImpl();
		return ciM_J2eeJDBCResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJDBCResourceUsesDataSource createCIM_J2eeJDBCResourceUsesDataSource() {
		CIM_J2eeJDBCResourceUsesDataSourceImpl ciM_J2eeJDBCResourceUsesDataSource = new CIM_J2eeJDBCResourceUsesDataSourceImpl();
		return ciM_J2eeJDBCResourceUsesDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJMSResource createCIM_J2eeJMSResource() {
		CIM_J2eeJMSResourceImpl ciM_J2eeJMSResource = new CIM_J2eeJMSResourceImpl();
		return ciM_J2eeJMSResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJNDIResource createCIM_J2eeJNDIResource() {
		CIM_J2eeJNDIResourceImpl ciM_J2eeJNDIResource = new CIM_J2eeJNDIResourceImpl();
		return ciM_J2eeJNDIResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJTAResource createCIM_J2eeJTAResource() {
		CIM_J2eeJTAResourceImpl ciM_J2eeJTAResource = new CIM_J2eeJTAResourceImpl();
		return ciM_J2eeJTAResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeJavaMailResource createCIM_J2eeJavaMailResource() {
		CIM_J2eeJavaMailResourceImpl ciM_J2eeJavaMailResource = new CIM_J2eeJavaMailResourceImpl();
		return ciM_J2eeJavaMailResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeRMI_IIOPResource createCIM_J2eeRMI_IIOPResource() {
		CIM_J2eeRMI_IIOPResourceImpl ciM_J2eeRMI_IIOPResource = new CIM_J2eeRMI_IIOPResourceImpl();
		return ciM_J2eeRMI_IIOPResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeResourceAdapterInModule createCIM_J2eeResourceAdapterInModule() {
		CIM_J2eeResourceAdapterInModuleImpl ciM_J2eeResourceAdapterInModule = new CIM_J2eeResourceAdapterInModuleImpl();
		return ciM_J2eeResourceAdapterInModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeServer createCIM_J2eeServer() {
		CIM_J2eeServerImpl ciM_J2eeServer = new CIM_J2eeServerImpl();
		return ciM_J2eeServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeServerUsesJVM createCIM_J2eeServerUsesJVM() {
		CIM_J2eeServerUsesJVMImpl ciM_J2eeServerUsesJVM = new CIM_J2eeServerUsesJVMImpl();
		return ciM_J2eeServerUsesJVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeServletInModule createCIM_J2eeServletInModule() {
		CIM_J2eeServletInModuleImpl ciM_J2eeServletInModule = new CIM_J2eeServletInModuleImpl();
		return ciM_J2eeServletInModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryCheck createCIM_MemoryCheck() {
		CIM_MemoryCheckImpl ciM_MemoryCheck = new CIM_MemoryCheckImpl();
		return ciM_MemoryCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ModifySettingAction createCIM_ModifySettingAction() {
		CIM_ModifySettingActionImpl ciM_ModifySettingAction = new CIM_ModifySettingActionImpl();
		return ciM_ModifySettingAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSVersionCheck createCIM_OSVersionCheck() {
		CIM_OSVersionCheckImpl ciM_OSVersionCheck = new CIM_OSVersionCheckImpl();
		return ciM_OSVersionCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RebootAction createCIM_RebootAction() {
		CIM_RebootActionImpl ciM_RebootAction = new CIM_RebootActionImpl();
		return ciM_RebootAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemoveDirectoryAction createCIM_RemoveDirectoryAction() {
		CIM_RemoveDirectoryActionImpl ciM_RemoveDirectoryAction = new CIM_RemoveDirectoryActionImpl();
		return ciM_RemoveDirectoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemoveFileAction createCIM_RemoveFileAction() {
		CIM_RemoveFileActionImpl ciM_RemoveFileAction = new CIM_RemoveFileActionImpl();
		return ciM_RemoveFileAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingCheck createCIM_SettingCheck() {
		CIM_SettingCheckImpl ciM_SettingCheck = new CIM_SettingCheckImpl();
		return ciM_SettingCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElementActions createCIM_SoftwareElementActions() {
		CIM_SoftwareElementActionsImpl ciM_SoftwareElementActions = new CIM_SoftwareElementActionsImpl();
		return ciM_SoftwareElementActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElementChecks createCIM_SoftwareElementChecks() {
		CIM_SoftwareElementChecksImpl ciM_SoftwareElementChecks = new CIM_SoftwareElementChecksImpl();
		return ciM_SoftwareElementChecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SoftwareElementVersionCheck createCIM_SoftwareElementVersionCheck() {
		CIM_SoftwareElementVersionCheckImpl ciM_SoftwareElementVersionCheck = new CIM_SoftwareElementVersionCheckImpl();
		return ciM_SoftwareElementVersionCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwapSpaceCheck createCIM_SwapSpaceCheck() {
		CIM_SwapSpaceCheckImpl ciM_SwapSpaceCheck = new CIM_SwapSpaceCheckImpl();
		return ciM_SwapSpaceCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemBIOS createCIM_SystemBIOS() {
		CIM_SystemBIOSImpl ciM_SystemBIOS = new CIM_SystemBIOSImpl();
		return ciM_SystemBIOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VersionCompatibilityCheck createCIM_VersionCompatibilityCheck() {
		CIM_VersionCompatibilityCheckImpl ciM_VersionCompatibilityCheck = new CIM_VersionCompatibilityCheckImpl();
		return ciM_VersionCompatibilityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ActiveConnection createCIM_ActiveConnection() {
		CIM_ActiveConnectionImpl ciM_ActiveConnection = new CIM_ActiveConnectionImpl();
		return ciM_ActiveConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AdminDomain createCIM_AdminDomain() {
		CIM_AdminDomainImpl ciM_AdminDomain = new CIM_AdminDomainImpl();
		return ciM_AdminDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedPowerManagementService createCIM_AssociatedPowerManagementService() {
		CIM_AssociatedPowerManagementServiceImpl ciM_AssociatedPowerManagementService = new CIM_AssociatedPowerManagementServiceImpl();
		return ciM_AssociatedPowerManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BasedOn createCIM_BasedOn() {
		CIM_BasedOnImpl ciM_BasedOn = new CIM_BasedOnImpl();
		return ciM_BasedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BindsTo createCIM_BindsTo() {
		CIM_BindsToImpl ciM_BindsTo = new CIM_BindsToImpl();
		return ciM_BindsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ConfigurationForSystem createCIM_ConfigurationForSystem() {
		CIM_ConfigurationForSystemImpl ciM_ConfigurationForSystem = new CIM_ConfigurationForSystemImpl();
		return ciM_ConfigurationForSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ContainedDomain createCIM_ContainedDomain() {
		CIM_ContainedDomainImpl ciM_ContainedDomain = new CIM_ContainedDomainImpl();
		return ciM_ContainedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceSAPImplementation createCIM_DeviceSAPImplementation() {
		CIM_DeviceSAPImplementationImpl ciM_DeviceSAPImplementation = new CIM_DeviceSAPImplementationImpl();
		return ciM_DeviceSAPImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceServiceImplementation createCIM_DeviceServiceImplementation() {
		CIM_DeviceServiceImplementationImpl ciM_DeviceServiceImplementation = new CIM_DeviceServiceImplementationImpl();
		return ciM_DeviceServiceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceStatistics createCIM_DeviceStatistics() {
		CIM_DeviceStatisticsImpl ciM_DeviceStatistics = new CIM_DeviceStatisticsImpl();
		return ciM_DeviceStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ExtentRedundancyComponent createCIM_ExtentRedundancyComponent() {
		CIM_ExtentRedundancyComponentImpl ciM_ExtentRedundancyComponent = new CIM_ExtentRedundancyComponentImpl();
		return ciM_ExtentRedundancyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedAccessPoint createCIM_HostedAccessPoint() {
		CIM_HostedAccessPointImpl ciM_HostedAccessPoint = new CIM_HostedAccessPointImpl();
		return ciM_HostedAccessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedCollection createCIM_HostedCollection() {
		CIM_HostedCollectionImpl ciM_HostedCollection = new CIM_HostedCollectionImpl();
		return ciM_HostedCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedIPInterface createCIM_HostedIPInterface() {
		CIM_HostedIPInterfaceImpl ciM_HostedIPInterface = new CIM_HostedIPInterfaceImpl();
		return ciM_HostedIPInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedResourcePool createCIM_HostedResourcePool() {
		CIM_HostedResourcePoolImpl ciM_HostedResourcePool = new CIM_HostedResourcePoolImpl();
		return ciM_HostedResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedService createCIM_HostedService() {
		CIM_HostedServiceImpl ciM_HostedService = new CIM_HostedServiceImpl();
		return ciM_HostedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InstalledSoftwareIdentity createCIM_InstalledSoftwareIdentity() {
		CIM_InstalledSoftwareIdentityImpl ciM_InstalledSoftwareIdentity = new CIM_InstalledSoftwareIdentityImpl();
		return ciM_InstalledSoftwareIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LaunchInContextSAP createCIM_LaunchInContextSAP() {
		CIM_LaunchInContextSAPImpl ciM_LaunchInContextSAP = new CIM_LaunchInContextSAPImpl();
		return ciM_LaunchInContextSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LaunchInContextService createCIM_LaunchInContextService() {
		CIM_LaunchInContextServiceImpl ciM_LaunchInContextService = new CIM_LaunchInContextServiceImpl();
		return ciM_LaunchInContextService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OpaqueManagementData createCIM_OpaqueManagementData() {
		CIM_OpaqueManagementDataImpl ciM_OpaqueManagementData = new CIM_OpaqueManagementDataImpl();
		return ciM_OpaqueManagementData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OpaqueManagementDataService createCIM_OpaqueManagementDataService() {
		CIM_OpaqueManagementDataServiceImpl ciM_OpaqueManagementDataService = new CIM_OpaqueManagementDataServiceImpl();
		return ciM_OpaqueManagementDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolService createCIM_ProtocolService() {
		CIM_ProtocolServiceImpl ciM_ProtocolService = new CIM_ProtocolServiceImpl();
		return ciM_ProtocolService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProvidesEndpoint createCIM_ProvidesEndpoint() {
		CIM_ProvidesEndpointImpl ciM_ProvidesEndpoint = new CIM_ProvidesEndpointImpl();
		return ciM_ProvidesEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RawMemory createCIM_RawMemory() {
		CIM_RawMemoryImpl ciM_RawMemory = new CIM_RawMemoryImpl();
		return ciM_RawMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RemotePort createCIM_RemotePort() {
		CIM_RemotePortImpl ciM_RemotePort = new CIM_RemotePortImpl();
		return ciM_RemotePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ScopedView createCIM_ScopedView() {
		CIM_ScopedViewImpl ciM_ScopedView = new CIM_ScopedViewImpl();
		return ciM_ScopedView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingForSystem createCIM_SettingForSystem() {
		CIM_SettingForSystemImpl ciM_SettingForSystem = new CIM_SettingForSystemImpl();
		return ciM_SettingForSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemDeviceView createCIM_SystemDeviceView() {
		CIM_SystemDeviceViewImpl ciM_SystemDeviceView = new CIM_SystemDeviceViewImpl();
		return ciM_SystemDeviceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemManagementService createCIM_VirtualSystemManagementService() {
		CIM_VirtualSystemManagementServiceImpl ciM_VirtualSystemManagementService = new CIM_VirtualSystemManagementServiceImpl();
		return ciM_VirtualSystemManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VirtualSystemSnapshotService createCIM_VirtualSystemSnapshotService() {
		CIM_VirtualSystemSnapshotServiceImpl ciM_VirtualSystemSnapshotService = new CIM_VirtualSystemSnapshotServiceImpl();
		return ciM_VirtualSystemSnapshotService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VisibleMemory createCIM_VisibleMemory() {
		CIM_VisibleMemoryImpl ciM_VisibleMemory = new CIM_VisibleMemoryImpl();
		return ciM_VisibleMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseStorage createCIM_DatabaseStorage() {
		CIM_DatabaseStorageImpl ciM_DatabaseStorage = new CIM_DatabaseStorageImpl();
		return ciM_DatabaseStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DatabaseSystem createCIM_DatabaseSystem() {
		CIM_DatabaseSystemImpl ciM_DatabaseSystem = new CIM_DatabaseSystemImpl();
		return ciM_DatabaseSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AGPVideoController createCIM_AGPVideoController() {
		CIM_AGPVideoControllerImpl ciM_AGPVideoController = new CIM_AGPVideoControllerImpl();
		return ciM_AGPVideoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ATAInitiatorTargetLogicalUnitPath createCIM_ATAInitiatorTargetLogicalUnitPath() {
		CIM_ATAInitiatorTargetLogicalUnitPathImpl ciM_ATAInitiatorTargetLogicalUnitPath = new CIM_ATAInitiatorTargetLogicalUnitPathImpl();
		return ciM_ATAInitiatorTargetLogicalUnitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ATAPort createCIM_ATAPort() {
		CIM_ATAPortImpl ciM_ATAPort = new CIM_ATAPortImpl();
		return ciM_ATAPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AdapterActiveConnection createCIM_AdapterActiveConnection() {
		CIM_AdapterActiveConnectionImpl ciM_AdapterActiveConnection = new CIM_AdapterActiveConnectionImpl();
		return ciM_AdapterActiveConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AggregatePSExtentBasedOnAggregatePExtent createCIM_AggregatePSExtentBasedOnAggregatePExtent() {
		CIM_AggregatePSExtentBasedOnAggregatePExtentImpl ciM_AggregatePSExtentBasedOnAggregatePExtent = new CIM_AggregatePSExtentBasedOnAggregatePExtentImpl();
		return ciM_AggregatePSExtentBasedOnAggregatePExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AggregatePSExtentBasedOnPExtent createCIM_AggregatePSExtentBasedOnPExtent() {
		CIM_AggregatePSExtentBasedOnPExtentImpl ciM_AggregatePSExtentBasedOnPExtent = new CIM_AggregatePSExtentBasedOnPExtentImpl();
		return ciM_AggregatePSExtentBasedOnPExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AggregateRedundancyComponent createCIM_AggregateRedundancyComponent() {
		CIM_AggregateRedundancyComponentImpl ciM_AggregateRedundancyComponent = new CIM_AggregateRedundancyComponentImpl();
		return ciM_AggregateRedundancyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocatedFromStoragePool createCIM_AllocatedFromStoragePool() {
		CIM_AllocatedFromStoragePoolImpl ciM_AllocatedFromStoragePool = new CIM_AllocatedFromStoragePoolImpl();
		return ciM_AllocatedFromStoragePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedBattery createCIM_AssociatedBattery() {
		CIM_AssociatedBatteryImpl ciM_AssociatedBattery = new CIM_AssociatedBatteryImpl();
		return ciM_AssociatedBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedComponentExtent createCIM_AssociatedComponentExtent() {
		CIM_AssociatedComponentExtentImpl ciM_AssociatedComponentExtent = new CIM_AssociatedComponentExtentImpl();
		return ciM_AssociatedComponentExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedCooling createCIM_AssociatedCooling() {
		CIM_AssociatedCoolingImpl ciM_AssociatedCooling = new CIM_AssociatedCoolingImpl();
		return ciM_AssociatedCooling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedIndicatorLED createCIM_AssociatedIndicatorLED() {
		CIM_AssociatedIndicatorLEDImpl ciM_AssociatedIndicatorLED = new CIM_AssociatedIndicatorLEDImpl();
		return ciM_AssociatedIndicatorLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedLabelReader createCIM_AssociatedLabelReader() {
		CIM_AssociatedLabelReaderImpl ciM_AssociatedLabelReader = new CIM_AssociatedLabelReaderImpl();
		return ciM_AssociatedLabelReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedMaskingGroup createCIM_AssociatedMaskingGroup() {
		CIM_AssociatedMaskingGroupImpl ciM_AssociatedMaskingGroup = new CIM_AssociatedMaskingGroupImpl();
		return ciM_AssociatedMaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedMemory createCIM_AssociatedMemory() {
		CIM_AssociatedMemoryImpl ciM_AssociatedMemory = new CIM_AssociatedMemoryImpl();
		return ciM_AssociatedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedProcessorMemory createCIM_AssociatedProcessorMemory() {
		CIM_AssociatedProcessorMemoryImpl ciM_AssociatedProcessorMemory = new CIM_AssociatedProcessorMemoryImpl();
		return ciM_AssociatedProcessorMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedProtocolController createCIM_AssociatedProtocolController() {
		CIM_AssociatedProtocolControllerImpl ciM_AssociatedProtocolController = new CIM_AssociatedProtocolControllerImpl();
		return ciM_AssociatedProtocolController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedRemainingExtent createCIM_AssociatedRemainingExtent() {
		CIM_AssociatedRemainingExtentImpl ciM_AssociatedRemainingExtent = new CIM_AssociatedRemainingExtentImpl();
		return ciM_AssociatedRemainingExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedSensor createCIM_AssociatedSensor() {
		CIM_AssociatedSensorImpl ciM_AssociatedSensor = new CIM_AssociatedSensorImpl();
		return ciM_AssociatedSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedTargetMaskingGroup createCIM_AssociatedTargetMaskingGroup() {
		CIM_AssociatedTargetMaskingGroupImpl ciM_AssociatedTargetMaskingGroup = new CIM_AssociatedTargetMaskingGroupImpl();
		return ciM_AssociatedTargetMaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BIOSLoadedInNV createCIM_BIOSLoadedInNV() {
		CIM_BIOSLoadedInNVImpl ciM_BIOSLoadedInNV = new CIM_BIOSLoadedInNVImpl();
		return ciM_BIOSLoadedInNV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BinarySensor createCIM_BinarySensor() {
		CIM_BinarySensorImpl ciM_BinarySensor = new CIM_BinarySensorImpl();
		return ciM_BinarySensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CDROMDrive createCIM_CDROMDrive() {
		CIM_CDROMDriveImpl ciM_CDROMDrive = new CIM_CDROMDriveImpl();
		return ciM_CDROMDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CacheMemory createCIM_CacheMemory() {
		CIM_CacheMemoryImpl ciM_CacheMemory = new CIM_CacheMemoryImpl();
		return ciM_CacheMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ChangerDevice createCIM_ChangerDevice() {
		CIM_ChangerDeviceImpl ciM_ChangerDevice = new CIM_ChangerDeviceImpl();
		return ciM_ChangerDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CompositeExtentBasedOn createCIM_CompositeExtentBasedOn() {
		CIM_CompositeExtentBasedOnImpl ciM_CompositeExtentBasedOn = new CIM_CompositeExtentBasedOnImpl();
		return ciM_CompositeExtentBasedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemMemory createCIM_ComputerSystemMemory() {
		CIM_ComputerSystemMemoryImpl ciM_ComputerSystemMemory = new CIM_ComputerSystemMemoryImpl();
		return ciM_ComputerSystemMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemProcessor createCIM_ComputerSystemProcessor() {
		CIM_ComputerSystemProcessorImpl ciM_ComputerSystemProcessor = new CIM_ComputerSystemProcessorImpl();
		return ciM_ComputerSystemProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ControlledBy createCIM_ControlledBy() {
		CIM_ControlledByImpl ciM_ControlledBy = new CIM_ControlledByImpl();
		return ciM_ControlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ControllerConfigurationService createCIM_ControllerConfigurationService() {
		CIM_ControllerConfigurationServiceImpl ciM_ControllerConfigurationService = new CIM_ControllerConfigurationServiceImpl();
		return ciM_ControllerConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DSLModem createCIM_DSLModem() {
		CIM_DSLModemImpl ciM_DSLModem = new CIM_DSLModemImpl();
		return ciM_DSLModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DVDDrive createCIM_DVDDrive() {
		CIM_DVDDriveImpl ciM_DVDDrive = new CIM_DVDDriveImpl();
		return ciM_DVDDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DeviceServicesLocation createCIM_DeviceServicesLocation() {
		CIM_DeviceServicesLocationImpl ciM_DeviceServicesLocation = new CIM_DeviceServicesLocationImpl();
		return ciM_DeviceServicesLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiscreteSensor createCIM_DiscreteSensor() {
		CIM_DiscreteSensorImpl ciM_DiscreteSensor = new CIM_DiscreteSensorImpl();
		return ciM_DiscreteSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskDrive createCIM_DiskDrive() {
		CIM_DiskDriveImpl ciM_DiskDrive = new CIM_DiskDriveImpl();
		return ciM_DiskDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DisketteDrive createCIM_DisketteDrive() {
		CIM_DisketteDriveImpl ciM_DisketteDrive = new CIM_DisketteDriveImpl();
		return ciM_DisketteDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DriveInDiskGroup createCIM_DriveInDiskGroup() {
		CIM_DriveInDiskGroupImpl ciM_DriveInDiskGroup = new CIM_DriveInDiskGroupImpl();
		return ciM_DriveInDiskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EthernetAdapter createCIM_EthernetAdapter() {
		CIM_EthernetAdapterImpl ciM_EthernetAdapter = new CIM_EthernetAdapterImpl();
		return ciM_EthernetAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EthernetPort createCIM_EthernetPort() {
		CIM_EthernetPortImpl ciM_EthernetPort = new CIM_EthernetPortImpl();
		return ciM_EthernetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCActiveConnection createCIM_FCActiveConnection() {
		CIM_FCActiveConnectionImpl ciM_FCActiveConnection = new CIM_FCActiveConnectionImpl();
		return ciM_FCActiveConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCPort createCIM_FCPort() {
		CIM_FCPortImpl ciM_FCPort = new CIM_FCPortImpl();
		return ciM_FCPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FCTopologyView createCIM_FCTopologyView() {
		CIM_FCTopologyViewImpl ciM_FCTopologyView = new CIM_FCTopologyViewImpl();
		return ciM_FCTopologyView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibreChannelAdapter createCIM_FibreChannelAdapter() {
		CIM_FibreChannelAdapterImpl ciM_FibreChannelAdapter = new CIM_FibreChannelAdapterImpl();
		return ciM_FibreChannelAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibrePort createCIM_FibrePort() {
		CIM_FibrePortImpl ciM_FibrePort = new CIM_FibrePortImpl();
		return ciM_FibrePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibrePortActiveLogin createCIM_FibrePortActiveLogin() {
		CIM_FibrePortActiveLoginImpl ciM_FibrePortActiveLogin = new CIM_FibrePortActiveLoginImpl();
		return ciM_FibrePortActiveLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FibrePortOnFCAdapter createCIM_FibrePortOnFCAdapter() {
		CIM_FibrePortOnFCAdapterImpl ciM_FibrePortOnFCAdapter = new CIM_FibrePortOnFCAdapterImpl();
		return ciM_FibrePortOnFCAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FlatPanel createCIM_FlatPanel() {
		CIM_FlatPanelImpl ciM_FlatPanel = new CIM_FlatPanelImpl();
		return ciM_FlatPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GenericDiskPartition createCIM_GenericDiskPartition() {
		CIM_GenericDiskPartitionImpl ciM_GenericDiskPartition = new CIM_GenericDiskPartitionImpl();
		return ciM_GenericDiskPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GroupMaskingMappingService createCIM_GroupMaskingMappingService() {
		CIM_GroupMaskingMappingServiceImpl ciM_GroupMaskingMappingService = new CIM_GroupMaskingMappingServiceImpl();
		return ciM_GroupMaskingMappingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HDSLModem createCIM_HDSLModem() {
		CIM_HDSLModemImpl ciM_HDSLModem = new CIM_HDSLModemImpl();
		return ciM_HDSLModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedStoragePool createCIM_HostedStoragePool() {
		CIM_HostedStoragePoolImpl ciM_HostedStoragePool = new CIM_HostedStoragePoolImpl();
		return ciM_HostedStoragePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ISDNModem createCIM_ISDNModem() {
		CIM_ISDNModemImpl ciM_ISDNModem = new CIM_ISDNModemImpl();
		return ciM_ISDNModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InterLibraryPort createCIM_InterLibraryPort() {
		CIM_InterLibraryPortImpl ciM_InterLibraryPort = new CIM_InterLibraryPortImpl();
		return ciM_InterLibraryPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Keyboard createCIM_Keyboard() {
		CIM_KeyboardImpl ciM_Keyboard = new CIM_KeyboardImpl();
		return ciM_Keyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LLDPEthernetPort createCIM_LLDPEthernetPort() {
		CIM_LLDPEthernetPortImpl ciM_LLDPEthernetPort = new CIM_LLDPEthernetPortImpl();
		return ciM_LLDPEthernetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LibraryExchange createCIM_LibraryExchange() {
		CIM_LibraryExchangeImpl ciM_LibraryExchange = new CIM_LibraryExchangeImpl();
		return ciM_LibraryExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LibraryPackage createCIM_LibraryPackage() {
		CIM_LibraryPackageImpl ciM_LibraryPackage = new CIM_LibraryPackageImpl();
		return ciM_LibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LimitedAccessPort createCIM_LimitedAccessPort() {
		CIM_LimitedAccessPortImpl ciM_LimitedAccessPort = new CIM_LimitedAccessPortImpl();
		return ciM_LimitedAccessPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalDiskBasedOnExtent createCIM_LogicalDiskBasedOnExtent() {
		CIM_LogicalDiskBasedOnExtentImpl ciM_LogicalDiskBasedOnExtent = new CIM_LogicalDiskBasedOnExtentImpl();
		return ciM_LogicalDiskBasedOnExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalDiskBasedOnPartition createCIM_LogicalDiskBasedOnPartition() {
		CIM_LogicalDiskBasedOnPartitionImpl ciM_LogicalDiskBasedOnPartition = new CIM_LogicalDiskBasedOnPartitionImpl();
		return ciM_LogicalDiskBasedOnPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalDiskBasedOnVolume createCIM_LogicalDiskBasedOnVolume() {
		CIM_LogicalDiskBasedOnVolumeImpl ciM_LogicalDiskBasedOnVolume = new CIM_LogicalDiskBasedOnVolumeImpl();
		return ciM_LogicalDiskBasedOnVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogicalDiskBasedOnVolumeSet createCIM_LogicalDiskBasedOnVolumeSet() {
		CIM_LogicalDiskBasedOnVolumeSetImpl ciM_LogicalDiskBasedOnVolumeSet = new CIM_LogicalDiskBasedOnVolumeSetImpl();
		return ciM_LogicalDiskBasedOnVolumeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MagnetoOpticalDrive createCIM_MagnetoOpticalDrive() {
		CIM_MagnetoOpticalDriveImpl ciM_MagnetoOpticalDrive = new CIM_MagnetoOpticalDriveImpl();
		return ciM_MagnetoOpticalDrive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MemoryConfigurationService createCIM_MemoryConfigurationService() {
		CIM_MemoryConfigurationServiceImpl ciM_MemoryConfigurationService = new CIM_MemoryConfigurationServiceImpl();
		return ciM_MemoryConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ModulePort createCIM_ModulePort() {
		CIM_ModulePortImpl ciM_ModulePort = new CIM_ModulePortImpl();
		return ciM_ModulePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MultiStateSensor createCIM_MultiStateSensor() {
		CIM_MultiStateSensorImpl ciM_MultiStateSensor = new CIM_MultiStateSensorImpl();
		return ciM_MultiStateSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NumericSensor createCIM_NumericSensor() {
		CIM_NumericSensorImpl ciM_NumericSensor = new CIM_NumericSensorImpl();
		return ciM_NumericSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OOBAlertServiceOnModem createCIM_OOBAlertServiceOnModem() {
		CIM_OOBAlertServiceOnModemImpl ciM_OOBAlertServiceOnModem = new CIM_OOBAlertServiceOnModemImpl();
		return ciM_OOBAlertServiceOnModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OOBAlertServiceOnNetworkAdapter createCIM_OOBAlertServiceOnNetworkAdapter() {
		CIM_OOBAlertServiceOnNetworkAdapterImpl ciM_OOBAlertServiceOnNetworkAdapter = new CIM_OOBAlertServiceOnNetworkAdapterImpl();
		return ciM_OOBAlertServiceOnNetworkAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OOBAlertServiceOnNetworkPort createCIM_OOBAlertServiceOnNetworkPort() {
		CIM_OOBAlertServiceOnNetworkPortImpl ciM_OOBAlertServiceOnNetworkPort = new CIM_OOBAlertServiceOnNetworkPortImpl();
		return ciM_OOBAlertServiceOnNetworkPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OwningPrintQueue createCIM_OwningPrintQueue() {
		CIM_OwningPrintQueueImpl ciM_OwningPrintQueue = new CIM_OwningPrintQueueImpl();
		return ciM_OwningPrintQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCIBridge createCIM_PCIBridge() {
		CIM_PCIBridgeImpl ciM_PCIBridge = new CIM_PCIBridgeImpl();
		return ciM_PCIBridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PCVideoController createCIM_PCVideoController() {
		CIM_PCVideoControllerImpl ciM_PCVideoController = new CIM_PCVideoControllerImpl();
		return ciM_PCVideoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PExtentRedundancyComponent createCIM_PExtentRedundancyComponent() {
		CIM_PExtentRedundancyComponentImpl ciM_PExtentRedundancyComponent = new CIM_PExtentRedundancyComponentImpl();
		return ciM_PExtentRedundancyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_POTSModem createCIM_POTSModem() {
		CIM_POTSModemImpl ciM_POTSModem = new CIM_POTSModemImpl();
		return ciM_POTSModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PSExtentBasedOnPExtent createCIM_PSExtentBasedOnPExtent() {
		CIM_PSExtentBasedOnPExtentImpl ciM_PSExtentBasedOnPExtent = new CIM_PSExtentBasedOnPExtentImpl();
		return ciM_PSExtentBasedOnPExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageAlarm createCIM_PackageAlarm() {
		CIM_PackageAlarmImpl ciM_PackageAlarm = new CIM_PackageAlarmImpl();
		return ciM_PackageAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageCooling createCIM_PackageCooling() {
		CIM_PackageCoolingImpl ciM_PackageCooling = new CIM_PackageCoolingImpl();
		return ciM_PackageCooling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PickerForChanger createCIM_PickerForChanger() {
		CIM_PickerForChangerImpl ciM_PickerForChanger = new CIM_PickerForChangerImpl();
		return ciM_PickerForChanger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PickerLabelReader createCIM_PickerLabelReader() {
		CIM_PickerLabelReaderImpl ciM_PickerLabelReader = new CIM_PickerLabelReaderImpl();
		return ciM_PickerLabelReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PointingDevice createCIM_PointingDevice() {
		CIM_PointingDeviceImpl ciM_PointingDevice = new CIM_PointingDeviceImpl();
		return ciM_PointingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PortImplementsEndpoint createCIM_PortImplementsEndpoint() {
		CIM_PortImplementsEndpointImpl ciM_PortImplementsEndpoint = new CIM_PortImplementsEndpointImpl();
		return ciM_PortImplementsEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtectedExtentBasedOn createCIM_ProtectedExtentBasedOn() {
		CIM_ProtectedExtentBasedOnImpl ciM_ProtectedExtentBasedOn = new CIM_ProtectedExtentBasedOnImpl();
		return ciM_ProtectedExtentBasedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ProtocolControllerAccessesUnit createCIM_ProtocolControllerAccessesUnit() {
		CIM_ProtocolControllerAccessesUnitImpl ciM_ProtocolControllerAccessesUnit = new CIM_ProtocolControllerAccessesUnitImpl();
		return ciM_ProtocolControllerAccessesUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RealizedOnSide createCIM_RealizedOnSide() {
		CIM_RealizedOnSideImpl ciM_RealizedOnSide = new CIM_RealizedOnSideImpl();
		return ciM_RealizedOnSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RealizesAggregatePExtent createCIM_RealizesAggregatePExtent() {
		CIM_RealizesAggregatePExtentImpl ciM_RealizesAggregatePExtent = new CIM_RealizesAggregatePExtentImpl();
		return ciM_RealizesAggregatePExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RealizesTapePartition createCIM_RealizesTapePartition() {
		CIM_RealizesTapePartitionImpl ciM_RealizesTapePartition = new CIM_RealizesTapePartitionImpl();
		return ciM_RealizesTapePartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplicaPoolForStorage createCIM_ReplicaPoolForStorage() {
		CIM_ReplicaPoolForStorageImpl ciM_ReplicaPoolForStorage = new CIM_ReplicaPoolForStorageImpl();
		return ciM_ReplicaPoolForStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplicationService createCIM_ReplicationService() {
		CIM_ReplicationServiceImpl ciM_ReplicationService = new CIM_ReplicationServiceImpl();
		return ciM_ReplicationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReplicationServiceCapabilities createCIM_ReplicationServiceCapabilities() {
		CIM_ReplicationServiceCapabilitiesImpl ciM_ReplicationServiceCapabilities = new CIM_ReplicationServiceCapabilitiesImpl();
		return ciM_ReplicationServiceCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SCSIInterface createCIM_SCSIInterface() {
		CIM_SCSIInterfaceImpl ciM_SCSIInterface = new CIM_SCSIInterfaceImpl();
		return ciM_SCSIInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SDSLModem createCIM_SDSLModem() {
		CIM_SDSLModemImpl ciM_SDSLModem = new CIM_SDSLModemImpl();
		return ciM_SDSLModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SerialInterface createCIM_SerialInterface() {
		CIM_SerialInterfaceImpl ciM_SerialInterface = new CIM_SerialInterfaceImpl();
		return ciM_SerialInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SpareConfigurationService createCIM_SpareConfigurationService() {
		CIM_SpareConfigurationServiceImpl ciM_SpareConfigurationService = new CIM_SpareConfigurationServiceImpl();
		return ciM_SpareConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageConfigurationCapabilities createCIM_StorageConfigurationCapabilities() {
		CIM_StorageConfigurationCapabilitiesImpl ciM_StorageConfigurationCapabilities = new CIM_StorageConfigurationCapabilitiesImpl();
		return ciM_StorageConfigurationCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageConfigurationService createCIM_StorageConfigurationService() {
		CIM_StorageConfigurationServiceImpl ciM_StorageConfigurationService = new CIM_StorageConfigurationServiceImpl();
		return ciM_StorageConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageElementCompositionService createCIM_StorageElementCompositionService() {
		CIM_StorageElementCompositionServiceImpl ciM_StorageElementCompositionService = new CIM_StorageElementCompositionServiceImpl();
		return ciM_StorageElementCompositionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageElementDriveDependency createCIM_StorageElementDriveDependency() {
		CIM_StorageElementDriveDependencyImpl ciM_StorageElementDriveDependency = new CIM_StorageElementDriveDependencyImpl();
		return ciM_StorageElementDriveDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageProcessorAffinity createCIM_StorageProcessorAffinity() {
		CIM_StorageProcessorAffinityImpl ciM_StorageProcessorAffinity = new CIM_StorageProcessorAffinityImpl();
		return ciM_StorageProcessorAffinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_StorageRelocationService createCIM_StorageRelocationService() {
		CIM_StorageRelocationServiceImpl ciM_StorageRelocationService = new CIM_StorageRelocationServiceImpl();
		return ciM_StorageRelocationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Tachometer createCIM_Tachometer() {
		CIM_TachometerImpl ciM_Tachometer = new CIM_TachometerImpl();
		return ciM_Tachometer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TapePartitionOnSurface createCIM_TapePartitionOnSurface() {
		CIM_TapePartitionOnSurfaceImpl ciM_TapePartitionOnSurface = new CIM_TapePartitionOnSurfaceImpl();
		return ciM_TapePartitionOnSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TemperatureSensor createCIM_TemperatureSensor() {
		CIM_TemperatureSensorImpl ciM_TemperatureSensor = new CIM_TemperatureSensorImpl();
		return ciM_TemperatureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TierDomain createCIM_TierDomain() {
		CIM_TierDomainImpl ciM_TierDomain = new CIM_TierDomainImpl();
		return ciM_TierDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TierService createCIM_TierService() {
		CIM_TierServiceImpl ciM_TierService = new CIM_TierServiceImpl();
		return ciM_TierService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBConnection createCIM_USBConnection() {
		CIM_USBConnectionImpl ciM_USBConnection = new CIM_USBConnectionImpl();
		return ciM_USBConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_USBControllerHasHub createCIM_USBControllerHasHub() {
		CIM_USBControllerHasHubImpl ciM_USBControllerHasHub = new CIM_USBControllerHasHubImpl();
		return ciM_USBControllerHasHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Unimodem createCIM_Unimodem() {
		CIM_UnimodemImpl ciM_Unimodem = new CIM_UnimodemImpl();
		return ciM_Unimodem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VDSLModem createCIM_VDSLModem() {
		CIM_VDSLModemImpl ciM_VDSLModem = new CIM_VDSLModemImpl();
		return ciM_VDSLModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VTLStatisticalDataService createCIM_VTLStatisticalDataService() {
		CIM_VTLStatisticalDataServiceImpl ciM_VTLStatisticalDataService = new CIM_VTLStatisticalDataServiceImpl();
		return ciM_VTLStatisticalDataService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VTOCDiskPartition createCIM_VTOCDiskPartition() {
		CIM_VTOCDiskPartitionImpl ciM_VTOCDiskPartition = new CIM_VTOCDiskPartitionImpl();
		return ciM_VTOCDiskPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VoltageSensor createCIM_VoltageSensor() {
		CIM_VoltageSensorImpl ciM_VoltageSensor = new CIM_VoltageSensorImpl();
		return ciM_VoltageSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VolumeSetBasedOnPSExtent createCIM_VolumeSetBasedOnPSExtent() {
		CIM_VolumeSetBasedOnPSExtentImpl ciM_VolumeSetBasedOnPSExtent = new CIM_VolumeSetBasedOnPSExtentImpl();
		return ciM_VolumeSetBasedOnPSExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WakeUpServiceOnModem createCIM_WakeUpServiceOnModem() {
		CIM_WakeUpServiceOnModemImpl ciM_WakeUpServiceOnModem = new CIM_WakeUpServiceOnModemImpl();
		return ciM_WakeUpServiceOnModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WakeUpServiceOnNetworkAdapter createCIM_WakeUpServiceOnNetworkAdapter() {
		CIM_WakeUpServiceOnNetworkAdapterImpl ciM_WakeUpServiceOnNetworkAdapter = new CIM_WakeUpServiceOnNetworkAdapterImpl();
		return ciM_WakeUpServiceOnNetworkAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WakeUpServiceOnNetworkPort createCIM_WakeUpServiceOnNetworkPort() {
		CIM_WakeUpServiceOnNetworkPortImpl ciM_WakeUpServiceOnNetworkPort = new CIM_WakeUpServiceOnNetworkPortImpl();
		return ciM_WakeUpServiceOnNetworkPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiEndpoint createCIM_WiFiEndpoint() {
		CIM_WiFiEndpointImpl ciM_WiFiEndpoint = new CIM_WiFiEndpointImpl();
		return ciM_WiFiEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_WiFiPortConfigurationService createCIM_WiFiPortConfigurationService() {
		CIM_WiFiPortConfigurationServiceImpl ciM_WiFiPortConfigurationService = new CIM_WiFiPortConfigurationServiceImpl();
		return ciM_WiFiPortConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecPolicyForEndpoint createCIM_IPsecPolicyForEndpoint() {
		CIM_IPsecPolicyForEndpointImpl ciM_IPsecPolicyForEndpoint = new CIM_IPsecPolicyForEndpointImpl();
		return ciM_IPsecPolicyForEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RuleThatGeneratedSA createCIM_RuleThatGeneratedSA() {
		CIM_RuleThatGeneratedSAImpl ciM_RuleThatGeneratedSA = new CIM_RuleThatGeneratedSAImpl();
		return ciM_RuleThatGeneratedSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CommMechanismForAdapter createCIM_CommMechanismForAdapter() {
		CIM_CommMechanismForAdapterImpl ciM_CommMechanismForAdapter = new CIM_CommMechanismForAdapterImpl();
		return ciM_CommMechanismForAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CommMechanismForManager createCIM_CommMechanismForManager() {
		CIM_CommMechanismForManagerImpl ciM_CommMechanismForManager = new CIM_CommMechanismForManagerImpl();
		return ciM_CommMechanismForManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CommMechanismForObjectManagerAdapter createCIM_CommMechanismForObjectManagerAdapter() {
		CIM_CommMechanismForObjectManagerAdapterImpl ciM_CommMechanismForObjectManagerAdapter = new CIM_CommMechanismForObjectManagerAdapterImpl();
		return ciM_CommMechanismForObjectManagerAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NamespaceInManager createCIM_NamespaceInManager() {
		CIM_NamespaceInManagerImpl ciM_NamespaceInManager = new CIM_NamespaceInManagerImpl();
		return ciM_NamespaceInManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AFService createCIM_AFService() {
		CIM_AFServiceImpl ciM_AFService = new CIM_AFServiceImpl();
		return ciM_AFService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AutonomousSystem createCIM_AutonomousSystem() {
		CIM_AutonomousSystemImpl ciM_AutonomousSystem = new CIM_AutonomousSystemImpl();
		return ciM_AutonomousSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPAdminDistance createCIM_BGPAdminDistance() {
		CIM_BGPAdminDistanceImpl ciM_BGPAdminDistance = new CIM_BGPAdminDistanceImpl();
		return ciM_BGPAdminDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPClustersInAS createCIM_BGPClustersInAS() {
		CIM_BGPClustersInASImpl ciM_BGPClustersInAS = new CIM_BGPClustersInASImpl();
		return ciM_BGPClustersInAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPPeerGroupService createCIM_BGPPeerGroupService() {
		CIM_BGPPeerGroupServiceImpl ciM_BGPPeerGroupService = new CIM_BGPPeerGroupServiceImpl();
		return ciM_BGPPeerGroupService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPRoutingPolicy createCIM_BGPRoutingPolicy() {
		CIM_BGPRoutingPolicyImpl ciM_BGPRoutingPolicy = new CIM_BGPRoutingPolicyImpl();
		return ciM_BGPRoutingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BindsToLANEndpoint createCIM_BindsToLANEndpoint() {
		CIM_BindsToLANEndpointImpl ciM_BindsToLANEndpoint = new CIM_BindsToLANEndpointImpl();
		return ciM_BindsToLANEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassifierElement createCIM_ClassifierElement() {
		CIM_ClassifierElementImpl ciM_ClassifierElement = new CIM_ClassifierElementImpl();
		return ciM_ClassifierElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassifierElementInClassifierService createCIM_ClassifierElementInClassifierService() {
		CIM_ClassifierElementInClassifierServiceImpl ciM_ClassifierElementInClassifierService = new CIM_ClassifierElementInClassifierServiceImpl();
		return ciM_ClassifierElementInClassifierService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassifierElementUsesFilterList createCIM_ClassifierElementUsesFilterList() {
		CIM_ClassifierElementUsesFilterListImpl ciM_ClassifierElementUsesFilterList = new CIM_ClassifierElementUsesFilterListImpl();
		return ciM_ClassifierElementUsesFilterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClassifierFilterSet createCIM_ClassifierFilterSet() {
		CIM_ClassifierFilterSetImpl ciM_ClassifierFilterSet = new CIM_ClassifierFilterSetImpl();
		return ciM_ClassifierFilterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Confederation createCIM_Confederation() {
		CIM_ConfederationImpl ciM_Confederation = new CIM_ConfederationImpl();
		return ciM_Confederation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EndpointInLink createCIM_EndpointInLink() {
		CIM_EndpointInLinkImpl ciM_EndpointInLink = new CIM_EndpointInLinkImpl();
		return ciM_EndpointInLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FailNextScheduler createCIM_FailNextScheduler() {
		CIM_FailNextSchedulerImpl ciM_FailNextScheduler = new CIM_FailNextSchedulerImpl();
		return ciM_FailNextScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterEntryInSystem createCIM_FilterEntryInSystem() {
		CIM_FilterEntryInSystemImpl ciM_FilterEntryInSystem = new CIM_FilterEntryInSystemImpl();
		return ciM_FilterEntryInSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterListInSystem createCIM_FilterListInSystem() {
		CIM_FilterListInSystemImpl ciM_FilterListInSystem = new CIM_FilterListInSystemImpl();
		return ciM_FilterListInSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FilterOfSecurityAssociation createCIM_FilterOfSecurityAssociation() {
		CIM_FilterOfSecurityAssociationImpl ciM_FilterOfSecurityAssociation = new CIM_FilterOfSecurityAssociationImpl();
		return ciM_FilterOfSecurityAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ForwardedRoutes createCIM_ForwardedRoutes() {
		CIM_ForwardedRoutesImpl ciM_ForwardedRoutes = new CIM_ForwardedRoutesImpl();
		return ciM_ForwardedRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedAdminDistance createCIM_HostedAdminDistance() {
		CIM_HostedAdminDistanceImpl ciM_HostedAdminDistance = new CIM_HostedAdminDistanceImpl();
		return ciM_HostedAdminDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedBGPAttributes createCIM_HostedBGPAttributes() {
		CIM_HostedBGPAttributesImpl ciM_HostedBGPAttributes = new CIM_HostedBGPAttributesImpl();
		return ciM_HostedBGPAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedBGPPeerGroup createCIM_HostedBGPPeerGroup() {
		CIM_HostedBGPPeerGroupImpl ciM_HostedBGPPeerGroup = new CIM_HostedBGPPeerGroupImpl();
		return ciM_HostedBGPPeerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedBGPRouteMap createCIM_HostedBGPRouteMap() {
		CIM_HostedBGPRouteMapImpl ciM_HostedBGPRouteMap = new CIM_HostedBGPRouteMapImpl();
		return ciM_HostedBGPRouteMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedFilterEntryBase createCIM_HostedFilterEntryBase() {
		CIM_HostedFilterEntryBaseImpl ciM_HostedFilterEntryBase = new CIM_HostedFilterEntryBaseImpl();
		return ciM_HostedFilterEntryBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedFilterList createCIM_HostedFilterList() {
		CIM_HostedFilterListImpl ciM_HostedFilterList = new CIM_HostedFilterListImpl();
		return ciM_HostedFilterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedForwardingServices createCIM_HostedForwardingServices() {
		CIM_HostedForwardingServicesImpl ciM_HostedForwardingServices = new CIM_HostedForwardingServicesImpl();
		return ciM_HostedForwardingServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedRoutingPolicy createCIM_HostedRoutingPolicy() {
		CIM_HostedRoutingPolicyImpl ciM_HostedRoutingPolicy = new CIM_HostedRoutingPolicyImpl();
		return ciM_HostedRoutingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedRoutingServices createCIM_HostedRoutingServices() {
		CIM_HostedRoutingServicesImpl ciM_HostedRoutingServices = new CIM_HostedRoutingServicesImpl();
		return ciM_HostedRoutingServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IKESAEndpoint createCIM_IKESAEndpoint() {
		CIM_IKESAEndpointImpl ciM_IKESAEndpoint = new CIM_IKESAEndpointImpl();
		return ciM_IKESAEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPConfigurationService createCIM_IPConfigurationService() {
		CIM_IPConfigurationServiceImpl ciM_IPConfigurationService = new CIM_IPConfigurationServiceImpl();
		return ciM_IPConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPEncapsulationManagementService createCIM_IPEncapsulationManagementService() {
		CIM_IPEncapsulationManagementServiceImpl ciM_IPEncapsulationManagementService = new CIM_IPEncapsulationManagementServiceImpl();
		return ciM_IPEncapsulationManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPLoopback createCIM_IPLoopback() {
		CIM_IPLoopbackImpl ciM_IPLoopback = new CIM_IPLoopbackImpl();
		return ciM_IPLoopback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPSubinterface createCIM_IPSubinterface() {
		CIM_IPSubinterfaceImpl ciM_IPSubinterface = new CIM_IPSubinterfaceImpl();
		return ciM_IPSubinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IPsecSAEndpoint createCIM_IPsecSAEndpoint() {
		CIM_IPsecSAEndpointImpl ciM_IPsecSAEndpoint = new CIM_IPsecSAEndpointImpl();
		return ciM_IPsecSAEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InBGPPeerGroup createCIM_InBGPPeerGroup() {
		CIM_InBGPPeerGroupImpl ciM_InBGPPeerGroup = new CIM_InBGPPeerGroupImpl();
		return ciM_InBGPPeerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InSegment createCIM_InSegment() {
		CIM_InSegmentImpl ciM_InSegment = new CIM_InSegmentImpl();
		return ciM_InSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_InboundVLAN createCIM_InboundVLAN() {
		CIM_InboundVLANImpl ciM_InboundVLAN = new CIM_InboundVLANImpl();
		return ciM_InboundVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Network createCIM_Network() {
		CIM_NetworkImpl ciM_Network = new CIM_NetworkImpl();
		return ciM_Network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworkServicesInAdminDomain createCIM_NetworkServicesInAdminDomain() {
		CIM_NetworkServicesInAdminDomainImpl ciM_NetworkServicesInAdminDomain = new CIM_NetworkServicesInAdminDomainImpl();
		return ciM_NetworkServicesInAdminDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NetworksInAdminDomain createCIM_NetworksInAdminDomain() {
		CIM_NetworksInAdminDomainImpl ciM_NetworksInAdminDomain = new CIM_NetworksInAdminDomainImpl();
		return ciM_NetworksInAdminDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_NextServiceAfterClassifierElement createCIM_NextServiceAfterClassifierElement() {
		CIM_NextServiceAfterClassifierElementImpl ciM_NextServiceAfterClassifierElement = new CIM_NextServiceAfterClassifierElementImpl();
		return ciM_NextServiceAfterClassifierElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFProtocolEndpoint createCIM_OSPFProtocolEndpoint() {
		CIM_OSPFProtocolEndpointImpl ciM_OSPFProtocolEndpoint = new CIM_OSPFProtocolEndpointImpl();
		return ciM_OSPFProtocolEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OutboundVLAN createCIM_OutboundVLAN() {
		CIM_OutboundVLANImpl ciM_OutboundVLAN = new CIM_OutboundVLANImpl();
		return ciM_OutboundVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PeerOfSAEndpoint createCIM_PeerOfSAEndpoint() {
		CIM_PeerOfSAEndpointImpl ciM_PeerOfSAEndpoint = new CIM_PeerOfSAEndpointImpl();
		return ciM_PeerOfSAEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Phase1SAUsedForPhase2 createCIM_Phase1SAUsedForPhase2() {
		CIM_Phase1SAUsedForPhase2Impl ciM_Phase1SAUsedForPhase2 = new CIM_Phase1SAUsedForPhase2Impl();
		return ciM_Phase1SAUsedForPhase2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RelatedSpanningTree createCIM_RelatedSpanningTree() {
		CIM_RelatedSpanningTreeImpl ciM_RelatedSpanningTree = new CIM_RelatedSpanningTreeImpl();
		return ciM_RelatedSpanningTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RelatedTransparentBridgingService createCIM_RelatedTransparentBridgingService() {
		CIM_RelatedTransparentBridgingServiceImpl ciM_RelatedTransparentBridgingService = new CIM_RelatedTransparentBridgingServiceImpl();
		return ciM_RelatedTransparentBridgingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoutersInAS createCIM_RoutersInAS() {
		CIM_RoutersInASImpl ciM_RoutersInAS = new CIM_RoutersInASImpl();
		return ciM_RoutersInAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoutersInBGPCluster createCIM_RoutersInBGPCluster() {
		CIM_RoutersInBGPClusterImpl ciM_RoutersInBGPCluster = new CIM_RoutersInBGPClusterImpl();
		return ciM_RoutersInBGPCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoutingProtocolDomain createCIM_RoutingProtocolDomain() {
		CIM_RoutingProtocolDomainImpl ciM_RoutingProtocolDomain = new CIM_RoutingProtocolDomainImpl();
		return ciM_RoutingProtocolDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RoutingProtocolDomainInAS createCIM_RoutingProtocolDomainInAS() {
		CIM_RoutingProtocolDomainInASImpl ciM_RoutingProtocolDomainInAS = new CIM_RoutingProtocolDomainInASImpl();
		return ciM_RoutingProtocolDomainInAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SNMPTrapTarget createCIM_SNMPTrapTarget() {
		CIM_SNMPTrapTargetImpl ciM_SNMPTrapTarget = new CIM_SNMPTrapTargetImpl();
		return ciM_SNMPTrapTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SwitchServiceTransparentBridging createCIM_SwitchServiceTransparentBridging() {
		CIM_SwitchServiceTransparentBridgingImpl ciM_SwitchServiceTransparentBridging = new CIM_SwitchServiceTransparentBridgingImpl();
		return ciM_SwitchServiceTransparentBridging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Switchable createCIM_Switchable() {
		CIM_SwitchableImpl ciM_Switchable = new CIM_SwitchableImpl();
		return ciM_Switchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TransformOfSecurityAssociation createCIM_TransformOfSecurityAssociation() {
		CIM_TransformOfSecurityAssociationImpl ciM_TransformOfSecurityAssociation = new CIM_TransformOfSecurityAssociationImpl();
		return ciM_TransformOfSecurityAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_TransparentBridgingDynamicForwarding createCIM_TransparentBridgingDynamicForwarding() {
		CIM_TransparentBridgingDynamicForwardingImpl ciM_TransparentBridgingDynamicForwarding = new CIM_TransparentBridgingDynamicForwardingImpl();
		return ciM_TransparentBridgingDynamicForwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VLANNetwork createCIM_VLANNetwork() {
		CIM_VLANNetworkImpl ciM_VLANNetwork = new CIM_VLANNetworkImpl();
		return ciM_VLANNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_VRFConfigurationService createCIM_VRFConfigurationService() {
		CIM_VRFConfigurationServiceImpl ciM_VRFConfigurationService = new CIM_VRFConfigurationServiceImpl();
		return ciM_VRFConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_iSCSIConfigurationService createCIM_iSCSIConfigurationService() {
		CIM_iSCSIConfigurationServiceImpl ciM_iSCSIConfigurationService = new CIM_iSCSIConfigurationServiceImpl();
		return ciM_iSCSIConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AcceptCredentialFrom createCIM_AcceptCredentialFrom() {
		CIM_AcceptCredentialFromImpl ciM_AcceptCredentialFrom = new CIM_AcceptCredentialFromImpl();
		return ciM_AcceptCredentialFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyGroupInSystem createCIM_PolicyGroupInSystem() {
		CIM_PolicyGroupInSystemImpl ciM_PolicyGroupInSystem = new CIM_PolicyGroupInSystemImpl();
		return ciM_PolicyGroupInSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRepository createCIM_PolicyRepository() {
		CIM_PolicyRepositoryImpl ciM_PolicyRepository = new CIM_PolicyRepositoryImpl();
		return ciM_PolicyRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRepositoryInPolicyRepository createCIM_PolicyRepositoryInPolicyRepository() {
		CIM_PolicyRepositoryInPolicyRepositoryImpl ciM_PolicyRepositoryInPolicyRepository = new CIM_PolicyRepositoryInPolicyRepositoryImpl();
		return ciM_PolicyRepositoryInPolicyRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRoleCollectionInSystem createCIM_PolicyRoleCollectionInSystem() {
		CIM_PolicyRoleCollectionInSystemImpl ciM_PolicyRoleCollectionInSystem = new CIM_PolicyRoleCollectionInSystemImpl();
		return ciM_PolicyRoleCollectionInSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyRuleInSystem createCIM_PolicyRuleInSystem() {
		CIM_PolicyRuleInSystemImpl ciM_PolicyRuleInSystem = new CIM_PolicyRuleInSystemImpl();
		return ciM_PolicyRuleInSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReusablePolicyContainer createCIM_ReusablePolicyContainer() {
		CIM_ReusablePolicyContainerImpl ciM_ReusablePolicyContainer = new CIM_ReusablePolicyContainerImpl();
		return ciM_ReusablePolicyContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AllocatedDMA createCIM_AllocatedDMA() {
		CIM_AllocatedDMAImpl ciM_AllocatedDMA = new CIM_AllocatedDMAImpl();
		return ciM_AllocatedDMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BootService createCIM_BootService() {
		CIM_BootServiceImpl ciM_BootService = new CIM_BootServiceImpl();
		return ciM_BootService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BootServiceAccessBySAP createCIM_BootServiceAccessBySAP() {
		CIM_BootServiceAccessBySAPImpl ciM_BootServiceAccessBySAP = new CIM_BootServiceAccessBySAPImpl();
		return ciM_BootServiceAccessBySAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CIFSShare createCIM_CIFSShare() {
		CIM_CIFSShareImpl ciM_CIFSShare = new CIM_CIFSShareImpl();
		return ciM_CIFSShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Cluster createCIM_Cluster() {
		CIM_ClusterImpl ciM_Cluster = new CIM_ClusterImpl();
		return ciM_Cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClusteringService createCIM_ClusteringService() {
		CIM_ClusteringServiceImpl ciM_ClusteringService = new CIM_ClusteringServiceImpl();
		return ciM_ClusteringService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComponentCS createCIM_ComponentCS() {
		CIM_ComponentCSImpl ciM_ComponentCS = new CIM_ComponentCSImpl();
		return ciM_ComponentCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemResource createCIM_ComputerSystemResource() {
		CIM_ComputerSystemResourceImpl ciM_ComputerSystemResource = new CIM_ComputerSystemResourceImpl();
		return ciM_ComputerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileExportService createCIM_FileExportService() {
		CIM_FileExportServiceImpl ciM_FileExportService = new CIM_FileExportServiceImpl();
		return ciM_FileExportService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_FileServerConfigurationService createCIM_FileServerConfigurationService() {
		CIM_FileServerConfigurationServiceImpl ciM_FileServerConfigurationService = new CIM_FileServerConfigurationServiceImpl();
		return ciM_FileServerConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedBootSAP createCIM_HostedBootSAP() {
		CIM_HostedBootSAPImpl ciM_HostedBootSAP = new CIM_HostedBootSAPImpl();
		return ciM_HostedBootSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedBootService createCIM_HostedBootService() {
		CIM_HostedBootServiceImpl ciM_HostedBootService = new CIM_HostedBootServiceImpl();
		return ciM_HostedBootService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedClusterSAP createCIM_HostedClusterSAP() {
		CIM_HostedClusterSAPImpl ciM_HostedClusterSAP = new CIM_HostedClusterSAPImpl();
		return ciM_HostedClusterSAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedClusterService createCIM_HostedClusterService() {
		CIM_HostedClusterServiceImpl ciM_HostedClusterService = new CIM_HostedClusterServiceImpl();
		return ciM_HostedClusterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostingCS createCIM_HostingCS() {
		CIM_HostingCSImpl ciM_HostingCS = new CIM_HostingCSImpl();
		return ciM_HostingCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ParticipatingCS createCIM_ParticipatingCS() {
		CIM_ParticipatingCSImpl ciM_ParticipatingCS = new CIM_ParticipatingCSImpl();
		return ciM_ParticipatingCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SystemPartition createCIM_SystemPartition() {
		CIM_SystemPartitionImpl ciM_SystemPartition = new CIM_SystemPartitionImpl();
		return ciM_SystemPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AuthenticateForUse createCIM_AuthenticateForUse() {
		CIM_AuthenticateForUseImpl ciM_AuthenticateForUse = new CIM_AuthenticateForUseImpl();
		return ciM_AuthenticateForUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CertificateAuthority createCIM_CertificateAuthority() {
		CIM_CertificateAuthorityImpl ciM_CertificateAuthority = new CIM_CertificateAuthorityImpl();
		return ciM_CertificateAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CertificateManagementService createCIM_CertificateManagementService() {
		CIM_CertificateManagementServiceImpl ciM_CertificateManagementService = new CIM_CertificateManagementServiceImpl();
		return ciM_CertificateManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_IKESecretIsNamed createCIM_IKESecretIsNamed() {
		CIM_IKESecretIsNamedImpl ciM_IKESecretIsNamed = new CIM_IKESecretIsNamedImpl();
		return ciM_IKESecretIsNamed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_KDCIssuesKerberosTicket createCIM_KDCIssuesKerberosTicket() {
		CIM_KDCIssuesKerberosTicketImpl ciM_KDCIssuesKerberosTicket = new CIM_KDCIssuesKerberosTicketImpl();
		return ciM_KDCIssuesKerberosTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LocallyManagedPublicKey createCIM_LocallyManagedPublicKey() {
		CIM_LocallyManagedPublicKeyImpl ciM_LocallyManagedPublicKey = new CIM_LocallyManagedPublicKeyImpl();
		return ciM_LocallyManagedPublicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagesAccountOnSystem createCIM_ManagesAccountOnSystem() {
		CIM_ManagesAccountOnSystemImpl ciM_ManagesAccountOnSystem = new CIM_ManagesAccountOnSystemImpl();
		return ciM_ManagesAccountOnSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SharedSecretIsShared createCIM_SharedSecretIsShared() {
		CIM_SharedSecretIsSharedImpl ciM_SharedSecretIsShared = new CIM_SharedSecretIsSharedImpl();
		return ciM_SharedSecretIsShared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ArchitectureCheck createCIM_ArchitectureCheck() {
		CIM_ArchitectureCheckImpl ciM_ArchitectureCheck = new CIM_ArchitectureCheckImpl();
		return ciM_ArchitectureCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CopyFileAction createCIM_CopyFileAction() {
		CIM_CopyFileActionImpl ciM_CopyFileAction = new CIM_CopyFileActionImpl();
		return ciM_CopyFileAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CreateDirectoryAction createCIM_CreateDirectoryAction() {
		CIM_CreateDirectoryActionImpl ciM_CreateDirectoryAction = new CIM_CreateDirectoryActionImpl();
		return ciM_CreateDirectoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DirectorySpecificationFile createCIM_DirectorySpecificationFile() {
		CIM_DirectorySpecificationFileImpl ciM_DirectorySpecificationFile = new CIM_DirectorySpecificationFileImpl();
		return ciM_DirectorySpecificationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeApplicationHostedOnServer createCIM_J2eeApplicationHostedOnServer() {
		CIM_J2eeApplicationHostedOnServerImpl ciM_J2eeApplicationHostedOnServer = new CIM_J2eeApplicationHostedOnServerImpl();
		return ciM_J2eeApplicationHostedOnServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeConnectionFactoryAvailableToJCAResource createCIM_J2eeConnectionFactoryAvailableToJCAResource() {
		CIM_J2eeConnectionFactoryAvailableToJCAResourceImpl ciM_J2eeConnectionFactoryAvailableToJCAResource = new CIM_J2eeConnectionFactoryAvailableToJCAResourceImpl();
		return ciM_J2eeConnectionFactoryAvailableToJCAResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeDomain createCIM_J2eeDomain() {
		CIM_J2eeDomainImpl ciM_J2eeDomain = new CIM_J2eeDomainImpl();
		return ciM_J2eeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeEJBInModule createCIM_J2eeEJBInModule() {
		CIM_J2eeEJBInModuleImpl ciM_J2eeEJBInModule = new CIM_J2eeEJBInModuleImpl();
		return ciM_J2eeEJBInModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeResourceOnServer createCIM_J2eeResourceOnServer() {
		CIM_J2eeResourceOnServerImpl ciM_J2eeResourceOnServer = new CIM_J2eeResourceOnServerImpl();
		return ciM_J2eeResourceOnServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_J2eeServerInDomain createCIM_J2eeServerInDomain() {
		CIM_J2eeServerInDomainImpl ciM_J2eeServerInDomain = new CIM_J2eeServerInDomainImpl();
		return ciM_J2eeServerInDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ToDirectoryAction createCIM_ToDirectoryAction() {
		CIM_ToDirectoryActionImpl ciM_ToDirectoryAction = new CIM_ToDirectoryActionImpl();
		return ciM_ToDirectoryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ToDirectorySpecification createCIM_ToDirectorySpecification() {
		CIM_ToDirectorySpecificationImpl ciM_ToDirectorySpecification = new CIM_ToDirectorySpecificationImpl();
		return ciM_ToDirectorySpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedDatabaseSystem createCIM_AssociatedDatabaseSystem() {
		CIM_AssociatedDatabaseSystemImpl ciM_AssociatedDatabaseSystem = new CIM_AssociatedDatabaseSystemImpl();
		return ciM_AssociatedDatabaseSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ADSLModem createCIM_ADSLModem() {
		CIM_ADSLModemImpl ciM_ADSLModem = new CIM_ADSLModemImpl();
		return ciM_ADSLModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AccessLabelReader createCIM_AccessLabelReader() {
		CIM_AccessLabelReaderImpl ciM_AccessLabelReader = new CIM_AccessLabelReaderImpl();
		return ciM_AccessLabelReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedCacheMemory createCIM_AssociatedCacheMemory() {
		CIM_AssociatedCacheMemoryImpl ciM_AssociatedCacheMemory = new CIM_AssociatedCacheMemoryImpl();
		return ciM_AssociatedCacheMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedDeviceMaskingGroup createCIM_AssociatedDeviceMaskingGroup() {
		CIM_AssociatedDeviceMaskingGroupImpl ciM_AssociatedDeviceMaskingGroup = new CIM_AssociatedDeviceMaskingGroupImpl();
		return ciM_AssociatedDeviceMaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedInitiatorMaskingGroup createCIM_AssociatedInitiatorMaskingGroup() {
		CIM_AssociatedInitiatorMaskingGroupImpl ciM_AssociatedInitiatorMaskingGroup = new CIM_AssociatedInitiatorMaskingGroupImpl();
		return ciM_AssociatedInitiatorMaskingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedSupplyVoltageSensor createCIM_AssociatedSupplyVoltageSensor() {
		CIM_AssociatedSupplyVoltageSensorImpl ciM_AssociatedSupplyVoltageSensor = new CIM_AssociatedSupplyVoltageSensorImpl();
		return ciM_AssociatedSupplyVoltageSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CableModem createCIM_CableModem() {
		CIM_CableModemImpl ciM_CableModem = new CIM_CableModemImpl();
		return ciM_CableModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CollectionOfSensors createCIM_CollectionOfSensors() {
		CIM_CollectionOfSensorsImpl ciM_CollectionOfSensors = new CIM_CollectionOfSensorsImpl();
		return ciM_CollectionOfSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CurrentSensor createCIM_CurrentSensor() {
		CIM_CurrentSensorImpl ciM_CurrentSensor = new CIM_CurrentSensorImpl();
		return ciM_CurrentSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DesktopMonitor createCIM_DesktopMonitor() {
		CIM_DesktopMonitorImpl ciM_DesktopMonitor = new CIM_DesktopMonitorImpl();
		return ciM_DesktopMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskPartition createCIM_DiskPartition() {
		CIM_DiskPartitionImpl ciM_DiskPartition = new CIM_DiskPartitionImpl();
		return ciM_DiskPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskPartitionBasedOnVolume createCIM_DiskPartitionBasedOnVolume() {
		CIM_DiskPartitionBasedOnVolumeImpl ciM_DiskPartitionBasedOnVolume = new CIM_DiskPartitionBasedOnVolumeImpl();
		return ciM_DiskPartitionBasedOnVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiskPartitionConfigurationService createCIM_DiskPartitionConfigurationService() {
		CIM_DiskPartitionConfigurationServiceImpl ciM_DiskPartitionConfigurationService = new CIM_DiskPartitionConfigurationServiceImpl();
		return ciM_DiskPartitionConfigurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_GPTDiskPartition createCIM_GPTDiskPartition() {
		CIM_GPTDiskPartitionImpl ciM_GPTDiskPartition = new CIM_GPTDiskPartitionImpl();
		return ciM_GPTDiskPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MonitorSetting createCIM_MonitorSetting() {
		CIM_MonitorSettingImpl ciM_MonitorSetting = new CIM_MonitorSettingImpl();
		return ciM_MonitorSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PackageTempSensor createCIM_PackageTempSensor() {
		CIM_PackageTempSensorImpl ciM_PackageTempSensor = new CIM_PackageTempSensorImpl();
		return ciM_PackageTempSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_RealizesDiskPartition createCIM_RealizesDiskPartition() {
		CIM_RealizesDiskPartitionImpl ciM_RealizesDiskPartition = new CIM_RealizesDiskPartitionImpl();
		return ciM_RealizesDiskPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AFRelatedServices createCIM_AFRelatedServices() {
		CIM_AFRelatedServicesImpl ciM_AFRelatedServices = new CIM_AFRelatedServicesImpl();
		return ciM_AFRelatedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ASBGPEndpoints createCIM_ASBGPEndpoints() {
		CIM_ASBGPEndpointsImpl ciM_ASBGPEndpoints = new CIM_ASBGPEndpointsImpl();
		return ciM_ASBGPEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_HostedNetworkPipe createCIM_HostedNetworkPipe() {
		CIM_HostedNetworkPipeImpl ciM_HostedNetworkPipe = new CIM_HostedNetworkPipeImpl();
		return ciM_HostedNetworkPipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_OSPFArea createCIM_OSPFArea() {
		CIM_OSPFAreaImpl ciM_OSPFArea = new CIM_OSPFAreaImpl();
		return ciM_OSPFArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyActionInPolicyRepository createCIM_PolicyActionInPolicyRepository() {
		CIM_PolicyActionInPolicyRepositoryImpl ciM_PolicyActionInPolicyRepository = new CIM_PolicyActionInPolicyRepositoryImpl();
		return ciM_PolicyActionInPolicyRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyConditionInPolicyRepository createCIM_PolicyConditionInPolicyRepository() {
		CIM_PolicyConditionInPolicyRepositoryImpl ciM_PolicyConditionInPolicyRepository = new CIM_PolicyConditionInPolicyRepositoryImpl();
		return ciM_PolicyConditionInPolicyRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_PolicyContainerInPolicyContainer createCIM_PolicyContainerInPolicyContainer() {
		CIM_PolicyContainerInPolicyContainerImpl ciM_PolicyContainerInPolicyContainer = new CIM_PolicyContainerInPolicyContainerImpl();
		return ciM_PolicyContainerInPolicyContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ReusablePolicy createCIM_ReusablePolicy() {
		CIM_ReusablePolicyImpl ciM_ReusablePolicy = new CIM_ReusablePolicyImpl();
		return ciM_ReusablePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ClusterServiceAccessBySAP createCIM_ClusterServiceAccessBySAP() {
		CIM_ClusterServiceAccessBySAPImpl ciM_ClusterServiceAccessBySAP = new CIM_ClusterServiceAccessBySAPImpl();
		return ciM_ClusterServiceAccessBySAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemDMA createCIM_ComputerSystemDMA() {
		CIM_ComputerSystemDMAImpl ciM_ComputerSystemDMA = new CIM_ComputerSystemDMAImpl();
		return ciM_ComputerSystemDMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemIRQ createCIM_ComputerSystemIRQ() {
		CIM_ComputerSystemIRQImpl ciM_ComputerSystemIRQ = new CIM_ComputerSystemIRQImpl();
		return ciM_ComputerSystemIRQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ComputerSystemMappedIO createCIM_ComputerSystemMappedIO() {
		CIM_ComputerSystemMappedIOImpl ciM_ComputerSystemMappedIO = new CIM_ComputerSystemMappedIOImpl();
		return ciM_ComputerSystemMappedIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CAHasPublicCertificate createCIM_CAHasPublicCertificate() {
		CIM_CAHasPublicCertificateImpl ciM_CAHasPublicCertificate = new CIM_CAHasPublicCertificateImpl();
		return ciM_CAHasPublicCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_CASignsPublicKeyCertificate createCIM_CASignsPublicKeyCertificate() {
		CIM_CASignsPublicKeyCertificateImpl ciM_CASignsPublicKeyCertificate = new CIM_CASignsPublicKeyCertificateImpl();
		return ciM_CASignsPublicKeyCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AssociatedSupplyCurrentSensor createCIM_AssociatedSupplyCurrentSensor() {
		CIM_AssociatedSupplyCurrentSensorImpl ciM_AssociatedSupplyCurrentSensor = new CIM_AssociatedSupplyCurrentSensorImpl();
		return ciM_AssociatedSupplyCurrentSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AreaOfConfiguration createCIM_AreaOfConfiguration() {
		CIM_AreaOfConfigurationImpl ciM_AreaOfConfiguration = new CIM_AreaOfConfigurationImpl();
		return ciM_AreaOfConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_EndpointInArea createCIM_EndpointInArea() {
		CIM_EndpointInAreaImpl ciM_EndpointInArea = new CIM_EndpointInAreaImpl();
		return ciM_EndpointInArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CimPackage getCimPackage() {
		return (CimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CimPackage getPackage() {
		return CimPackage.eINSTANCE;
	}

} //CimFactoryImpl

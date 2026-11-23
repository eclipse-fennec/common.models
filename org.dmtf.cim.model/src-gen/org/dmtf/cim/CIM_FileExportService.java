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
 * A representation of the model object '<em><b>CIM File Export Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides configuration support for exporting elements ('files') of a FileSystem. FileExportService(s) are hosted by a ComputerSystem that exports the files (these would be the Filers in a NAS Head). These shared elements (FileShares) are accessed through ProtocolEndpoint(s) hosted by the Filer that support the specified file-sharing protocol. FileShares are associated with the Service via ServiceAffectsElement and with the ProtocolEndpoint(s) via SAPAvailableForElement.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileExportService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FileExportService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a Job to create a FileShare from an element of a FileSystem or an imported FileShare. Makes the element available as a FileShare and returns it as the parameter TheShare of type CIM_FileShare. 
	 * If 0 is returned, the method completed successfully and no ConcreteJob instance was required. If 0x1000 is returned, a ConcreteJob has been started to create the FileShare. The Job's reference will be returned in the output parameter Job. If the Job succeeds, the FileShare will be created and configured and ready to be exported. If the FileShare has been configured to be exported at a later time, its 'EnabledState' attribute will not be set to "Enabled", until exported. The FileShare will have a HostedShare association to the host ComputerSystem. 
	 * This method MUST return a CIM_Error representing that a single named property of a setting (or other) parameter (either reference or embedded object) has an invalid value or that an invalid combination of named properties of a setting (or other) parameter (either reference or embedded object) has been requested. 
	 * The reference parameter Root indicates the FileSystem or FileShare whose element is being exported, either directly, or indirectly by specifying a Directory element that is associated via MountedElement to the FileSystem or FileShare. 
	 * The string parameter SharedElementPath indicates the shared element within the file hierarchy by a path relative to the Root. If the Root is a FileSystem, this path begins at the root directory of the FileSystem; if the Root is a FileShare, this path begins at the directory associated to the FileShare via MountedElement; if the Root is a Directory, this path begins at that Directory. This is a string because multiple paths could lead to the same element but the access rights or other privileges could be specific to the path. 
	 * Goal is a CIM_ExportedFileShareSetting element encoded as a string-valued EmbeddedInstance parameter; this allows the client to specify the properties desired for the share. 
	 * If the method is successful, it will return a CIM_FileShare in the OUT parameter TheShare. The settings on the FileShare will be specified by the ExportedFileShareSetting element associated with the TheShare element via CIM_ElementSettingData. This ExportedFileShareSetting will also be associated via SettingGeneratedByCapabilities to the ExportedFileShareCapabilities element that was used for creating the FileShare. The FileShare will also be associated to the ComputerSystem via HostedShare, to the FileExportService via ServiceAffectsElement, and to one or more ServiceAccessPoints via SAPAvailableForElement.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Root
	 *   A reference indicating an element whose sub-element is being exported. The class that Root references must be a FileSystem, a FileShare that has a MountedElement association (or a derived class of MountedElement) to a LogicalFile (or Directory), or a LogicalFile (or a derived class such as Directory) that has a MountedElement association to a FileShare or FileSystem. 
	 *   If Root is NULL, it indicates the root of the FileExportService host's default local FileSystem, that is used as the default local name space.
	 * @param SharedElementPath
	 *   A string representing a path to the shared element from the Directory indicated by Root. 
	 *   Multiple paths could lead to the same element but the access rights or other privileges could be specific to the path. The client must specify the path. 
	 *   If SharedElementPath is NULL or the empty string, it indicates the "root" LogicalElement contained by Root.
	 * @param Goal The client-specified requirements for how the specified FileShare element is to be shared or exported by the FileExportService. This is an element of the CIM_ExportedFileShareSetting class, or a derived class, encoded as a string-valued embedded object parameter. If NULL or the empty string, the default configuration will be specified by the FileExportService.
	 * @param TheShare This specifies the FileShare element (or its derived class) that is created by the method, if successful.
	 * @param DefaultUserId A reference to a concrete derived class of CIM_Identity that indicates the user id to use for default access to this share. A NULL value indicates that no user id is specified. The provider is expected to surface this access using the privilege model.
	 * @param RootAccessHosts
	 *   An array of strings that specify the hosts that have root access to this Share, if the CIM_ExportedFileShareSetting.RootAccess property is set to 'Allow Root Access'. Each entry specifies a host by a vendor-specific host-id, prefixed with '+' or '-' to indicate that access is either Granted or Denied. The name of the host is its Durable Name, which is expected to be a fully-qualified-domain-name or its IP Address. If one of the entries is '+*', root access will be allowed from all hosts. If one of the entries is '-*', root access will be denied to all hosts, effectively overriding the value of the property CIM_ExportedFileShareSetting.RootAccess. The provider is expected to surface this access using the privilege model. 
	 *   This property needs to be a string because the remote host may not be known to the provider and therefore a reference to the host may not exist.
	 * @param AccessPointPorts
	 *   An array of strings that specify the ServiceAccessPoints that can connect to this Share, if the CIM_ExportedFileShareSettings.AccessPoints property is set to 'Named Ports'. Each entry specifies one or more access points by its Name, unique within the System hosting the FileShare. The ids may be prefixed with '+' or '-'to indicate that access is to be granted or denied. 
	 *   If one of the entries is '+*', all access points supported by the service will be supported. If one of the entries is '-*', all access points will be denied access, effectively overriding the value of the property CIM_ExportedFileShareSetting.AccessPoints. The provider is expected to surface these access rights (whether granted or denied) using the privilege model. Any AccessPoints granted access via this parameter will also be associated to this share with CIM_SAPAvailableForElement. If the AccessPoint is not already enabled it will appear in a disabled state. 
	 *   This property needs to be a string because the access point may not be known to the provider and therefore a reference to the ServiceAccessPoint may not exist.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" RootAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Out='true'" SharedElementPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ExportedFileShareSetting'" TheShareAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileShare REF' Out='true'" DefaultUserIdAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF'" RootAccessHostsUnique="false" RootAccessHostsMany="true"
	 *        RootAccessHostsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.RootAccess\"]'" AccessPointPortsUnique="false" AccessPointPortsMany="true"
	 *        AccessPointPortsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.AccessPoints\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"FileExportService Not Accessible\",\"Root is not accessible\",\"Base Directory element of Root is Not Accessible\",\"Path does not specify a shareable element\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateExportedShare(CIM_ConcreteJob Job, CIM_LogicalElement Root, String SharedElementPath, String Goal, CIM_FileShare TheShare, CIM_Identity DefaultUserId, EList<String> RootAccessHosts, EList<String> AccessPointPorts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a Job to modify an Exported FileShare. 
	 * If 0 is returned, the method completed successfully and no ConcreteJob instance was required. If 0x1000 is returned, a ConcreteJob has been started to modify the FileShare. The Job's reference will be returned in the output parameter Job. 
	 * If the Job succeeds, the FileShare will be modified and re-configured and ready to be exported. If the FileShare has been configured to be exported at a later time, its 'EnabledState' attribute will not be set to "Enabled", until exported. A reference to the FileShare will be returned in TheShare. The FileShare will have a HostedShare association to the host ComputerSystem, as before. If the parameters are, invalid, this method MUST return a CIM_Error representing that a single named property of a setting (or other) parameter (either reference or embedded object) has an invalid value or that an invalid combination of named properties of a setting (or other) parameter (either reference or embedded object) has been requested. 
	 * This method cannot be used to change the element that has been exported, but a provider may support changing the pathname used to access it by re-specifying Root and/or SubElementPath. The reference parameter Root indicates the FileSystem or FileShare whose element is being exported, either directly, or indirectly by specifying a Directory element that is associated via MountedElement to the FileSystem or FileShare. The FileSystem or FileShare so indicated cannot be changed by this method. 
	 * The parameter SharedElementPath indicates the shared element within the file hierarchy by a path relative to the Root. If the Root is a FileSystem, this path begins at the root directory of the FileSystem; if the Root is a FileShare, this path begins at the directory associated to the FileShare via MountedElement; if the Root is a Directory, this path begins at that Directory. If this path is modified, it must still indicate the same terminal element. 
	 * Goal is a CIM_ExportedFileShareSetting element encoded as a string-valued embedded object parameter; this allows the client to specify the properties desired for the share. 
	 * If the method is successful, it will return a reference to the same CIM_FileShare in the INOUT parameter TheShare. The settings for the FileShare and the ServiceAccessPoint associations may change, but the HostedShare and ServiceAffectsElement associations to the share must not be changed by this method. 
	 * The input TheShare must not be NULL.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Root
	 *   A reference indicating an element whose sub-element is being exported. The class that Root references must be a FileSystem, a FileShare that has a MountedElement association (or a derived class of MountedElement) to a Directory, or a Directory that has a MountedElement association to a FileShare or FileSystem. If the FileShare being modified is currently exported or imported, this parameter should indicate the same Root FileSystem or FileShare element. 
	 *   If Root is NULL, it indicates no change to the current root.
	 * @param SharedElementPath
	 *   A string representing a path to the shared element from the Directory element indicated by Root. If the FileShare being modified is currently exported or imported, this parameter should specify the same shared element, even if via a different path. 
	 *   Multiple paths could lead to the same element but the access rights or other privileges could be specific to the path. The client must specify the path during creation. 
	 *   If SharedElementPath is NULL, it indicates no change to the current path. If SharedElementPath is the empty string, it indicates the element indicated by Root.
	 * @param Goal The client-specified requirements for how the export settings for the specified FileShare element are to be modifed by the FileExportService. If the FileShare is currently imported and not exported this will set up the necessary SharedElement, SharedElementRoot, HostedShare, and other associations. Goal is an element of the CIM_ExportedFileShareSetting class, or a derived class, encoded as a string-valued embedded object parameter. If NULL or the empty string, the existing configuration must include an ExportedFileShareSetting which will not be changed. Any differences in property values will be merged by the FileExportService.
	 * @param TheShare TheShare indicates the FileShare that is to be modified. This can be an existing exported FileShare or an existing imported FileShare.
	 * @param InUseOptions
	 *   An enumerated integer that specifies the action that the provider should take if the FileShare is still in use when this request is made. The WaitTime parameter indicates the 'specified time' used for this function. 
	 *   This option is only relevant if the FileShare must be made unavailable while the request is being executed.
	 * @param WaitTime
	 *   An integer that indicates the time (in seconds) that the provider must wait before executing this request if it cannot be done while the FileShare is in use. If WaitTime is not zero, the method will create a job, if supported by the provider, and return immediately. If the provider does not support asynchronous jobs, there is a possibility that the client could time-out before the job is completed. 
	 *   The combination of InUseOptions = '4' and WaitTime ='0' (the default) is interpreted as 'Wait (forever) until Quiescence, then Execute Request' and will be performed asynchronously if possible.
	 * @param DefaultUserId A reference to a concrete derived class of CIM_Identity that indicates the user id to use for default access to this share. A NULL value indicates that any existing user id is not changed. The provider is expected to surface this access using the privilege model. This method does not support disabling the currently specified default user id, which must be done using the privilege model.
	 * @param RootAccessHosts
	 *   An array of strings that specify additional hosts that have root access to this Share, if the CIM_ExportedFileShareSetting.RootAccess property is set to 'Allow Root Access'. Each entry specifies a host by a vendor-specific host-id, prefixed with '+' or '-' to indicate that access is either Granted or Denied. The name of the host is its Durable Name, which is expected to be a fully-qualified-domain-name or its IP Address. If one of the entries is '+*', root access will be allowed from all hosts. If one of the entries is '-*', root access will be denied to all hosts, effectively overriding the value of the property CIM_ExportedFileShareSetting.RootAccess. If this is a null entry, the currently configured set of hosts will not be changed. If this is an empty array, the currently configured set of hosts will be cleared. The provider is expected to surface this access using the privilege model. 
	 *   This property needs to be a string because the remote host may not be known to the provider and therefore a REF to the host may not exist.
	 * @param AccessPointPorts
	 *   An array of strings that specify additional ServiceAccessPoints that can connect to this Share, if the CIM_ExportedFileShareSettings.AccessPoints property is set to 'Named Ports'. Each entry specifies one or more access points by its Name, unique within the System hosting the FileShare. The ids may be prefixed with '+' or '-'to indicate that access is to be granted or denied. 
	 *   If one of the entries is '+*', all access points supported by the service will be supported. If one of the entries is '-*', all access points will be denied access, effectively overriding the value of the property CIM_ExportedFileShareSetting.AccessPoints. If this is a null entry, the currently configured set of access points will not be changed. If this is an empty array, the currently configured set of access points will be cleared. The provider is expected to surface these access rights (whether granted or denied) using the privilege model. Any AccessPoints granted access via this parameter will also be associated to this share with CIM_SAPAvailableForElement. If the AccessPoint is not already enabled it will appear in a disabled state. 
	 *   This property needs to be a string because the access point may not be known to the provider and therefore a REF to the ServiceAccessPoint may not exist.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" RootAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF'" SharedElementPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ExportedFileShareSetting'" TheShareAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileShare REF'" InUseOptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x1000..0xFFFF\"]' Values='[\"Do Not Execute Request\",\"Wait for specified time, then Execute Request Immediately\",\"Attempt Quiescence for specified time, then Execute Request Immediately\",\"DMTF Reserved\",\"Vendor Defined\"]'" WaitTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='seconds' PUnit='second'" DefaultUserIdAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF'" RootAccessHostsUnique="false" RootAccessHostsMany="true"
	 *        RootAccessHostsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.RootAccess\"]'" AccessPointPortsUnique="false" AccessPointPortsMany="true"
	 *        AccessPointPortsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExportedFileShareSetting.AccessPoints\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"FileExportService Not Accessible\",\"Root is not accessible\",\"Base Directory element of Root is Not Accessible\",\"Path does not specify a shareable element\",\"Share in use and cannot be Modified, Failed\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyExportedShare(CIM_ConcreteJob Job, CIM_LogicalElement Root, String SharedElementPath, String Goal, CIM_FileShare TheShare, Integer InUseOptions, Long WaitTime, CIM_Identity DefaultUserId, EList<String> RootAccessHosts, EList<String> AccessPointPorts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a Job to release an exported Share. 
	 * If 0 is returned, the method completed successfully and no ConcreteJob instance was required. If 0x1000 is returned, a ConcreteJob will be started to release the Share. The Job's reference will be returned in the OUT parameter Job. 
	 * If the method is successful, the Share element will not be surfaced for export and the shared element will not be exported anymore through this Share. 
	 * If InUseOptions are specified, this method will succeed only if no more clients are accessing the share.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TheShare The imported Share to be released.
	 * @param InUseOptions
	 *   An enumerated integer that specifies the action that the provider should take if the FileShare is still in use when this request is made. The WaitTime parameter indicates the 'specified time' used for this function. 
	 *   This option is only relevant if the FileShare must be made unavailable while the request is being executed.
	 * @param WaitTime
	 *   An integer that indicates the time (in seconds) that the provider must wait before releasing this FileShare. If WaitTime is not zero, the method will create a job, if supported by the provider, and return immediately. If the provider does not support asynchronous jobs, there is a possibility that the client could time-out before the job is completed. 
	 *   The combination of InUseOptions = '4' and WaitTime ='0' (the default) is interpreted as 'Wait (forever) until Quiescence, then Release' and will be performed asynchronously if possible.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TheShareAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Share REF'" InUseOptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x1000..0xFFFF\"]' Values='[\"Do Not Execute Request\",\"Wait for specified time, then Release Immediately\",\"Attempt Quiescence for specified time, then Release Immediately\",\"DMTF Reserved\",\"Vendor Defined\"]'" WaitTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='seconds' PUnit='second'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"10\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Share in use, Failed\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ReleaseExportedShare(CIM_ConcreteJob Job, CIM_Share TheShare, Integer InUseOptions, Long WaitTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AssignPrivilegeToExportedShaare will assign all of the supplied activities to the specified Identities.
	 * @param Identities The list of Identities to assign privilege to share.
	 * @param Activities The Activities to assign to the share. The Activities are defined in the CIM_AssociatedPrivilege.Activities property.
	 * @param FileShare The FileShare to assing the privileges.
	 * <!-- end-model-doc -->
	 * @model IdentitiesUnique="false" IdentitiesMany="true"
	 *        IdentitiesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF[]' Required='true'" ActivitiesUnique="false" ActivitiesMany="true"
	 *        ActivitiesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"..\"]' Values='[\"Create\",\"Delete\",\"Detect\",\"Read\",\"Write\",\"Execute\",\"Deny Create\",\"Deny Delete\",\"Deny Detect\",\"Deny Read\",\"Deny Write\",\"Deny Execute\",\"Authorize to Grant/Deny Authorization\",\"Authorize to Create\",\"Authorize to Delete\",\"Authorize to Detect\",\"Authorize to Read\",\"Authorize to Write\",\"Authorize to Execute\",\"Authorize to Deny Create\",\"Authorize to Deny Delete\",\"Authorize to Deny Detect\",\"Authorize to Deny Read\",\"Authorize to Deny Write\",\"Authorize to Deny Execute\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_AssociatedPrivilege.Activities\"]'" FileShareAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FileShare REF' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Activities Not Supported\",\"Identity Not Found\",\"File Share Not Found\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Long AssignPrivilegeToExportedShare(EList<CIM_Identity> Identities, EList<Integer> Activities, CIM_FileShare FileShare);

} // CIM_FileExportService

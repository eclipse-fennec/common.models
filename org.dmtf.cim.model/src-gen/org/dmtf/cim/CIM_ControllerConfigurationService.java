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
 * A representation of the model object '<em><b>CIM Controller Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ControllerConfigurationService provides methods that allow a client to manipulate LUN Masking in a storage system.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ControllerConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::ProtocolController' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ControllerConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates an appropriate subclass of ProtocolController. In addition to its role of controlling downstream devices, a ProtocolControl is used to provide a central management point for access control with respect to those devices. Certain storage system implementations across multiple vendors require permissions to be established atomically with the creation of a ProtocolController. This method provides this capability via the Privilege and Identity properties. By supplying appropriate information in those properties, this method will assure that appropriate AuthorizedTarget and AuthorizedSubject associations, (as defined in the User and Security Model), are instantiated to restrict access to the logical devices 'behind' it. 
	 * If multiple target ports are specified in the Ports input parameter, all expose the same view (i.e., have the same unit numbers and permissions). This method does not create the port instances, but does create ProtocolControllerForPort associations between the specified ports and the new ProtocolController. The new ProtocolController is defined to be weak to the same System as the ControllerConfigurationService.
	 * @param ElementName The string to be used in the ElementName of the new ProtocolController.
	 * @param Ports Array of strings containing representations of references to instances of CIM_LogicalPort (or subclass) instances. This is the list of target ports that are associated to the ProtocolController. ProtocolControllerForPort associations are created by the instrumentation associating the new ProtocolController to these ports. If this parameter is null, then all ports in the storage system (this Service's 'scoping' System and all its ComponentCS Systems) are attached to the new ProtocolController.
	 * @param Protocol The protocol type for the new ProtocolController.
	 * @param Privilege
	 *   Reference to a CIM_Privilege (or subclass) instance to be used as a template. If supplied, it has a 1:1 correspondence with the Identity parameter and this method will atomically create the new ProtocolController instance and related AuthorizedPrivilege, AuthorizedTarget and AuthorizedSubject instances. 
	 *   Note: if ProtocolControllerRequiresAuthorizedIdentity is true, then the Identity/Privilege pair MUST be specified. If false, then the Identity/Privilege pair MUST NOT be specified.
	 * @param Identity
	 *   Reference to a CIM_ManagedElement (or subclass) instance. This ManagedElement MUST be either a CIM_Identity, or a CIM_Collection (or subclass, eg. SystemSpecificCollection, Role, or Group) that has CIM_Identities as MemberOfCollection. If ProtocolControllerMaskingCapabilities.ProtocolControllerSupportsCollection is false, the reference MUST be to a CIM_Identity (or subclass). If present, it has a 1:1 correspondence with the Privilege property. If present, this method will atomically create the new ProtocolController instance and instantiate a missing AuthorizedSubject association between the Privilege/Identity pair; and instantiate an AuthorizedTarget association between the AuthorizedPrivilege and the new ProtocolController. 
	 *   Note: if ProtocolControllerRequiresAuthorizedIdentity is true, then at least the Identity/Privilege pair MUST be specified.
	 * @param ProtocolController A reference to the new ProtocolController that is created.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ProtocolController.ElementName\"]'" PortsUnique="false" PortsMany="true"
	 *        PortsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" ProtocolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Other\",\"SCSI\"]'" PrivilegeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Privilege REF'" IdentityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" ProtocolControllerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolController REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"ID Parameter Missing or Not Unique\",\"Hardware Implementation Requires Null Ports Parameter\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateProtocolControllerWithPorts(String ElementName, EList<String> Ports, Integer Protocol, CIM_Privilege Privilege, CIM_ManagedElement Identity, CIM_ProtocolController ProtocolController);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The method deletes an instance of ProtocolController and all associations in which this ProtocolController is referenced.
	 * @param ProtocolController The ProtocolController to be deleted.
	 * @param DeleteChildrenProtocolControllers If true, the management instrumentation provider will also delete 'child' ProtocolControllers (i.e., those defined as Dependent references in instances of AssociatedProtocolController where this ProtocolController is the Antecedent reference). Also, all direct associations involving the 'child' ProtocolControllers will be removed.
	 * @param DeleteUnits If true, the management instrumentation provider will also delete LogicalDevice instances associated via ProtocolControllerForUnit, to this ProtocolController and its children. (Note that 'child' controllers will only be affected if the DeleteChildrenProtocolControllers input parameter is TRUE). LogicalDevice instances are only deleted if there are NO remaining ProtocolControllerForUnit associations, to other ProtocolControllers.
	 * <!-- end-model-doc -->
	 * @model ProtocolControllerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolController REF'" DeleteChildrenProtocolControllersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" DeleteUnitsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"LogicalDevices Associated to Other ProtocolControllers Not Deleted\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteProtocolController(CIM_ProtocolController ProtocolController, Boolean DeleteChildrenProtocolControllers, Boolean DeleteUnits);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method associates a LogicalDevice subclass (specifically a StorageVolume or MediaAccessDevice subclass) to the referenced ProtocolController. The association is persisted as an instance of ProtocolControllerForUnit. The management instrumentation provider must verify that the logical unit numbers (defined using the DeviceNumber input parameter) are unique for the ProtocolController. When the Protocol Controller is actively masking a device (i.e. is part of an AuthorizedTarget association), the provider should update the access configuration in the underlying hardware as appropriate.
	 * @param ProtocolController The ProtocolController instance.
	 * @param Device The LogicalDevice instance to attach.
	 * @param DeviceNumber The number assigned to ProtocolControllerForUnit.DeviceNumber (if supported by the hardware). Hardware support is indicated by ProtocolControllerMaskingCapabilities.ClientSelectableDeviceNumbers). If the hardware does not support setting the number, but the DeviceNumber has not been established in an existing ProtocolControllerForDevice subclass, then this parameter's value will be used. If the DeviceNumber has been established, then the current number will be reused.
	 * <!-- end-model-doc -->
	 * @model ProtocolControllerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolController REF'" DeviceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF'" DeviceNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' ModelCorrespondence='[\"CIM_ProtocolControllerForUnit.DeviceNumber\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Invalid LogicalDevice Instance\",\"Device Number Conflict\",\"DeviceNumber Parameter Must Be Provided\",\"Hardware Implementation Requires Null DeviceNumber\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AttachDevice(CIM_ProtocolController ProtocolController, CIM_LogicalDevice Device, String DeviceNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method removes the ProtocolControllerForDevice association subclass between the ProtocolController and a LogicalDevice, such as a StorageVolume or a MediaAccessDevice. When the ProtocolController is actively masking a device (i.e. is part of an AuthorizedTarget association, the management instrumentation provider should update the hardware access configuration when DetachDevice is called.
	 * @param ProtocolController The ProtocolController instance.
	 * @param Device The LogicalDevice instance to detach.
	 * <!-- end-model-doc -->
	 * @model ProtocolControllerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolController REF'" DeviceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalDevice REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"LogicalDevice Instance not Associated with Controller\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DetachDevice(CIM_ProtocolController ProtocolController, CIM_LogicalDevice Device);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expose a list of SCSI logical units (such as RAID volumes or tape drives) to a list of initiators through a list of target ports, through one or more SCSIProtocolControllers (SPCs). 
	 * 
	 * The parameters for this method are: Job - null if no job created, otherwise this is a reference to the job. LUNames - the list of names of the logical units to use. InitiatorPortIDs - the names of the initiator ports to use. TargetPortIDs - the names of the target ports to use. DeviceNumbers - the device numbers (LUNs) to use. DeviceAccesses - permissions for the logical units. ProtocolControllers - SPCs involved in this operation. 
	 * 
	 * There are two modes of operation, create and modify. If a NULL value is passed in for the SPC, then the instrumentation will create at least one SPC that satisfies the request. Depending upon the instrumentation capabilities, more than one SPC MAY be created. (e.g. if CIM_ProtocolControllerMaskingCapabilities.OneHardwareIDPerView is true and more than one initiatorID was passed in, then one SPC per initiatorID will be created). If an SPC is passed in, then the instrumentation attempts to add the new paths to the existing SPC. Depending upon the instrumentation capabilities, this MAY result in the creation of additional SPCs. The instrumentation MAY return an error if honoring this request would violate SCSI semantics. 
	 * 
	 * For creating an SPC, the parameters that MUST be specified are dependent upon the SPCAllows* properties in CIM_ProtocolControllerMaskingCapabilities. If SPCAllowsNoLUs is false, the caller MUST specify a list of LUNames. If it is true, the caller MAY specify a list of LUNames or MAY pass in null. If SPCAllowsNoTargets is false and PortsPerView is not 'All Ports share the same view' the caller MUST specify a list of TargetPortIDs. If it is true, the caller MAY specify a list of TargetPortIDs or MAY pass in null. If SPCAllowsNoInitiators is false, the caller MUST specify a list of InitiatorPortIDs. If it is true, the caller MAY specify a list of InitiatorPortIDs or MAY pass in null. If LUNames is not null, the caller MUST specify DeviceAccesses for each logical unit. If the instrumentation's CIM_ProtocolControllerMaskingCapabilities ClientSelectableDeviceNumbers property is TRUE then the client MAY provide a list of device numbers (LUNs) to use for the paths to be created. If is false, the client MUST pass in NULL for this parameter. 
	 * 
	 * The LUNames, DeviceNumbers, and DeviceAccesses parameters are mutually indexed arrays - any element in DeviceNumbers or DeviceAccesses will set a property relative to the LogicalDevice instance named in the corresponding element of LUNames. LUNames and DeviceAccesses MUST have the same number of elements. DeviceNumbers MUST be null (asking the instrumentation to assign numbers) or have the same number of elements as LUNames. If these conditions are not met, the instrumentation MUST return a 'Invalid Parameter' status or a CIM_Error. 
	 * 
	 * For modifying an SPC, there are three specific use cases identified. The instrumentation MUST support these use cases. Other permutations are allowed, but are vendor-specific. The use cases are: Add LUs to a view, Add initiator IDs to a view, and Add target port IDs to a view. Add LUs to a view requires that the LUNames parameter not be null and that the InitiatorIDs and TargetPortIDs parameters be null. DeviceNumbers MAY be null if ClientSelectableDeviceNumbers is false. DeviceAccesses MUST be specified. Add initiator IDs to a view requires that the LUNames parameter be null, that the InitiatorIDs not be null, and that the TargetPortIDs parameters be null. DeviceNumbers and DeviceAccesses MUST be null. Add target port IDs to a view requires that the LUNames and InitiatorPortIDs parameters be null and is only possible is PortsPerView is 'Multiple Ports Per View'. DeviceNumbers and DeviceAccesses MUST also be null 
	 * 
	 * The relevant rules of SCSI semantics are: 
	 * - an SPC MAY NOT be exposed through a particular host/target port pair that is in use by another SPC. (In other words, an SPC and its associated logical units and ports together correspond to the logical unit inventory provided by SCSI REPORT LUNS and INQUIRY commands) 
	 * - each LogicalDevice associated to an SPC MUST have a unique ProtocolControllerForUnit DeviceNumber (logical unit number) 
	 * The instrumentation MUST report an error if the client request would violate one of these rules. 
	 * 
	 * If the instrumentation provides PrivilegeManagementService, the results of setting DeviceAccesses MUST be synchronized with PrivilegeManagementService as described in the ProtocolControllerForUnit DeviceAccess description.
	 * @param Job Reference to the job if 'Method Parameters Checked - Job Started' is returned (MAY be null if job completed).
	 * @param LUNames An array of IDs of logical unit instances. The LU instances MUST already exist. The members of this array MUST match the Name property of LogicalDevice instances that represent SCSI logical units. See the method description for conditions where this MAY be null.
	 * @param InitiatorPortIDs IDs of initiator ports. If existing StorageHardwareID instances exist, they MUST be used. If no StorageHardwareID instance matches, then one is implicitly created. See the method description for conditions where this MAY be null.
	 * @param TargetPortIDs IDs of target ports. See the method description for conditions where this MAY be null.
	 * @param DeviceNumbers A list of logical unit numbers to assign to the corresponding logical unit in the LUNames parameter. (within the context of the elements specified in the other parameters). If the LUNames parameter is null, then this parameter MUST be null. Otherwise, if this parameter is null, all LU numbers are assigned by the hardware or instrumentation.
	 * @param DeviceAccesses A list of permissions to assign to the corresponding logical unit in the LUNames parameter. This specifies the permission to assign within the context of the elements specified in the other parameters. Setting this to 'No Access' assigns the DeviceNumber for the associated initiators, but does not grant read or write access. If the LUNames parameter is not null then this parameter MUST be specified.
	 * @param ProtocolControllers An array of references to SCSIProtocolControllers (SPCs). On input, this can be null, or contain exactly one element; there MAY be multiple references on output. If null on input, the instrumentation will create one or more new SPC instances. If an SPC is specified, the instrumentation will attempt to add associations to one or more existing SPCs. If the first array element is a valid SPC reference and SCSI semantics can be preserved, the instrumentation MUST attach associations to the specified SPC. If multiple elements are non-null on input, the instrumentation MUST report an invalid parameter. On output, this is an array of references to SPCs created or modified as the result of processing the request.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" LUNamesUnique="false" LUNamesMany="true"
	 *        LUNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LogicalDevice.Name\"]'" InitiatorPortIDsUnique="false" InitiatorPortIDsMany="true"
	 *        InitiatorPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageHardwareID.StorageID\"]'" TargetPortIDsUnique="false" TargetPortIDsMany="true"
	 *        TargetPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\"]'" DeviceNumbersUnique="false" DeviceNumbersMany="true"
	 *        DeviceNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed'" DeviceAccessesUnique="false" DeviceAccessesMany="true"
	 *        DeviceAccessesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..15999\",\"16000..\"]' Values='[\"Unknown\",\"Read Write\",\"Read-Only\",\"No Access\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed'" ProtocolControllersUnique="false" ProtocolControllersMany="true"
	 *        ProtocolControllersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102\",\"4103\",\"4104..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Invalid logical unit ID\",\"Invalid initiator port ID\",\"Invalid target port ID\",\"Invalid permission\",\"Target/initiator combination already exposed\",\"Requested logical unit number in use\",\"Maximum Map Count Exceeded\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ExposePaths(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> InitiatorPortIDs, EList<String> TargetPortIDs, EList<String> DeviceNumbers, EList<Integer> DeviceAccesses, EList<CIM_SCSIProtocolController> ProtocolControllers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hide a list of SCSI logical units (such as a RAID volume or tape drive) from a list of initiators and/or target ports on a SCSIProtocolController (SPC). 
	 * 
	 * The parameters for this method are: Job - null if no job created, otherwise this is a reference to the job. LUNames - the list of names of the logical units to use. InitiatorPortIDs - the names of the initiator ports to use. TargetPortIDs - the names of the target ports to use. ProtocolControllers - SPCs involved in this operation. 
	 * 
	 * When hiding logical units, there are three specific use cases identified. The instrumentation MUST support these use cases. Other permutations are allowed, but are vendor-specific. The use cases are: Remove LUs from a view, Remove initiator IDs from a view, and Remove target port IDs from a view. Remove LUs from a view requires that the LUNames parameter not be null and that the InitiatorIDs and TargetPortIDs parameters be null. Remove initiator IDs from a view requires that the LUNames parameter be null, that the InitiatorIDs not be null, and that the TargetPortIDs parameters be null. Remove target port IDs from a view requires that the LUNames and InitiatorPortIDs parameters be null. 
	 * 
	 * The disposition of the SPC when the last logical unit, initiator ID, or target port ID is removed depends upon the CIM_ProtocolControllerMaskingCapabilites SPCAllowsNo* properties. If SPCAllowsNoLUs is false, then the SPC is automatically deleted when the last logical unit is removed. If SPCAllowsNoTargets is false, then the SPC is automatically deleted when the last target port ID is removed. If SPCAllowsNoInitiators is false, then the SPC is automatically deleted when the last initiator port ID is removed. In all other cases, the SPC MUST be explicitly deleted via the DeleteInstance intrinsic function.
	 * @param Job Reference to the job if 'Method Parameters Checked - Job Started' is returned (MAY be null if job completed).
	 * @param LUNames An array of IDs of logical units. The LU instances MUST already exist. The members of this array MUST match the Name property of LogicalDevice instances. See the method description for conditions where this MAY be null.
	 * @param InitiatorPortIDs IDs of initiator ports. See the method description for conditions where this MAY be null.
	 * @param TargetPortIDs IDs of target ports. See the method description for conditions where this MAY be null.
	 * @param ProtocolControllers An array of references to SCSIProtocolControllers (SPCs). On input, this MUST contain exactly one element; there MAY be multiple references on output. The instrumentation will attempt to remove associations (LUNames, InitiatorPortIDs, or TargetPortIDs) from this SPC. Depending upon the specific implementation, the instrumentation MAY need to create new SPCs with a subset of the remaining associations. On output, this is an array of references to SPCs created or modified as the result of processing the request.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" LUNamesUnique="false" LUNamesMany="true"
	 *        LUNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_LogicalDevice.Name\"]'" InitiatorPortIDsUnique="false" InitiatorPortIDsMany="true"
	 *        InitiatorPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageHardwareID.StorageID\"]'" TargetPortIDsUnique="false" TargetPortIDsMany="true"
	 *        TargetPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\"]'" ProtocolControllersUnique="false" ProtocolControllersMany="true"
	 *        ProtocolControllersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Invalid logical unit ID\",\"Invalid initiator port ID\",\"Invalid target port ID\",\"Target/initiator combination not exposed\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long HidePaths(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> InitiatorPortIDs, EList<String> TargetPortIDs, EList<CIM_SCSIProtocolController> ProtocolControllers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expose a list of SCSI logical units (such as RAID volumes or tape drives) through a 'default view' SCSIProtocolController (SPC) through a list of target ports. The 'default view' SPC exposes logical units to all initiators. This SPC is identified by an association to a StorageHardwareID with Name property set to the empty string. 
	 * 
	 * The parameters for this method are: Job - null if no job created, otherwise this is a reference to the job. LUNames - the list of names of the logical units to use. TargetPortIDs - the names of the target ports to use. DeviceNumbers - the device numbers (LUNs) to use. DeviceAccesses - permissions for the logical units. ProtocolControllers - SPCs involved in this operation. 
	 * 
	 * There are two modes of operation, create and modify. If a NULL value is passed in for the SPC, then the instrumentation will attempt to create a new default view. If PortsPerView is 'All Ports share the same view', then there is at most one default view SPC. If PortsPerView is not 'All Ports share the same view', then there MAY be multiple default view SPCs as long as different ports are associated with each. If an SPC is passed in, then the instrumentation adds the new paths to the existing SPC. The instrumentation MAY return an error if honoring this request would violate SCSI semantics. 
	 * 
	 * For creating a default view SPC, the parameters that MUST be specified are dependent upon the SPCAllows* properties in CIM_ProtocolControllerMaskingCapabilities. If SPCAllowsNoLUs is false, the caller MUST specify a list of LUNames. If it is true, the caller MAY specify a list of LUNames or MAY pass in null. If SPCAllowsNoTargets is false, the caller MUST specify a list of TargetPortIDs. If it is true, the caller MAY specify a list of TargetPortIDs or MAY pass in null. If LUNames is not null, the caller MUST specify DeviceAccesses for each logical unit. If the instrumentation's CIM_ProtocolControllerMaskingCapabilities ClientSelectableDeviceNumbers property is TRUE then the client MAY provide a list of device numbers (LUNs) to use for the paths to be created. If is false, the client MUST pass in NULL for this parameter. 
	 * 
	 * The LUNames, DeviceNumbers, and DeviceAccesses parameters are mutually indexed arrays - any element in DeviceNumbers or DeviceAccesses will set a property relative to the LogicalDevice instance named in the corresponding element of LUNames. LUNames and DeviceAccesses MUST have the same number of elements. DeviceNumbers MUST be null (asking the instrumentation to assign numbers) or have the same number of elements as LUNames. If these conditions are not met, the instrumentation MUST return a 'Invalid Parameter' status or a CIM_Error. 
	 * 
	 * For modifying an SPC, there are two specific use cases identified. The instrumentation MUST support one and the other is required depending on a how a property is set. Other permutations are allowed, but are vendor-specific. The required use case is - Add LUs to a default view. Add LUs to a default view requires that the LUNames parameter not be null and that the TargetPortIDs parameters be null. DeviceNumbers MAY be null if ClientSelectableDeviceNumbers is false. DeviceAccess MUST be specified. Add target port IDs to a default view is only valid if PortsPerView is set to 'Multiple Ports per View'. It requires that the LUNames, DeviceNumbers, and DeviceAccesses MUST also be null 
	 * 
	 * The relevant rules of SCSI semantics are: 
	 * - an SPC MAY NOT be exposed through a particular host/target port pair that is in use by another SPC. (In other words, an SPC and its associated logical units and ports together correspond to the logical unit inventory provided by SCSI REPORT LUNS and INQUIRY commands) 
	 * - each LogicalDevice associated to an SPC MUST have a unique ProtocolControllerForUnit DeviceNumber (logical unit number) 
	 * The instrumentation MUST report an error if the client request would violate one of these rules. 
	 * 
	 * If the instrumentation provides PrivilegeManagementService, the results of setting DeviceAccesses MUST be synchronized with PrivilegeManagementService as described in the ProtocolControllerForUnit DeviceAccess description.
	 * @param Job Reference to the job if 'Method Parameters Checked - Job Started' is returned (MAY be null if job completed).
	 * @param LUNames An array of IDs of logical unit instances. The LU instances MUST already exist. The members of this array MUST match the Name property of LogicalDevice instances that represent SCSI logical units. See the method description for conditions where this MAY be null.
	 * @param TargetPortIDs IDs of target ports. See the method description for conditions where this MAY be null.
	 * @param DeviceNumbers A list of logical unit numbers to assign to the corresponding logical unit in the LUNames parameter. (within the context of the elements specified in the other parameters). If the LUNames parameter is null, then this parameter MUST be null. Otherwise, if this parameter is null, all LU numbers are assigned by the hardware or instrumentation.
	 * @param DeviceAccesses A list of permissions to assign to the corresponding logical unit in the LUNames parameter. This specifies the permission to assign within the context of the elements specified in the other parameters. Setting this to 'No Access' assigns the DeviceNumber for all initiators, but does not grant read or write access. If the LUNames parameter is not null then this parameter MUST be specified.
	 * @param ProtocolControllers An array of references to SCSIProtocolControllers (SPCs). On input, this can be null, or contain exactly one element; there MAY be multiple references on output. If null on input, the instrumentation will create one or more new SPC instances. If an SPC is specified, the instrumentation will attempt to add associations to one or more existing SPCs. If the first array element is a valid SPC reference and SCSI semantics can be preserved, the instrumentation MUST attach associations to the specified SPC. If multiple elements are non-null on input, the instrumentation MUST report an invalid parameter. On output, this is an array of references to SPCs created or modified as the result of processing the request.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" LUNamesUnique="false" LUNamesMany="true"
	 *        LUNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LogicalDevice.Name\"]'" TargetPortIDsUnique="false" TargetPortIDsMany="true"
	 *        TargetPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\"]'" DeviceNumbersUnique="false" DeviceNumbersMany="true"
	 *        DeviceNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed'" DeviceAccessesUnique="false" DeviceAccessesMany="true"
	 *        DeviceAccessesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..15999\",\"16000..\"]' Values='[\"Unknown\",\"Read Write\",\"Read-Only\",\"No Access\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed'" ProtocolControllersUnique="false" ProtocolControllersMany="true"
	 *        ProtocolControllersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Invalid logical unit ID\",\"Invalid target port ID\",\"Invalid permission\",\"Requested logical unit number in use\",\"Maximum Map Count Exceeded\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ExposeDefaultLUs(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> TargetPortIDs, EList<String> DeviceNumbers, EList<Integer> DeviceAccesses, EList<CIM_SCSIProtocolController> ProtocolControllers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method expands the functionality of ExposePaths by including two additional parameters, namely, the ElementName and ClientSettingData. Refer to ExposePaths for description of the method and its parameters.
	 * @param Job Reference to the job if 'Method Parameters Checked - Job Started' is returned (MAY be null if job completed).
	 * @param LUNames An array of IDs of logical unit instances. The LU instances MUST already exist. The members of this array MUST match the Name property of LogicalDevice instances that represent SCSI logical units. See the method description for conditions where this MAY be null.
	 * @param InitiatorPortIDs IDs of initiator ports. If existing StorageHardwareID instances exist, they MUST be used. If no StorageHardwareID instance matches, then one is implicitly created. See the method description for conditions where this MAY be null.
	 * @param TargetPortIDs IDs of target ports. See the method description for conditions where this MAY be null.
	 * @param DeviceNumbers A list of logical unit numbers to assign to the corresponding logical unit in the LUNames parameter. (within the context of the elements specified in the other parameters). If the LUNames parameter is null, then this parameter MUST be null. Otherwise, if this parameter is null, all LU numbers are assigned by the hardware or instrumentation.
	 * @param DeviceAccesses A list of permissions to assign to the corresponding logical unit in the LUNames parameter. This specifies the permission to assign within the context of the elements specified in the other parameters. Setting this to 'No Access' assigns the DeviceNumber for the associated initiators, but does not grant read or write access. If the LUNames parameter is not null then this parameter MUST be specified.
	 * @param ElementName The string to be used in the ElementName of the new ProtocolController.
	 * @param ClientSettingData REF to the StorageClientSettingData containing the OSType appropriate for this initiator. If left NULL, the instrumentation assumes a standard OSType - i.e., that no OS-specific behavior for this initiator is defined.
	 * @param ProtocolControllers An array of references to SCSIProtocolControllers (SPCs). On input, this can be null, or contain exactly one element; there MAY be multiple references on output. If null on input, the instrumentation will create one or more new SPC instances. If an SPC is specified, the instrumentation will attempt to add associations to one or more existing SPCs. If the first array element is a valid SPC reference and SCSI semantics can be preserved, the instrumentation MUST attach associations to the specified SPC. If multiple elements are non-null on input, the instrumentation MUST report an invalid parameter. On output, this is an array of references to SPCs created or modified as the result of processing the request.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" LUNamesUnique="false" LUNamesMany="true"
	 *        LUNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LogicalDevice.Name\"]'" InitiatorPortIDsUnique="false" InitiatorPortIDsMany="true"
	 *        InitiatorPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_StorageHardwareID.StorageID\"]'" TargetPortIDsUnique="false" TargetPortIDsMany="true"
	 *        TargetPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\"]'" DeviceNumbersUnique="false" DeviceNumbersMany="true"
	 *        DeviceNumbersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed'" DeviceAccessesUnique="false" DeviceAccessesMany="true"
	 *        DeviceAccessesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..15999\",\"16000..\"]' Values='[\"Unknown\",\"Read Write\",\"Read-Only\",\"No Access\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ProtocolController.ElementName\"]'" ClientSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageClientSettingData REF'" ProtocolControllersUnique="false" ProtocolControllersMany="true"
	 *        ProtocolControllersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102\",\"4103\",\"4104..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Invalid logical unit ID\",\"Invalid initiator port ID\",\"Invalid target port ID\",\"Invalid permission\",\"Target/initiator combination already exposed\",\"Requested logical unit number in use\",\"Maximum Map Count Exceeded\",\"Method Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ControllerConfigurationService.ExposePaths\"]'"
	 * @generated
	 */
	Long ExposePathsWithNameAndHostType(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> InitiatorPortIDs, EList<String> TargetPortIDs, EList<String> DeviceNumbers, EList<Integer> DeviceAccesses, String ElementName, CIM_StorageClientSettingData ClientSettingData, EList<CIM_SCSIProtocolController> ProtocolControllers);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hide a list of SCSI logical units (such as RAID volumes or tape drives) through a list of target ports on a default view SCSIProtocolController (SPC). 
	 * 
	 * The parameters for this method are: Job - null if no job created, otherwise this is a reference to the job. LUNames - the list of names of the logical units to use. TargetPortIDs - the names of the target ports to use. ProtocolControllers - SPCs involved in this operation. 
	 * 
	 * When hiding logical units, there are two specific use cases identified. The instrumentation MUST support the Remove LUs case and MUST support the remove target port IDs if PortsPerView is set to 'Multiple Ports per View'. Other permutations are allowed, but are vendor-specific. The use cases are: Remove LUs from a default view and Remove target port IDs from a default view. Remove LUs from a default view requires that the LUNames parameter not be null and that the TargetPortIDs parameter be null. Remove target port IDs from a default view is required if PortsPerView is Multiple Ports per view. It requires that the LUNames parameter be null. 
	 * 
	 * If both LUNames and TargetIDs parameters are non-null and CIM_ProtocolControllerMaskingCapabilities.MaximumMapCount is 0, then the instrumentation MUST create new SPCs and change associations as necessary to meet the client request and maintain the relevant rules of SCSI in the ExposeDefaultLUs description. If both LUNames and TargetIDs parameters are non-null and CIM_ProtocolControllerMaskingCapabilities.MaximumMapCount is greater than 0, then any client request that cannot be honored by changing associations to the specified SPC will receive a 'Maximum Map Count Error' response. 
	 * The disposition of the SPC when the last logical unit or target port ID is removed depends upon the CIM_ProtocolControllerMaskingCapabilites SPCAllowsNo* properties. If SPCAllowsNoLUs is false, then the SPC is automatically deleted when the last logical unit is removed. If SPCAllowsNoTargets is false, then the SPC is automatically deleted when the last target port ID is removed. In all other cases, the SPC MUST be explicitly deleted via the DeleteInstance intrinsic function.
	 * @param Job Reference to the job if 'Method Parameters Checked - Job Started' is returned (MAY be null if job completed).
	 * @param LUNames A list of IDs of logical units. Each LU instance MUST already exist. See the method description for conditions where this MAY be null.
	 * @param TargetPortIDs IDs of target ports. See the method description for conditions where this MAY be null.
	 * @param ProtocolControllers An array of references to SCSIProtocolControllers (SPCs). On input, this MUST contain exactly one element; there MAY be multiple references on output. The instrumentation will attempt to remove associations (LUNames or TargetPortIDs) from this SPC. Depending upon the specific implementation, the instrumentation MAY need to create new SPCs with a subset of the remaining associations. On output, this is an array of references to SPCs created or modified as the result of processing the request.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" LUNamesUnique="false" LUNamesMany="true"
	 *        LUNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true' ModelCorrespondence='[\"CIM_LogicalDevice.Name\"]'" TargetPortIDsUnique="false" TargetPortIDsMany="true"
	 *        TargetPortIDsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.Name\"]'" ProtocolControllersUnique="false" ProtocolControllersMany="true"
	 *        ProtocolControllersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolController REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Invalid logical unit ID\",\"Invalid target port ID\",\"Maximum Map Count Error\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long HideDefaultLUs(CIM_ConcreteJob Job, EList<String> LUNames, EList<String> TargetPortIDs, EList<CIM_SCSIProtocolController> ProtocolControllers);

} // CIM_ControllerConfigurationService
